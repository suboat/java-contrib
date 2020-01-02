package com.suboat.contrib.demo.graphql;

import com.suboat.contrib.ctrl.ErrorSerialize;
import graphql.ExceptionWhileDataFetching;
import graphql.GraphQLError;
import graphql.kickstart.execution.error.GraphQLErrorHandler;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ErrorHandler implements GraphQLErrorHandler {

	@Override
	public List<GraphQLError> processErrors(List<GraphQLError> errors) {
		List<GraphQLError> clientErrors = errors.stream().filter(this::isClientError).collect(Collectors.toList());

		List<GraphQLError> serverErrors = errors.stream().filter(e -> !isClientError(e)).map(ErrorSerialize::new)
				.collect(Collectors.toList());

		List<GraphQLError> e = new ArrayList<>();
		e.addAll(clientErrors);
		e.addAll(serverErrors);
		return e;
	}

	protected boolean isClientError(GraphQLError error) {
		return !(error instanceof ExceptionWhileDataFetching || error instanceof Throwable);
	}

}
