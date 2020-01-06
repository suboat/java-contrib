package com.suboat.contrib.ctrl;

import com.suboat.contrib.config.SecurityConfig;
import com.suboat.contrib.error.Rest;
import io.jsonwebtoken.*;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.stream.Collectors;

public class JwtTokenProvider {

	/**
	 * THIS IS NOT A SECURE PRACTICE! For simplicity, we are storing a static key here.
	 * Ideally, in a microservices environment, this key would be kept on a config-server.
	 */

	// @Autowired
	// private UserBaseDetails userBaseDetails;

	// token有效期
	private long expire;

	// jwt密钥
	private String secret;

	// rsa密钥
	private PrivateKey rsaKey;

	// rsa公钥
	private PublicKey rsaPub;

	// 默认用户
	public JwtTokenProvider() {
		secret = Base64.getEncoder().encodeToString(SecurityConfig.securityConfig.secret.getBytes());
		expire = SecurityConfig.securityConfig.expire;
	}

	// 指定不同密钥
	public JwtTokenProvider(String cate) {
		if (cate.equals("admin")) {
			// admin
			expire = SecurityConfig.securityConfig.expireAdmin;
			if (SecurityConfig.securityConfig.keyAdmin != null && SecurityConfig.securityConfig.keyAdmin.length() > 0) {
				this.setRsaKey(SecurityConfig.securityConfig.keyAdmin);
				this.setRsaPub(SecurityConfig.securityConfig.pubAdmin);
			}
			else if (SecurityConfig.securityConfig.pubAdmin != null
					&& SecurityConfig.securityConfig.pubAdmin.length() > 0) {
				this.setRsaPub(SecurityConfig.securityConfig.pubAdmin);
			}
			else {
				secret = Base64.getEncoder().encodeToString(SecurityConfig.securityConfig.secretAdmin.getBytes());
			}
		}
		else {
			// user
			expire = SecurityConfig.securityConfig.expire;
			if (SecurityConfig.securityConfig.keyUser != null && SecurityConfig.securityConfig.keyUser.length() > 0) {
				this.setRsaKey(SecurityConfig.securityConfig.keyUser);
				this.setRsaPub(SecurityConfig.securityConfig.pubUser);
			}
			else if (SecurityConfig.securityConfig.pubUser != null
					&& SecurityConfig.securityConfig.pubUser.length() > 0) {
				this.setRsaPub(SecurityConfig.securityConfig.pubUser);
			}
			else {
				secret = Base64.getEncoder().encodeToString(SecurityConfig.securityConfig.secret.getBytes());
			}
		}
		if (expire <= 0) {
			// 默认一小时过期
			expire = 3600000;
		}
	}

	// 设置私钥
	// https://stackoverflow.com/questions/34454531/java-how-can-i-generate-privatekey-from-a-string
	private void setRsaKey(String content) {
		try {
			content = content.replace("-----BEGIN PRIVATE KEY-----", "").replace("-----END PRIVATE KEY-----", "")
					.replaceAll("\r\n", "").replaceAll("\n", "").replaceAll(" ", "");
			KeyFactory kf = KeyFactory.getInstance("RSA");
			PKCS8EncodedKeySpec keySpecPKCS8 = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(content));
			this.rsaKey = kf.generatePrivate(keySpecPKCS8);
		}
		catch (NoSuchAlgorithmException | InvalidKeySpecException err) {
			throw new Rest.ParamInvalid(err.getMessage());
		}
	}

	// 设置公钥 https://stackoverflow.com/questions/11410770/load-rsa-public-key-from-file
	private void setRsaPub(String content) {
		if (content == null || content.length() == 0) {
			return;
		}
		try {
			content = content.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "")
					.replaceAll("\r\n", "").replaceAll("\n", "").replaceAll(" ", "");
			KeyFactory kf = KeyFactory.getInstance("RSA");
			X509EncodedKeySpec spec = new X509EncodedKeySpec(Base64.getDecoder().decode(content));
			this.rsaPub = kf.generatePublic(spec);
		}
		catch (NoSuchAlgorithmException | InvalidKeySpecException err) {
			throw new Rest.ParamInvalid(err.getMessage());
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
		JwtBuilder jwtBuilder = Jwts.builder().setClaims(claims) //
				// .setIssuedAt(jwtTokenBase.cre) //
				.setExpiration(jwtTokenBase.exp);
		if (rsaKey != null) {
			jwtBuilder = jwtBuilder.signWith(SignatureAlgorithm.RS256, rsaKey);
		}
		else {
			jwtBuilder = jwtBuilder.signWith(SignatureAlgorithm.HS256, secret);
		}
		return jwtBuilder.compact();
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
			if (rsaPub != null) {
				claims = Jwts.parser().setSigningKey(rsaPub).parseClaimsJws(token).getBody();
			}
			else {
				claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
			}
			// Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
		}
		catch (UnsupportedJwtException | MalformedJwtException | SignatureException | IllegalArgumentException e) {
			throw new Rest.TokenInvalid("token非法" + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		catch (ExpiredJwtException e) {
			throw new Rest.TokenExpired();
		}
		if (claims == null) {
			throw new Rest.TokenClaimsInvalid();
		}

		return claims;
	}

}
