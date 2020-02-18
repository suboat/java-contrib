/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.user;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * 特定参数: 密码 有效条件：(登录密码) 或 (登录密码+安全密码) 或 (登录密码+安全密码+交易密码)
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-02-18")
public class ArgPassword implements org.apache.thrift.TBase<ArgPassword, ArgPassword._Fields>, java.io.Serializable,
		Cloneable, Comparable<ArgPassword> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"ArgPassword");

	private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"password", org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.protocol.TField PASSWORD_SECURE_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"passwordSecure", org.apache.thrift.protocol.TType.STRING, (short) 2);

	private static final org.apache.thrift.protocol.TField PASSWORD_PAY_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"passwordPay", org.apache.thrift.protocol.TType.STRING, (short) 3);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ArgPasswordStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ArgPasswordTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String password; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String passwordSecure; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String passwordPay; // required

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		PASSWORD((short) 1, "password"), PASSWORD_SECURE((short) 2, "passwordSecure"), PASSWORD_PAY((short) 3,
				"passwordPay");

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
			case 1: // PASSWORD
				return PASSWORD;
			case 2: // PASSWORD_SECURE
				return PASSWORD_SECURE;
			case 3: // PASSWORD_PAY
				return PASSWORD_PAY;
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
		tmpMap.put(_Fields.PASSWORD,
				new org.apache.thrift.meta_data.FieldMetaData("password",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.PASSWORD_SECURE,
				new org.apache.thrift.meta_data.FieldMetaData("passwordSecure",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.PASSWORD_PAY,
				new org.apache.thrift.meta_data.FieldMetaData("passwordPay",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ArgPassword.class, metaDataMap);
	}

	public ArgPassword() {
	}

	public ArgPassword(java.lang.String password, java.lang.String passwordSecure, java.lang.String passwordPay) {
		this();
		this.password = password;
		this.passwordSecure = passwordSecure;
		this.passwordPay = passwordPay;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public ArgPassword(ArgPassword other) {
		if (other.isSetPassword()) {
			this.password = other.password;
		}
		if (other.isSetPasswordSecure()) {
			this.passwordSecure = other.passwordSecure;
		}
		if (other.isSetPasswordPay()) {
			this.passwordPay = other.passwordPay;
		}
	}

	public ArgPassword deepCopy() {
		return new ArgPassword(this);
	}

	@Override
	public void clear() {
		this.password = null;
		this.passwordSecure = null;
		this.passwordPay = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getPassword() {
		return this.password;
	}

	public ArgPassword setPassword(@org.apache.thrift.annotation.Nullable java.lang.String password) {
		this.password = password;
		return this;
	}

	public void unsetPassword() {
		this.password = null;
	}

	/**
	 * Returns true if field password is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetPassword() {
		return this.password != null;
	}

	public void setPasswordIsSet(boolean value) {
		if (!value) {
			this.password = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getPasswordSecure() {
		return this.passwordSecure;
	}

	public ArgPassword setPasswordSecure(@org.apache.thrift.annotation.Nullable java.lang.String passwordSecure) {
		this.passwordSecure = passwordSecure;
		return this;
	}

	public void unsetPasswordSecure() {
		this.passwordSecure = null;
	}

	/**
	 * Returns true if field passwordSecure is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetPasswordSecure() {
		return this.passwordSecure != null;
	}

	public void setPasswordSecureIsSet(boolean value) {
		if (!value) {
			this.passwordSecure = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getPasswordPay() {
		return this.passwordPay;
	}

	public ArgPassword setPasswordPay(@org.apache.thrift.annotation.Nullable java.lang.String passwordPay) {
		this.passwordPay = passwordPay;
		return this;
	}

	public void unsetPasswordPay() {
		this.passwordPay = null;
	}

	/**
	 * Returns true if field passwordPay is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetPasswordPay() {
		return this.passwordPay != null;
	}

	public void setPasswordPayIsSet(boolean value) {
		if (!value) {
			this.passwordPay = null;
		}
	}

	public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
		switch (field) {
		case PASSWORD:
			if (value == null) {
				unsetPassword();
			}
			else {
				setPassword((java.lang.String) value);
			}
			break;

		case PASSWORD_SECURE:
			if (value == null) {
				unsetPasswordSecure();
			}
			else {
				setPasswordSecure((java.lang.String) value);
			}
			break;

		case PASSWORD_PAY:
			if (value == null) {
				unsetPasswordPay();
			}
			else {
				setPasswordPay((java.lang.String) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case PASSWORD:
			return getPassword();

		case PASSWORD_SECURE:
			return getPasswordSecure();

		case PASSWORD_PAY:
			return getPasswordPay();

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
		case PASSWORD:
			return isSetPassword();
		case PASSWORD_SECURE:
			return isSetPasswordSecure();
		case PASSWORD_PAY:
			return isSetPasswordPay();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof ArgPassword)
			return this.equals((ArgPassword) that);
		return false;
	}

	public boolean equals(ArgPassword that) {
		if (that == null)
			return false;
		if (this == that)
			return true;

		boolean this_present_password = true && this.isSetPassword();
		boolean that_present_password = true && that.isSetPassword();
		if (this_present_password || that_present_password) {
			if (!(this_present_password && that_present_password))
				return false;
			if (!this.password.equals(that.password))
				return false;
		}

		boolean this_present_passwordSecure = true && this.isSetPasswordSecure();
		boolean that_present_passwordSecure = true && that.isSetPasswordSecure();
		if (this_present_passwordSecure || that_present_passwordSecure) {
			if (!(this_present_passwordSecure && that_present_passwordSecure))
				return false;
			if (!this.passwordSecure.equals(that.passwordSecure))
				return false;
		}

		boolean this_present_passwordPay = true && this.isSetPasswordPay();
		boolean that_present_passwordPay = true && that.isSetPasswordPay();
		if (this_present_passwordPay || that_present_passwordPay) {
			if (!(this_present_passwordPay && that_present_passwordPay))
				return false;
			if (!this.passwordPay.equals(that.passwordPay))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int hashCode = 1;

		hashCode = hashCode * 8191 + ((isSetPassword()) ? 131071 : 524287);
		if (isSetPassword())
			hashCode = hashCode * 8191 + password.hashCode();

		hashCode = hashCode * 8191 + ((isSetPasswordSecure()) ? 131071 : 524287);
		if (isSetPasswordSecure())
			hashCode = hashCode * 8191 + passwordSecure.hashCode();

		hashCode = hashCode * 8191 + ((isSetPasswordPay()) ? 131071 : 524287);
		if (isSetPasswordPay())
			hashCode = hashCode * 8191 + passwordPay.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(ArgPassword other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = java.lang.Boolean.valueOf(isSetPassword()).compareTo(other.isSetPassword());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetPassword()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.password, other.password);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetPasswordSecure()).compareTo(other.isSetPasswordSecure());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetPasswordSecure()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.passwordSecure, other.passwordSecure);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetPasswordPay()).compareTo(other.isSetPasswordPay());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetPasswordPay()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.passwordPay, other.passwordPay);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("ArgPassword(");
		boolean first = true;

		sb.append("password:");
		if (this.password == null) {
			sb.append("null");
		}
		else {
			sb.append(this.password);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("passwordSecure:");
		if (this.passwordSecure == null) {
			sb.append("null");
		}
		else {
			sb.append(this.passwordSecure);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("passwordPay:");
		if (this.passwordPay == null) {
			sb.append("null");
		}
		else {
			sb.append(this.passwordPay);
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

	private static class ArgPasswordStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ArgPasswordStandardScheme getScheme() {
			return new ArgPasswordStandardScheme();
		}

	}

	private static class ArgPasswordStandardScheme extends org.apache.thrift.scheme.StandardScheme<ArgPassword> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, ArgPassword struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // PASSWORD
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.password = iprot.readString();
						struct.setPasswordIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // PASSWORD_SECURE
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.passwordSecure = iprot.readString();
						struct.setPasswordSecureIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // PASSWORD_PAY
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.passwordPay = iprot.readString();
						struct.setPasswordPayIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, ArgPassword struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.password != null) {
				oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
				oprot.writeString(struct.password);
				oprot.writeFieldEnd();
			}
			if (struct.passwordSecure != null) {
				oprot.writeFieldBegin(PASSWORD_SECURE_FIELD_DESC);
				oprot.writeString(struct.passwordSecure);
				oprot.writeFieldEnd();
			}
			if (struct.passwordPay != null) {
				oprot.writeFieldBegin(PASSWORD_PAY_FIELD_DESC);
				oprot.writeString(struct.passwordPay);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class ArgPasswordTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ArgPasswordTupleScheme getScheme() {
			return new ArgPasswordTupleScheme();
		}

	}

	private static class ArgPasswordTupleScheme extends org.apache.thrift.scheme.TupleScheme<ArgPassword> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, ArgPassword struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetPassword()) {
				optionals.set(0);
			}
			if (struct.isSetPasswordSecure()) {
				optionals.set(1);
			}
			if (struct.isSetPasswordPay()) {
				optionals.set(2);
			}
			oprot.writeBitSet(optionals, 3);
			if (struct.isSetPassword()) {
				oprot.writeString(struct.password);
			}
			if (struct.isSetPasswordSecure()) {
				oprot.writeString(struct.passwordSecure);
			}
			if (struct.isSetPasswordPay()) {
				oprot.writeString(struct.passwordPay);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, ArgPassword struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(3);
			if (incoming.get(0)) {
				struct.password = iprot.readString();
				struct.setPasswordIsSet(true);
			}
			if (incoming.get(1)) {
				struct.passwordSecure = iprot.readString();
				struct.setPasswordSecureIsSet(true);
			}
			if (incoming.get(2)) {
				struct.passwordPay = iprot.readString();
				struct.setPasswordPayIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
