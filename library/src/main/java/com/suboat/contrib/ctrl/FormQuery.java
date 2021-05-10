package com.suboat.contrib.ctrl;

import com.github.wenhao.jpa.PredicateBuilder;
import com.github.wenhao.jpa.Specifications;
import com.suboat.contrib.error.Rest;
import com.suboat.contrib.rpc.base.Error;
import com.suboat.contrib.utils.DateUtils;
import lombok.Data;
import org.json.JSONObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Data
public class FormQuery<T> {

	public static final String TagKeyOr = "$or$";

	public static final String TagKeyAnd = "$and$";

	public static final String TagKeyGte = "$gte$";

	public static final String TagKeyGt = "$gt$";

	public static final String TagKeyLte = "$lte$";

	public static final String TagKeyLt = "$lt$";

	public static final String TagKeyNe = "$ne$";

	public static final String TagKeyLike = "$like$";

	public Integer limit;

	public Integer page;

	public Integer skip;

	public String[] sort;

	public String[] group;

	public String keyJson;

	// >0: 覆盖count结果,不执行真正的count查询
	public Integer count;

	// 覆盖搜索
	public HashMap<String, Object> m;

	// 默认排序
	public String[] s;

	//
	public FormQuery() {
	}

	// 过滤参数
	public static FormQuery<?> filter(FormQuery<?> source) {
		if (source == null) {
			source = new FormQuery<>();
		}
		// 基本错误检查与初始化
		source.init();
		return source;
	}

	// 初始化
	public void init() {
		if (this.limit == null || this.limit <= 0) {
			this.limit = 10;
		}
		else if (this.limit > 100) {
			this.limit = 100;
		}
		if (this.page == null) {
			this.page = 0;
		}
		if (this.skip != null && this.skip != 0) {
			// skip换算成page
			this.page = this.skip / this.limit;
		}
		else {
			// page换算成skip
			this.skip = this.page * this.limit;
		}
		if (this.m == null) {
			this.m = new HashMap<>();
		}
	}

