/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.base;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-01-10")
public class ArgQuery implements org.apache.thrift.TBase<ArgQuery, ArgQuery._Fields>, java.io.Serializable, Cloneable,
		Comparable<ArgQuery> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"ArgQuery");

	private static final org.apache.thrift.protocol.TField LIMIT_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"limit", org.apache.thrift.protocol.TType.I32, (short) 1);

	private static final org.apache.thrift.protocol.TField PAGE_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"page", org.apache.thrift.protocol.TType.I32, (short) 2);

	private static final org.apache.thrift.protocol.TField SKIP_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"skip", org.apache.thrift.protocol.TType.I32, (short) 3);

	private static final org.apache.thrift.protocol.TField SORT_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"sort", org.apache.thrift.protocol.TType.LIST, (short) 4);

	private static final org.apache.thrift.protocol.TField KEY_JSON_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"keyJson", org.apache.thrift.protocol.TType.STRING, (short) 5);

	private static final org.apache.thrift.protocol.TField COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"count", org.apache.thrift.protocol.TType.I32, (short) 6);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ArgQueryStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ArgQueryTupleSchemeFactory();

	public int limit; // required

	public int page; // optional

	public int skip; // optional

	public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> sort; // optional

	public @org.apache.thrift.annotation.Nullable java.lang.String keyJson; // optional

	public int count; // optional

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		LIMIT((short) 1, "limit"), PAGE((short) 2, "page"), SKIP((short) 3, "skip"), SORT((short) 4,
				"sort"), KEY_JSON((short) 5, "keyJson"), COUNT((short) 6, "count");

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
			case 1: // LIMIT
				return LIMIT;
			case 2: // PAGE
				return PAGE;
			case 3: // SKIP
				return SKIP;
			case 4: // SORT
				return SORT;
			case 5: // KEY_JSON
				return KEY_JSON;
			case 6: // COUNT
				return COUNT;
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
	private static final int __LIMIT_ISSET_ID = 0;

	private static final int __PAGE_ISSET_ID = 1;

	private static final int __SKIP_ISSET_ID = 2;

	private static final int __COUNT_ISSET_ID = 3;

	private byte __isset_bitfield = 0;

	private static final _Fields optionals[] = { _Fields.PAGE, _Fields.SKIP, _Fields.SORT, _Fields.KEY_JSON,
			_Fields.COUNT };

	public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.LIMIT,
				new org.apache.thrift.meta_data.FieldMetaData("limit", org.apache.thrift.TFieldRequirementType.REQUIRED,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		tmpMap.put(_Fields.PAGE,
				new org.apache.thrift.meta_data.FieldMetaData("page", org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		tmpMap.put(_Fields.SKIP,
				new org.apache.thrift.meta_data.FieldMetaData("skip", org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		tmpMap.put(_Fields.SORT, new org.apache.thrift.meta_data.FieldMetaData("sort",
				org.apache.thrift.TFieldRequirementType.OPTIONAL,
				new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
		tmpMap.put(_Fields.KEY_JSON,
				new org.apache.thrift.meta_data.FieldMetaData("keyJson",
						org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.COUNT,
				new org.apache.thrift.meta_data.FieldMetaData("count", org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ArgQuery.class, metaDataMap);
	}

	public ArgQuery() {
	}

	public ArgQuery(int limit) {
		this();
		this.limit = limit;
		setLimitIsSet(true);
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public ArgQuery(ArgQuery other) {
		__isset_bitfield = other.__isset_bitfield;
		this.limit = other.limit;
		this.page = other.page;
		this.skip = other.skip;
		if (other.isSetSort()) {
			java.util.List<java.lang.String> __this__sort = new java.util.ArrayList<java.lang.String>(other.sort);
			this.sort = __this__sort;
		}
		if (other.isSetKeyJson()) {
			this.keyJson = other.keyJson;
		}
		this.count = other.count;
	}

	public ArgQuery deepCopy() {
		return new ArgQuery(this);
	}

	@Override
	public void clear() {
		setLimitIsSet(false);
		this.limit = 0;
		setPageIsSet(false);
		this.page = 0;
		setSkipIsSet(false);
		this.skip = 0;
		this.sort = null;
		this.keyJson = null;
		setCountIsSet(false);
		this.count = 0;
	}

	public int getLimit() {
		return this.limit;
	}

	public ArgQuery setLimit(int limit) {
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

	public ArgQuery setPage(int page) {
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

	public ArgQuery setSkip(int skip) {
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

	public ArgQuery setSort(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> sort) {
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

	public ArgQuery setKeyJson(@org.apache.thrift.annotation.Nullable java.lang.String keyJson) {
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

	public int getCount() {
		return this.count;
	}

	public ArgQuery setCount(int count) {
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

	public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
		switch (field) {
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

		case COUNT:
			if (value == null) {
				unsetCount();
			}
			else {
				setCount((java.lang.Integer) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case LIMIT:
			return getLimit();

		case PAGE:
			return getPage();

		case SKIP:
			return getSkip();

		case SORT:
			return getSort();

		case KEY_JSON:
			return getKeyJson();

		case COUNT:
			return getCount();

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
		case LIMIT:
			return isSetLimit();
		case PAGE:
			return isSetPage();
		case SKIP:
			return isSetSkip();
		case SORT:
			return isSetSort();
		case KEY_JSON:
			return isSetKeyJson();
		case COUNT:
			return isSetCount();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof ArgQuery)
			return this.equals((ArgQuery) that);
		return false;
	}

	public boolean equals(ArgQuery that) {
		if (that == null)
			return false;
		if (this == that)
			return true;

		boolean this_present_limit = true;
		boolean that_present_limit = true;
		if (this_present_limit || that_present_limit) {
			if (!(this_present_limit && that_present_limit))
				return false;
			if (this.limit != that.limit)
				return false;
		}

		boolean this_present_page = true && this.isSetPage();
		boolean that_present_page = true && that.isSetPage();
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

		boolean this_present_count = true && this.isSetCount();
		boolean that_present_count = true && that.isSetCount();
		if (this_present_count || that_present_count) {
			if (!(this_present_count && that_present_count))
				return false;
			if (this.count != that.count)
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int hashCode = 1;

		hashCode = hashCode * 8191 + limit;

		hashCode = hashCode * 8191 + ((isSetPage()) ? 131071 : 524287);
		if (isSetPage())
			hashCode = hashCode * 8191 + page;

		hashCode = hashCode * 8191 + ((isSetSkip()) ? 131071 : 524287);
		if (isSetSkip())
			hashCode = hashCode * 8191 + skip;

		hashCode = hashCode * 8191 + ((isSetSort()) ? 131071 : 524287);
		if (isSetSort())
			hashCode = hashCode * 8191 + sort.hashCode();

		hashCode = hashCode * 8191 + ((isSetKeyJson()) ? 131071 : 524287);
		if (isSetKeyJson())
			hashCode = hashCode * 8191 + keyJson.hashCode();

		hashCode = hashCode * 8191 + ((isSetCount()) ? 131071 : 524287);
		if (isSetCount())
			hashCode = hashCode * 8191 + count;

		return hashCode;
	}

	@Override
	public int compareTo(ArgQuery other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("ArgQuery(");
		boolean first = true;

		sb.append("limit:");
		sb.append(this.limit);
		first = false;
		if (isSetPage()) {
			if (!first)
				sb.append(", ");
			sb.append("page:");
			sb.append(this.page);
			first = false;
		}
		if (isSetSkip()) {
			if (!first)
				sb.append(", ");
			sb.append("skip:");
			sb.append(this.skip);
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
		if (isSetCount()) {
			if (!first)
				sb.append(", ");
			sb.append("count:");
			sb.append(this.count);
			first = false;
		}
		sb.append(")");
		return sb.toString();
	}

	public void validate() throws org.apache.thrift.TException {
		// check for required fields
		// alas, we cannot check 'limit' because it's a primitive and you chose the
		// non-beans generator.
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

	private static class ArgQueryStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ArgQueryStandardScheme getScheme() {
			return new ArgQueryStandardScheme();
		}

	}

	private static class ArgQueryStandardScheme extends org.apache.thrift.scheme.StandardScheme<ArgQuery> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, ArgQuery struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // LIMIT
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.limit = iprot.readI32();
						struct.setLimitIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // PAGE
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.page = iprot.readI32();
						struct.setPageIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // SKIP
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.skip = iprot.readI32();
						struct.setSkipIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 4: // SORT
					if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
						{
							org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
							struct.sort = new java.util.ArrayList<java.lang.String>(_list0.size);
							@org.apache.thrift.annotation.Nullable
							java.lang.String _elem1;
							for (int _i2 = 0; _i2 < _list0.size; ++_i2) {
								_elem1 = iprot.readString();
								struct.sort.add(_elem1);
							}
							iprot.readListEnd();
						}
						struct.setSortIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 5: // KEY_JSON
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.keyJson = iprot.readString();
						struct.setKeyJsonIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 6: // COUNT
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.count = iprot.readI32();
						struct.setCountIsSet(true);
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
			if (!struct.isSetLimit()) {
				throw new org.apache.thrift.protocol.TProtocolException(
						"Required field 'limit' was not found in serialized data! Struct: " + toString());
			}
			struct.validate();
		}

		public void write(org.apache.thrift.protocol.TProtocol oprot, ArgQuery struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			oprot.writeFieldBegin(LIMIT_FIELD_DESC);
			oprot.writeI32(struct.limit);
			oprot.writeFieldEnd();
			if (struct.isSetPage()) {
				oprot.writeFieldBegin(PAGE_FIELD_DESC);
				oprot.writeI32(struct.page);
				oprot.writeFieldEnd();
			}
			if (struct.isSetSkip()) {
				oprot.writeFieldBegin(SKIP_FIELD_DESC);
				oprot.writeI32(struct.skip);
				oprot.writeFieldEnd();
			}
			if (struct.sort != null) {
				if (struct.isSetSort()) {
					oprot.writeFieldBegin(SORT_FIELD_DESC);
					{
						oprot.writeListBegin(new org.apache.thrift.protocol.TList(
								org.apache.thrift.protocol.TType.STRING, struct.sort.size()));
						for (java.lang.String _iter3 : struct.sort) {
							oprot.writeString(_iter3);
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
			if (struct.isSetCount()) {
				oprot.writeFieldBegin(COUNT_FIELD_DESC);
				oprot.writeI32(struct.count);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class ArgQueryTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ArgQueryTupleScheme getScheme() {
			return new ArgQueryTupleScheme();
		}

	}

	private static class ArgQueryTupleScheme extends org.apache.thrift.scheme.TupleScheme<ArgQuery> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, ArgQuery struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			oprot.writeI32(struct.limit);
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetPage()) {
				optionals.set(0);
			}
			if (struct.isSetSkip()) {
				optionals.set(1);
			}
			if (struct.isSetSort()) {
				optionals.set(2);
			}
			if (struct.isSetKeyJson()) {
				optionals.set(3);
			}
			if (struct.isSetCount()) {
				optionals.set(4);
			}
			oprot.writeBitSet(optionals, 5);
			if (struct.isSetPage()) {
				oprot.writeI32(struct.page);
			}
			if (struct.isSetSkip()) {
				oprot.writeI32(struct.skip);
			}
			if (struct.isSetSort()) {
				{
					oprot.writeI32(struct.sort.size());
					for (java.lang.String _iter4 : struct.sort) {
						oprot.writeString(_iter4);
					}
				}
			}
			if (struct.isSetKeyJson()) {
				oprot.writeString(struct.keyJson);
			}
			if (struct.isSetCount()) {
				oprot.writeI32(struct.count);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, ArgQuery struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			struct.limit = iprot.readI32();
			struct.setLimitIsSet(true);
			java.util.BitSet incoming = iprot.readBitSet(5);
			if (incoming.get(0)) {
				struct.page = iprot.readI32();
				struct.setPageIsSet(true);
			}
			if (incoming.get(1)) {
				struct.skip = iprot.readI32();
				struct.setSkipIsSet(true);
			}
			if (incoming.get(2)) {
				{
					org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(
							org.apache.thrift.protocol.TType.STRING, iprot.readI32());
					struct.sort = new java.util.ArrayList<java.lang.String>(_list5.size);
					@org.apache.thrift.annotation.Nullable
					java.lang.String _elem6;
					for (int _i7 = 0; _i7 < _list5.size; ++_i7) {
						_elem6 = iprot.readString();
						struct.sort.add(_elem6);
					}
				}
				struct.setSortIsSet(true);
			}
			if (incoming.get(3)) {
				struct.keyJson = iprot.readString();
				struct.setKeyJsonIsSet(true);
			}
			if (incoming.get(4)) {
				struct.count = iprot.readI32();
				struct.setCountIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}