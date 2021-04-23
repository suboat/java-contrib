package com.suboat.contrib.demo.service;

import com.suboat.contrib.demo.form.FormUser;
import com.suboat.contrib.demo.model.orm.UserBase;
import com.suboat.contrib.demo.model.repo.RepositoryUserBase;
import com.suboat.contrib.rpc.base.Error;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LogicUser {

	private static final Logger log = LoggerFactory.getLogger(LogicUser.class);

	@Autowired
	private RepositoryUserBase repositoryUserBase;

	@Transactional
	public UserBase userNew(FormUser form) throws Error {
		UserBase data = form.toData();
		repositoryUserBase.save(data);
		log.info(String.format("新建用户 %s", data.getUid()));
		return data;
	}
}
