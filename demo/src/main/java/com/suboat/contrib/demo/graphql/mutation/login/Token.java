package com.suboat.contrib.demo.graphql.mutation.login;

import com.suboat.contrib.ctrl.JwtTokenBase;
import com.suboat.contrib.ctrl.JwtTokenProvider;

//
public class Token extends JwtTokenBase {

	private JwtTokenProvider jwtTokenProvider;

	public Token(JwtTokenProvider jwtTokenProvider) {
		this.jwtTokenProvider = jwtTokenProvider;
	}

	public String token() {
		return jwtTokenProvider.createToken(this);
	};

}
