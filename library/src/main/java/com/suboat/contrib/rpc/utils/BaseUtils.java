package com.suboat.contrib.rpc.utils;

import com.suboat.contrib.error.ErrorBase;
import com.suboat.contrib.rpc.base.Error;

public class BaseUtils {

	// 错误转格式
	public Error rpc2base(ErrorBase src) {
		if (src == null) {
			return null;
		}
		return new Error(src.getPrefix(), src.getCode(), src.getDetail());
	}

	// 错误转格式
	public ErrorBase base2rpc(Error src) {
		if (src == null) {
			return null;
		}
		return new ErrorBase(src.getPrefix(), src.getCode(), src.getDetail());
	}

}
