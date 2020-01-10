/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.user;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
public class userConstants {

	/**
	 * 预留的uid
	 */
	public static final java.lang.String UID_SYSTEM = "00000000-0000-0000-0000-000000000000";

	public static final java.lang.String UID_GUEST = "11111111-1111-1111-1111-111111111111";

	public static final java.lang.String UID_ADMIN = "22222222-2222-2222-2222-222222222222";

	public static final java.lang.String UID_STAFF = "33333333-3333-3333-3333-333333333333";

	/**
	 * 预留的token类型(目前支持的)
	 */
	public static final java.lang.String TOKEN_SCOPE_WEIXIN = "weixin";

	/**
	 * 用户拓展表公共中的重要字段(key)
	 */
	public static final java.lang.String USEREXT_PUBKEY_REALNAME = "realname";

	public static final java.lang.String USEREXT_PUBKEY_ID = "id";

	public static final java.lang.String USEREXT_PUBKEY_PASSPORT = "passport";

	public static final java.lang.String USEREXT_PUBKEY_DRIVER = "driver";

	/**
	 * 用户注册来源枚举
	 */
	public static final java.lang.String USERSOURCE_LOCAL = "local";

	public static final java.lang.String USERSOURCE_WXMP = "wx_mp";

	public static final java.lang.String USERSOURCE_WXMINIAPP = "wx_miniapp";

}