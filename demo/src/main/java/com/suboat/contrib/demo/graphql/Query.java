package com.suboat.contrib.demo.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.suboat.contrib.ctrl.context.ContextAuth;
import com.suboat.contrib.demo.graphql.query.Me;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	private Me me;

	public String version() {
		return "hello";
	}

	public Me me(String token, String lang, String passwordPay, DataFetchingEnvironment env) {
		new ContextAuth(env, token, "user"); // 解析用户token
		return me;
	}

}
