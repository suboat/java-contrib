package com.suboat.contrib.rpc.utils;

import com.suboat.contrib.ctrl.FormUserID;
import com.suboat.contrib.rpc.user.ArgUser;

public class UserUtils {

	// 用户定位参数互转
	public static FormUserID argUser2From(ArgUser argUser) {
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

	//
	public static ArgUser form2ArgUser(FormUserID form) {
		ArgUser ret = new ArgUser();
		if (form == null) {
			return ret;
		}
		ret.uid = form.uid;
		ret.username = form.username;
		ret.phone = form.phone;
		ret.locNum = form.locNum;
		ret.unique = form.unique;
		ret.bindApp = form.bindApp;
		ret.bindApp = form.bindApp;
		ret.bindKey = form.bindKey;
		ret.bindVal = form.bindVal;
		return ret;
	}

}
