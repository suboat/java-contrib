package com.suboat.contrib.demo.model.repo;

import com.suboat.contrib.demo.model.orm.BranchUserView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RepositoryBranchUserView extends JpaRepository<BranchUserView, Integer>, JpaSpecificationExecutor<BranchUserView> {
}
