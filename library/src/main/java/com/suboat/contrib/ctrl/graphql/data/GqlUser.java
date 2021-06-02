package com.suboat.contrib.ctrl.graphql.data;

import com.suboat.contrib.ctrl.graphql.UserServe;
import com.suboat.contrib.rpc.user.ArgUser;
import com.suboat.contrib.rpc.user.UserDetail;
import com.suboat.contrib.rpc.user.UserProfile;
import com.suboat.contrib.utils.DateUtils;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.util.Date;

@Data
public class GqlUser {

	private static final Logger log = LoggerFactory.getLogger(GqlUser.class);

	private String uid;

	private UserDetail userDetail;

	public GqlUser(String uid) {
		this.uid = uid;
	}

	// 用户资料
	@Data
	public static class GqlUserProfile {

		public String name;

		public String email;

		public String phone;

		public String icon;

		public String sex;

		public String birth;

		public String sign;

		public String country;

		public String province;

		public String city;

		public String district;

		public String address;

		public String realName;

		public String cardId;

		public String passport;

		public String driver;

		public String bankNumber;

		public String ethnic;

		public String religion;

		public String wxIcon;

		public String wxNickname;

		public GqlUserProfile() {
		}

		public GqlUserProfile(UserProfile src) {
			if (src == null) {
				return;
			}
			name = src.name;
			email = src.email;
			phone = src.phone;
			icon = src.icon;
			sex = src.sex;
			birth = src.birth;
			sign = src.sign;
			country = src.country;
			province = src.province;
			city = src.city;
			district = src.district;
			address = src.address;
			realName = src.realName;
			cardId = src.cardId;
			passport = src.passport;
			driver = src.driver;
			bankNumber = src.bankNumber;
			ethnic = src.ethnic;
			religion = src.religion;
			wxIcon = src.wxIcon;
			wxNickname = src.wxNickname;
		}

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
			log.error(this.uid);
			log.error("rpc-user err: {0}", e);
			log.error(e.getMessage());
			log.error(e.toString());
		}
		finally {
			userServe.close();
		}
	}

	//
	public String getUid() {
		return uid;
	}

	//
	public String getLang() {
		syncUser();
		return userDetail.getBase().lang;
	}

	// 取昵称
	public String getNickname() {
		syncUser();
		if (userDetail.nickname == null || userDetail.nickname.equals(uid)) {
			return "";
		}
		return userDetail.nickname;
	}

	// 取用户名
	public String getUsername() {
		syncUser();
		if (userDetail == null || userDetail.getBase() == null || userDetail.getBase().username == null
				|| userDetail.getBase().username.equals(uid)) {
			return null;
		}
		return userDetail.getBase().username;
	}

	// 取手邮箱
	public String getEmail() {
		syncUser();
		if (userDetail.getBase().email == null || userDetail.getBase().email.equals(uid)) {
			return null;
		}
		return userDetail.getBase().email;
	}

	// 取手机号
	public String getPhone() {
		syncUser();
		if (userDetail.getBase().phone == null || userDetail.getBase().phone.equals(uid)) {
			return null;
		}
		return userDetail.getBase().phone;
	}

	// 手机区号
	public String getLocNum() {
		syncUser();
		return userDetail.getBase().locNum;
	}

	// 取唯一值
	public String getUnique() {
		syncUser();
		if (userDetail.getBase().unique == null || userDetail.getBase().unique.equals(uid)) {
			return null;
		}
		return userDetail.getBase().unique;
	}

	// 创建时间
	public Date getCreateTime() throws ParseException {
		syncUser();
		if (userDetail.getBase().createTime == null || userDetail.getBase().createTime.length() == 0) {
			return null;
		}
		return DateUtils.stringToDate(userDetail.getBase().createTime);
	}

	// 创建时间
	public Date getUpdateTime() throws ParseException {
		syncUser();
		if (userDetail.getBase().updateTime == null || userDetail.getBase().updateTime.length() == 0) {
			return null;
		}
		return DateUtils.stringToDate(userDetail.getBase().updateTime);
	}

	// 注册来源
	public String getSource() {
		syncUser();
		return userDetail.getBase().source;
	}

	//
	public Integer getStatus() {
		syncUser();
		return userDetail.getBase().status;
	}

	//
	public Integer getStatusEmail() {
		syncUser();
		return userDetail.getBase().statusEmail;
	}

	//
	public Integer getStatusPhone() {
		syncUser();
		return userDetail.getBase().statusPhone;
	}

	//
	public Integer getStatusPsw() {
		syncUser();
		return userDetail.getBase().statusPsw;
	}

	//
	public Integer getStatusQuest() {
		syncUser();
		return userDetail.getBase().statusQuest;
	}

	//
	public Integer getStatusCard() {
		syncUser();
		return userDetail.getBase().statusCard;
	}

	//
	public Boolean getIsTwoFactor() {
		syncUser();
		return userDetail.getBase().isTwoFactor;
	}

	// 取用户资料
	public GqlUserProfile getProfile() {
		syncUser();
		if (userDetail != null && userDetail.profile != null) {
			return new GqlUserProfile(userDetail.profile);
		}
		return null;
	}

}
