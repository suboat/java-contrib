package com.suboat.contrib.ctrl.graphql.data;

import com.suboat.contrib.ctrl.JwtTokenBase;
import com.suboat.contrib.ctrl.JwtTokenProvider;
import com.suboat.contrib.rpc.user.UserToken;
import lombok.Data;

@Data
public class GqlToken extends JwtTokenBase {

	public String uid;

	public String token;

	private JwtTokenProvider jwtTokenProvider;

	public GqlToken(UserToken userToken) {
		uid = userToken.uid;
		token = userToken.token;
	}

	public GqlToken(JwtTokenProvider jwtTokenProvider) {
		this.jwtTokenProvider = jwtTokenProvider;
	}

	public String getToken() {
		if (token == null && jwtTokenProvider != null) {
			token = jwtTokenProvider.createToken(this);
		}
		return token;
	}

}
