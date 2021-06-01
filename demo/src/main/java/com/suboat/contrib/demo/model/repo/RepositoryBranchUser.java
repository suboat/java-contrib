package com.suboat.contrib.demo.model.repo;

import com.suboat.contrib.demo.model.orm.BranchUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RepositoryBranchUser extends JpaRepository<BranchUser, Integer>, JpaSpecificationExecutor<BranchUser> {
}
