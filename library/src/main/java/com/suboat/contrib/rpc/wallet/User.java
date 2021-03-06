/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.wallet;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
public class User
		implements org.apache.thrift.TBase<User, User._Fields>, java.io.Serializable, Cloneable, Comparable<User> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"User");

	private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid",
			org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.protocol.TField IS_AGENT_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"isAgent", org.apache.thrift.protocol.TType.BOOL, (short) 2);

	private static final org.apache.thrift.protocol.TField CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"createTime", org.apache.thrift.protocol.TType.STRING, (short) 3);

	private static final org.apache.thrift.protocol.TField UPDATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"updateTime", org.apache.thrift.protocol.TType.STRING, (short) 4);

	private static final org.apache.thrift.protocol.TField ALIAS_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"aliasName", org.apache.thrift.protocol.TType.STRING, (short) 5);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UserStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UserTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String uid; // required

	public boolean isAgent; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String createTime; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String updateTime; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String aliasName; // required

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		UID((short) 1, "uid"), IS_AGENT((short) 2, "isAgent"), CREATE_TIME((short) 3,
				"createTime"), UPDATE_TIME((short) 4, "updateTime"), ALIAS_NAME((short) 5, "aliasName");

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
			case 3: // CREATE_TIME
				return CREATE_TIME;
			case 4: // UPDATE_TIME
				return UPDATE_TIME;
			case 5: // ALIAS_NAME
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

	public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.UID,
				new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.IS_AGENT,
				new org.apache.thrift.meta_data.FieldMetaData("isAgent",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
		tmpMap.put(_Fields.CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("createTime",
				org.apache.thrift.TFieldRequirementType.DEFAULT,
				new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING, "Time")));
		tmpMap.put(_Fields.UPDATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("updateTime",
				org.apache.thrift.TFieldRequirementType.DEFAULT,
				new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING, "Time")));
		tmpMap.put(_Fields.ALIAS_NAME,
				new org.apache.thrift.meta_data.FieldMetaData("aliasName",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(User.class, metaDataMap);
	}

	public User() {
	}

	public User(java.lang.String uid, boolean isAgent, java.lang.String createTime, java.lang.String updateTime,
			java.lang.String aliasName) {
		this();
		this.uid = uid;
		this.isAgent = isAgent;
		setIsAgentIsSet(true);
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.aliasName = aliasName;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public User(User other) {
		__isset_bitfield = other.__isset_bitfield;
		if (other.isSetUid()) {
			this.uid = other.uid;
		}
		this.isAgent = other.isAgent;
		if (other.isSetCreateTime()) {
			this.createTime = other.createTime;
		}
		if (other.isSetUpdateTime()) {
			this.updateTime = other.updateTime;
		}
		if (other.isSetAliasName()) {
			this.aliasName = other.aliasName;
		}
	}

	public User deepCopy() {
		return new User(this);
	}

	@Override
	public void clear() {
		this.uid = null;
		setIsAgentIsSet(false);
		this.isAgent = false;
		this.createTime = null;
		this.updateTime = null;
		this.aliasName = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getUid() {
		return this.uid;
	}

	public User setUid(@org.apache.thrift.annotation.Nullable java.lang.String uid) {
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

	public User setIsAgent(boolean isAgent) {
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
	public java.lang.String getCreateTime() {
		return this.createTime;
	}

	public User setCreateTime(@org.apache.thrift.annotation.Nullable java.lang.String createTime) {
		this.createTime = createTime;
		return this;
	}

	public void unsetCreateTime() {
		this.createTime = null;
	}

	/**
	 * Returns true if field createTime is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetCreateTime() {
		return this.createTime != null;
	}

	public void setCreateTimeIsSet(boolean value) {
		if (!value) {
			this.createTime = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getUpdateTime() {
		return this.updateTime;
	}

	public User setUpdateTime(@org.apache.thrift.annotation.Nullable java.lang.String updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public void unsetUpdateTime() {
		this.updateTime = null;
	}

	/**
	 * Returns true if field updateTime is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetUpdateTime() {
		return this.updateTime != null;
	}

	public void setUpdateTimeIsSet(boolean value) {
		if (!value) {
			this.updateTime = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getAliasName() {
		return this.aliasName;
	}

	public User setAliasName(@org.apache.thrift.annotation.Nullable java.lang.String aliasName) {
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

		case CREATE_TIME:
			if (value == null) {
				unsetCreateTime();
			}
			else {
				setCreateTime((java.lang.String) value);
			}
			break;

		case UPDATE_TIME:
			if (value == null) {
				unsetUpdateTime();
			}
			else {
				setUpdateTime((java.lang.String) value);
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

		case CREATE_TIME:
			return getCreateTime();

		case UPDATE_TIME:
			return getUpdateTime();

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
		case CREATE_TIME:
			return isSetCreateTime();
		case UPDATE_TIME:
			return isSetUpdateTime();
		case ALIAS_NAME:
			return isSetAliasName();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof User)
			return this.equals((User) that);
		return false;
	}

	public boolean equals(User that) {
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

		boolean this_present_isAgent = true;
		boolean that_present_isAgent = true;
		if (this_present_isAgent || that_present_isAgent) {
			if (!(this_present_isAgent && that_present_isAgent))
				return false;
			if (this.isAgent != that.isAgent)
				return false;
		}

		boolean this_present_createTime = true && this.isSetCreateTime();
		boolean that_present_createTime = true && that.isSetCreateTime();
		if (this_present_createTime || that_present_createTime) {
			if (!(this_present_createTime && that_present_createTime))
				return false;
			if (!this.createTime.equals(that.createTime))
				return false;
		}

		boolean this_present_updateTime = true && this.isSetUpdateTime();
		boolean that_present_updateTime = true && that.isSetUpdateTime();
		if (this_present_updateTime || that_present_updateTime) {
			if (!(this_present_updateTime && that_present_updateTime))
				return false;
			if (!this.updateTime.equals(that.updateTime))
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

		hashCode = hashCode * 8191 + ((isAgent) ? 131071 : 524287);

		hashCode = hashCode * 8191 + ((isSetCreateTime()) ? 131071 : 524287);
		if (isSetCreateTime())
			hashCode = hashCode * 8191 + createTime.hashCode();

		hashCode = hashCode * 8191 + ((isSetUpdateTime()) ? 131071 : 524287);
		if (isSetUpdateTime())
			hashCode = hashCode * 8191 + updateTime.hashCode();

		hashCode = hashCode * 8191 + ((isSetAliasName()) ? 131071 : 524287);
		if (isSetAliasName())
			hashCode = hashCode * 8191 + aliasName.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(User other) {
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
		lastComparison = java.lang.Boolean.valueOf(isSetCreateTime()).compareTo(other.isSetCreateTime());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetCreateTime()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createTime, other.createTime);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetUpdateTime()).compareTo(other.isSetUpdateTime());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetUpdateTime()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updateTime, other.updateTime);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("User(");
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
		sb.append("isAgent:");
		sb.append(this.isAgent);
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("createTime:");
		if (this.createTime == null) {
			sb.append("null");
		}
		else {
			sb.append(this.createTime);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("updateTime:");
		if (this.updateTime == null) {
			sb.append("null");
		}
		else {
			sb.append(this.updateTime);
		}
		first = false;
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

	private static class UserStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public UserStandardScheme getScheme() {
			return new UserStandardScheme();
		}

	}

	private static class UserStandardScheme extends org.apache.thrift.scheme.StandardScheme<User> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, User struct) throws org.apache.thrift.TException {
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
				case 3: // CREATE_TIME
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.createTime = iprot.readString();
						struct.setCreateTimeIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 4: // UPDATE_TIME
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.updateTime = iprot.readString();
						struct.setUpdateTimeIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 5: // ALIAS_NAME
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, User struct) throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.uid != null) {
				oprot.writeFieldBegin(UID_FIELD_DESC);
				oprot.writeString(struct.uid);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldBegin(IS_AGENT_FIELD_DESC);
			oprot.writeBool(struct.isAgent);
			oprot.writeFieldEnd();
			if (struct.createTime != null) {
				oprot.writeFieldBegin(CREATE_TIME_FIELD_DESC);
				oprot.writeString(struct.createTime);
				oprot.writeFieldEnd();
			}
			if (struct.updateTime != null) {
				oprot.writeFieldBegin(UPDATE_TIME_FIELD_DESC);
				oprot.writeString(struct.updateTime);
				oprot.writeFieldEnd();
			}
			if (struct.aliasName != null) {
				oprot.writeFieldBegin(ALIAS_NAME_FIELD_DESC);
				oprot.writeString(struct.aliasName);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class UserTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public UserTupleScheme getScheme() {
			return new UserTupleScheme();
		}

	}

	private static class UserTupleScheme extends org.apache.thrift.scheme.TupleScheme<User> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, User struct) throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetUid()) {
				optionals.set(0);
			}
			if (struct.isSetIsAgent()) {
				optionals.set(1);
			}
			if (struct.isSetCreateTime()) {
				optionals.set(2);
			}
			if (struct.isSetUpdateTime()) {
				optionals.set(3);
			}
			if (struct.isSetAliasName()) {
				optionals.set(4);
			}
			oprot.writeBitSet(optionals, 5);
			if (struct.isSetUid()) {
				oprot.writeString(struct.uid);
			}
			if (struct.isSetIsAgent()) {
				oprot.writeBool(struct.isAgent);
			}
			if (struct.isSetCreateTime()) {
				oprot.writeString(struct.createTime);
			}
			if (struct.isSetUpdateTime()) {
				oprot.writeString(struct.updateTime);
			}
			if (struct.isSetAliasName()) {
				oprot.writeString(struct.aliasName);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, User struct) throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(5);
			if (incoming.get(0)) {
				struct.uid = iprot.readString();
				struct.setUidIsSet(true);
			}
			if (incoming.get(1)) {
				struct.isAgent = iprot.readBool();
				struct.setIsAgentIsSet(true);
			}
			if (incoming.get(2)) {
				struct.createTime = iprot.readString();
				struct.setCreateTimeIsSet(true);
			}
			if (incoming.get(3)) {
				struct.updateTime = iprot.readString();
				struct.setUpdateTimeIsSet(true);
			}
			if (incoming.get(4)) {
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
