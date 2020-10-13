/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.user;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * 特定参数: 行政区划 有效条件：key 或 code 或 name 填写一个
 */
public class ArgDivision implements org.apache.thrift.TBase<ArgDivision, ArgDivision._Fields>, java.io.Serializable,
		Cloneable, Comparable<ArgDivision> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"ArgDivision");

	private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key",
			org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"code", org.apache.thrift.protocol.TType.STRING, (short) 2);

	private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"name", org.apache.thrift.protocol.TType.STRING, (short) 3);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ArgDivisionStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ArgDivisionTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String key; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String code; // optional

	public @org.apache.thrift.annotation.Nullable java.lang.String name; // optional

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		KEY((short) 1, "key"), CODE((short) 2, "code"), NAME((short) 3, "name");

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
			case 2: // CODE
				return CODE;
			case 3: // NAME
				return NAME;
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
	private static final _Fields optionals[] = { _Fields.CODE, _Fields.NAME };

	public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.KEY,
				new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.CODE,
				new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.NAME,
				new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ArgDivision.class, metaDataMap);
	}

	public ArgDivision() {
	}

	public ArgDivision(java.lang.String key) {
		this();
		this.key = key;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public ArgDivision(ArgDivision other) {
		if (other.isSetKey()) {
			this.key = other.key;
		}
		if (other.isSetCode()) {
			this.code = other.code;
		}
		if (other.isSetName()) {
			this.name = other.name;
		}
	}

	public ArgDivision deepCopy() {
		return new ArgDivision(this);
	}

	@Override
	public void clear() {
		this.key = null;
		this.code = null;
		this.name = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getKey() {
		return this.key;
	}

	public ArgDivision setKey(@org.apache.thrift.annotation.Nullable java.lang.String key) {
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

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getCode() {
		return this.code;
	}

	public ArgDivision setCode(@org.apache.thrift.annotation.Nullable java.lang.String code) {
		this.code = code;
		return this;
	}

	public void unsetCode() {
		this.code = null;
	}

	/**
	 * Returns true if field code is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetCode() {
		return this.code != null;
	}

	public void setCodeIsSet(boolean value) {
		if (!value) {
			this.code = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getName() {
		return this.name;
	}

	public ArgDivision setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
		this.name = name;
		return this;
	}

	public void unsetName() {
		this.name = null;
	}

	/**
	 * Returns true if field name is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetName() {
		return this.name != null;
	}

	public void setNameIsSet(boolean value) {
		if (!value) {
			this.name = null;
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

		case CODE:
			if (value == null) {
				unsetCode();
			}
			else {
				setCode((java.lang.String) value);
			}
			break;

		case NAME:
			if (value == null) {
				unsetName();
			}
			else {
				setName((java.lang.String) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case KEY:
			return getKey();

		case CODE:
			return getCode();

		case NAME:
			return getName();

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
		case CODE:
			return isSetCode();
		case NAME:
			return isSetName();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof ArgDivision)
			return this.equals((ArgDivision) that);
		return false;
	}

	public boolean equals(ArgDivision that) {
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

		boolean this_present_code = true && this.isSetCode();
		boolean that_present_code = true && that.isSetCode();
		if (this_present_code || that_present_code) {
			if (!(this_present_code && that_present_code))
				return false;
			if (!this.code.equals(that.code))
				return false;
		}

		boolean this_present_name = true && this.isSetName();
		boolean that_present_name = true && that.isSetName();
		if (this_present_name || that_present_name) {
			if (!(this_present_name && that_present_name))
				return false;
			if (!this.name.equals(that.name))
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

		hashCode = hashCode * 8191 + ((isSetCode()) ? 131071 : 524287);
		if (isSetCode())
			hashCode = hashCode * 8191 + code.hashCode();

		hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
		if (isSetName())
			hashCode = hashCode * 8191 + name.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(ArgDivision other) {
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
		lastComparison = java.lang.Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetCode()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetName()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("ArgDivision(");
		boolean first = true;

		sb.append("key:");
		if (this.key == null) {
			sb.append("null");
		}
		else {
			sb.append(this.key);
		}
		first = false;
		if (isSetCode()) {
			if (!first)
				sb.append(", ");
			sb.append("code:");
			if (this.code == null) {
				sb.append("null");
			}
			else {
				sb.append(this.code);
			}
			first = false;
		}
		if (isSetName()) {
			if (!first)
				sb.append(", ");
			sb.append("name:");
			if (this.name == null) {
				sb.append("null");
			}
			else {
				sb.append(this.name);
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
			read(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(in)));
		}
		catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private static class ArgDivisionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ArgDivisionStandardScheme getScheme() {
			return new ArgDivisionStandardScheme();
		}

	}

	private static class ArgDivisionStandardScheme extends org.apache.thrift.scheme.StandardScheme<ArgDivision> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, ArgDivision struct)
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
				case 2: // CODE
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.code = iprot.readString();
						struct.setCodeIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // NAME
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.name = iprot.readString();
						struct.setNameIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, ArgDivision struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.key != null) {
				oprot.writeFieldBegin(KEY_FIELD_DESC);
				oprot.writeString(struct.key);
				oprot.writeFieldEnd();
			}
			if (struct.code != null) {
				if (struct.isSetCode()) {
					oprot.writeFieldBegin(CODE_FIELD_DESC);
					oprot.writeString(struct.code);
					oprot.writeFieldEnd();
				}
			}
			if (struct.name != null) {
				if (struct.isSetName()) {
					oprot.writeFieldBegin(NAME_FIELD_DESC);
					oprot.writeString(struct.name);
					oprot.writeFieldEnd();
				}
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class ArgDivisionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ArgDivisionTupleScheme getScheme() {
			return new ArgDivisionTupleScheme();
		}

	}

	private static class ArgDivisionTupleScheme extends org.apache.thrift.scheme.TupleScheme<ArgDivision> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, ArgDivision struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetKey()) {
				optionals.set(0);
			}
			if (struct.isSetCode()) {
				optionals.set(1);
			}
			if (struct.isSetName()) {
				optionals.set(2);
			}
			oprot.writeBitSet(optionals, 3);
			if (struct.isSetKey()) {
				oprot.writeString(struct.key);
			}
			if (struct.isSetCode()) {
				oprot.writeString(struct.code);
			}
			if (struct.isSetName()) {
				oprot.writeString(struct.name);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, ArgDivision struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(3);
			if (incoming.get(0)) {
				struct.key = iprot.readString();
				struct.setKeyIsSet(true);
			}
			if (incoming.get(1)) {
				struct.code = iprot.readString();
				struct.setCodeIsSet(true);
			}
			if (incoming.get(2)) {
				struct.name = iprot.readString();
				struct.setNameIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
