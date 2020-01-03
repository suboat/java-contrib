package com.suboat.contrib.demo.graphql.mutation.login;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.suboat.contrib.ctrl.FormUserID;
import com.suboat.contrib.ctrl.JwtTokenProvider;
import com.suboat.contrib.demo.form.FormLogin;
import org.springframework.stereotype.Component;

@Component
public class Login implements GraphQLResolver<String> {

	// 用户登录
	public Token withPassword(FormUserID form, FormLogin value) {
		form.valid();
		value.valid();

		// 生成token
		JwtTokenProvider jwtTokenProvider = new JwtTokenProvider("user");
		Token ret = new Token(jwtTokenProvider);
		ret.uid = "test login uid";
		return ret;
	}

}
