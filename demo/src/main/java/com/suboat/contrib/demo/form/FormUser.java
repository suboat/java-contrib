package com.suboat.contrib.demo.form;

import com.suboat.contrib.demo.model.orm.UserBase;
import com.suboat.contrib.rpc.base.Error;
import com.suboat.contrib.utils.BeanUtils;
import lombok.Data;

@Data
public class FormUser {

	// 用户uid/手机号选填一个
	private String uid;

	private String phone;

	private String realName;

	private String password;

	private String source;

	public FormUser() {
	}

	//
	public void valid() throws Error {

	}

	public UserBase toData() throws Error {
		this.valid();
		UserBase data = new UserBase();
		BeanUtils.copyPropertiesIgnoreNull(this, data);
		return data;
	}
}