	// 搜索
	public <S extends JpaRepository<T, Long> & JpaSpecificationExecutor<T>> Result<T> query(S repo) throws Error {
		this.init();
		Result<T> result = new Result<>();
		Specification<T> spec;
		Sort sort = null;
		Page<T> page;

		// keyJson && group
		// if (this.keyJson != null && this.keyJson.length() > 0) {
		// spec = this.keyJsonToQuery(this.keyJson, null, false).build();
		// }
		// else {
		// spec = Specifications.<T>and().build();
		// }
		JpaQuery<T> _p = this.keyJsonToQuery(this.keyJson, null, false);
		_p.setGroup(this.group);
		spec = _p.build();
		// spec = this.keyJsonToQuery(this.keyJson, null, false).build();

		// sort
		if ((this.sort != null && this.sort.length > 0) || (this.s != null && this.s.length > 0)) {
			String[] sorts;
			if (this.sort != null && this.sort.length > 0) {
				sorts = this.sort;
			}
			else {
				sorts = this.s;
			}
			Sort.Order[] orders = new Sort.Order[sorts.length];
			for (int i = 0; i < sorts.length; i++) {
				String str = sorts[i];
				if (str.startsWith("-")) {
					str = str.replace("-", "");
					orders[i] = new Sort.Order(Sort.Direction.DESC, str);
				}
				else if (str.startsWith("+")) {
					str = str.replace("+", "");
					orders[i] = new Sort.Order(Sort.Direction.ASC, str);
				}
				else {
					orders[i] = new Sort.Order(Sort.Direction.ASC, str);
				}
			}
			sort = Sort.by(orders);
		}

		// query
		if (sort != null) {
			page = repo.findAll(spec, PageRequest.of(this.page, this.limit, sort));
		}
		else {
			page = repo.findAll(spec, PageRequest.of(this.page, this.limit));
		}

		// meta
		Meta meta = new Meta();
		meta.setKeyJson(this.keyJson);
		meta.setLimit(this.limit);
		meta.setPage(this.page);
		meta.setSkip(this.skip);
		meta.setSort(this.sort);
		meta.setGroup(this.group);
		meta.setCount(null);
		meta.setNum(null);
		meta.setNum(page.getNumberOfElements());

		// 异步取count
		// 具体实现请参考
		// https://stackoverflow.com/questions/26738199/how-to-disable-count-when-specification-and-pageable-are-used-together/26765003
		// https://stackoverflow.com/questions/37254385/querydsl-springdata-jpa-findall-how-to-avoid-count
		meta.setAsyncCount((String s) -> page.getTotalElements());

		//
		result.setMeta(meta);
		result.setData(page.getContent());
		return result;
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

	private void parseKeyVal(PredicateBuilder<T> handle, String key, Object val, String col, Boolean isOr)
			throws Error {
		int _count = countStr(key, "$");
		//
		if (_count == 0) {
			handle.eq(key, val);
		}
		else if (_count == 2) {
			String _tag = getTag(key);
			String _col = getColumn(key, _tag);
			if (_col.length() == 0 && col != null) {
				_col = col;
			}
			String _c = _col.toLowerCase();
			// 可查询的时间白名单
			switch (_c) {
			case "expiretime":
			case "createtime":
			case "updatetime":
			case "logintime":
			case "releasetime":
			case "begindate":
			case "enddate":
				if (!val.toString().startsWith("{")) {
					try {
						val = DateUtils.stringToDate(val.toString());
					}
					catch (ParseException e) {
						throw new Rest.ParamInvalid("时间格式错误 请用yyyy-MM-dd'T'HH:mm:ss.000Z(toISOString)格式");
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
					// _q = Specifications.<T>and();
					_q = keyJsonToQuery(val.toString(), null, false);
					handle.predicate(_q.build());
				}
				break;
			case TagKeyOr:
				if (_col.length() > 0) {
					String _v = val.toString();
					if (_v.startsWith("[")) {
						// 去括号
						_v = _v.substring(1, _v.length() - 1);
						Object[] _objArr = _v.split(",");
						Object[] _arr = new Object[_objArr.length];
						// 去前后双引号
						for (int i = 0; i < _objArr.length; i++) {
							String o = _objArr[i].toString().trim();
							if (o.startsWith("\"") && o.endsWith("\"")) {
								o = o.substring(1, o.length() - 1);
							}
							_arr[i] = o;
						}
						handle.in(_col, _arr);
					}
					else if (_v.startsWith("{")) {
						_q = Specifications.<T>or();
						_q = keyJsonToQuery(val.toString(), _col, true);
						handle.predicate(_q.build());
					}
				}
				else {
					// _q = Specifications.<T>or();
					_q = keyJsonToQuery(val.toString(), null, false);
					handle.predicate(_q.build());
				}
				break;
			case TagKeyNe:
				handle.ne(_col, val);
				break;
			case TagKeyGt:
				handle.gt(_col, (Comparable<?>) val);
				break;
			case TagKeyGte:
				handle.ge(_col, (Comparable<?>) val);
				break;
			case TagKeyLt:
				handle.lt(_col, (Comparable<?>) val);
				break;
			case TagKeyLte:
				handle.le(_col, (Comparable<?>) val);
				break;
			case TagKeyLike:
				if (val instanceof String) {
					handle.like(_col, (String) val);
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

	private JpaQuery<T> keyJsonToQuery(String keyJson, String col, Boolean isOr) throws Error {
		JpaQuery<T> q;
		if (isOr) {
			q = new JpaQuery(Specifications.<T>or());
			// q = Specifications.<T>or();
		}
		else {
			q = new JpaQuery(Specifications.<T>and());
			// q = Specifications.<T>and();
		}
		// CriteriaQuery a = null;
		// a.groupBy().groupBy();
		// 解析keyJson
		if (keyJson != null && keyJson.length() > 2) {
			JSONObject js = new JSONObject(keyJson);
			Iterator<String> iter = js.keys();
			// 解析成数据库可读的语句
			while (iter.hasNext()) {
				String _key = iter.next();
				Object _val = js.get(_key);
				parseKeyVal(q, _key, _val, col, isOr);
			}
		}
		// 解析默认查询
		if (this.m != null && this.m.size() > 0) {
			for (Map.Entry<String, Object> entry : m.entrySet()) {
				String _key = entry.getKey();
				Object _val = entry.getValue();
				parseKeyVal(q, _key, _val, col, isOr);
			}
		}
		return q;
	}

}
