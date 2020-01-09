/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.user;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * 用户绑定的银行卡
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-01-09")
public class UserBankCard implements org.apache.thrift.TBase<UserBankCard, UserBankCard._Fields>, java.io.Serializable,
		Cloneable, Comparable<UserBankCard> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"UserBankCard");

	private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid",
			org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.protocol.TField NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"number", org.apache.thrift.protocol.TType.STRING, (short) 2);

	private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"name", org.apache.thrift.protocol.TType.STRING, (short) 3);

	private static final org.apache.thrift.protocol.TField PHONE_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"phone", org.apache.thrift.protocol.TType.STRING, (short) 4);

	private static final org.apache.thrift.protocol.TField BANK_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"bank", org.apache.thrift.protocol.TType.STRING, (short) 5);

	private static final org.apache.thrift.protocol.TField BANK_START_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"bankStart", org.apache.thrift.protocol.TType.STRING, (short) 6);

	private static final org.apache.thrift.protocol.TField CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"createTime", org.apache.thrift.protocol.TType.STRING, (short) 7);

	private static final org.apache.thrift.protocol.TField UPDATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"updateTime", org.apache.thrift.protocol.TType.STRING, (short) 8);

	private static final org.apache.thrift.protocol.TField EXPIRE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"expireTime", org.apache.thrift.protocol.TType.STRING, (short) 9);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UserBankCardStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UserBankCardTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String uid; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String number; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String name; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String phone; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String bank; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String bankStart; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String createTime; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String updateTime; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String expireTime; // required

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		UID((short) 1, "uid"), NUMBER((short) 2, "number"), NAME((short) 3, "name"), PHONE((short) 4, "phone"), BANK(
				(short) 5, "bank"), BANK_START((short) 6, "bankStart"), CREATE_TIME((short) 7,
						"createTime"), UPDATE_TIME((short) 8, "updateTime"), EXPIRE_TIME((short) 9, "expireTime");

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
			case 2: // NUMBER
				return NUMBER;
			case 3: // NAME
				return NAME;
			case 4: // PHONE
				return PHONE;
			case 5: // BANK
				return BANK;
			case 6: // BANK_START
				return BANK_START;
			case 7: // CREATE_TIME
				return CREATE_TIME;
			case 8: // UPDATE_TIME
				return UPDATE_TIME;
			case 9: // EXPIRE_TIME
				return EXPIRE_TIME;
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
		tmpMap.put(_Fields.NUMBER,
				new org.apache.thrift.meta_data.FieldMetaData("number", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.NAME,
				new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.PHONE,
				new org.apache.thrift.meta_data.FieldMetaData("phone", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.BANK,
				new org.apache.thrift.meta_data.FieldMetaData("bank", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.BANK_START,
				new org.apache.thrift.meta_data.FieldMetaData("bankStart",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("createTime",
				org.apache.thrift.TFieldRequirementType.DEFAULT,
				new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING, "Time")));
		tmpMap.put(_Fields.UPDATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("updateTime",
				org.apache.thrift.TFieldRequirementType.DEFAULT,
				new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING, "Time")));
		tmpMap.put(_Fields.EXPIRE_TIME, new org.apache.thrift.meta_data.FieldMetaData("expireTime",
				org.apache.thrift.TFieldRequirementType.DEFAULT,
				new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING, "Time")));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserBankCard.class, metaDataMap);
	}

	public UserBankCard() {
	}

	public UserBankCard(java.lang.String uid, java.lang.String number, java.lang.String name, java.lang.String phone,
			java.lang.String bank, java.lang.String bankStart, java.lang.String createTime, java.lang.String updateTime,
			java.lang.String expireTime) {
		this();
		this.uid = uid;
		this.number = number;
		this.name = name;
		this.phone = phone;
		this.bank = bank;
		this.bankStart = bankStart;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.expireTime = expireTime;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public UserBankCard(UserBankCard other) {
		if (other.isSetUid()) {
			this.uid = other.uid;
		}
		if (other.isSetNumber()) {
			this.number = other.number;
		}
		if (other.isSetName()) {
			this.name = other.name;
		}
		if (other.isSetPhone()) {
			this.phone = other.phone;
		}
		if (other.isSetBank()) {
			this.bank = other.bank;
		}
		if (other.isSetBankStart()) {
			this.bankStart = other.bankStart;
		}
		if (other.isSetCreateTime()) {
			this.createTime = other.createTime;
		}
		if (other.isSetUpdateTime()) {
			this.updateTime = other.updateTime;
		}
		if (other.isSetExpireTime()) {
			this.expireTime = other.expireTime;
		}
	}

	public UserBankCard deepCopy() {
		return new UserBankCard(this);
	}

	@Override
	public void clear() {
		this.uid = null;
		this.number = null;
		this.name = null;
		this.phone = null;
		this.bank = null;
		this.bankStart = null;
		this.createTime = null;
		this.updateTime = null;
		this.expireTime = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getUid() {
		return this.uid;
	}

	public UserBankCard setUid(@org.apache.thrift.annotation.Nullable java.lang.String uid) {
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
	public java.lang.String getNumber() {
		return this.number;
	}

	public UserBankCard setNumber(@org.apache.thrift.annotation.Nullable java.lang.String number) {
		this.number = number;
		return this;
	}

	public void unsetNumber() {
		this.number = null;
	}

	/**
	 * Returns true if field number is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetNumber() {
		return this.number != null;
	}

	public void setNumberIsSet(boolean value) {
		if (!value) {
			this.number = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getName() {
		return this.name;
	}

	public UserBankCard setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
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

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getPhone() {
		return this.phone;
	}

	public UserBankCard setPhone(@org.apache.thrift.annotation.Nullable java.lang.String phone) {
		this.phone = phone;
		return this;
	}

	public void unsetPhone() {
		this.phone = null;
	}

	/**
	 * Returns true if field phone is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetPhone() {
		return this.phone != null;
	}

	public void setPhoneIsSet(boolean value) {
		if (!value) {
			this.phone = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getBank() {
		return this.bank;
	}

	public UserBankCard setBank(@org.apache.thrift.annotation.Nullable java.lang.String bank) {
		this.bank = bank;
		return this;
	}

	public void unsetBank() {
		this.bank = null;
	}

	/**
	 * Returns true if field bank is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetBank() {
		return this.bank != null;
	}

	public void setBankIsSet(boolean value) {
		if (!value) {
			this.bank = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getBankStart() {
		return this.bankStart;
	}

	public UserBankCard setBankStart(@org.apache.thrift.annotation.Nullable java.lang.String bankStart) {
		this.bankStart = bankStart;
		return this;
	}

	public void unsetBankStart() {
		this.bankStart = null;
	}

	/**
	 * Returns true if field bankStart is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetBankStart() {
		return this.bankStart != null;
	}

	public void setBankStartIsSet(boolean value) {
		if (!value) {
			this.bankStart = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getCreateTime() {
		return this.createTime;
	}

	public UserBankCard setCreateTime(@org.apache.thrift.annotation.Nullable java.lang.String createTime) {
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

	public UserBankCard setUpdateTime(@org.apache.thrift.annotation.Nullable java.lang.String updateTime) {
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
	public java.lang.String getExpireTime() {
		return this.expireTime;
	}

	public UserBankCard setExpireTime(@org.apache.thrift.annotation.Nullable java.lang.String expireTime) {
		this.expireTime = expireTime;
		return this;
	}

	public void unsetExpireTime() {
		this.expireTime = null;
	}

	/**
	 * Returns true if field expireTime is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetExpireTime() {
		return this.expireTime != null;
	}

	public void setExpireTimeIsSet(boolean value) {
		if (!value) {
			this.expireTime = null;
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

		case NUMBER:
			if (value == null) {
				unsetNumber();
			}
			else {
				setNumber((java.lang.String) value);
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

		case PHONE:
			if (value == null) {
				unsetPhone();
			}
			else {
				setPhone((java.lang.String) value);
			}
			break;

		case BANK:
			if (value == null) {
				unsetBank();
			}
			else {
				setBank((java.lang.String) value);
			}
			break;

		case BANK_START:
			if (value == null) {
				unsetBankStart();
			}
			else {
				setBankStart((java.lang.String) value);
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

		case EXPIRE_TIME:
			if (value == null) {
				unsetExpireTime();
			}
			else {
				setExpireTime((java.lang.String) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case UID:
			return getUid();

		case NUMBER:
			return getNumber();

		case NAME:
			return getName();

		case PHONE:
			return getPhone();

		case BANK:
			return getBank();

		case BANK_START:
			return getBankStart();

		case CREATE_TIME:
			return getCreateTime();

		case UPDATE_TIME:
			return getUpdateTime();

		case EXPIRE_TIME:
			return getExpireTime();

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
		case NUMBER:
			return isSetNumber();
		case NAME:
			return isSetName();
		case PHONE:
			return isSetPhone();
		case BANK:
			return isSetBank();
		case BANK_START:
			return isSetBankStart();
		case CREATE_TIME:
			return isSetCreateTime();
		case UPDATE_TIME:
			return isSetUpdateTime();
		case EXPIRE_TIME:
			return isSetExpireTime();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof UserBankCard)
			return this.equals((UserBankCard) that);
		return false;
	}

	public boolean equals(UserBankCard that) {
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

		boolean this_present_number = true && this.isSetNumber();
		boolean that_present_number = true && that.isSetNumber();
		if (this_present_number || that_present_number) {
			if (!(this_present_number && that_present_number))
				return false;
			if (!this.number.equals(that.number))
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

		boolean this_present_phone = true && this.isSetPhone();
		boolean that_present_phone = true && that.isSetPhone();
		if (this_present_phone || that_present_phone) {
			if (!(this_present_phone && that_present_phone))
				return false;
			if (!this.phone.equals(that.phone))
				return false;
		}

		boolean this_present_bank = true && this.isSetBank();
		boolean that_present_bank = true && that.isSetBank();
		if (this_present_bank || that_present_bank) {
			if (!(this_present_bank && that_present_bank))
				return false;
			if (!this.bank.equals(that.bank))
				return false;
		}

		boolean this_present_bankStart = true && this.isSetBankStart();
		boolean that_present_bankStart = true && that.isSetBankStart();
		if (this_present_bankStart || that_present_bankStart) {
			if (!(this_present_bankStart && that_present_bankStart))
				return false;
			if (!this.bankStart.equals(that.bankStart))
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

		boolean this_present_expireTime = true && this.isSetExpireTime();
		boolean that_present_expireTime = true && that.isSetExpireTime();
		if (this_present_expireTime || that_present_expireTime) {
			if (!(this_present_expireTime && that_present_expireTime))
				return false;
			if (!this.expireTime.equals(that.expireTime))
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

		hashCode = hashCode * 8191 + ((isSetNumber()) ? 131071 : 524287);
		if (isSetNumber())
			hashCode = hashCode * 8191 + number.hashCode();

		hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
		if (isSetName())
			hashCode = hashCode * 8191 + name.hashCode();

		hashCode = hashCode * 8191 + ((isSetPhone()) ? 131071 : 524287);
		if (isSetPhone())
			hashCode = hashCode * 8191 + phone.hashCode();

		hashCode = hashCode * 8191 + ((isSetBank()) ? 131071 : 524287);
		if (isSetBank())
			hashCode = hashCode * 8191 + bank.hashCode();

		hashCode = hashCode * 8191 + ((isSetBankStart()) ? 131071 : 524287);
		if (isSetBankStart())
			hashCode = hashCode * 8191 + bankStart.hashCode();

		hashCode = hashCode * 8191 + ((isSetCreateTime()) ? 131071 : 524287);
		if (isSetCreateTime())
			hashCode = hashCode * 8191 + createTime.hashCode();

		hashCode = hashCode * 8191 + ((isSetUpdateTime()) ? 131071 : 524287);
		if (isSetUpdateTime())
			hashCode = hashCode * 8191 + updateTime.hashCode();

		hashCode = hashCode * 8191 + ((isSetExpireTime()) ? 131071 : 524287);
		if (isSetExpireTime())
			hashCode = hashCode * 8191 + expireTime.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(UserBankCard other) {
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
		lastComparison = java.lang.Boolean.valueOf(isSetNumber()).compareTo(other.isSetNumber());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetNumber()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.number, other.number);
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
		lastComparison = java.lang.Boolean.valueOf(isSetPhone()).compareTo(other.isSetPhone());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetPhone()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.phone, other.phone);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetBank()).compareTo(other.isSetBank());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetBank()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bank, other.bank);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetBankStart()).compareTo(other.isSetBankStart());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetBankStart()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bankStart, other.bankStart);
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
		lastComparison = java.lang.Boolean.valueOf(isSetExpireTime()).compareTo(other.isSetExpireTime());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetExpireTime()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expireTime, other.expireTime);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("UserBankCard(");
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
		sb.append("number:");
		if (this.number == null) {
			sb.append("null");
		}
		else {
			sb.append(this.number);
		}
		first = false;
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
		if (!first)
			sb.append(", ");
		sb.append("phone:");
		if (this.phone == null) {
			sb.append("null");
		}
		else {
			sb.append(this.phone);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("bank:");
		if (this.bank == null) {
			sb.append("null");
		}
		else {
			sb.append(this.bank);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("bankStart:");
		if (this.bankStart == null) {
			sb.append("null");
		}
		else {
			sb.append(this.bankStart);
		}
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
		sb.append("expireTime:");
		if (this.expireTime == null) {
			sb.append("null");
		}
		else {
			sb.append(this.expireTime);
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

	private static class UserBankCardStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public UserBankCardStandardScheme getScheme() {
			return new UserBankCardStandardScheme();
		}

	}

	private static class UserBankCardStandardScheme extends org.apache.thrift.scheme.StandardScheme<UserBankCard> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, UserBankCard struct)
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
				case 2: // NUMBER
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.number = iprot.readString();
						struct.setNumberIsSet(true);
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
				case 4: // PHONE
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.phone = iprot.readString();
						struct.setPhoneIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 5: // BANK
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.bank = iprot.readString();
						struct.setBankIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 6: // BANK_START
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.bankStart = iprot.readString();
						struct.setBankStartIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 7: // CREATE_TIME
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.createTime = iprot.readString();
						struct.setCreateTimeIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 8: // UPDATE_TIME
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.updateTime = iprot.readString();
						struct.setUpdateTimeIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 9: // EXPIRE_TIME
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.expireTime = iprot.readString();
						struct.setExpireTimeIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, UserBankCard struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.uid != null) {
				oprot.writeFieldBegin(UID_FIELD_DESC);
				oprot.writeString(struct.uid);
				oprot.writeFieldEnd();
			}
			if (struct.number != null) {
				oprot.writeFieldBegin(NUMBER_FIELD_DESC);
				oprot.writeString(struct.number);
				oprot.writeFieldEnd();
			}
			if (struct.name != null) {
				oprot.writeFieldBegin(NAME_FIELD_DESC);
				oprot.writeString(struct.name);
				oprot.writeFieldEnd();
			}
			if (struct.phone != null) {
				oprot.writeFieldBegin(PHONE_FIELD_DESC);
				oprot.writeString(struct.phone);
				oprot.writeFieldEnd();
			}
			if (struct.bank != null) {
				oprot.writeFieldBegin(BANK_FIELD_DESC);
				oprot.writeString(struct.bank);
				oprot.writeFieldEnd();
			}
			if (struct.bankStart != null) {
				oprot.writeFieldBegin(BANK_START_FIELD_DESC);
				oprot.writeString(struct.bankStart);
				oprot.writeFieldEnd();
			}
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
			if (struct.expireTime != null) {
				oprot.writeFieldBegin(EXPIRE_TIME_FIELD_DESC);
				oprot.writeString(struct.expireTime);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class UserBankCardTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public UserBankCardTupleScheme getScheme() {
			return new UserBankCardTupleScheme();
		}

	}

	private static class UserBankCardTupleScheme extends org.apache.thrift.scheme.TupleScheme<UserBankCard> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, UserBankCard struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetUid()) {
				optionals.set(0);
			}
			if (struct.isSetNumber()) {
				optionals.set(1);
			}
			if (struct.isSetName()) {
				optionals.set(2);
			}
			if (struct.isSetPhone()) {
				optionals.set(3);
			}
			if (struct.isSetBank()) {
				optionals.set(4);
			}
			if (struct.isSetBankStart()) {
				optionals.set(5);
			}
			if (struct.isSetCreateTime()) {
				optionals.set(6);
			}
			if (struct.isSetUpdateTime()) {
				optionals.set(7);
			}
			if (struct.isSetExpireTime()) {
				optionals.set(8);
			}
			oprot.writeBitSet(optionals, 9);
			if (struct.isSetUid()) {
				oprot.writeString(struct.uid);
			}
			if (struct.isSetNumber()) {
				oprot.writeString(struct.number);
			}
			if (struct.isSetName()) {
				oprot.writeString(struct.name);
			}
			if (struct.isSetPhone()) {
				oprot.writeString(struct.phone);
			}
			if (struct.isSetBank()) {
				oprot.writeString(struct.bank);
			}
			if (struct.isSetBankStart()) {
				oprot.writeString(struct.bankStart);
			}
			if (struct.isSetCreateTime()) {
				oprot.writeString(struct.createTime);
			}
			if (struct.isSetUpdateTime()) {
				oprot.writeString(struct.updateTime);
			}
			if (struct.isSetExpireTime()) {
				oprot.writeString(struct.expireTime);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, UserBankCard struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(9);
			if (incoming.get(0)) {
				struct.uid = iprot.readString();
				struct.setUidIsSet(true);
			}
			if (incoming.get(1)) {
				struct.number = iprot.readString();
				struct.setNumberIsSet(true);
			}
			if (incoming.get(2)) {
				struct.name = iprot.readString();
				struct.setNameIsSet(true);
			}
			if (incoming.get(3)) {
				struct.phone = iprot.readString();
				struct.setPhoneIsSet(true);
			}
			if (incoming.get(4)) {
				struct.bank = iprot.readString();
				struct.setBankIsSet(true);
			}
			if (incoming.get(5)) {
				struct.bankStart = iprot.readString();
				struct.setBankStartIsSet(true);
			}
			if (incoming.get(6)) {
				struct.createTime = iprot.readString();
				struct.setCreateTimeIsSet(true);
			}
			if (incoming.get(7)) {
				struct.updateTime = iprot.readString();
				struct.setUpdateTimeIsSet(true);
			}
			if (incoming.get(8)) {
				struct.expireTime = iprot.readString();
				struct.setExpireTimeIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
