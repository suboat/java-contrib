package com.suboat.contrib.demo;

import com.suboat.contrib.demo.model.repo.RepositoryUserBase;
import com.suboat.contrib.demo.service.LogicUser;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Data
public class AppInstance {

	// 全局变量
	public static AppInstance appInstance;

	@Autowired
	private RepositoryUserBase repositoryUserBase;

	@Autowired
	private LogicUser logicUser;

	@PostConstruct
	public void init() {
		appInstance = this;
	}
}
