package com.suboat.contrib.demo.model;

import com.suboat.contrib.utils.BeanUtils;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@Table(name = "userbase",
		uniqueConstraints = { @UniqueConstraint(columnNames = { "phone", "locnum" }, name = "phone_locnum") },
		indexes = { @Index(columnList = "uid", name = "uid", unique = true),
				@Index(columnList = "phone", name = "phone", unique = true),
				@Index(columnList = "email", name = "email", unique = true),
				@Index(columnList = "username", name = "username", unique = true),
				@Index(columnList = "locnum", name = "locnum"), })
public class UserBase {

	// 初始化
	public UserBase() {
		this.uid = UUID.randomUUID().toString();
		this.username = this.uid;
		this.email = this.uid;
		this.phone = this.uid;
		this.locNum = "";
		// this.createTime = new Date();
		// this.updateTime = this.createTime;
	}

	public UserBase(UserBase userBase) {
		BeanUtils.copyNotNullProperties(userBase, this);
	}

	// 登陆信息
	@Id // 主键标志 等于primary
	@Column(length = 36)
	private String uid; // 用户id

	@Column(length = 36, nullable = false)
	private String phone; // 手机号码

	@Column(name = "locnum", length = 8)
	private String locNum; // 所在地区(国家),国际电话区号,不带"+"号

	@Column(unique = true, nullable = false)
	private String email; // 邮箱地址

	@Column(unique = true, nullable = false)
	private String username; // 登录用户名,唯一,默认为uid

	// @Column(name = "createtime")
	// private Date createTime;
	//
	// @Column(name = "updatetime")
	// private Date updateTime;

}
