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
		if (m == null) {
			m = new HashMap<>();
		}
		if (exit != null && exit.size() > 0) {
			for (Map.Entry<String, Object> entry : exit.entrySet()) {
				String _key = entry.getKey();
				Object _val = entry.getValue();
				System.out.println("key " + _key);
				System.out.println("val " + _val);
				System.out.println("m " + m);
				m.put(_key, _val);
			}
		}
		ret.setKeyJson(JsonUtils.toJson(m));
		if (query.sort != null) {
			ret.setSort(Arrays.asList(query.sort));
		}
		if (query.limit != null) {
			ret.setLimit(query.limit);
		}
		if (query.page != null) {
			ret.setPage(query.page);
		}
		if (query.skip != null) {
			ret.setSkip(query.skip);
		}
		if (query.count != null) {
			ret.setCount(query.count);
		}
		return ret;
	}

	// query转换
	public static FormQuery rpc2query(ArgQuery query) {
		FormQuery ret = new FormQuery();
		if (query == null) {
			return ret;
		}
		ret.setLimit(query.limit);
		ret.setPage(query.page);
		ret.setSkip(query.skip);
		if (query.getSort() != null) {
			ret.setSort(query.sort.toArray(new String[0]));
		}
		ret.setKeyJson(query.keyJson);
		ret.init();
		return ret;
	}

	// meta转换
	public static QueryMeta meta2rpc(Meta meta) {
		QueryMeta ret = new QueryMeta();
		if (meta == null) {
			return ret;
		}
		ret.setCount(Math.toIntExact(meta.getCount()));
		ret.setLimit(meta.getLimit());
		ret.setPage(meta.getPage());
		ret.setSkip(meta.getSkip());
		ret.setNum(meta.getNum());
		if (meta.getSort() != null) {
			ret.setSort(Arrays.asList(meta.getSort()));
		}
		ret.setKeyJson(meta.getKeyJson());
		return ret;
	}

	public static Meta rpc2meta(QueryMeta meta) {
		Meta ret = new Meta();
		if (meta == null) {
			return ret;
		}
		ret.setCount((long) meta.count);
		ret.setLimit(meta.limit);
		ret.setPage(meta.page);
		ret.setSkip(meta.skip);
		ret.setNum(meta.num);
		if (meta.getSort() != null && meta.sort.size() > 0) {
			ret.setSort(meta.sort.toArray(new String[0]));
		}
		ret.setKeyJson(meta.keyJson);
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
