package com.suboat.contrib.ctrl;

import com.github.wenhao.jpa.PredicateBuilder;
import com.github.wenhao.jpa.Specifications;
import com.suboat.contrib.error.Rest;
import com.suboat.contrib.utils.BeanUtils;
import com.suboat.contrib.utils.DateUtils;
import lombok.Data;
import org.json.JSONObject;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.text.ParseException;
import java.util.Iterator;

@Data
public class Query<T> {

	private static final String TagKeyOr = "$or$";

	private static final String TagKeyAnd = "$and$";

	private static final String TagKeyGte = "$gte$";

	private static final String TagKeyGt = "$gt$";

	private static final String TagKeyLte = "$lte$";

	private static final String TagKeyLt = "$lt$";

	private static final String TagKeyNe = "$ne$";

	private static final String TagKeyLike = "$like$";

	private Integer limit;

	private Integer page;

	private Integer skip;

	private String[] sort;

	private String keyJson;

	private Specification<T> cond;

	private Sort _sort;

	private Meta meta;

	public Query() {

	}

	public Query(Query form) {
		if (form == null) {
			this.limit = 10;
			this.page = 0;
		}
		else {
			this.toQuery(form);
		}
		// 初始化meta
		this.meta = new Meta();
		this.meta.setLimit(this.limit);
		this.meta.setPage(this.page);
		this.meta.setSort(this.sort);
		this.meta.setKeyJson(this.keyJson);
		return;
	}

	public Query toQuery(Query query) {
		BeanUtils.copyNotNullProperties(query, this);
		PredicateBuilder<T> q = Specifications.<T>and();
		if (this.limit == null) {
			this.limit = 10;
		}
		if (this.page == null) {
			this.page = 0;
		}
		// 解析成可读的orderBy
		if (this.sort != null) {
			Sort.Order[] _o = new Sort.Order[this.sort.length];
			for (int i = 0; i < this.sort.length; i++) {
				String str = this.sort[i];
				if (str.startsWith("-")) {
					str = str.replace("-", "");
					_o[i] = new Sort.Order(Sort.Direction.DESC, str);
				}
				else if (str.startsWith("+")) {
					str = str.replace("+", "");
					_o[i] = new Sort.Order(Sort.Direction.ASC, str);
				}
				else {
					_o[i] = new Sort.Order(Sort.Direction.ASC, str);
				}
			}
			this._sort = Sort.by(_o);
		}
		// 解析成可读的where
		if (this.keyJson != null) {
			this.cond = keyJsonToQuery(this.keyJson, null, false).build();
		}
		else {
			this.cond = q.build();
		}
		return this;
	}

	private int countStr(String str, String sToFind) {
		int num = 0;
		while (str.contains(sToFind)) {
			str = str.substring(str.indexOf(sToFind) + sToFind.length());
			num++;
		}
		return num;
	}

	private String getTag(String str) {
		int start = str.indexOf("$");
		int end = str.lastIndexOf("$");
		str = str.substring(start, end + 1);
		return str;
	}

	private String getColumn(String str, String tag) {
		int start = str.indexOf(tag);
		str = str.substring(0, start);
		return str;
	}

	private PredicateBuilder<T> keyJsonToQuery(String keyJson, String col, Boolean isOr) {
		PredicateBuilder<T> q = Specifications.<T>and();
		if (isOr) {
			q = Specifications.<T>or();
		}
		JSONObject js = new JSONObject(keyJson);
		Iterator<String> iter = js.keys();
		// 解析成数据库可读的语句
		while (iter.hasNext()) {
			String _key = iter.next();
			Object _val = js.get(_key);
			int _count = countStr(_key, "$");
			//
			if (_count == 0) {
				q.eq(_key, _val);
			}
			else if (_count == 2) {
				String _tag = getTag(_key);
				String _col = getColumn(_key, _tag);
				if (_col.length() == 0 && col != null) {
					_col = col;
				}
				String _c = _col.toLowerCase();
				// 可查询的时间白名单
				switch (_c) {
				case "createtime":
				case "updatetime":
				case "logintime":
					if (!_val.toString().startsWith("{")) {
						try {
							_val = DateUtils.stringToDate(_val.toString());

						}
						catch (ParseException e) {
							throw new Rest.ParamInvalid("时间格式错误 请用yyyy-MM-dd'T'HH:mm:ss格式");
						}
					}
					break;
				}
				PredicateBuilder<T> _q;
				// 解析成数据库查询相应的关键字
				switch (_tag) {
				case TagKeyAnd:
					if (_col.length() > 0) {
						throw new Rest.ParamInvalid("不支持的查询语法");
					}
					else {
						_q = Specifications.<T>and();
						_q = keyJsonToQuery(_val.toString(), null, false);
						q.predicate(_q.build());
					}
					break;
				case TagKeyOr:
					if (_col.length() > 0) {
						String _v = _val.toString();
						if (_v.startsWith("[")) {
							_v = _v.substring(1, _v.length() - 1);
							Object[] _arr = _v.split(",");
							q.in(_col, _arr);
						}
						else if (_v.startsWith("{")) {
							_q = Specifications.<T>or();
							_q = keyJsonToQuery(_val.toString(), _col, true);
							q.predicate(_q.build());
						}
					}
					else {
						_q = Specifications.<T>or();
						_q = keyJsonToQuery(_val.toString(), null, false);
						q.predicate(_q.build());
					}
					break;
				case TagKeyNe:
					q.ne(_col, _val);
					break;
				case TagKeyGt:
					q.gt(_col, (Comparable<?>) _val);
					break;
				case TagKeyGte:
					q.ge(_col, (Comparable<?>) _val);
					break;
				case TagKeyLt:
					q.lt(_col, (Comparable<?>) _val);
					break;
				case TagKeyLte:
					q.le(_col, (Comparable<?>) _val);
					break;
				case TagKeyLike:
					if (_val instanceof String) {
						q.like(_col, (String) _val);
					}
					break;
				default:
					throw new Rest.ParamInvalid(_tag + "查询标签非法");
				}
			}
			else {
				throw new Rest.ParamInvalid("查询标签非法");
			}
		}
		return q;
	}

}
