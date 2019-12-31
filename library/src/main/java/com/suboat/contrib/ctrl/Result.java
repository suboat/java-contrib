package com.suboat.contrib.ctrl;

import lombok.Data;

import java.util.List;

@Data
public class Result<T> {

	private List<T> data;

	private Meta meta;

}
