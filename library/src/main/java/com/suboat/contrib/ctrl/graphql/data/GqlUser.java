package com.suboat.contrib.ctrl.graphql.data;

import com.suboat.contrib.ctrl.graphql.UserServe;
import com.suboat.contrib.rpc.user.ArgUser;
import com.suboat.contrib.rpc.user.UserDetail;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
public class GqlUser {

	private static final Logger log = LoggerFactory.getLogger(GqlUser.class);

	private String uid;

	private UserDetail userDetail;

	public GqlUser(String uid) {
		this.uid = uid;
	}

	// 从rpc获取数据
	private synchronized void syncUser() {
		if (userDetail != null) {
			return;
		}
		UserServe userServe = new UserServe();
		try {
			userDetail = userServe.getClient().getUserDetail(new ArgUser(this.uid));
		}
		catch (Exception e) {
			log.error("%s", e);
		}
		finally {
			userServe.close();
		}
	}

	public String getNickname() {
		syncUser();
		return userDetail.nickname;
	}

	public String getLang() {
		syncUser();
		return userDetail.getBase().lang;
	}

}
