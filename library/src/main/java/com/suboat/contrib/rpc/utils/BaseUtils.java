package com.suboat.contrib.rpc.utils;

import com.suboat.contrib.ctrl.FormQuery;
import com.suboat.contrib.ctrl.Meta;
import com.suboat.contrib.error.ErrorBase;
import com.suboat.contrib.rpc.base.ArgQuery;
import com.suboat.contrib.rpc.base.Error;
import com.suboat.contrib.rpc.base.QueryMeta;
import com.suboat.contrib.utils.JsonUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// rpc基本工具
public class BaseUtils {

	// query转换
	public static ArgQuery query2rpc(FormQuery query) {
		ArgQuery ret = new ArgQuery();
		if (query == null) {
			return ret;
		}
		HashMap<String, Object> exit = query.getM();
		HashMap<String, Object> m = (HashMap<String, Object>) JsonUtils.fromJson(query.keyJson, HashMap.class);
		if (exit != null && exit.size() > 0) {
			for (Map.Entry<String, Object> entry : exit.entrySet()) {
				String _key = entry.getKey();
				Object _val = entry.getValue();
				m.put(_key, _val);
			}
		}
		ret.keyJson = JsonUtils.toJson(m);
		return ret;
	}

	// query转换
	public static FormQuery rpc2query(ArgQuery query) {
		FormQuery ret = new FormQuery();
		if (query == null) {
			return ret;
		}
		ret.limit = query.limit;
		ret.page = query.page;
		ret.skip = query.skip;
		ret.sort = query.sort.toArray(new String[0]);
		ret.keyJson = query.keyJson;
		ret.init();
		return ret;
	}

	// meta转换
	public static QueryMeta meta2rpc(Meta meta) {
		QueryMeta ret = new QueryMeta();
		if (meta == null) {
			return ret;
		}
		ret.count = Math.toIntExact(meta.getCount());
		ret.limit = meta.getLimit();
		ret.page = meta.getPage();
		ret.skip = meta.getSkip();
		ret.num = meta.getNum();
		ret.sort = Arrays.asList(meta.getSort());
		ret.keyJson = meta.getKeyJson();
		return ret;
	}

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
