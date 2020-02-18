/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.user;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * 管理员详情
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-02-18")
public class AdminDetail implements org.apache.thrift.TBase<AdminDetail, AdminDetail._Fields>, java.io.Serializable,
		Cloneable, Comparable<AdminDetail> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"AdminDetail");

	private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid",
			org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.protocol.TField BASE_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"base", org.apache.thrift.protocol.TType.STRUCT, (short) 2);

	private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"user", org.apache.thrift.protocol.TType.STRUCT, (short) 3);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AdminDetailStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AdminDetailTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String uid; // required

	public @org.apache.thrift.annotation.Nullable Admin base; // required

	public @org.apache.thrift.annotation.Nullable UserDetail user; // required

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		UID((short) 1, "uid"), BASE((short) 2, "base"), USER((short) 3, "user");

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
			case 1: // UID
				return UID;
			case 2: // BASE
				return BASE;
			case 3: // USER
				return USER;
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
		tmpMap.put(_Fields.UID,
				new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.BASE, new org.apache.thrift.meta_data.FieldMetaData("base",
				org.apache.thrift.TFieldRequirementType.DEFAULT,
				new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Admin.class)));
		tmpMap.put(_Fields.USER,
				new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT,
								UserDetail.class)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AdminDetail.class, metaDataMap);
	}

	public AdminDetail() {
	}

	public AdminDetail(java.lang.String uid, Admin base, UserDetail user) {
		this();
		this.uid = uid;
		this.base = base;
		this.user = user;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public AdminDetail(AdminDetail other) {
		if (other.isSetUid()) {
			this.uid = other.uid;
		}
		if (other.isSetBase()) {
			this.base = new Admin(other.base);
		}
		if (other.isSetUser()) {
			this.user = new UserDetail(other.user);
		}
	}

	public AdminDetail deepCopy() {
		return new AdminDetail(this);
	}

	@Override
	public void clear() {
		this.uid = null;
		this.base = null;
		this.user = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getUid() {
		return this.uid;
	}

	public AdminDetail setUid(@org.apache.thrift.annotation.Nullable java.lang.String uid) {
		this.uid = uid;
		return this;
	}

	public void unsetUid() {
		this.uid = null;
	}

	/**
	 * Returns true if field uid is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetUid() {
		return this.uid != null;
	}

	public void setUidIsSet(boolean value) {
		if (!value) {
			this.uid = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public Admin getBase() {
		return this.base;
	}

	public AdminDetail setBase(@org.apache.thrift.annotation.Nullable Admin base) {
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

	@org.apache.thrift.annotation.Nullable
	public UserDetail getUser() {
		return this.user;
	}

	public AdminDetail setUser(@org.apache.thrift.annotation.Nullable UserDetail user) {
		this.user = user;
		return this;
	}

	public void unsetUser() {
		this.user = null;
	}

	/**
	 * Returns true if field user is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetUser() {
		return this.user != null;
	}

	public void setUserIsSet(boolean value) {
		if (!value) {
			this.user = null;
		}
	}

	public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
		switch (field) {
		case UID:
			if (value == null) {
				unsetUid();
			}
			else {
				setUid((java.lang.String) value);
			}
			break;

		case BASE:
			if (value == null) {
				unsetBase();
			}
			else {
				setBase((Admin) value);
			}
			break;

		case USER:
			if (value == null) {
				unsetUser();
			}
			else {
				setUser((UserDetail) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case UID:
			return getUid();

		case BASE:
			return getBase();

		case USER:
			return getUser();

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
		case UID:
			return isSetUid();
		case BASE:
			return isSetBase();
		case USER:
			return isSetUser();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof AdminDetail)
			return this.equals((AdminDetail) that);
		return false;
	}

	public boolean equals(AdminDetail that) {
		if (that == null)
			return false;
		if (this == that)
			return true;

		boolean this_present_uid = true && this.isSetUid();
		boolean that_present_uid = true && that.isSetUid();
		if (this_present_uid || that_present_uid) {
			if (!(this_present_uid && that_present_uid))
				return false;
			if (!this.uid.equals(that.uid))
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

		boolean this_present_user = true && this.isSetUser();
		boolean that_present_user = true && that.isSetUser();
		if (this_present_user || that_present_user) {
			if (!(this_present_user && that_present_user))
				return false;
			if (!this.user.equals(that.user))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int hashCode = 1;

		hashCode = hashCode * 8191 + ((isSetUid()) ? 131071 : 524287);
		if (isSetUid())
			hashCode = hashCode * 8191 + uid.hashCode();

		hashCode = hashCode * 8191 + ((isSetBase()) ? 131071 : 524287);
		if (isSetBase())
			hashCode = hashCode * 8191 + base.hashCode();

		hashCode = hashCode * 8191 + ((isSetUser()) ? 131071 : 524287);
		if (isSetUser())
			hashCode = hashCode * 8191 + user.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(AdminDetail other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = java.lang.Boolean.valueOf(isSetUid()).compareTo(other.isSetUid());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetUid()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uid, other.uid);
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
		lastComparison = java.lang.Boolean.valueOf(isSetUser()).compareTo(other.isSetUser());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetUser()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user, other.user);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("AdminDetail(");
		boolean first = true;

		sb.append("uid:");
		if (this.uid == null) {
			sb.append("null");
		}
		else {
			sb.append(this.uid);
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
		if (!first)
			sb.append(", ");
		sb.append("user:");
		if (this.user == null) {
			sb.append("null");
		}
		else {
			sb.append(this.user);
		}
		first = false;
		sb.append(")");
		return sb.toString();
	}

	public void validate() throws org.apache.thrift.TException {
		// check for required fields
		// check for sub-struct validity
		if (base != null) {
			base.validate();
		}
		if (user != null) {
			user.validate();
		}
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

	private static class AdminDetailStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public AdminDetailStandardScheme getScheme() {
			return new AdminDetailStandardScheme();
		}

	}

	private static class AdminDetailStandardScheme extends org.apache.thrift.scheme.StandardScheme<AdminDetail> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, AdminDetail struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // UID
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.uid = iprot.readString();
						struct.setUidIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // BASE
					if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
						struct.base = new Admin();
						struct.base.read(iprot);
						struct.setBaseIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // USER
					if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
						struct.user = new UserDetail();
						struct.user.read(iprot);
						struct.setUserIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, AdminDetail struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.uid != null) {
				oprot.writeFieldBegin(UID_FIELD_DESC);
				oprot.writeString(struct.uid);
				oprot.writeFieldEnd();
			}
			if (struct.base != null) {
				oprot.writeFieldBegin(BASE_FIELD_DESC);
				struct.base.write(oprot);
				oprot.writeFieldEnd();
			}
			if (struct.user != null) {
				oprot.writeFieldBegin(USER_FIELD_DESC);
				struct.user.write(oprot);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class AdminDetailTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public AdminDetailTupleScheme getScheme() {
			return new AdminDetailTupleScheme();
		}

	}

	private static class AdminDetailTupleScheme extends org.apache.thrift.scheme.TupleScheme<AdminDetail> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, AdminDetail struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetUid()) {
				optionals.set(0);
			}
			if (struct.isSetBase()) {
				optionals.set(1);
			}
			if (struct.isSetUser()) {
				optionals.set(2);
			}
			oprot.writeBitSet(optionals, 3);
			if (struct.isSetUid()) {
				oprot.writeString(struct.uid);
			}
			if (struct.isSetBase()) {
				struct.base.write(oprot);
			}
			if (struct.isSetUser()) {
				struct.user.write(oprot);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, AdminDetail struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(3);
			if (incoming.get(0)) {
				struct.uid = iprot.readString();
				struct.setUidIsSet(true);
			}
			if (incoming.get(1)) {
				struct.base = new Admin();
				struct.base.read(iprot);
				struct.setBaseIsSet(true);
			}
			if (incoming.get(2)) {
				struct.user = new UserDetail();
				struct.user.read(iprot);
				struct.setUserIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
