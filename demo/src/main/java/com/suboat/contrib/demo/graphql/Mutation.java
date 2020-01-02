package com.suboat.contrib.demo.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

	public String version() {
		return "hello";
	}

}
