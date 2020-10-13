package com.suboat.contrib.demo.graphql.mutation.login;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.suboat.contrib.ctrl.FormLogin;
import com.suboat.contrib.ctrl.FormUserID;
import com.suboat.contrib.ctrl.JwtTokenProvider;
import com.suboat.contrib.ctrl.graphql.UserServe;
import com.suboat.contrib.ctrl.graphql.data.GqlToken;
import com.suboat.contrib.error.Rest;
import com.suboat.contrib.rpc.user.*;
import com.suboat.contrib.rpc.utils.UserUtils;
import org.springframework.stereotype.Component;

@Component
public class Login implements GraphQLResolver<String> {

	// 用户登录
	public GqlToken withPassword(FormUserID form, FormLogin value) throws Exception {
		form.valid();
		value.valid();
		User user;
		UserToken userToken;
		UserServe userServe = new UserServe("127.0.0.1");

		try {
			// 取用户uid
			user = userServe.getClient().getUser(UserUtils.form2ArgUser(form));
			// 验证密码
			if (!userServe.getClient().checkPassword(user.getUid(), "", value.value)) {
				throw new Rest.PasswordUndefined("账号名或密码错误");
			};
			// 登录
			userToken = userServe.getClient().getUserToken(new ArgLogin(user.getUid()));
		} finally {
			System.out.println("close");
			userServe.close();
		}

//		// 生成token
//		JwtTokenProvider jwtTokenProvider = new JwtTokenProvider("user");
//		GqlToken ret = new GqlToken(jwtTokenProvider);
//		ret.uid = user.getUid();
//		return ret;

		//
		return new GqlToken(userToken);
	}

	// 小程序登录
	public GqlToken withMiniApp(String appID, String code) throws Exception {
		UserWeixin userWeixin;
		UserToken userToken;
		ArgBind argBind = new ArgBind();
		argBind.bindApp = userConstants.USERSOURCE_WXMINIAPP;
		argBind.bindKey = userConstants.USEREXT_WX_OPENID + "|" + appID;
		argBind.bindCode = code;
		UserServe userServe = new UserServe("127.0.0.1");

		try {
			// 取用户uid
			userWeixin = userServe.getClient().getUserWeixin(argBind);
			if (userWeixin.uids.size() <= 0) {
				// 未知错误
				throw new Rest.ParamInvalid("未知错误");
			} else if (userWeixin.uids.size() > 1) {
				// 微信号绑定了多个账户
				throw new Rest.ParamInvalid("微信号绑定了多个账户");
			}
			// 登录
			userToken = userServe.getClient().getUserToken(new ArgLogin(userWeixin.uids.get(0)));
		} finally {
			System.out.println("close");
			userServe.close();
		}

		//
		return new GqlToken(userToken);
	}

}
