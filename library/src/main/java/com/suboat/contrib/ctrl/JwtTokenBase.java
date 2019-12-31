package com.suboat.contrib.ctrl;

import java.util.Date;

public class JwtTokenBase {

	// 超时时间戳
	public Date exp;

	// 创建时间戳
	public Date cre;

	// 用户uid
	public String uid;

	// 会话等级
	public String level;

	// 登录IP
	public String ip;

	// 唯一标记id
	public String id;

	// 密码哈希摘要
	public String psw;

}
