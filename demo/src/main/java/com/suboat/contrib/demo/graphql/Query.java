package com.suboat.contrib.demo.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.suboat.contrib.ctrl.FormQuery;
import com.suboat.contrib.ctrl.Result;
import com.suboat.contrib.ctrl.context.ContextAuth;
import com.suboat.contrib.demo.graphql.data.GqlUserBase;
import com.suboat.contrib.demo.graphql.query.Me;
import com.suboat.contrib.demo.model.UserBase;
import com.suboat.contrib.demo.model.UserBaseRepository;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	private Me me;

	@Autowired
	private UserBaseRepository userBaseRepository;

	public String version() {
		return "hello";
	}

	public Me me(String token, String lang, String passwordPay, DataFetchingEnvironment env) {
		new ContextAuth(env, token, "user"); // 解析用户token
		return me;
	}

	public Result<GqlUserBase> userList(FormQuery query) {
		query = FormQuery.filter(query);

		// 默认限制与排序
		query.s = new String[] { "-username" }; // 默认排序

		// 转格式
		Result<UserBase> orgResult = query.query(userBaseRepository);
		List<UserBase> oldData = orgResult.getData();
		List<GqlUserBase> nowData = new ArrayList<>();
		for (UserBase d : oldData) {
			nowData.add(new GqlUserBase(d));
		}
		Result<GqlUserBase> result = new Result<>();
		result.setMeta(orgResult.getMeta());
		result.setData(nowData);
		return result;
	}

}
