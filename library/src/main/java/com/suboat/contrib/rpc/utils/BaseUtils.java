package com.suboat.contrib.rpc.utils;

import com.suboat.contrib.error.ErrorBase;
import com.suboat.contrib.rpc.base.Error;

public class BaseUtils {

	// 错误转格式
	public static Error base2rpc(Exception src) {
		if (src == null) {
			return null;
		}
		if (src instanceof ErrorBase) {
			ErrorBase err = (ErrorBase) src;
			return new Error(err.getPrefix(), err.getCode(), err.getDetail());
		}
		else {
			return new Error("rest", 0, src.getMessage());
		}
	}

	// 错误转格式
	public static ErrorBase rpc2base(Exception src) {
		if (src == null) {
			return null;
		}
		if (src instanceof Error) {
			Error err = (Error) src;
			return new ErrorBase(err.getPrefix(), err.getCode(), err.getDetail());
		}
		else {
			return new ErrorBase("rest", 0, src.getMessage());
		}
	}

}
