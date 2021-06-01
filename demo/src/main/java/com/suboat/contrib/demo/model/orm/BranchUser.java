package com.suboat.contrib.demo.model.orm;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "demo_branch_user",
		uniqueConstraints = {@UniqueConstraint(columnNames = {"bid", "uid"}, name = "bid_uid"),},
		indexes = {
				@Index(columnList = "bid", name = "bid"),
				@Index(columnList = "uid", name = "uid"),
		})
public class BranchUser {

	public BranchUser() {
		this.bid = "";
		this.uid = "";
	}

	public BranchUser(String bid, String uid) {
		this.bid = bid;
		this.uid = uid;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "`id`", nullable = false)
	private Integer id; // 自增主键

	@Column(name = "`bid`", nullable = false, length = 36)
	private String bid; //

	@Column(name = "`uid`", nullable = false, length = 36)
	private String uid; //

}
