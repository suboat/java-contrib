/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.base;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-01-10")
public class QueryMeta implements org.apache.thrift.TBase<QueryMeta, QueryMeta._Fields>, java.io.Serializable,
		Cloneable, Comparable<QueryMeta> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"QueryMeta");

	private static final org.apache.thrift.protocol.TField COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"count", org.apache.thrift.protocol.TType.I32, (short) 1);

	private static final org.apache.thrift.protocol.TField LIMIT_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"limit", org.apache.thrift.protocol.TType.I32, (short) 2);

	private static final org.apache.thrift.protocol.TField PAGE_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"page", org.apache.thrift.protocol.TType.I32, (short) 3);

	private static final org.apache.thrift.protocol.TField SKIP_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"skip", org.apache.thrift.protocol.TType.I32, (short) 4);

	private static final org.apache.thrift.protocol.TField NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("num",
			org.apache.thrift.protocol.TType.I32, (short) 5);

	private static final org.apache.thrift.protocol.TField SORT_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"sort", org.apache.thrift.protocol.TType.LIST, (short) 6);

	private static final org.apache.thrift.protocol.TField KEY_JSON_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"keyJson", org.apache.thrift.protocol.TType.STRING, (short) 7);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new QueryMetaStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new QueryMetaTupleSchemeFactory();

	public int count; // required

	public int limit; // required

	public int page; // required

	public int skip; // optional

	public int num; // optional

	public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> sort; // optional

	public @org.apache.thrift.annotation.Nullable java.lang.String keyJson; // optional

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		COUNT((short) 1, "count"), LIMIT((short) 2, "limit"), PAGE((short) 3, "page"), SKIP((short) 4,
				"skip"), NUM((short) 5, "num"), SORT((short) 6, "sort"), KEY_JSON((short) 7, "keyJson");

		private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

		static {
			for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
				byName.put(field.getFieldName(), field);
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, or null if its not found.
		 */
		@org.apache.thrift.annotation.Nullable
		public static _Fields findByThriftId(int fieldId) {
			switch (fieldId) {
			case 1: // COUNT
				return COUNT;
			case 2: // LIMIT
				return LIMIT;
			case 3: // PAGE
				return PAGE;
			case 4: // SKIP
				return SKIP;
			case 5: // NUM
				return NUM;
			case 6: // SORT
				return SORT;
			case 7: // KEY_JSON
				return KEY_JSON;
			default:
				return null;
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, throwing an exception if it is
		 * not found.
		 */
		public static _Fields findByThriftIdOrThrow(int fieldId) {
			_Fields fields = findByThriftId(fieldId);
			if (fields == null)
				throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
			return fields;
		}

		/**
		 * Find the _Fields constant that matches name, or null if its not found.
		 */
		@org.apache.thrift.annotation.Nullable
		public static _Fields findByName(java.lang.String name) {
			return byName.get(name);
		}

		private final short _thriftId;

		private final java.lang.String _fieldName;

		_Fields(short thriftId, java.lang.String fieldName) {
			_thriftId = thriftId;
			_fieldName = fieldName;
		}

		public short getThriftFieldId() {
			return _thriftId;
		}

		public java.lang.String getFieldName() {
			return _fieldName;
		}

	}

	// isset id assignments
	private static final int __COUNT_ISSET_ID = 0;

	private static final int __LIMIT_ISSET_ID = 1;

	private static final int __PAGE_ISSET_ID = 2;

	private static final int __SKIP_ISSET_ID = 3;

	private static final int __NUM_ISSET_ID = 4;

	private byte __isset_bitfield = 0;

	private static final _Fields optionals[] = { _Fields.SKIP, _Fields.NUM, _Fields.SORT, _Fields.KEY_JSON };

	public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.COUNT,
				new org.apache.thrift.meta_data.FieldMetaData("count", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		tmpMap.put(_Fields.LIMIT,
				new org.apache.thrift.meta_data.FieldMetaData("limit", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		tmpMap.put(_Fields.PAGE,
				new org.apache.thrift.meta_data.FieldMetaData("page", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		tmpMap.put(_Fields.SKIP,
				new org.apache.thrift.meta_data.FieldMetaData("skip", org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		tmpMap.put(_Fields.NUM,
				new org.apache.thrift.meta_data.FieldMetaData("num", org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		tmpMap.put(_Fields.SORT, new org.apache.thrift.meta_data.FieldMetaData("sort",
				org.apache.thrift.TFieldRequirementType.OPTIONAL,
				new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
		tmpMap.put(_Fields.KEY_JSON,
				new org.apache.thrift.meta_data.FieldMetaData("keyJson",
						org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(QueryMeta.class, metaDataMap);
	}

	public QueryMeta() {
	}

	public QueryMeta(int count, int limit, int page) {
		this();
		this.count = count;
		setCountIsSet(true);
		this.limit = limit;
		setLimitIsSet(true);
		this.page = page;
		setPageIsSet(true);
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public QueryMeta(QueryMeta other) {
		__isset_bitfield = other.__isset_bitfield;
		this.count = other.count;
		this.limit = other.limit;
		this.page = other.page;
		this.skip = other.skip;
		this.num = other.num;
		if (other.isSetSort()) {
			java.util.List<java.lang.String> __this__sort = new java.util.ArrayList<java.lang.String>(other.sort);
			this.sort = __this__sort;
		}
		if (other.isSetKeyJson()) {
			this.keyJson = other.keyJson;
		}
	}

	public QueryMeta deepCopy() {
		return new QueryMeta(this);
	}

	@Override
	public void clear() {
		setCountIsSet(false);
		this.count = 0;
		setLimitIsSet(false);
		this.limit = 0;
		setPageIsSet(false);
		this.page = 0;
		setSkipIsSet(false);
		this.skip = 0;
		setNumIsSet(false);
		this.num = 0;
		this.sort = null;
		this.keyJson = null;
	}

	public int getCount() {
		return this.count;
	}

	public QueryMeta setCount(int count) {
		this.count = count;
		setCountIsSet(true);
		return this;
	}

	public void unsetCount() {
		__isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COUNT_ISSET_ID);
	}

	/**
	 * Returns true if field count is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetCount() {
		return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COUNT_ISSET_ID);
	}

	public void setCountIsSet(boolean value) {
		__isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COUNT_ISSET_ID, value);
	}

	public int getLimit() {
		return this.limit;
	}

	public QueryMeta setLimit(int limit) {
		this.limit = limit;
		setLimitIsSet(true);
		return this;
	}

	public void unsetLimit() {
		__isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LIMIT_ISSET_ID);
	}

	/**
	 * Returns true if field limit is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetLimit() {
		return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LIMIT_ISSET_ID);
	}

	public void setLimitIsSet(boolean value) {
		__isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LIMIT_ISSET_ID, value);
	}

	public int getPage() {
		return this.page;
	}

	public QueryMeta setPage(int page) {
		this.page = page;
		setPageIsSet(true);
		return this;
	}

	public void unsetPage() {
		__isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PAGE_ISSET_ID);
	}

	/**
	 * Returns true if field page is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetPage() {
		return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PAGE_ISSET_ID);
	}

	public void setPageIsSet(boolean value) {
		__isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PAGE_ISSET_ID, value);
	}

	public int getSkip() {
		return this.skip;
	}

	public QueryMeta setSkip(int skip) {
		this.skip = skip;
		setSkipIsSet(true);
		return this;
	}

	public void unsetSkip() {
		__isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SKIP_ISSET_ID);
	}

	/**
	 * Returns true if field skip is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetSkip() {
		return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SKIP_ISSET_ID);
	}

	public void setSkipIsSet(boolean value) {
		__isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SKIP_ISSET_ID, value);
	}

	public int getNum() {
		return this.num;
	}

	public QueryMeta setNum(int num) {
		this.num = num;
		setNumIsSet(true);
		return this;
	}

	public void unsetNum() {
		__isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NUM_ISSET_ID);
	}

	/**
	 * Returns true if field num is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetNum() {
		return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NUM_ISSET_ID);
	}

	public void setNumIsSet(boolean value) {
		__isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NUM_ISSET_ID, value);
	}

	public int getSortSize() {
		return (this.sort == null) ? 0 : this.sort.size();
	}

	@org.apache.thrift.annotation.Nullable
	public java.util.Iterator<java.lang.String> getSortIterator() {
		return (this.sort == null) ? null : this.sort.iterator();
	}

	public void addToSort(java.lang.String elem) {
		if (this.sort == null) {
			this.sort = new java.util.ArrayList<java.lang.String>();
		}
		this.sort.add(elem);
	}

	@org.apache.thrift.annotation.Nullable
	public java.util.List<java.lang.String> getSort() {
		return this.sort;
	}

	public QueryMeta setSort(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> sort) {
		this.sort = sort;
		return this;
	}

	public void unsetSort() {
		this.sort = null;
	}

	/**
	 * Returns true if field sort is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetSort() {
		return this.sort != null;
	}

	public void setSortIsSet(boolean value) {
		if (!value) {
			this.sort = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getKeyJson() {
		return this.keyJson;
	}

	public QueryMeta setKeyJson(@org.apache.thrift.annotation.Nullable java.lang.String keyJson) {
		this.keyJson = keyJson;
		return this;
	}

	public void unsetKeyJson() {
		this.keyJson = null;
	}

	/**
	 * Returns true if field keyJson is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetKeyJson() {
		return this.keyJson != null;
	}

	public void setKeyJsonIsSet(boolean value) {
		if (!value) {
			this.keyJson = null;
		}
	}

	public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
		switch (field) {
		case COUNT:
			if (value == null) {
				unsetCount();
			}
			else {
				setCount((java.lang.Integer) value);
			}
			break;

		case LIMIT:
			if (value == null) {
				unsetLimit();
			}
			else {
				setLimit((java.lang.Integer) value);
			}
			break;

		case PAGE:
			if (value == null) {
				unsetPage();
			}
			else {
				setPage((java.lang.Integer) value);
			}
			break;

		case SKIP:
			if (value == null) {
				unsetSkip();
			}
			else {
				setSkip((java.lang.Integer) value);
			}
			break;

		case NUM:
			if (value == null) {
				unsetNum();
			}
			else {
				setNum((java.lang.Integer) value);
			}
			break;

		case SORT:
			if (value == null) {
				unsetSort();
			}
			else {
				setSort((java.util.List<java.lang.String>) value);
			}
			break;

		case KEY_JSON:
			if (value == null) {
				unsetKeyJson();
			}
			else {
				setKeyJson((java.lang.String) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case COUNT:
			return getCount();

		case LIMIT:
			return getLimit();

		case PAGE:
			return getPage();

		case SKIP:
			return getSkip();

		case NUM:
			return getNum();

		case SORT:
			return getSort();

		case KEY_JSON:
			return getKeyJson();

		}
		throw new java.lang.IllegalStateException();
	}

	/**
	 * Returns true if field corresponding to fieldID is set (has been assigned a value)
	 * and false otherwise
	 */
	public boolean isSet(_Fields field) {
		if (field == null) {
			throw new java.lang.IllegalArgumentException();
		}

		switch (field) {
		case COUNT:
			return isSetCount();
		case LIMIT:
			return isSetLimit();
		case PAGE:
			return isSetPage();
		case SKIP:
			return isSetSkip();
		case NUM:
			return isSetNum();
		case SORT:
			return isSetSort();
		case KEY_JSON:
			return isSetKeyJson();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof QueryMeta)
			return this.equals((QueryMeta) that);
		return false;
	}

	public boolean equals(QueryMeta that) {
		if (that == null)
			return false;
		if (this == that)
			return true;

		boolean this_present_count = true;
		boolean that_present_count = true;
		if (this_present_count || that_present_count) {
			if (!(this_present_count && that_present_count))
				return false;
			if (this.count != that.count)
				return false;
		}

		boolean this_present_limit = true;
		boolean that_present_limit = true;
		if (this_present_limit || that_present_limit) {
			if (!(this_present_limit && that_present_limit))
				return false;
			if (this.limit != that.limit)
				return false;
		}

		boolean this_present_page = true;
		boolean that_present_page = true;
		if (this_present_page || that_present_page) {
			if (!(this_present_page && that_present_page))
				return false;
			if (this.page != that.page)
				return false;
		}

		boolean this_present_skip = true && this.isSetSkip();
		boolean that_present_skip = true && that.isSetSkip();
		if (this_present_skip || that_present_skip) {
			if (!(this_present_skip && that_present_skip))
				return false;
			if (this.skip != that.skip)
				return false;
		}

		boolean this_present_num = true && this.isSetNum();
		boolean that_present_num = true && that.isSetNum();
		if (this_present_num || that_present_num) {
			if (!(this_present_num && that_present_num))
				return false;
			if (this.num != that.num)
				return false;
		}

		boolean this_present_sort = true && this.isSetSort();
		boolean that_present_sort = true && that.isSetSort();
		if (this_present_sort || that_present_sort) {
			if (!(this_present_sort && that_present_sort))
				return false;
			if (!this.sort.equals(that.sort))
				return false;
		}

		boolean this_present_keyJson = true && this.isSetKeyJson();
		boolean that_present_keyJson = true && that.isSetKeyJson();
		if (this_present_keyJson || that_present_keyJson) {
			if (!(this_present_keyJson && that_present_keyJson))
				return false;
			if (!this.keyJson.equals(that.keyJson))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int hashCode = 1;

		hashCode = hashCode * 8191 + count;

		hashCode = hashCode * 8191 + limit;

		hashCode = hashCode * 8191 + page;

		hashCode = hashCode * 8191 + ((isSetSkip()) ? 131071 : 524287);
		if (isSetSkip())
			hashCode = hashCode * 8191 + skip;

		hashCode = hashCode * 8191 + ((isSetNum()) ? 131071 : 524287);
		if (isSetNum())
			hashCode = hashCode * 8191 + num;

		hashCode = hashCode * 8191 + ((isSetSort()) ? 131071 : 524287);
		if (isSetSort())
			hashCode = hashCode * 8191 + sort.hashCode();

		hashCode = hashCode * 8191 + ((isSetKeyJson()) ? 131071 : 524287);
		if (isSetKeyJson())
			hashCode = hashCode * 8191 + keyJson.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(QueryMeta other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = java.lang.Boolean.valueOf(isSetCount()).compareTo(other.isSetCount());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetCount()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.count, other.count);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetLimit()).compareTo(other.isSetLimit());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetLimit()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.limit, other.limit);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetPage()).compareTo(other.isSetPage());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetPage()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.page, other.page);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetSkip()).compareTo(other.isSetSkip());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetSkip()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.skip, other.skip);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetNum()).compareTo(other.isSetNum());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetNum()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num, other.num);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetSort()).compareTo(other.isSetSort());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetSort()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sort, other.sort);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetKeyJson()).compareTo(other.isSetKeyJson());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetKeyJson()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.keyJson, other.keyJson);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		return 0;
	}

	@org.apache.thrift.annotation.Nullable
	public _Fields fieldForId(int fieldId) {
		return _Fields.findByThriftId(fieldId);
	}

	public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
		scheme(iprot).read(iprot, this);
	}

	public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
		scheme(oprot).write(oprot, this);
	}

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder sb = new java.lang.StringBuilder("QueryMeta(");
		boolean first = true;

		sb.append("count:");
		sb.append(this.count);
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("limit:");
		sb.append(this.limit);
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("page:");
		sb.append(this.page);
		first = false;
		if (isSetSkip()) {
			if (!first)
				sb.append(", ");
			sb.append("skip:");
			sb.append(this.skip);
			first = false;
		}
		if (isSetNum()) {
			if (!first)
				sb.append(", ");
			sb.append("num:");
			sb.append(this.num);
			first = false;
		}
		if (isSetSort()) {
			if (!first)
				sb.append(", ");
			sb.append("sort:");
			if (this.sort == null) {
				sb.append("null");
			}
			else {
				sb.append(this.sort);
			}
			first = false;
		}
		if (isSetKeyJson()) {
			if (!first)
				sb.append(", ");
			sb.append("keyJson:");
			if (this.keyJson == null) {
				sb.append("null");
			}
			else {
				sb.append(this.keyJson);
			}
			first = false;
		}
		sb.append(")");
		return sb.toString();
	}

	public void validate() throws org.apache.thrift.TException {
		// check for required fields
		// check for sub-struct validity
	}

	private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
		try {
			write(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(out)));
		}
		catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
		try {
			// it doesn't seem like you should have to do this, but java serialization is
			// wacky, and doesn't call the default constructor.
			__isset_bitfield = 0;
			read(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(in)));
		}
		catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private static class QueryMetaStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public QueryMetaStandardScheme getScheme() {
			return new QueryMetaStandardScheme();
		}

	}

	private static class QueryMetaStandardScheme extends org.apache.thrift.scheme.StandardScheme<QueryMeta> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, QueryMeta struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // COUNT
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.count = iprot.readI32();
						struct.setCountIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // LIMIT
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.limit = iprot.readI32();
						struct.setLimitIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // PAGE
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.page = iprot.readI32();
						struct.setPageIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 4: // SKIP
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.skip = iprot.readI32();
						struct.setSkipIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 5: // NUM
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.num = iprot.readI32();
						struct.setNumIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 6: // SORT
					if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
						{
							org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
							struct.sort = new java.util.ArrayList<java.lang.String>(_list8.size);
							@org.apache.thrift.annotation.Nullable
							java.lang.String _elem9;
							for (int _i10 = 0; _i10 < _list8.size; ++_i10) {
								_elem9 = iprot.readString();
								struct.sort.add(_elem9);
							}
							iprot.readListEnd();
						}
						struct.setSortIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 7: // KEY_JSON
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.keyJson = iprot.readString();
						struct.setKeyJsonIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				default:
					org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
				}
				iprot.readFieldEnd();
			}
			iprot.readStructEnd();

			// check for required fields of primitive type, which can't be checked in the
			// validate method
			struct.validate();
		}

		public void write(org.apache.thrift.protocol.TProtocol oprot, QueryMeta struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			oprot.writeFieldBegin(COUNT_FIELD_DESC);
			oprot.writeI32(struct.count);
			oprot.writeFieldEnd();
			oprot.writeFieldBegin(LIMIT_FIELD_DESC);
			oprot.writeI32(struct.limit);
			oprot.writeFieldEnd();
			oprot.writeFieldBegin(PAGE_FIELD_DESC);
			oprot.writeI32(struct.page);
			oprot.writeFieldEnd();
			if (struct.isSetSkip()) {
				oprot.writeFieldBegin(SKIP_FIELD_DESC);
				oprot.writeI32(struct.skip);
				oprot.writeFieldEnd();
			}
			if (struct.isSetNum()) {
				oprot.writeFieldBegin(NUM_FIELD_DESC);
				oprot.writeI32(struct.num);
				oprot.writeFieldEnd();
			}
			if (struct.sort != null) {
				if (struct.isSetSort()) {
					oprot.writeFieldBegin(SORT_FIELD_DESC);
					{
						oprot.writeListBegin(new org.apache.thrift.protocol.TList(
								org.apache.thrift.protocol.TType.STRING, struct.sort.size()));
						for (java.lang.String _iter11 : struct.sort) {
							oprot.writeString(_iter11);
						}
						oprot.writeListEnd();
					}
					oprot.writeFieldEnd();
				}
			}
			if (struct.keyJson != null) {
				if (struct.isSetKeyJson()) {
					oprot.writeFieldBegin(KEY_JSON_FIELD_DESC);
					oprot.writeString(struct.keyJson);
					oprot.writeFieldEnd();
				}
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class QueryMetaTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public QueryMetaTupleScheme getScheme() {
			return new QueryMetaTupleScheme();
		}

	}

	private static class QueryMetaTupleScheme extends org.apache.thrift.scheme.TupleScheme<QueryMeta> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, QueryMeta struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetCount()) {
				optionals.set(0);
			}
			if (struct.isSetLimit()) {
				optionals.set(1);
			}
			if (struct.isSetPage()) {
				optionals.set(2);
			}
			if (struct.isSetSkip()) {
				optionals.set(3);
			}
			if (struct.isSetNum()) {
				optionals.set(4);
			}
			if (struct.isSetSort()) {
				optionals.set(5);
			}
			if (struct.isSetKeyJson()) {
				optionals.set(6);
			}
			oprot.writeBitSet(optionals, 7);
			if (struct.isSetCount()) {
				oprot.writeI32(struct.count);
			}
			if (struct.isSetLimit()) {
				oprot.writeI32(struct.limit);
			}
			if (struct.isSetPage()) {
				oprot.writeI32(struct.page);
			}
			if (struct.isSetSkip()) {
				oprot.writeI32(struct.skip);
			}
			if (struct.isSetNum()) {
				oprot.writeI32(struct.num);
			}
			if (struct.isSetSort()) {
				{
					oprot.writeI32(struct.sort.size());
					for (java.lang.String _iter12 : struct.sort) {
						oprot.writeString(_iter12);
					}
				}
			}
			if (struct.isSetKeyJson()) {
				oprot.writeString(struct.keyJson);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, QueryMeta struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(7);
			if (incoming.get(0)) {
				struct.count = iprot.readI32();
				struct.setCountIsSet(true);
			}
			if (incoming.get(1)) {
				struct.limit = iprot.readI32();
				struct.setLimitIsSet(true);
			}
			if (incoming.get(2)) {
				struct.page = iprot.readI32();
				struct.setPageIsSet(true);
			}
			if (incoming.get(3)) {
				struct.skip = iprot.readI32();
				struct.setSkipIsSet(true);
			}
			if (incoming.get(4)) {
				struct.num = iprot.readI32();
				struct.setNumIsSet(true);
			}
			if (incoming.get(5)) {
				{
					org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(
							org.apache.thrift.protocol.TType.STRING, iprot.readI32());
					struct.sort = new java.util.ArrayList<java.lang.String>(_list13.size);
					@org.apache.thrift.annotation.Nullable
					java.lang.String _elem14;
					for (int _i15 = 0; _i15 < _list13.size; ++_i15) {
						_elem14 = iprot.readString();
						struct.sort.add(_elem14);
					}
				}
				struct.setSortIsSet(true);
			}
			if (incoming.get(6)) {
				struct.keyJson = iprot.readString();
				struct.setKeyJsonIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
