/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.base;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-01-02")
public class Error extends org.apache.thrift.TException
		implements org.apache.thrift.TBase<Error, Error._Fields>, java.io.Serializable, Cloneable, Comparable<Error> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"Error");

	private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"code", org.apache.thrift.protocol.TType.I32, (short) 1);

	private static final org.apache.thrift.protocol.TField DETAIL_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"detail", org.apache.thrift.protocol.TType.STRING, (short) 2);

	private static final org.apache.thrift.protocol.TField PREFIX_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"prefix", org.apache.thrift.protocol.TType.STRING, (short) 3);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ErrorStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ErrorTupleSchemeFactory();

	public int code; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String detail; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String prefix; // required

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		CODE((short) 1, "code"), DETAIL((short) 2, "detail"), PREFIX((short) 3, "prefix");

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
			case 1: // CODE
				return CODE;
			case 2: // DETAIL
				return DETAIL;
			case 3: // PREFIX
				return PREFIX;
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
	private static final int __CODE_ISSET_ID = 0;

	private byte __isset_bitfield = 0;

	public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.CODE,
				new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		tmpMap.put(_Fields.DETAIL,
				new org.apache.thrift.meta_data.FieldMetaData("detail", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.PREFIX,
				new org.apache.thrift.meta_data.FieldMetaData("prefix", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Error.class, metaDataMap);
	}

	public Error() {
	}

	public Error(int code, java.lang.String detail, java.lang.String prefix) {
		this();
		this.code = code;
		setCodeIsSet(true);
		this.detail = detail;
		this.prefix = prefix;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public Error(Error other) {
		__isset_bitfield = other.__isset_bitfield;
		this.code = other.code;
		if (other.isSetDetail()) {
			this.detail = other.detail;
		}
		if (other.isSetPrefix()) {
			this.prefix = other.prefix;
		}
	}

	public Error deepCopy() {
		return new Error(this);
	}

	@Override
	public void clear() {
		setCodeIsSet(false);
		this.code = 0;
		this.detail = null;
		this.prefix = null;
	}

	public int getCode() {
		return this.code;
	}

	public Error setCode(int code) {
		this.code = code;
		setCodeIsSet(true);
		return this;
	}

	public void unsetCode() {
		__isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CODE_ISSET_ID);
	}

	/**
	 * Returns true if field code is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetCode() {
		return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CODE_ISSET_ID);
	}

	public void setCodeIsSet(boolean value) {
		__isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CODE_ISSET_ID, value);
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getDetail() {
		return this.detail;
	}

	public Error setDetail(@org.apache.thrift.annotation.Nullable java.lang.String detail) {
		this.detail = detail;
		return this;
	}

	public void unsetDetail() {
		this.detail = null;
	}

	/**
	 * Returns true if field detail is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetDetail() {
		return this.detail != null;
	}

	public void setDetailIsSet(boolean value) {
		if (!value) {
			this.detail = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getPrefix() {
		return this.prefix;
	}

	public Error setPrefix(@org.apache.thrift.annotation.Nullable java.lang.String prefix) {
		this.prefix = prefix;
		return this;
	}

	public void unsetPrefix() {
		this.prefix = null;
	}

	/**
	 * Returns true if field prefix is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetPrefix() {
		return this.prefix != null;
	}

	public void setPrefixIsSet(boolean value) {
		if (!value) {
			this.prefix = null;
		}
	}

	public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
		switch (field) {
		case CODE:
			if (value == null) {
				unsetCode();
			}
			else {
				setCode((java.lang.Integer) value);
			}
			break;

		case DETAIL:
			if (value == null) {
				unsetDetail();
			}
			else {
				setDetail((java.lang.String) value);
			}
			break;

		case PREFIX:
			if (value == null) {
				unsetPrefix();
			}
			else {
				setPrefix((java.lang.String) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case CODE:
			return getCode();

		case DETAIL:
			return getDetail();

		case PREFIX:
			return getPrefix();

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
		case CODE:
			return isSetCode();
		case DETAIL:
			return isSetDetail();
		case PREFIX:
			return isSetPrefix();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof Error)
			return this.equals((Error) that);
		return false;
	}

	public boolean equals(Error that) {
		if (that == null)
			return false;
		if (this == that)
			return true;

		boolean this_present_code = true;
		boolean that_present_code = true;
		if (this_present_code || that_present_code) {
			if (!(this_present_code && that_present_code))
				return false;
			if (this.code != that.code)
				return false;
		}

		boolean this_present_detail = true && this.isSetDetail();
		boolean that_present_detail = true && that.isSetDetail();
		if (this_present_detail || that_present_detail) {
			if (!(this_present_detail && that_present_detail))
				return false;
			if (!this.detail.equals(that.detail))
				return false;
		}

		boolean this_present_prefix = true && this.isSetPrefix();
		boolean that_present_prefix = true && that.isSetPrefix();
		if (this_present_prefix || that_present_prefix) {
			if (!(this_present_prefix && that_present_prefix))
				return false;
			if (!this.prefix.equals(that.prefix))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int hashCode = 1;

		hashCode = hashCode * 8191 + code;

		hashCode = hashCode * 8191 + ((isSetDetail()) ? 131071 : 524287);
		if (isSetDetail())
			hashCode = hashCode * 8191 + detail.hashCode();

		hashCode = hashCode * 8191 + ((isSetPrefix()) ? 131071 : 524287);
		if (isSetPrefix())
			hashCode = hashCode * 8191 + prefix.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(Error other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

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
		lastComparison = java.lang.Boolean.valueOf(isSetDetail()).compareTo(other.isSetDetail());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetDetail()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.detail, other.detail);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetPrefix()).compareTo(other.isSetPrefix());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetPrefix()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.prefix, other.prefix);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(");
		boolean first = true;

		sb.append("code:");
		sb.append(this.code);
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("detail:");
		if (this.detail == null) {
			sb.append("null");
		}
		else {
			sb.append(this.detail);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("prefix:");
		if (this.prefix == null) {
			sb.append("null");
		}
		else {
			sb.append(this.prefix);
		}
		first = false;
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

	private static class ErrorStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ErrorStandardScheme getScheme() {
			return new ErrorStandardScheme();
		}

	}

	private static class ErrorStandardScheme extends org.apache.thrift.scheme.StandardScheme<Error> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, Error struct) throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // CODE
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.code = iprot.readI32();
						struct.setCodeIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // DETAIL
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.detail = iprot.readString();
						struct.setDetailIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // PREFIX
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.prefix = iprot.readString();
						struct.setPrefixIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, Error struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			oprot.writeFieldBegin(CODE_FIELD_DESC);
			oprot.writeI32(struct.code);
			oprot.writeFieldEnd();
			if (struct.detail != null) {
				oprot.writeFieldBegin(DETAIL_FIELD_DESC);
				oprot.writeString(struct.detail);
				oprot.writeFieldEnd();
			}
			if (struct.prefix != null) {
				oprot.writeFieldBegin(PREFIX_FIELD_DESC);
				oprot.writeString(struct.prefix);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class ErrorTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ErrorTupleScheme getScheme() {
			return new ErrorTupleScheme();
		}

	}

	private static class ErrorTupleScheme extends org.apache.thrift.scheme.TupleScheme<Error> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, Error struct) throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetCode()) {
				optionals.set(0);
			}
			if (struct.isSetDetail()) {
				optionals.set(1);
			}
			if (struct.isSetPrefix()) {
				optionals.set(2);
			}
			oprot.writeBitSet(optionals, 3);
			if (struct.isSetCode()) {
				oprot.writeI32(struct.code);
			}
			if (struct.isSetDetail()) {
				oprot.writeString(struct.detail);
			}
			if (struct.isSetPrefix()) {
				oprot.writeString(struct.prefix);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, Error struct) throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(3);
			if (incoming.get(0)) {
				struct.code = iprot.readI32();
				struct.setCodeIsSet(true);
			}
			if (incoming.get(1)) {
				struct.detail = iprot.readString();
				struct.setDetailIsSet(true);
			}
			if (incoming.get(2)) {
				struct.prefix = iprot.readString();
				struct.setPrefixIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
