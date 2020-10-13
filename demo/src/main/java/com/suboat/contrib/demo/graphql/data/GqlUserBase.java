package com.suboat.contrib.demo.graphql.data;

import com.suboat.contrib.ctrl.graphql.data.GqlUser;
import com.suboat.contrib.demo.model.UserBase;

public class GqlUserBase extends UserBase {

	//
	public GqlUserBase(UserBase userBase) {
		super(userBase);
	}

	public String getNickname() {
		return "rewrite from gql";
	}

	public GqlUser getUser() {
		return new GqlUser(this.getUid());
	}

}
