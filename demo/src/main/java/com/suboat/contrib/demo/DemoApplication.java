package com.suboat.contrib.demo;

import com.suboat.contrib.MyService;
import com.suboat.contrib.ctrl.graphql.UserServe;
import com.suboat.contrib.rpc.RpcConnConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.suboat.contrib")
@RestController
public class DemoApplication {

	private final MyService myService;

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public DemoApplication(MyService myService) {
		this.myService = myService;

		// 初始化配置
		UserServe.Config = new RpcConnConfig();
		UserServe.Config.host = "127.0.0.1";
		log.info("初始化配置 {}", UserServe.Config);
	}

	@GetMapping("/")
	public String home() {
		return myService.message();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
