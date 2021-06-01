package com.suboat.contrib.demo.model.repo;

import com.suboat.contrib.demo.model.orm.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RepositoryBranch extends JpaRepository<Branch, Integer>, JpaSpecificationExecutor<Branch> {
}
