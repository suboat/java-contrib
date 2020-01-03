package com.suboat.contrib.ctrl;

import com.suboat.contrib.error.Rest;

//
public class FormUserID {

	// 登录用户名
	public String username;

	// 邮箱
	public String email;

	// 电话号码,带区号
	public String phone;

	// uid
	public String uid;

	//
	public void valid() throws Rest.ParamInvalid {
		int count = 0;
		if (username != null) {
			if (username.length() > 0) {
				count += 1;
			}
			else {
				username = null;
			}
		}
		if (email != null) {
			if (email.length() > 0) {
				count += 1;
			}
			else {
				email = null;
			}
		}
		if (phone != null) {
			if (phone.length() > 0) {
				count += 1;
			}
			else {
				phone = null;
			}
		}
		if (uid != null) {
			if (uid.length() > 0) {
				count += 1;
			}
			else {
				uid = null;
			}
		}
		if (count == 0) {
			throw new Rest.ParamInvalid("用户未指定");
		}
		else if (count != 1) {
			throw new Rest.ParamInvalid("用户指定模糊", count);
		}
	}

	public String getPhoneValue() {
		return phone;
	}

	public String getPhoneLocNum() {
		return "86";
	}

}
