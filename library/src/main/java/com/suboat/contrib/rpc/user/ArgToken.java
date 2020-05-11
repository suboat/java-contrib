/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.user;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * 特定参数: token 有效条件：scope与token必填
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-05-11")
public class ArgToken implements org.apache.thrift.TBase<ArgToken, ArgToken._Fields>, java.io.Serializable, Cloneable,
		Comparable<ArgToken> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"ArgToken");

	private static final org.apache.thrift.protocol.TField SCOPE_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"scope", org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.protocol.TField TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"token", org.apache.thrift.protocol.TType.STRING, (short) 2);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ArgTokenStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ArgTokenTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String scope; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String token; // required

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		SCOPE((short) 1, "scope"), TOKEN((short) 2, "token");

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
			case 1: // SCOPE
				return SCOPE;
			case 2: // TOKEN
				return TOKEN;
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
		tmpMap.put(_Fields.SCOPE,
				new org.apache.thrift.meta_data.FieldMetaData("scope", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.TOKEN,
				new org.apache.thrift.meta_data.FieldMetaData("token", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ArgToken.class, metaDataMap);
	}

	public ArgToken() {
	}

	public ArgToken(java.lang.String scope, java.lang.String token) {
		this();
		this.scope = scope;
		this.token = token;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public ArgToken(ArgToken other) {
		if (other.isSetScope()) {
			this.scope = other.scope;
		}
		if (other.isSetToken()) {
			this.token = other.token;
		}
	}

	public ArgToken deepCopy() {
		return new ArgToken(this);
	}

	@Override
	public void clear() {
		this.scope = null;
		this.token = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getScope() {
		return this.scope;
	}

	public ArgToken setScope(@org.apache.thrift.annotation.Nullable java.lang.String scope) {
		this.scope = scope;
		return this;
	}

	public void unsetScope() {
		this.scope = null;
	}

	/**
	 * Returns true if field scope is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetScope() {
		return this.scope != null;
	}

	public void setScopeIsSet(boolean value) {
		if (!value) {
			this.scope = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getToken() {
		return this.token;
	}

	public ArgToken setToken(@org.apache.thrift.annotation.Nullable java.lang.String token) {
		this.token = token;
		return this;
	}

	public void unsetToken() {
		this.token = null;
	}

	/**
	 * Returns true if field token is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetToken() {
		return this.token != null;
	}

	public void setTokenIsSet(boolean value) {
		if (!value) {
			this.token = null;
		}
	}

	public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
		switch (field) {
		case SCOPE:
			if (value == null) {
				unsetScope();
			}
			else {
				setScope((java.lang.String) value);
			}
			break;

		case TOKEN:
			if (value == null) {
				unsetToken();
			}
			else {
				setToken((java.lang.String) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case SCOPE:
			return getScope();

		case TOKEN:
			return getToken();

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
		case SCOPE:
			return isSetScope();
		case TOKEN:
			return isSetToken();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof ArgToken)
			return this.equals((ArgToken) that);
		return false;
	}

	public boolean equals(ArgToken that) {
		if (that == null)
			return false;
		if (this == that)
			return true;

		boolean this_present_scope = true && this.isSetScope();
		boolean that_present_scope = true && that.isSetScope();
		if (this_present_scope || that_present_scope) {
			if (!(this_present_scope && that_present_scope))
				return false;
			if (!this.scope.equals(that.scope))
				return false;
		}

		boolean this_present_token = true && this.isSetToken();
		boolean that_present_token = true && that.isSetToken();
		if (this_present_token || that_present_token) {
			if (!(this_present_token && that_present_token))
				return false;
			if (!this.token.equals(that.token))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int hashCode = 1;

		hashCode = hashCode * 8191 + ((isSetScope()) ? 131071 : 524287);
		if (isSetScope())
			hashCode = hashCode * 8191 + scope.hashCode();

		hashCode = hashCode * 8191 + ((isSetToken()) ? 131071 : 524287);
		if (isSetToken())
			hashCode = hashCode * 8191 + token.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(ArgToken other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = java.lang.Boolean.valueOf(isSetScope()).compareTo(other.isSetScope());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetScope()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scope, other.scope);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetToken()).compareTo(other.isSetToken());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetToken()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.token, other.token);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("ArgToken(");
		boolean first = true;

		sb.append("scope:");
		if (this.scope == null) {
			sb.append("null");
		}
		else {
			sb.append(this.scope);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("token:");
		if (this.token == null) {
			sb.append("null");
		}
		else {
			sb.append(this.token);
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

	private static class ArgTokenStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ArgTokenStandardScheme getScheme() {
			return new ArgTokenStandardScheme();
		}

	}

	private static class ArgTokenStandardScheme extends org.apache.thrift.scheme.StandardScheme<ArgToken> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, ArgToken struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // SCOPE
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.scope = iprot.readString();
						struct.setScopeIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // TOKEN
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.token = iprot.readString();
						struct.setTokenIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, ArgToken struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.scope != null) {
				oprot.writeFieldBegin(SCOPE_FIELD_DESC);
				oprot.writeString(struct.scope);
				oprot.writeFieldEnd();
			}
			if (struct.token != null) {
				oprot.writeFieldBegin(TOKEN_FIELD_DESC);
				oprot.writeString(struct.token);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class ArgTokenTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ArgTokenTupleScheme getScheme() {
			return new ArgTokenTupleScheme();
		}

	}

	private static class ArgTokenTupleScheme extends org.apache.thrift.scheme.TupleScheme<ArgToken> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, ArgToken struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetScope()) {
				optionals.set(0);
			}
			if (struct.isSetToken()) {
				optionals.set(1);
			}
			oprot.writeBitSet(optionals, 2);
			if (struct.isSetScope()) {
				oprot.writeString(struct.scope);
			}
			if (struct.isSetToken()) {
				oprot.writeString(struct.token);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, ArgToken struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(2);
			if (incoming.get(0)) {
				struct.scope = iprot.readString();
				struct.setScopeIsSet(true);
			}
			if (incoming.get(1)) {
				struct.token = iprot.readString();
				struct.setTokenIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
