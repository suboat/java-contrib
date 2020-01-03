package com.suboat.contrib.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Data
@Configuration("JwtConfig")
@ConfigurationProperties(prefix = "security.jwt.token")
public class SecurityConfig {

	// 全局变量
	public static SecurityConfig securityConfig;

	// token有效期
	public long expire;

	// jwt密钥
	public String secret;

	// jwt私钥
	public String keyUser;

	// jwt公钥
	public String pubUser;

	// token有效期 管理员的
	public long expireAdmin;

	// jwt管理员密钥
	public String secretAdmin;

	// jwt私钥
	public String keyAdmin;

	// jwt公钥
	public String pubAdmin;

	@PostConstruct
	public void init() {
		securityConfig = this;
	}

}
