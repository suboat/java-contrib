package com.suboat.contrib.ctrl;

import lombok.Data;

import java.util.function.Function;

@Data
public class Meta {

	private Integer limit;

	private Integer page;

	private Integer skip;

	private String[] sort;

	private String[] group;

	private String keyJson;

	private Long count;

	private Integer num;

	private Function<String, Long> asyncCount;

	// 异步读取count
	public Long getCount() {
		if (count == null && asyncCount != null) {
			count = asyncCount.apply("count");
		}
		return count;
	}

}
