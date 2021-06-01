package com.suboat.contrib.demo;

import com.suboat.contrib.demo.config.AppConfig;
import com.suboat.contrib.demo.form.FormUser;
import com.suboat.contrib.demo.model.orm.Branch;
import com.suboat.contrib.demo.model.orm.BranchUser;
import com.suboat.contrib.demo.model.orm.UserBase;
import com.suboat.contrib.demo.model.repo.RepositoryBranch;
import com.suboat.contrib.demo.model.repo.RepositoryBranchUser;
import com.suboat.contrib.demo.model.repo.RepositoryUserBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@AutoConfigureAfter(AppConfig.class)
public class AppPatch implements InitializingBean {

	private static final Logger log = LoggerFactory.getLogger(AppPatch.class);

	@Autowired
	AppConfig appConfig;

	@Autowired
	AppInstance appInstance;

	@Autowired
	RepositoryUserBase repositoryUserBase;

	@Autowired
	RepositoryBranch repositoryBranch;

	@Autowired
	RepositoryBranchUser repositoryBranchUser;

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("补丁执行位置2");

		// 调试用户
		List<UserBase> userBaseList = repositoryUserBase.findAllBySource("tester");
		int minTest = 3;
		if (userBaseList.size() <= minTest) {
			for (int i = userBaseList.size(); i < minTest; i++) {
				FormUser formUser = new FormUser();
				formUser.setSource("tester");
				UserBase userBase = appInstance.getLogicUser().userNew(formUser);
				userBaseList.add(userBase);
				log.info(String.format("测试用户 %s", userBase.getUid()));
			}
		}

		// 测试部门
		List<Branch> branchList = repositoryBranch.findAll();
		int minBranch = 3;
		if (branchList.size() < minBranch) {
			for (int i = branchList.size(); i < minBranch; i++) {
				Branch branch = new Branch(String.format("branch%d", i + 1));
				repositoryBranch.save(branch);
				branchList.add(branch);
			}
		}

		// 用户与部门关联:每个用户加入n-1个部门
		for (int i = 0; i < userBaseList.size(); i++) {
			UserBase userBase = userBaseList.get(i);
			for (int j = 0; j < branchList.size(); j++) {
				Branch branch = branchList.get(j);
				if (j == i) {
					continue;
				}
				BranchUser branchUser = new BranchUser(branch.getBid(), userBase.getUid());
				repositoryBranchUser.save(branchUser);
			}
		}

	}

	@PostConstruct
	public void postConstruct() {
		log.info("补丁执行位置1");
	}
}
