/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.user;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * 微信支付实例
 */
public class WeixinPay implements org.apache.thrift.TBase<WeixinPay, WeixinPay._Fields>, java.io.Serializable,
		Cloneable, Comparable<WeixinPay> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"WeixinPay");

	private static final org.apache.thrift.protocol.TField APP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"appId", org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.protocol.TField MCH_ID_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"mchId", org.apache.thrift.protocol.TType.STRING, (short) 2);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new WeixinPayStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new WeixinPayTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String appId; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String mchId; // required

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		APP_ID((short) 1, "appId"), MCH_ID((short) 2, "mchId");

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
			case 1: // APP_ID
				return APP_ID;
			case 2: // MCH_ID
				return MCH_ID;
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
	public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.APP_ID,
				new org.apache.thrift.meta_data.FieldMetaData("appId", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.MCH_ID,
				new org.apache.thrift.meta_data.FieldMetaData("mchId", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WeixinPay.class, metaDataMap);
	}

	public WeixinPay() {
	}

	public WeixinPay(java.lang.String appId, java.lang.String mchId) {
		this();
		this.appId = appId;
		this.mchId = mchId;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public WeixinPay(WeixinPay other) {
		if (other.isSetAppId()) {
			this.appId = other.appId;
		}
		if (other.isSetMchId()) {
			this.mchId = other.mchId;
		}
	}

	public WeixinPay deepCopy() {
		return new WeixinPay(this);
	}

	@Override
	public void clear() {
		this.appId = null;
		this.mchId = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getAppId() {
		return this.appId;
	}

	public WeixinPay setAppId(@org.apache.thrift.annotation.Nullable java.lang.String appId) {
		this.appId = appId;
		return this;
	}

	public void unsetAppId() {
		this.appId = null;
	}

	/**
	 * Returns true if field appId is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetAppId() {
		return this.appId != null;
	}

	public void setAppIdIsSet(boolean value) {
		if (!value) {
			this.appId = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getMchId() {
		return this.mchId;
	}

	public WeixinPay setMchId(@org.apache.thrift.annotation.Nullable java.lang.String mchId) {
		this.mchId = mchId;
		return this;
	}

	public void unsetMchId() {
		this.mchId = null;
	}

	/**
	 * Returns true if field mchId is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetMchId() {
		return this.mchId != null;
	}

	public void setMchIdIsSet(boolean value) {
		if (!value) {
			this.mchId = null;
		}
	}

	public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
		switch (field) {
		case APP_ID:
			if (value == null) {
				unsetAppId();
			}
			else {
				setAppId((java.lang.String) value);
			}
			break;

		case MCH_ID:
			if (value == null) {
				unsetMchId();
			}
			else {
				setMchId((java.lang.String) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case APP_ID:
			return getAppId();

		case MCH_ID:
			return getMchId();

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
		case APP_ID:
			return isSetAppId();
		case MCH_ID:
			return isSetMchId();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof WeixinPay)
			return this.equals((WeixinPay) that);
		return false;
	}

	public boolean equals(WeixinPay that) {
		if (that == null)
			return false;
		if (this == that)
			return true;

		boolean this_present_appId = true && this.isSetAppId();
		boolean that_present_appId = true && that.isSetAppId();
		if (this_present_appId || that_present_appId) {
			if (!(this_present_appId && that_present_appId))
				return false;
			if (!this.appId.equals(that.appId))
				return false;
		}

		boolean this_present_mchId = true && this.isSetMchId();
		boolean that_present_mchId = true && that.isSetMchId();
		if (this_present_mchId || that_present_mchId) {
			if (!(this_present_mchId && that_present_mchId))
				return false;
			if (!this.mchId.equals(that.mchId))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int hashCode = 1;

		hashCode = hashCode * 8191 + ((isSetAppId()) ? 131071 : 524287);
		if (isSetAppId())
			hashCode = hashCode * 8191 + appId.hashCode();

		hashCode = hashCode * 8191 + ((isSetMchId()) ? 131071 : 524287);
		if (isSetMchId())
			hashCode = hashCode * 8191 + mchId.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(WeixinPay other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = java.lang.Boolean.valueOf(isSetAppId()).compareTo(other.isSetAppId());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetAppId()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.appId, other.appId);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetMchId()).compareTo(other.isSetMchId());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetMchId()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mchId, other.mchId);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("WeixinPay(");
		boolean first = true;

		sb.append("appId:");
		if (this.appId == null) {
			sb.append("null");
		}
		else {
			sb.append(this.appId);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("mchId:");
		if (this.mchId == null) {
			sb.append("null");
		}
		else {
			sb.append(this.mchId);
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
			read(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(in)));
		}
		catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private static class WeixinPayStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public WeixinPayStandardScheme getScheme() {
			return new WeixinPayStandardScheme();
		}

	}

	private static class WeixinPayStandardScheme extends org.apache.thrift.scheme.StandardScheme<WeixinPay> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, WeixinPay struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // APP_ID
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.appId = iprot.readString();
						struct.setAppIdIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // MCH_ID
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.mchId = iprot.readString();
						struct.setMchIdIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, WeixinPay struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.appId != null) {
				oprot.writeFieldBegin(APP_ID_FIELD_DESC);
				oprot.writeString(struct.appId);
				oprot.writeFieldEnd();
			}
			if (struct.mchId != null) {
				oprot.writeFieldBegin(MCH_ID_FIELD_DESC);
				oprot.writeString(struct.mchId);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class WeixinPayTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public WeixinPayTupleScheme getScheme() {
			return new WeixinPayTupleScheme();
		}

	}

	private static class WeixinPayTupleScheme extends org.apache.thrift.scheme.TupleScheme<WeixinPay> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, WeixinPay struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetAppId()) {
				optionals.set(0);
			}
			if (struct.isSetMchId()) {
				optionals.set(1);
			}
			oprot.writeBitSet(optionals, 2);
			if (struct.isSetAppId()) {
				oprot.writeString(struct.appId);
			}
			if (struct.isSetMchId()) {
				oprot.writeString(struct.mchId);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, WeixinPay struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(2);
			if (incoming.get(0)) {
				struct.appId = iprot.readString();
				struct.setAppIdIsSet(true);
			}
			if (incoming.get(1)) {
				struct.mchId = iprot.readString();
				struct.setMchIdIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
