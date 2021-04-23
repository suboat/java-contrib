/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.msg;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * 特定参数: 设置一个用户的参数 有效条件: 必填项必填
 */
public class ArgUser implements org.apache.thrift.TBase<ArgUser, ArgUser._Fields>, java.io.Serializable, Cloneable,
		Comparable<ArgUser> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"ArgUser");

	private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid",
			org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.protocol.TField IS_GUEST_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"isGuest", org.apache.thrift.protocol.TType.BOOL, (short) 2);

	private static final org.apache.thrift.protocol.TField IS_BOT_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"isBot", org.apache.thrift.protocol.TType.BOOL, (short) 3);

	private static final org.apache.thrift.protocol.TField IS_ONLINE_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"isOnline", org.apache.thrift.protocol.TType.BOOL, (short) 4);

	private static final org.apache.thrift.protocol.TField WANT_BRANCH_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"wantBranch", org.apache.thrift.protocol.TType.STRING, (short) 5);

	private static final org.apache.thrift.protocol.TField WANT_UID_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"wantUid", org.apache.thrift.protocol.TType.STRING, (short) 6);

	private static final org.apache.thrift.protocol.TField OID_FIELD_DESC = new org.apache.thrift.protocol.TField("oid",
			org.apache.thrift.protocol.TType.STRING, (short) 7);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ArgUserStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ArgUserTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String uid; // required

	public boolean isGuest; // optional

	public boolean isBot; // optional

	public boolean isOnline; // optional

	public @org.apache.thrift.annotation.Nullable java.lang.String wantBranch; // optional

	public @org.apache.thrift.annotation.Nullable java.lang.String wantUid; // optional

	public @org.apache.thrift.annotation.Nullable java.lang.String oid; // optional

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		UID((short) 1, "uid"), IS_GUEST((short) 2, "isGuest"), IS_BOT((short) 3, "isBot"), IS_ONLINE((short) 4,
				"isOnline"), WANT_BRANCH((short) 5,
						"wantBranch"), WANT_UID((short) 6, "wantUid"), OID((short) 7, "oid");

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
			case 2: // IS_GUEST
				return IS_GUEST;
			case 3: // IS_BOT
				return IS_BOT;
			case 4: // IS_ONLINE
				return IS_ONLINE;
			case 5: // WANT_BRANCH
				return WANT_BRANCH;
			case 6: // WANT_UID
				return WANT_UID;
			case 7: // OID
				return OID;
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
	private static final int __ISGUEST_ISSET_ID = 0;

	private static final int __ISBOT_ISSET_ID = 1;

	private static final int __ISONLINE_ISSET_ID = 2;

	private byte __isset_bitfield = 0;

	private static final _Fields optionals[] = { _Fields.IS_GUEST, _Fields.IS_BOT, _Fields.IS_ONLINE,
			_Fields.WANT_BRANCH, _Fields.WANT_UID, _Fields.OID };

	public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.UID,
				new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.IS_GUEST,
				new org.apache.thrift.meta_data.FieldMetaData("isGuest",
						org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
		tmpMap.put(_Fields.IS_BOT,
				new org.apache.thrift.meta_data.FieldMetaData("isBot", org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
		tmpMap.put(_Fields.IS_ONLINE,
				new org.apache.thrift.meta_data.FieldMetaData("isOnline",
						org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
		tmpMap.put(_Fields.WANT_BRANCH,
				new org.apache.thrift.meta_data.FieldMetaData("wantBranch",
						org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.WANT_UID,
				new org.apache.thrift.meta_data.FieldMetaData("wantUid",
						org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.OID,
				new org.apache.thrift.meta_data.FieldMetaData("oid", org.apache.thrift.TFieldRequirementType.OPTIONAL,
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
		this.isGuest = other.isGuest;
		this.isBot = other.isBot;
		this.isOnline = other.isOnline;
		if (other.isSetWantBranch()) {
			this.wantBranch = other.wantBranch;
		}
		if (other.isSetWantUid()) {
			this.wantUid = other.wantUid;
		}
		if (other.isSetOid()) {
			this.oid = other.oid;
		}
	}

	public ArgUser deepCopy() {
		return new ArgUser(this);
	}

	@Override
	public void clear() {
		this.uid = null;
		setIsGuestIsSet(false);
		this.isGuest = false;
		setIsBotIsSet(false);
		this.isBot = false;
		setIsOnlineIsSet(false);
		this.isOnline = false;
		this.wantBranch = null;
		this.wantUid = null;
		this.oid = null;
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

	public boolean isIsGuest() {
		return this.isGuest;
	}

	public ArgUser setIsGuest(boolean isGuest) {
		this.isGuest = isGuest;
		setIsGuestIsSet(true);
		return this;
	}

	public void unsetIsGuest() {
		__isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISGUEST_ISSET_ID);
	}

	/**
	 * Returns true if field isGuest is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetIsGuest() {
		return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISGUEST_ISSET_ID);
	}

	public void setIsGuestIsSet(boolean value) {
		__isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISGUEST_ISSET_ID, value);
	}

	public boolean isIsBot() {
		return this.isBot;
	}

	public ArgUser setIsBot(boolean isBot) {
		this.isBot = isBot;
		setIsBotIsSet(true);
		return this;
	}

	public void unsetIsBot() {
		__isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISBOT_ISSET_ID);
	}

	/**
	 * Returns true if field isBot is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetIsBot() {
		return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISBOT_ISSET_ID);
	}

	public void setIsBotIsSet(boolean value) {
		__isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISBOT_ISSET_ID, value);
	}

	public boolean isIsOnline() {
		return this.isOnline;
	}

	public ArgUser setIsOnline(boolean isOnline) {
		this.isOnline = isOnline;
		setIsOnlineIsSet(true);
		return this;
	}

	public void unsetIsOnline() {
		__isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISONLINE_ISSET_ID);
	}

	/**
	 * Returns true if field isOnline is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetIsOnline() {
		return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISONLINE_ISSET_ID);
	}

	public void setIsOnlineIsSet(boolean value) {
		__isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISONLINE_ISSET_ID, value);
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getWantBranch() {
		return this.wantBranch;
	}

	public ArgUser setWantBranch(@org.apache.thrift.annotation.Nullable java.lang.String wantBranch) {
		this.wantBranch = wantBranch;
		return this;
	}

	public void unsetWantBranch() {
		this.wantBranch = null;
	}

	/**
	 * Returns true if field wantBranch is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetWantBranch() {
		return this.wantBranch != null;
	}

	public void setWantBranchIsSet(boolean value) {
		if (!value) {
			this.wantBranch = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getWantUid() {
		return this.wantUid;
	}

	public ArgUser setWantUid(@org.apache.thrift.annotation.Nullable java.lang.String wantUid) {
		this.wantUid = wantUid;
		return this;
	}

	public void unsetWantUid() {
		this.wantUid = null;
	}

	/**
	 * Returns true if field wantUid is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetWantUid() {
		return this.wantUid != null;
	}

	public void setWantUidIsSet(boolean value) {
		if (!value) {
			this.wantUid = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getOid() {
		return this.oid;
	}

	public ArgUser setOid(@org.apache.thrift.annotation.Nullable java.lang.String oid) {
		this.oid = oid;
		return this;
	}

	public void unsetOid() {
		this.oid = null;
	}

	/**
	 * Returns true if field oid is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetOid() {
		return this.oid != null;
	}

	public void setOidIsSet(boolean value) {
		if (!value) {
			this.oid = null;
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

		case IS_GUEST:
			if (value == null) {
				unsetIsGuest();
			}
			else {
				setIsGuest((java.lang.Boolean) value);
			}
			break;

		case IS_BOT:
			if (value == null) {
				unsetIsBot();
			}
			else {
				setIsBot((java.lang.Boolean) value);
			}
			break;

		case IS_ONLINE:
			if (value == null) {
				unsetIsOnline();
			}
			else {
				setIsOnline((java.lang.Boolean) value);
			}
			break;

		case WANT_BRANCH:
			if (value == null) {
				unsetWantBranch();
			}
			else {
				setWantBranch((java.lang.String) value);
			}
			break;

		case WANT_UID:
			if (value == null) {
				unsetWantUid();
			}
			else {
				setWantUid((java.lang.String) value);
			}
			break;

		case OID:
			if (value == null) {
				unsetOid();
			}
			else {
				setOid((java.lang.String) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case UID:
			return getUid();

		case IS_GUEST:
			return isIsGuest();

		case IS_BOT:
			return isIsBot();

		case IS_ONLINE:
			return isIsOnline();

		case WANT_BRANCH:
			return getWantBranch();

		case WANT_UID:
			return getWantUid();

		case OID:
			return getOid();

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
		case IS_GUEST:
			return isSetIsGuest();
		case IS_BOT:
			return isSetIsBot();
		case IS_ONLINE:
			return isSetIsOnline();
		case WANT_BRANCH:
			return isSetWantBranch();
		case WANT_UID:
			return isSetWantUid();
		case OID:
			return isSetOid();
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

		boolean this_present_isGuest = true && this.isSetIsGuest();
		boolean that_present_isGuest = true && that.isSetIsGuest();
		if (this_present_isGuest || that_present_isGuest) {
			if (!(this_present_isGuest && that_present_isGuest))
				return false;
			if (this.isGuest != that.isGuest)
				return false;
		}

		boolean this_present_isBot = true && this.isSetIsBot();
		boolean that_present_isBot = true && that.isSetIsBot();
		if (this_present_isBot || that_present_isBot) {
			if (!(this_present_isBot && that_present_isBot))
				return false;
			if (this.isBot != that.isBot)
				return false;
		}

		boolean this_present_isOnline = true && this.isSetIsOnline();
		boolean that_present_isOnline = true && that.isSetIsOnline();
		if (this_present_isOnline || that_present_isOnline) {
			if (!(this_present_isOnline && that_present_isOnline))
				return false;
			if (this.isOnline != that.isOnline)
				return false;
		}

		boolean this_present_wantBranch = true && this.isSetWantBranch();
		boolean that_present_wantBranch = true && that.isSetWantBranch();
		if (this_present_wantBranch || that_present_wantBranch) {
			if (!(this_present_wantBranch && that_present_wantBranch))
				return false;
			if (!this.wantBranch.equals(that.wantBranch))
				return false;
		}

		boolean this_present_wantUid = true && this.isSetWantUid();
		boolean that_present_wantUid = true && that.isSetWantUid();
		if (this_present_wantUid || that_present_wantUid) {
			if (!(this_present_wantUid && that_present_wantUid))
				return false;
			if (!this.wantUid.equals(that.wantUid))
				return false;
		}

		boolean this_present_oid = true && this.isSetOid();
		boolean that_present_oid = true && that.isSetOid();
		if (this_present_oid || that_present_oid) {
			if (!(this_present_oid && that_present_oid))
				return false;
			if (!this.oid.equals(that.oid))
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

		hashCode = hashCode * 8191 + ((isSetIsGuest()) ? 131071 : 524287);
		if (isSetIsGuest())
			hashCode = hashCode * 8191 + ((isGuest) ? 131071 : 524287);

		hashCode = hashCode * 8191 + ((isSetIsBot()) ? 131071 : 524287);
		if (isSetIsBot())
			hashCode = hashCode * 8191 + ((isBot) ? 131071 : 524287);

		hashCode = hashCode * 8191 + ((isSetIsOnline()) ? 131071 : 524287);
		if (isSetIsOnline())
			hashCode = hashCode * 8191 + ((isOnline) ? 131071 : 524287);

		hashCode = hashCode * 8191 + ((isSetWantBranch()) ? 131071 : 524287);
		if (isSetWantBranch())
			hashCode = hashCode * 8191 + wantBranch.hashCode();

		hashCode = hashCode * 8191 + ((isSetWantUid()) ? 131071 : 524287);
		if (isSetWantUid())
			hashCode = hashCode * 8191 + wantUid.hashCode();

		hashCode = hashCode * 8191 + ((isSetOid()) ? 131071 : 524287);
		if (isSetOid())
			hashCode = hashCode * 8191 + oid.hashCode();

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
		lastComparison = java.lang.Boolean.valueOf(isSetIsGuest()).compareTo(other.isSetIsGuest());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetIsGuest()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isGuest, other.isGuest);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetIsBot()).compareTo(other.isSetIsBot());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetIsBot()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isBot, other.isBot);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetIsOnline()).compareTo(other.isSetIsOnline());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetIsOnline()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isOnline, other.isOnline);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetWantBranch()).compareTo(other.isSetWantBranch());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetWantBranch()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.wantBranch, other.wantBranch);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetWantUid()).compareTo(other.isSetWantUid());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetWantUid()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.wantUid, other.wantUid);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetOid()).compareTo(other.isSetOid());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetOid()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.oid, other.oid);
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
		if (isSetIsGuest()) {
			if (!first)
				sb.append(", ");
			sb.append("isGuest:");
			sb.append(this.isGuest);
			first = false;
		}
		if (isSetIsBot()) {
			if (!first)
				sb.append(", ");
			sb.append("isBot:");
			sb.append(this.isBot);
			first = false;
		}
		if (isSetIsOnline()) {
			if (!first)
				sb.append(", ");
			sb.append("isOnline:");
			sb.append(this.isOnline);
			first = false;
		}
		if (isSetWantBranch()) {
			if (!first)
				sb.append(", ");
			sb.append("wantBranch:");
			if (this.wantBranch == null) {
				sb.append("null");
			}
			else {
				sb.append(this.wantBranch);
			}
			first = false;
		}
		if (isSetWantUid()) {
			if (!first)
				sb.append(", ");
			sb.append("wantUid:");
			if (this.wantUid == null) {
				sb.append("null");
			}
			else {
				sb.append(this.wantUid);
			}
			first = false;
		}
		if (isSetOid()) {
			if (!first)
				sb.append(", ");
			sb.append("oid:");
			if (this.oid == null) {
				sb.append("null");
			}
			else {
				sb.append(this.oid);
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
				case 2: // IS_GUEST
					if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
						struct.isGuest = iprot.readBool();
						struct.setIsGuestIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // IS_BOT
					if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
						struct.isBot = iprot.readBool();
						struct.setIsBotIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 4: // IS_ONLINE
					if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
						struct.isOnline = iprot.readBool();
						struct.setIsOnlineIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 5: // WANT_BRANCH
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.wantBranch = iprot.readString();
						struct.setWantBranchIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 6: // WANT_UID
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.wantUid = iprot.readString();
						struct.setWantUidIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 7: // OID
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.oid = iprot.readString();
						struct.setOidIsSet(true);
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
			if (struct.isSetIsGuest()) {
				oprot.writeFieldBegin(IS_GUEST_FIELD_DESC);
				oprot.writeBool(struct.isGuest);
				oprot.writeFieldEnd();
			}
			if (struct.isSetIsBot()) {
				oprot.writeFieldBegin(IS_BOT_FIELD_DESC);
				oprot.writeBool(struct.isBot);
				oprot.writeFieldEnd();
			}
			if (struct.isSetIsOnline()) {
				oprot.writeFieldBegin(IS_ONLINE_FIELD_DESC);
				oprot.writeBool(struct.isOnline);
				oprot.writeFieldEnd();
			}
			if (struct.wantBranch != null) {
				if (struct.isSetWantBranch()) {
					oprot.writeFieldBegin(WANT_BRANCH_FIELD_DESC);
					oprot.writeString(struct.wantBranch);
					oprot.writeFieldEnd();
				}
			}
			if (struct.wantUid != null) {
				if (struct.isSetWantUid()) {
					oprot.writeFieldBegin(WANT_UID_FIELD_DESC);
					oprot.writeString(struct.wantUid);
					oprot.writeFieldEnd();
				}
			}
			if (struct.oid != null) {
				if (struct.isSetOid()) {
					oprot.writeFieldBegin(OID_FIELD_DESC);
					oprot.writeString(struct.oid);
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
			if (struct.isSetIsGuest()) {
				optionals.set(1);
			}
			if (struct.isSetIsBot()) {
				optionals.set(2);
			}
			if (struct.isSetIsOnline()) {
				optionals.set(3);
			}
			if (struct.isSetWantBranch()) {
				optionals.set(4);
			}
			if (struct.isSetWantUid()) {
				optionals.set(5);
			}
			if (struct.isSetOid()) {
				optionals.set(6);
			}
			oprot.writeBitSet(optionals, 7);
			if (struct.isSetUid()) {
				oprot.writeString(struct.uid);
			}
			if (struct.isSetIsGuest()) {
				oprot.writeBool(struct.isGuest);
			}
			if (struct.isSetIsBot()) {
				oprot.writeBool(struct.isBot);
			}
			if (struct.isSetIsOnline()) {
				oprot.writeBool(struct.isOnline);
			}
			if (struct.isSetWantBranch()) {
				oprot.writeString(struct.wantBranch);
			}
			if (struct.isSetWantUid()) {
				oprot.writeString(struct.wantUid);
			}
			if (struct.isSetOid()) {
				oprot.writeString(struct.oid);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, ArgUser struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(7);
			if (incoming.get(0)) {
				struct.uid = iprot.readString();
				struct.setUidIsSet(true);
			}
			if (incoming.get(1)) {
				struct.isGuest = iprot.readBool();
				struct.setIsGuestIsSet(true);
			}
			if (incoming.get(2)) {
				struct.isBot = iprot.readBool();
				struct.setIsBotIsSet(true);
			}
			if (incoming.get(3)) {
				struct.isOnline = iprot.readBool();
				struct.setIsOnlineIsSet(true);
			}
			if (incoming.get(4)) {
				struct.wantBranch = iprot.readString();
				struct.setWantBranchIsSet(true);
			}
			if (incoming.get(5)) {
				struct.wantUid = iprot.readString();
				struct.setWantUidIsSet(true);
			}
			if (incoming.get(6)) {
				struct.oid = iprot.readString();
				struct.setOidIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}