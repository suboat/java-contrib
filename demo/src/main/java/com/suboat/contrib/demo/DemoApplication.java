package com.suboat.contrib.demo;

import com.suboat.contrib.MyService;
import com.suboat.contrib.ctrl.graphql.MsgServe;
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
		UserServe.Config.host = "192.168.6.213";
		UserServe.Config.port = 30709;
		UserServe.Config.framed = true;
		log.info("初始化配置 user: {}", UserServe.Config);
		MsgServe.Config = new RpcConnConfig();
		MsgServe.Config.host = "192.168.6.213";
		MsgServe.Config.port = 32542;
		MsgServe.Config.framed = true;
		log.info("初始化配置 msg: {}", UserServe.Config);

		// rpc连接
		UserServe userServe = null;
		MsgServe msgServe = null;
		try {
			// 用户模块
			userServe = new UserServe();
			log.info("rpc-user version get");
			log.info(String.valueOf(userServe.getClient().version()));
			// 消息模块
			msgServe = new MsgServe();
			log.info("rpc-msg version get");
			log.info(String.valueOf(msgServe.getClient().version()));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (userServe != null) {
				userServe.close();
			}
			if (msgServe != null) {
				msgServe.close();
			}
		}
	}

	@GetMapping("/")
	public String home() {
		return myService.message();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
