package com.suboat.contrib.demo;

import com.suboat.contrib.demo.config.AppConfig;
import com.suboat.contrib.demo.form.FormUser;
import com.suboat.contrib.demo.model.orm.UserBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@AutoConfigureAfter(AppConfig.class)
public class AppPatch implements InitializingBean {

	private static final Logger log = LoggerFactory.getLogger(AppPatch.class);

	@Autowired
	AppConfig appConfig;

	@Autowired
	AppInstance appInstance;

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("补丁执行位置2");

		// 调试用户
		Integer minTest = 3;
		Integer numTest = appInstance.getRepositoryUserBase().countAllBySource("tester");
		if (numTest <= minTest) {
			for (int i = numTest; i < minTest; i++) {
				FormUser formUser = new FormUser();
				formUser.setSource("tester");
				UserBase userBase = appInstance.getLogicUser().userNew(formUser);
				log.info(String.format("测试用户 %s", userBase.getUid()));
			}
		}
	}

	@PostConstruct
	public void postConstruct() {
		log.info("补丁执行位置1");
	}
}
