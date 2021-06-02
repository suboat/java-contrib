package com.suboat.contrib.demo.model.orm;

import jdk.nashorn.internal.ir.annotations.Immutable;
import lombok.Data;
import org.hibernate.annotations.Subselect;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@Immutable
@Subselect("SELECT u.uid, u.createtime, bu.bid " +
		"FROM demo_user u " +
		"LEFT JOIN demo_branch_user bu " +
		"ON u.uid=bu.uid")
public class BranchUserView {

	@Id
	private String uid; // 用户id

	@Column(name = "createtime")
	private Date createTime;

	private String bid; //

}
