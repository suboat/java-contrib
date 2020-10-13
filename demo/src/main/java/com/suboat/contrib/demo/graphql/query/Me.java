package com.suboat.contrib.demo.graphql.query;

import com.suboat.contrib.ctrl.context.ContextAuth;
import com.suboat.contrib.demo.graphql.data.GqlUserBase;
import com.suboat.contrib.demo.model.UserBase;
import com.suboat.contrib.demo.model.UserBaseRepository;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Me {

	@Autowired
	private UserBaseRepository repoUserBase;

	public String uid(DataFetchingEnvironment env) throws Exception  {
		return new ContextAuth(env).uid;
	}

	// 用户个人信息
	public GqlUserBase detail(DataFetchingEnvironment env)throws Exception  {
		ContextAuth s = new ContextAuth(env);
		UserBase u = repoUserBase.findByUid(s.uid);
		return new GqlUserBase(u);
	}

}
