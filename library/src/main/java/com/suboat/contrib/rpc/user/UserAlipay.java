/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.user;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * 用户实例: 支付宝用户
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-01-12")
public class UserAlipay implements org.apache.thrift.TBase<UserAlipay, UserAlipay._Fields>, java.io.Serializable,
		Cloneable, Comparable<UserAlipay> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"UserAlipay");

	private static final org.apache.thrift.protocol.TField UIDS_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"uids", org.apache.thrift.protocol.TType.LIST, (short) 1);

	private static final org.apache.thrift.protocol.TField BASE_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"base", org.apache.thrift.protocol.TType.STRUCT, (short) 2);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UserAlipayStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UserAlipayTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> uids; // required

	public @org.apache.thrift.annotation.Nullable UserAlipayBase base; // required

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		UIDS((short) 1, "uids"), BASE((short) 2, "base");

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
			case 1: // UIDS
				return UIDS;
			case 2: // BASE
				return BASE;
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
		tmpMap.put(_Fields.UIDS, new org.apache.thrift.meta_data.FieldMetaData("uids",
				org.apache.thrift.TFieldRequirementType.DEFAULT,
				new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
		tmpMap.put(_Fields.BASE,
				new org.apache.thrift.meta_data.FieldMetaData("base", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT,
								"UserAlipayBase")));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserAlipay.class, metaDataMap);
	}

	public UserAlipay() {
	}

	public UserAlipay(java.util.List<java.lang.String> uids, UserAlipayBase base) {
		this();
		this.uids = uids;
		this.base = base;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public UserAlipay(UserAlipay other) {
		if (other.isSetUids()) {
			java.util.List<java.lang.String> __this__uids = new java.util.ArrayList<java.lang.String>(other.uids);
			this.uids = __this__uids;
		}
		if (other.isSetBase()) {
			this.base = new UserAlipayBase(other.base);
		}
	}

	public UserAlipay deepCopy() {
		return new UserAlipay(this);
	}

	@Override
	public void clear() {
		this.uids = null;
		this.base = null;
	}

	public int getUidsSize() {
		return (this.uids == null) ? 0 : this.uids.size();
	}

	@org.apache.thrift.annotation.Nullable
	public java.util.Iterator<java.lang.String> getUidsIterator() {
		return (this.uids == null) ? null : this.uids.iterator();
	}

	public void addToUids(java.lang.String elem) {
		if (this.uids == null) {
			this.uids = new java.util.ArrayList<java.lang.String>();
		}
		this.uids.add(elem);
	}

	@org.apache.thrift.annotation.Nullable
	public java.util.List<java.lang.String> getUids() {
		return this.uids;
	}

	public UserAlipay setUids(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> uids) {
		this.uids = uids;
		return this;
	}

	public void unsetUids() {
		this.uids = null;
	}

	/**
	 * Returns true if field uids is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetUids() {
		return this.uids != null;
	}

	public void setUidsIsSet(boolean value) {
		if (!value) {
			this.uids = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public UserAlipayBase getBase() {
		return this.base;
	}

	public UserAlipay setBase(@org.apache.thrift.annotation.Nullable UserAlipayBase base) {
		this.base = base;
		return this;
	}

	public void unsetBase() {
		this.base = null;
	}

	/**
	 * Returns true if field base is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetBase() {
		return this.base != null;
	}

	public void setBaseIsSet(boolean value) {
		if (!value) {
			this.base = null;
		}
	}

	public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
		switch (field) {
		case UIDS:
			if (value == null) {
				unsetUids();
			}
			else {
				setUids((java.util.List<java.lang.String>) value);
			}
			break;

		case BASE:
			if (value == null) {
				unsetBase();
			}
			else {
				setBase((UserAlipayBase) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case UIDS:
			return getUids();

		case BASE:
			return getBase();

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
		case UIDS:
			return isSetUids();
		case BASE:
			return isSetBase();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof UserAlipay)
			return this.equals((UserAlipay) that);
		return false;
	}

	public boolean equals(UserAlipay that) {
		if (that == null)
			return false;
		if (this == that)
			return true;

		boolean this_present_uids = true && this.isSetUids();
		boolean that_present_uids = true && that.isSetUids();
		if (this_present_uids || that_present_uids) {
			if (!(this_present_uids && that_present_uids))
				return false;
			if (!this.uids.equals(that.uids))
				return false;
		}

		boolean this_present_base = true && this.isSetBase();
		boolean that_present_base = true && that.isSetBase();
		if (this_present_base || that_present_base) {
			if (!(this_present_base && that_present_base))
				return false;
			if (!this.base.equals(that.base))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int hashCode = 1;

		hashCode = hashCode * 8191 + ((isSetUids()) ? 131071 : 524287);
		if (isSetUids())
			hashCode = hashCode * 8191 + uids.hashCode();

		hashCode = hashCode * 8191 + ((isSetBase()) ? 131071 : 524287);
		if (isSetBase())
			hashCode = hashCode * 8191 + base.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(UserAlipay other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = java.lang.Boolean.valueOf(isSetUids()).compareTo(other.isSetUids());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetUids()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uids, other.uids);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetBase()).compareTo(other.isSetBase());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetBase()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.base, other.base);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("UserAlipay(");
		boolean first = true;

		sb.append("uids:");
		if (this.uids == null) {
			sb.append("null");
		}
		else {
			sb.append(this.uids);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("base:");
		if (this.base == null) {
			sb.append("null");
		}
		else {
			sb.append(this.base);
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

	private static class UserAlipayStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public UserAlipayStandardScheme getScheme() {
			return new UserAlipayStandardScheme();
		}

	}

	private static class UserAlipayStandardScheme extends org.apache.thrift.scheme.StandardScheme<UserAlipay> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, UserAlipay struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // UIDS
					if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
						{
							org.apache.thrift.protocol.TList _list92 = iprot.readListBegin();
							struct.uids = new java.util.ArrayList<java.lang.String>(_list92.size);
							@org.apache.thrift.annotation.Nullable
							java.lang.String _elem93;
							for (int _i94 = 0; _i94 < _list92.size; ++_i94) {
								_elem93 = iprot.readString();
								struct.uids.add(_elem93);
							}
							iprot.readListEnd();
						}
						struct.setUidsIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // BASE
					if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
						struct.base = new UserAlipayBase();
						struct.base.read(iprot);
						struct.setBaseIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, UserAlipay struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.uids != null) {
				oprot.writeFieldBegin(UIDS_FIELD_DESC);
				{
					oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING,
							struct.uids.size()));
					for (java.lang.String _iter95 : struct.uids) {
						oprot.writeString(_iter95);
					}
					oprot.writeListEnd();
				}
				oprot.writeFieldEnd();
			}
			if (struct.base != null) {
				oprot.writeFieldBegin(BASE_FIELD_DESC);
				struct.base.write(oprot);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class UserAlipayTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public UserAlipayTupleScheme getScheme() {
			return new UserAlipayTupleScheme();
		}

	}

	private static class UserAlipayTupleScheme extends org.apache.thrift.scheme.TupleScheme<UserAlipay> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, UserAlipay struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetUids()) {
				optionals.set(0);
			}
			if (struct.isSetBase()) {
				optionals.set(1);
			}
			oprot.writeBitSet(optionals, 2);
			if (struct.isSetUids()) {
				{
					oprot.writeI32(struct.uids.size());
					for (java.lang.String _iter96 : struct.uids) {
						oprot.writeString(_iter96);
					}
				}
			}
			if (struct.isSetBase()) {
				struct.base.write(oprot);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, UserAlipay struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(2);
			if (incoming.get(0)) {
				{
					org.apache.thrift.protocol.TList _list97 = new org.apache.thrift.protocol.TList(
							org.apache.thrift.protocol.TType.STRING, iprot.readI32());
					struct.uids = new java.util.ArrayList<java.lang.String>(_list97.size);
					@org.apache.thrift.annotation.Nullable
					java.lang.String _elem98;
					for (int _i99 = 0; _i99 < _list97.size; ++_i99) {
						_elem98 = iprot.readString();
						struct.uids.add(_elem98);
					}
				}
				struct.setUidsIsSet(true);
			}
			if (incoming.get(1)) {
				struct.base = new UserAlipayBase();
				struct.base.read(iprot);
				struct.setBaseIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
