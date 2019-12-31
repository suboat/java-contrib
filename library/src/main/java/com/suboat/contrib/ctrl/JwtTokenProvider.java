package com.suboat.contrib.ctrl;

import com.suboat.contrib.config.SecurityConfig;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import com.suboat.contrib.error.Rest;
import org.springframework.context.annotation.DependsOn;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.util.stream.Collectors;

public class JwtTokenProvider {

	/**
	 * THIS IS NOT A SECURE PRACTICE! For simplicity, we are storing a static key here.
	 * Ideally, in a microservices environment, this key would be kept on a config-server.
	 */

	// @Autowired
	// private UserBaseDetails userBaseDetails;

	// jwt密钥
	private String secret;

	// token有效期
	private long expire;

	// 默认用户
	public JwtTokenProvider() {
		secret = Base64.getEncoder().encodeToString(SecurityConfig.securityConfig.secret.getBytes());
		expire = SecurityConfig.securityConfig.expire;
	}

	// 指定不同密钥
	public JwtTokenProvider(String cate) {
		if (cate.equals("admin")) {
			secret = Base64.getEncoder().encodeToString(SecurityConfig.securityConfig.secretAdmin.getBytes());
			expire = SecurityConfig.securityConfig.expireAdmin;
		}
		else {
			secret = Base64.getEncoder().encodeToString(SecurityConfig.securityConfig.secret.getBytes());
			expire = SecurityConfig.securityConfig.expire;
		}
	}

	public String createToken(@NotNull JwtTokenBase jwtTokenBase) {

		Claims claims = Jwts.claims();
		jwtTokenBase.cre = new Date();
		claims.put("cre", jwtTokenBase.cre);

		if (jwtTokenBase.uid != null) {
			claims.put("uid", jwtTokenBase.uid);
		}
		if (jwtTokenBase.exp == null) {
			jwtTokenBase.exp = new Date(jwtTokenBase.cre.getTime() + expire);
		}
		if (jwtTokenBase.level != null) {
			claims.put("level", jwtTokenBase.level);
		}
		if (jwtTokenBase.ip != null) {
			claims.put("ip", jwtTokenBase.ip);
		}
		if (jwtTokenBase.id != null) {
			claims.put("id", jwtTokenBase.id);
		}
		if (jwtTokenBase.psw != null) {
			claims.put("psw", jwtTokenBase.psw);
		}

		// test
		claims.put("roles", new ArrayList<>(Arrays.asList("aaa", "bbb")).stream().map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList()));

		//
		return Jwts.builder() //
				.setClaims(claims) //
				// .setIssuedAt(jwtTokenBase.cre) //
				.setExpiration(jwtTokenBase.exp) //
				.signWith(SignatureAlgorithm.HS256, secret) //
				.compact();
	}

	// public Authentication getAuthentication(String token) {
	// UserDetails userDetails = userBaseDetails.loadUserByUsername(getUsername(token));
	// return new UsernamePasswordAuthenticationToken(userDetails, "",
	// userDetails.getAuthorities());
	// }

	public String getUsername(String token) {
		return Jwts.parser().setSigningKey(SecurityConfig.securityConfig.secret).parseClaimsJws(token).getBody()
				.getSubject();
	}

	public String resolveToken(HttpServletRequest req) {
		String bearerToken = req.getHeader("Authorization");
		if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
			return bearerToken.substring(7);
		}
		return null;
	}

	// 验证token合法性
	public Claims validateToken(String token) {
		Claims claims;
		try {
			claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
			Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
		}
		catch (JwtException | IllegalArgumentException e) {
			throw new Rest.TokenInvalid("token非法" + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if (claims == null) {
			throw new Rest.TokenInvalid("未知错误", HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return claims;
	}

}
