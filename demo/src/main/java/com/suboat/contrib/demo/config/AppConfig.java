package com.suboat.contrib.demo.config;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Data
@Configuration("AppConfig")
@ConfigurationProperties(prefix = "model.app")
public class AppConfig {


	private static final Logger log = LoggerFactory.getLogger(AppConfig.class);
	public static AppConfig appConfig;

	@PostConstruct
	public void init() {
		appConfig = this;
	}
}
