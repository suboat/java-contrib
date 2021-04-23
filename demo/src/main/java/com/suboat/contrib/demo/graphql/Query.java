package com.suboat.contrib.demo.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.suboat.contrib.ctrl.FormQuery;
import com.suboat.contrib.ctrl.Result;
import com.suboat.contrib.ctrl.context.ContextAuth;
import com.suboat.contrib.ctrl.graphql.UserServe;
import com.suboat.contrib.demo.graphql.data.GqlUserBase;
import com.suboat.contrib.demo.graphql.query.Me;
import com.suboat.contrib.demo.model.orm.UserBase;
import com.suboat.contrib.demo.model.repo.RepositoryUserBase;
import com.suboat.contrib.rpc.base.Version;
import com.suboat.contrib.rpc.user.ResultUser;
import com.suboat.contrib.rpc.utils.BaseUtils;
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
	private RepositoryUserBase userBaseRepository;

	public String version() {
		return "hello";
	}

	public Me me(String token, String lang, String passwordPay, DataFetchingEnvironment env) throws Exception {
		new ContextAuth(env, token, "user"); // 解析用户token
		return me;
	}

	// 用户列表
	public Result<GqlUserBase> getUserList(FormQuery query) throws Exception {
		query = FormQuery.filter(query);
		// 默认限制与排序
		query.s = new String[]{"-createTime"}; // 默认排序
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

	public Result<GqlUserBase> userListOld(FormQuery query) throws Exception {
		query = FormQuery.filter(query);

		// 默认限制与排序
		query.s = new String[]{"-createTime"}; // 默认排序
		// query.m.put("username$like$", "%test%"); // 模糊搜索

		// rpc
		UserServe userServe = new UserServe("127.0.0.1");

//		if (1 == 1) {
//			throw BaseUtils.base2rpc(new Rest.ParamInvalid(""));
//		}

//		Error error = new Error("aaa",1,  "bbb");
//		if (1==2) {
//			System.out.println(error);
//			System.out.println(error.getMessage());
//			throw error;
//		}

		// 用户列表
		try {
			FormQuery q = new FormQuery();
			q.init();
			q.m.put("username", "wesker");
			System.out.println("llll " + q.limit);
			ResultUser res = userServe.getClient().getUserList(BaseUtils.query2rpc(q));
			System.out.println("rrr" + res);
		} finally {
			System.out.println("close");
			userServe.close();
		}

		try {
			Version version = userServe.getClient().version();
		} finally {
			System.out.println("close");
			userServe.close();
		}


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
