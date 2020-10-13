/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.user;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * 接口一览及权限定义
 */
public class ApiUnit implements org.apache.thrift.TBase<ApiUnit, ApiUnit._Fields>, java.io.Serializable, Cloneable,
		Comparable<ApiUnit> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"ApiUnit");

	private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key",
			org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.protocol.TField PERMS_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"perms", org.apache.thrift.protocol.TType.LIST, (short) 2);

	private static final org.apache.thrift.protocol.TField IS_OR_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"isOr", org.apache.thrift.protocol.TType.BOOL, (short) 5);

	private static final org.apache.thrift.protocol.TField MODEL_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"model", org.apache.thrift.protocol.TType.STRING, (short) 3);

	private static final org.apache.thrift.protocol.TField DESC_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"desc", org.apache.thrift.protocol.TType.STRING, (short) 4);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ApiUnitStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ApiUnitTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String key; // required

	public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> perms; // required

	public boolean isOr; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String model; // optional

	public @org.apache.thrift.annotation.Nullable java.lang.String desc; // optional

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		KEY((short) 1, "key"), PERMS((short) 2, "perms"), IS_OR((short) 5, "isOr"), MODEL((short) 3,
				"model"), DESC((short) 4, "desc");

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
			case 1: // KEY
				return KEY;
			case 2: // PERMS
				return PERMS;
			case 5: // IS_OR
				return IS_OR;
			case 3: // MODEL
				return MODEL;
			case 4: // DESC
				return DESC;
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
	private static final int __ISOR_ISSET_ID = 0;

	private byte __isset_bitfield = 0;

	private static final _Fields optionals[] = { _Fields.MODEL, _Fields.DESC };

	public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.KEY,
				new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.PERMS, new org.apache.thrift.meta_data.FieldMetaData("perms",
				org.apache.thrift.TFieldRequirementType.DEFAULT,
				new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
		tmpMap.put(_Fields.IS_OR,
				new org.apache.thrift.meta_data.FieldMetaData("isOr", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
		tmpMap.put(_Fields.MODEL,
				new org.apache.thrift.meta_data.FieldMetaData("model", org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.DESC,
				new org.apache.thrift.meta_data.FieldMetaData("desc", org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ApiUnit.class, metaDataMap);
	}

	public ApiUnit() {
	}

	public ApiUnit(java.lang.String key, java.util.List<java.lang.String> perms, boolean isOr) {
		this();
		this.key = key;
		this.perms = perms;
		this.isOr = isOr;
		setIsOrIsSet(true);
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public ApiUnit(ApiUnit other) {
		__isset_bitfield = other.__isset_bitfield;
		if (other.isSetKey()) {
			this.key = other.key;
		}
		if (other.isSetPerms()) {
			java.util.List<java.lang.String> __this__perms = new java.util.ArrayList<java.lang.String>(other.perms);
			this.perms = __this__perms;
		}
		this.isOr = other.isOr;
		if (other.isSetModel()) {
			this.model = other.model;
		}
		if (other.isSetDesc()) {
			this.desc = other.desc;
		}
	}

	public ApiUnit deepCopy() {
		return new ApiUnit(this);
	}

	@Override
	public void clear() {
		this.key = null;
		this.perms = null;
		setIsOrIsSet(false);
		this.isOr = false;
		this.model = null;
		this.desc = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getKey() {
		return this.key;
	}

	public ApiUnit setKey(@org.apache.thrift.annotation.Nullable java.lang.String key) {
		this.key = key;
		return this;
	}

	public void unsetKey() {
		this.key = null;
	}

	/**
	 * Returns true if field key is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetKey() {
		return this.key != null;
	}

	public void setKeyIsSet(boolean value) {
		if (!value) {
			this.key = null;
		}
	}

	public int getPermsSize() {
		return (this.perms == null) ? 0 : this.perms.size();
	}

	@org.apache.thrift.annotation.Nullable
	public java.util.Iterator<java.lang.String> getPermsIterator() {
		return (this.perms == null) ? null : this.perms.iterator();
	}

	public void addToPerms(java.lang.String elem) {
		if (this.perms == null) {
			this.perms = new java.util.ArrayList<java.lang.String>();
		}
		this.perms.add(elem);
	}

	@org.apache.thrift.annotation.Nullable
	public java.util.List<java.lang.String> getPerms() {
		return this.perms;
	}

	public ApiUnit setPerms(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> perms) {
		this.perms = perms;
		return this;
	}

	public void unsetPerms() {
		this.perms = null;
	}

	/**
	 * Returns true if field perms is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetPerms() {
		return this.perms != null;
	}

	public void setPermsIsSet(boolean value) {
		if (!value) {
			this.perms = null;
		}
	}

	public boolean isIsOr() {
		return this.isOr;
	}

	public ApiUnit setIsOr(boolean isOr) {
		this.isOr = isOr;
		setIsOrIsSet(true);
		return this;
	}

	public void unsetIsOr() {
		__isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISOR_ISSET_ID);
	}

	/**
	 * Returns true if field isOr is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetIsOr() {
		return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISOR_ISSET_ID);
	}

	public void setIsOrIsSet(boolean value) {
		__isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISOR_ISSET_ID, value);
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getModel() {
		return this.model;
	}

	public ApiUnit setModel(@org.apache.thrift.annotation.Nullable java.lang.String model) {
		this.model = model;
		return this;
	}

	public void unsetModel() {
		this.model = null;
	}

	/**
	 * Returns true if field model is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetModel() {
		return this.model != null;
	}

	public void setModelIsSet(boolean value) {
		if (!value) {
			this.model = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getDesc() {
		return this.desc;
	}

	public ApiUnit setDesc(@org.apache.thrift.annotation.Nullable java.lang.String desc) {
		this.desc = desc;
		return this;
	}

	public void unsetDesc() {
		this.desc = null;
	}

	/**
	 * Returns true if field desc is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetDesc() {
		return this.desc != null;
	}

	public void setDescIsSet(boolean value) {
		if (!value) {
			this.desc = null;
		}
	}

	public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
		switch (field) {
		case KEY:
			if (value == null) {
				unsetKey();
			}
			else {
				setKey((java.lang.String) value);
			}
			break;

		case PERMS:
			if (value == null) {
				unsetPerms();
			}
			else {
				setPerms((java.util.List<java.lang.String>) value);
			}
			break;

		case IS_OR:
			if (value == null) {
				unsetIsOr();
			}
			else {
				setIsOr((java.lang.Boolean) value);
			}
			break;

		case MODEL:
			if (value == null) {
				unsetModel();
			}
			else {
				setModel((java.lang.String) value);
			}
			break;

		case DESC:
			if (value == null) {
				unsetDesc();
			}
			else {
				setDesc((java.lang.String) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case KEY:
			return getKey();

		case PERMS:
			return getPerms();

		case IS_OR:
			return isIsOr();

		case MODEL:
			return getModel();

		case DESC:
			return getDesc();

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
		case KEY:
			return isSetKey();
		case PERMS:
			return isSetPerms();
		case IS_OR:
			return isSetIsOr();
		case MODEL:
			return isSetModel();
		case DESC:
			return isSetDesc();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof ApiUnit)
			return this.equals((ApiUnit) that);
		return false;
	}

	public boolean equals(ApiUnit that) {
		if (that == null)
			return false;
		if (this == that)
			return true;

		boolean this_present_key = true && this.isSetKey();
		boolean that_present_key = true && that.isSetKey();
		if (this_present_key || that_present_key) {
			if (!(this_present_key && that_present_key))
				return false;
			if (!this.key.equals(that.key))
				return false;
		}

		boolean this_present_perms = true && this.isSetPerms();
		boolean that_present_perms = true && that.isSetPerms();
		if (this_present_perms || that_present_perms) {
			if (!(this_present_perms && that_present_perms))
				return false;
			if (!this.perms.equals(that.perms))
				return false;
		}

		boolean this_present_isOr = true;
		boolean that_present_isOr = true;
		if (this_present_isOr || that_present_isOr) {
			if (!(this_present_isOr && that_present_isOr))
				return false;
			if (this.isOr != that.isOr)
				return false;
		}

		boolean this_present_model = true && this.isSetModel();
		boolean that_present_model = true && that.isSetModel();
		if (this_present_model || that_present_model) {
			if (!(this_present_model && that_present_model))
				return false;
			if (!this.model.equals(that.model))
				return false;
		}

		boolean this_present_desc = true && this.isSetDesc();
		boolean that_present_desc = true && that.isSetDesc();
		if (this_present_desc || that_present_desc) {
			if (!(this_present_desc && that_present_desc))
				return false;
			if (!this.desc.equals(that.desc))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int hashCode = 1;

		hashCode = hashCode * 8191 + ((isSetKey()) ? 131071 : 524287);
		if (isSetKey())
			hashCode = hashCode * 8191 + key.hashCode();

		hashCode = hashCode * 8191 + ((isSetPerms()) ? 131071 : 524287);
		if (isSetPerms())
			hashCode = hashCode * 8191 + perms.hashCode();

		hashCode = hashCode * 8191 + ((isOr) ? 131071 : 524287);

		hashCode = hashCode * 8191 + ((isSetModel()) ? 131071 : 524287);
		if (isSetModel())
			hashCode = hashCode * 8191 + model.hashCode();

		hashCode = hashCode * 8191 + ((isSetDesc()) ? 131071 : 524287);
		if (isSetDesc())
			hashCode = hashCode * 8191 + desc.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(ApiUnit other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = java.lang.Boolean.valueOf(isSetKey()).compareTo(other.isSetKey());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetKey()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key, other.key);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetPerms()).compareTo(other.isSetPerms());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetPerms()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.perms, other.perms);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetIsOr()).compareTo(other.isSetIsOr());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetIsOr()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isOr, other.isOr);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetModel()).compareTo(other.isSetModel());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetModel()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.model, other.model);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetDesc()).compareTo(other.isSetDesc());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetDesc()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.desc, other.desc);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("ApiUnit(");
		boolean first = true;

		sb.append("key:");
		if (this.key == null) {
			sb.append("null");
		}
		else {
			sb.append(this.key);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("perms:");
		if (this.perms == null) {
			sb.append("null");
		}
		else {
			sb.append(this.perms);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("isOr:");
		sb.append(this.isOr);
		first = false;
		if (isSetModel()) {
			if (!first)
				sb.append(", ");
			sb.append("model:");
			if (this.model == null) {
				sb.append("null");
			}
			else {
				sb.append(this.model);
			}
			first = false;
		}
		if (isSetDesc()) {
			if (!first)
				sb.append(", ");
			sb.append("desc:");
			if (this.desc == null) {
				sb.append("null");
			}
			else {
				sb.append(this.desc);
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

	private static class ApiUnitStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ApiUnitStandardScheme getScheme() {
			return new ApiUnitStandardScheme();
		}

	}

	private static class ApiUnitStandardScheme extends org.apache.thrift.scheme.StandardScheme<ApiUnit> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, ApiUnit struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // KEY
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.key = iprot.readString();
						struct.setKeyIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // PERMS
					if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
						{
							org.apache.thrift.protocol.TList _list78 = iprot.readListBegin();
							struct.perms = new java.util.ArrayList<java.lang.String>(_list78.size);
							@org.apache.thrift.annotation.Nullable
							java.lang.String _elem79;
							for (int _i80 = 0; _i80 < _list78.size; ++_i80) {
								_elem79 = iprot.readString();
								struct.perms.add(_elem79);
							}
							iprot.readListEnd();
						}
						struct.setPermsIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 5: // IS_OR
					if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
						struct.isOr = iprot.readBool();
						struct.setIsOrIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // MODEL
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.model = iprot.readString();
						struct.setModelIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 4: // DESC
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.desc = iprot.readString();
						struct.setDescIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, ApiUnit struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.key != null) {
				oprot.writeFieldBegin(KEY_FIELD_DESC);
				oprot.writeString(struct.key);
				oprot.writeFieldEnd();
			}
			if (struct.perms != null) {
				oprot.writeFieldBegin(PERMS_FIELD_DESC);
				{
					oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING,
							struct.perms.size()));
					for (java.lang.String _iter81 : struct.perms) {
						oprot.writeString(_iter81);
					}
					oprot.writeListEnd();
				}
				oprot.writeFieldEnd();
			}
			if (struct.model != null) {
				if (struct.isSetModel()) {
					oprot.writeFieldBegin(MODEL_FIELD_DESC);
					oprot.writeString(struct.model);
					oprot.writeFieldEnd();
				}
			}
			if (struct.desc != null) {
				if (struct.isSetDesc()) {
					oprot.writeFieldBegin(DESC_FIELD_DESC);
					oprot.writeString(struct.desc);
					oprot.writeFieldEnd();
				}
			}
			oprot.writeFieldBegin(IS_OR_FIELD_DESC);
			oprot.writeBool(struct.isOr);
			oprot.writeFieldEnd();
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class ApiUnitTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ApiUnitTupleScheme getScheme() {
			return new ApiUnitTupleScheme();
		}

	}

	private static class ApiUnitTupleScheme extends org.apache.thrift.scheme.TupleScheme<ApiUnit> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, ApiUnit struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetKey()) {
				optionals.set(0);
			}
			if (struct.isSetPerms()) {
				optionals.set(1);
			}
			if (struct.isSetIsOr()) {
				optionals.set(2);
			}
			if (struct.isSetModel()) {
				optionals.set(3);
			}
			if (struct.isSetDesc()) {
				optionals.set(4);
			}
			oprot.writeBitSet(optionals, 5);
			if (struct.isSetKey()) {
				oprot.writeString(struct.key);
			}
			if (struct.isSetPerms()) {
				{
					oprot.writeI32(struct.perms.size());
					for (java.lang.String _iter82 : struct.perms) {
						oprot.writeString(_iter82);
					}
				}
			}
			if (struct.isSetIsOr()) {
				oprot.writeBool(struct.isOr);
			}
			if (struct.isSetModel()) {
				oprot.writeString(struct.model);
			}
			if (struct.isSetDesc()) {
				oprot.writeString(struct.desc);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, ApiUnit struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(5);
			if (incoming.get(0)) {
				struct.key = iprot.readString();
				struct.setKeyIsSet(true);
			}
			if (incoming.get(1)) {
				{
					org.apache.thrift.protocol.TList _list83 = new org.apache.thrift.protocol.TList(
							org.apache.thrift.protocol.TType.STRING, iprot.readI32());
					struct.perms = new java.util.ArrayList<java.lang.String>(_list83.size);
					@org.apache.thrift.annotation.Nullable
					java.lang.String _elem84;
					for (int _i85 = 0; _i85 < _list83.size; ++_i85) {
						_elem84 = iprot.readString();
						struct.perms.add(_elem84);
					}
				}
				struct.setPermsIsSet(true);
			}
			if (incoming.get(2)) {
				struct.isOr = iprot.readBool();
				struct.setIsOrIsSet(true);
			}
			if (incoming.get(3)) {
				struct.model = iprot.readString();
				struct.setModelIsSet(true);
			}
			if (incoming.get(4)) {
				struct.desc = iprot.readString();
				struct.setDescIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
