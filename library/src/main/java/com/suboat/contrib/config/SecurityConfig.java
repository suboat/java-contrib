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

	// jwt密钥
	public String secret;

	// token有效期
	public long expire;

	// jwt管理员密钥
	public String secretAdmin;

	// token有效期 管理员的
	public long expireAdmin;

	@PostConstruct
	public void init() {
		securityConfig = this;
	}

}
