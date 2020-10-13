package com.suboat.contrib.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserBaseRepository extends JpaRepository<UserBase, Integer>, JpaSpecificationExecutor<UserBase> {

	UserBase findByUid(String uid);
}
