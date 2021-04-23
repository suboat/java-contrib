package com.suboat.contrib.ctrl;

import com.github.wenhao.jpa.PredicateBuilder;

import javax.persistence.criteria.Predicate;

public class JpaQuery<T> extends PredicateBuilder<T> {

	public JpaQuery(Predicate.BooleanOperator operator) {
		super(operator);
	}

}
