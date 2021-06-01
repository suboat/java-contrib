package com.suboat.contrib.demo.model.repo;

import com.suboat.contrib.demo.model.orm.UserBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface RepositoryUserBase extends JpaRepository<UserBase, Integer>, JpaSpecificationExecutor<UserBase> {

	UserBase findByUid(String uid);

	Integer countAllBySource(String source);

	List<UserBase> findAllBySource(String source);
}
