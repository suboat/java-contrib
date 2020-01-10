package com.suboat.contrib.rpc.utils;

import com.suboat.contrib.ctrl.FormUserID;
import com.suboat.contrib.rpc.user.ArgUser;

public class UserUtils {

	public FormUserID argUser2From(ArgUser argUser) {
		FormUserID formUserID = new FormUserID();
		formUserID.uid = argUser.uid;
		formUserID.username = argUser.username;
		formUserID.phone = argUser.phone;
		formUserID.unique = argUser.unique;
		return formUserID;
	}

}
