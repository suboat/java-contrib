package com.suboat.contrib.ctrl.context;

import graphql.kickstart.execution.context.DefaultGraphQLContext;
import graphql.kickstart.execution.context.GraphQLContext;
import graphql.schema.DataFetchingEnvironment;
import graphql.servlet.context.DefaultGraphQLServletContext;
import graphql.servlet.context.DefaultGraphQLWebSocketContext;
import graphql.servlet.context.GraphQLServletContext;
import graphql.servlet.context.GraphQLServletContextBuilder;
import org.dataloader.DataLoader;
import org.dataloader.DataLoaderRegistry;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;
import javax.websocket.server.HandshakeRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Component
public class Context implements GraphQLServletContextBuilder {

	static private String keyAuth = "auth";

	public static ContextAuth GetAuth(DataFetchingEnvironment env) {
		GraphQLServletContext context = env.getContext();
		final Optional<DataLoaderRegistry> dataLoaderRegistry = context.getDataLoaderRegistry();
		if (!dataLoaderRegistry.isPresent()) {
			// TODO: 未知错误, 报错
			throw new NullPointerException();
		}
		final DataLoader<String, ContextAuth> dataLoader = dataLoaderRegistry.get().getDataLoader(keyAuth);
		CompletableFuture<ContextAuth> data = dataLoader.load("user");
		dataLoader.dispatch();
		ContextAuth contextAuth = data.join();
		if (contextAuth == null) {
			// 如果读不到, 报错
			throw new NullPointerException();
		}
		return contextAuth;
	}

	public GraphQLContext build() {
		return new DefaultGraphQLContext();
	}

	public GraphQLContext build(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		return DefaultGraphQLServletContext.createServletContext().with(httpServletRequest).with(httpServletResponse)
				.with(buildDataLoaderRegistry()).build();
	}

	public GraphQLContext build(Session session, HandshakeRequest handshakeRequest) {
		return DefaultGraphQLWebSocketContext.createWebSocketContext().with(session).with(handshakeRequest)
				.with(buildDataLoaderRegistry()).build();
	}

	private DataLoaderRegistry buildDataLoaderRegistry() {
		ContextAuth auth = new ContextAuth();
		DataLoaderRegistry registry = new DataLoaderRegistry();

		// 获取当前授权状态
		registry.register(keyAuth, new DataLoader<String, ContextAuth>(key -> CompletableFuture.supplyAsync(() -> {
			List<ContextAuth> ret = new ArrayList<>();
			ret.add(auth);
			return ret;
		})));

		// BatchLoader<String, ContextAuth> authBatchLoader = new BatchLoader<String,
		// ContextAuth>() {
		// @Override
		// public CompletionStage<List<ContextAuth>> load(List<String> userIds) {
		// return CompletableFuture.supplyAsync(() -> {
		// List<ContextAuth> ret = new ArrayList<ContextAuth>();
		// ret.add(auth);
		// return ret;
		// });
		// }
		// };
		// registry.register("auth2", DataLoader.newDataLoader(authBatchLoader,
		// DataLoaderOptions.newOptions().setCachingEnabled(false)));

		return registry;
	}

}
