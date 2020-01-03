package com.suboat.contrib.demo.form;

import com.suboat.contrib.error.Rest;

public class FormLogin {

	// 密码或者code
	public String value;

	// 验证码问题
	public String captchaKey;

	// 验证码答案
	public String captchaVal;

	//
	public void valid() throws Rest.ParamInvalid {
		int captcha = 0;
		if (value == null || value.length() == 0) {
			throw new Rest.ParamInvalid("登录凭据");
		}
		if (captchaKey != null && captchaKey.length() > 0) {
			captcha += 1;
		}
		if (captchaVal != null && captchaVal.length() > 0) {
			captcha += 1;
		}
		if (!(captcha == 0 || captcha == 2)) {
			throw new Rest.ParamInvalid("验证码格式错误");
		}
	}

}
