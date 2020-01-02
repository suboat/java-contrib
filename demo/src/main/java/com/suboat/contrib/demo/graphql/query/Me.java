package com.suboat.contrib.demo.graphql.query;

import com.suboat.contrib.ctrl.context.ContextAuth;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

@Component
public class Me {

	public String uid(DataFetchingEnvironment env) {
		return new ContextAuth(env).uid;
	}

}
