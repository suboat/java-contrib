/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.wallet;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * 特定参数: 确保一个用户存在 应用场景: 拉取未来流水
 */
public class ArgUser implements org.apache.thrift.TBase<ArgUser, ArgUser._Fields>, java.io.Serializable, Cloneable,
		Comparable<ArgUser> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"ArgUser");

	private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid",
			org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.protocol.TField IS_AGENT_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"isAgent", org.apache.thrift.protocol.TType.BOOL, (short) 2);

	private static final org.apache.thrift.protocol.TField ALIAS_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"aliasName", org.apache.thrift.protocol.TType.STRING, (short) 3);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ArgUserStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ArgUserTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String uid; // required

	public boolean isAgent; // optional

	public @org.apache.thrift.annotation.Nullable java.lang.String aliasName; // optional

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		UID((short) 1, "uid"), IS_AGENT((short) 2, "isAgent"), ALIAS_NAME((short) 3, "aliasName");

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
			case 2: // IS_AGENT
				return IS_AGENT;
			case 3: // ALIAS_NAME
				return ALIAS_NAME;
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
	private static final int __ISAGENT_ISSET_ID = 0;

	private byte __isset_bitfield = 0;

	private static final _Fields optionals[] = { _Fields.IS_AGENT, _Fields.ALIAS_NAME };

	public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.UID,
				new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.IS_AGENT,
				new org.apache.thrift.meta_data.FieldMetaData("isAgent",
						org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
		tmpMap.put(_Fields.ALIAS_NAME,
				new org.apache.thrift.meta_data.FieldMetaData("aliasName",
						org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ArgUser.class, metaDataMap);
	}

	public ArgUser() {
	}

	public ArgUser(java.lang.String uid) {
		this();
		this.uid = uid;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public ArgUser(ArgUser other) {
		__isset_bitfield = other.__isset_bitfield;
		if (other.isSetUid()) {
			this.uid = other.uid;
		}
		this.isAgent = other.isAgent;
		if (other.isSetAliasName()) {
			this.aliasName = other.aliasName;
		}
	}

	public ArgUser deepCopy() {
		return new ArgUser(this);
	}

	@Override
	public void clear() {
		this.uid = null;
		setIsAgentIsSet(false);
		this.isAgent = false;
		this.aliasName = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getUid() {
		return this.uid;
	}

	public ArgUser setUid(@org.apache.thrift.annotation.Nullable java.lang.String uid) {
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

	public boolean isIsAgent() {
		return this.isAgent;
	}

	public ArgUser setIsAgent(boolean isAgent) {
		this.isAgent = isAgent;
		setIsAgentIsSet(true);
		return this;
	}

	public void unsetIsAgent() {
		__isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISAGENT_ISSET_ID);
	}

	/**
	 * Returns true if field isAgent is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetIsAgent() {
		return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISAGENT_ISSET_ID);
	}

	public void setIsAgentIsSet(boolean value) {
		__isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISAGENT_ISSET_ID, value);
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getAliasName() {
		return this.aliasName;
	}

	public ArgUser setAliasName(@org.apache.thrift.annotation.Nullable java.lang.String aliasName) {
		this.aliasName = aliasName;
		return this;
	}

	public void unsetAliasName() {
		this.aliasName = null;
	}

	/**
	 * Returns true if field aliasName is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetAliasName() {
		return this.aliasName != null;
	}

	public void setAliasNameIsSet(boolean value) {
		if (!value) {
			this.aliasName = null;
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

		case IS_AGENT:
			if (value == null) {
				unsetIsAgent();
			}
			else {
				setIsAgent((java.lang.Boolean) value);
			}
			break;

		case ALIAS_NAME:
			if (value == null) {
				unsetAliasName();
			}
			else {
				setAliasName((java.lang.String) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case UID:
			return getUid();

		case IS_AGENT:
			return isIsAgent();

		case ALIAS_NAME:
			return getAliasName();

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
		case IS_AGENT:
			return isSetIsAgent();
		case ALIAS_NAME:
			return isSetAliasName();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof ArgUser)
			return this.equals((ArgUser) that);
		return false;
	}

	public boolean equals(ArgUser that) {
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

		boolean this_present_isAgent = true && this.isSetIsAgent();
		boolean that_present_isAgent = true && that.isSetIsAgent();
		if (this_present_isAgent || that_present_isAgent) {
			if (!(this_present_isAgent && that_present_isAgent))
				return false;
			if (this.isAgent != that.isAgent)
				return false;
		}

		boolean this_present_aliasName = true && this.isSetAliasName();
		boolean that_present_aliasName = true && that.isSetAliasName();
		if (this_present_aliasName || that_present_aliasName) {
			if (!(this_present_aliasName && that_present_aliasName))
				return false;
			if (!this.aliasName.equals(that.aliasName))
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

		hashCode = hashCode * 8191 + ((isSetIsAgent()) ? 131071 : 524287);
		if (isSetIsAgent())
			hashCode = hashCode * 8191 + ((isAgent) ? 131071 : 524287);

		hashCode = hashCode * 8191 + ((isSetAliasName()) ? 131071 : 524287);
		if (isSetAliasName())
			hashCode = hashCode * 8191 + aliasName.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(ArgUser other) {
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
		lastComparison = java.lang.Boolean.valueOf(isSetIsAgent()).compareTo(other.isSetIsAgent());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetIsAgent()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isAgent, other.isAgent);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetAliasName()).compareTo(other.isSetAliasName());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetAliasName()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.aliasName, other.aliasName);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("ArgUser(");
		boolean first = true;

		sb.append("uid:");
		if (this.uid == null) {
			sb.append("null");
		}
		else {
			sb.append(this.uid);
		}
		first = false;
		if (isSetIsAgent()) {
			if (!first)
				sb.append(", ");
			sb.append("isAgent:");
			sb.append(this.isAgent);
			first = false;
		}
		if (isSetAliasName()) {
			if (!first)
				sb.append(", ");
			sb.append("aliasName:");
			if (this.aliasName == null) {
				sb.append("null");
			}
			else {
				sb.append(this.aliasName);
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

	private static class ArgUserStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ArgUserStandardScheme getScheme() {
			return new ArgUserStandardScheme();
		}

	}

	private static class ArgUserStandardScheme extends org.apache.thrift.scheme.StandardScheme<ArgUser> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, ArgUser struct)
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
				case 2: // IS_AGENT
					if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
						struct.isAgent = iprot.readBool();
						struct.setIsAgentIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // ALIAS_NAME
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.aliasName = iprot.readString();
						struct.setAliasNameIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, ArgUser struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.uid != null) {
				oprot.writeFieldBegin(UID_FIELD_DESC);
				oprot.writeString(struct.uid);
				oprot.writeFieldEnd();
			}
			if (struct.isSetIsAgent()) {
				oprot.writeFieldBegin(IS_AGENT_FIELD_DESC);
				oprot.writeBool(struct.isAgent);
				oprot.writeFieldEnd();
			}
			if (struct.aliasName != null) {
				if (struct.isSetAliasName()) {
					oprot.writeFieldBegin(ALIAS_NAME_FIELD_DESC);
					oprot.writeString(struct.aliasName);
					oprot.writeFieldEnd();
				}
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class ArgUserTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ArgUserTupleScheme getScheme() {
			return new ArgUserTupleScheme();
		}

	}

	private static class ArgUserTupleScheme extends org.apache.thrift.scheme.TupleScheme<ArgUser> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, ArgUser struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetUid()) {
				optionals.set(0);
			}
			if (struct.isSetIsAgent()) {
				optionals.set(1);
			}
			if (struct.isSetAliasName()) {
				optionals.set(2);
			}
			oprot.writeBitSet(optionals, 3);
			if (struct.isSetUid()) {
				oprot.writeString(struct.uid);
			}
			if (struct.isSetIsAgent()) {
				oprot.writeBool(struct.isAgent);
			}
			if (struct.isSetAliasName()) {
				oprot.writeString(struct.aliasName);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, ArgUser struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(3);
			if (incoming.get(0)) {
				struct.uid = iprot.readString();
				struct.setUidIsSet(true);
			}
			if (incoming.get(1)) {
				struct.isAgent = iprot.readBool();
				struct.setIsAgentIsSet(true);
			}
			if (incoming.get(2)) {
				struct.aliasName = iprot.readString();
				struct.setAliasNameIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
