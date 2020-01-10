package com.suboat.contrib.rpc.utils;

import com.suboat.contrib.ctrl.FormUserID;
import com.suboat.contrib.rpc.user.ArgUser;

public class UserUtils {

	public FormUserID argUser2From(ArgUser argUser) {
		FormUserID form = new FormUserID();
		form.uid = argUser.uid;
		form.username = argUser.username;
		form.phone = argUser.phone;
		form.locNum = argUser.locNum;
		form.unique = argUser.unique;
		form.bindApp = argUser.bindApp;
		form.bindKey = argUser.bindKey;
		form.bindVal = argUser.bindVal;
		return form;
	}

}
