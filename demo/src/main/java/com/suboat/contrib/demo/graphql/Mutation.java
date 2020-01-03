package com.suboat.contrib.demo.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.suboat.contrib.demo.graphql.mutation.login.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

	@Autowired
	private Login login;

	public String version() {
		return "hello";
	}

	public Login login() {
		return this.login;
	}

}
