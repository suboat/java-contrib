package com.suboat.contrib.ctrl;

import lombok.Data;

@Data
public class Meta {

	private Integer limit;

	private Integer page;

	private Integer skip;

	private String[] sort;

	private String keyJson;

	private Long count;

	private Integer num;

}
