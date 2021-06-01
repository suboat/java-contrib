package com.suboat.contrib.demo.model.orm;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Table(name = "demo_branch",
		indexes = {
				@Index(columnList = "bid", name = "bid"),
		})
public class Branch {

	public Branch() {
		this.bid = UUID.randomUUID().toString();
		this.name = "branch";
	}

	public Branch(String name) {
		this.bid = UUID.randomUUID().toString();
		this.name = name;
	}

	@Id
	@Column(length = 36)
	private String bid; // 部门id

	@Column(unique = false, nullable = false)
	private String name; // 登录用户名,唯一,默认为uid
}
