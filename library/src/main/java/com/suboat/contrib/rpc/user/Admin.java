/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.user;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * 管理员实例
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-05-11")
public class Admin
		implements org.apache.thrift.TBase<Admin, Admin._Fields>, java.io.Serializable, Cloneable, Comparable<Admin> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"Admin");

	private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid",
			org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.protocol.TField ADMIN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"adminId", org.apache.thrift.protocol.TType.STRING, (short) 2);

	private static final org.apache.thrift.protocol.TField ADMIN_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"adminName", org.apache.thrift.protocol.TType.STRING, (short) 3);

	private static final org.apache.thrift.protocol.TField CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"createTime", org.apache.thrift.protocol.TType.STRING, (short) 4);

	private static final org.apache.thrift.protocol.TField UPDATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"updateTime", org.apache.thrift.protocol.TType.STRING, (short) 5);

	private static final org.apache.thrift.protocol.TField LOGIN_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"loginTime", org.apache.thrift.protocol.TType.STRING, (short) 6);

	private static final org.apache.thrift.protocol.TField IP_LAST_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"ipLast", org.apache.thrift.protocol.TType.STRING, (short) 7);

	private static final org.apache.thrift.protocol.TField IP_LAST_FAIL_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"ipLastFail", org.apache.thrift.protocol.TType.STRING, (short) 8);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AdminStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AdminTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String uid; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String adminId; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String adminName; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String createTime; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String updateTime; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String loginTime; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String ipLast; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String ipLastFail; // required

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		UID((short) 1, "uid"), ADMIN_ID((short) 2, "adminId"), ADMIN_NAME((short) 3, "adminName"), CREATE_TIME(
				(short) 4, "createTime"), UPDATE_TIME((short) 5, "updateTime"), LOGIN_TIME((short) 6,
						"loginTime"), IP_LAST((short) 7, "ipLast"), IP_LAST_FAIL((short) 8, "ipLastFail");

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
			case 2: // ADMIN_ID
				return ADMIN_ID;
			case 3: // ADMIN_NAME
				return ADMIN_NAME;
			case 4: // CREATE_TIME
				return CREATE_TIME;
			case 5: // UPDATE_TIME
				return UPDATE_TIME;
			case 6: // LOGIN_TIME
				return LOGIN_TIME;
			case 7: // IP_LAST
				return IP_LAST;
			case 8: // IP_LAST_FAIL
				return IP_LAST_FAIL;
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
		tmpMap.put(_Fields.ADMIN_ID,
				new org.apache.thrift.meta_data.FieldMetaData("adminId",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.ADMIN_NAME,
				new org.apache.thrift.meta_data.FieldMetaData("adminName",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("createTime",
				org.apache.thrift.TFieldRequirementType.DEFAULT,
				new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING, "Time")));
		tmpMap.put(_Fields.UPDATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("updateTime",
				org.apache.thrift.TFieldRequirementType.DEFAULT,
				new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING, "Time")));
		tmpMap.put(_Fields.LOGIN_TIME, new org.apache.thrift.meta_data.FieldMetaData("loginTime",
				org.apache.thrift.TFieldRequirementType.DEFAULT,
				new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING, "Time")));
		tmpMap.put(_Fields.IP_LAST,
				new org.apache.thrift.meta_data.FieldMetaData("ipLast", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.IP_LAST_FAIL,
				new org.apache.thrift.meta_data.FieldMetaData("ipLastFail",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Admin.class, metaDataMap);
	}

	public Admin() {
	}

	public Admin(java.lang.String uid, java.lang.String adminId, java.lang.String adminName,
			java.lang.String createTime, java.lang.String updateTime, java.lang.String loginTime,
			java.lang.String ipLast, java.lang.String ipLastFail) {
		this();
		this.uid = uid;
		this.adminId = adminId;
		this.adminName = adminName;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.loginTime = loginTime;
		this.ipLast = ipLast;
		this.ipLastFail = ipLastFail;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public Admin(Admin other) {
		if (other.isSetUid()) {
			this.uid = other.uid;
		}
		if (other.isSetAdminId()) {
			this.adminId = other.adminId;
		}
		if (other.isSetAdminName()) {
			this.adminName = other.adminName;
		}
		if (other.isSetCreateTime()) {
			this.createTime = other.createTime;
		}
		if (other.isSetUpdateTime()) {
			this.updateTime = other.updateTime;
		}
		if (other.isSetLoginTime()) {
			this.loginTime = other.loginTime;
		}
		if (other.isSetIpLast()) {
			this.ipLast = other.ipLast;
		}
		if (other.isSetIpLastFail()) {
			this.ipLastFail = other.ipLastFail;
		}
	}

	public Admin deepCopy() {
		return new Admin(this);
	}

	@Override
	public void clear() {
		this.uid = null;
		this.adminId = null;
		this.adminName = null;
		this.createTime = null;
		this.updateTime = null;
		this.loginTime = null;
		this.ipLast = null;
		this.ipLastFail = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getUid() {
		return this.uid;
	}

	public Admin setUid(@org.apache.thrift.annotation.Nullable java.lang.String uid) {
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
	public java.lang.String getAdminId() {
		return this.adminId;
	}

	public Admin setAdminId(@org.apache.thrift.annotation.Nullable java.lang.String adminId) {
		this.adminId = adminId;
		return this;
	}

	public void unsetAdminId() {
		this.adminId = null;
	}

	/**
	 * Returns true if field adminId is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetAdminId() {
		return this.adminId != null;
	}

	public void setAdminIdIsSet(boolean value) {
		if (!value) {
			this.adminId = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getAdminName() {
		return this.adminName;
	}

	public Admin setAdminName(@org.apache.thrift.annotation.Nullable java.lang.String adminName) {
		this.adminName = adminName;
		return this;
	}

	public void unsetAdminName() {
		this.adminName = null;
	}

	/**
	 * Returns true if field adminName is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetAdminName() {
		return this.adminName != null;
	}

	public void setAdminNameIsSet(boolean value) {
		if (!value) {
			this.adminName = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getCreateTime() {
		return this.createTime;
	}

	public Admin setCreateTime(@org.apache.thrift.annotation.Nullable java.lang.String createTime) {
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

	public Admin setUpdateTime(@org.apache.thrift.annotation.Nullable java.lang.String updateTime) {
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
	public java.lang.String getLoginTime() {
		return this.loginTime;
	}

	public Admin setLoginTime(@org.apache.thrift.annotation.Nullable java.lang.String loginTime) {
		this.loginTime = loginTime;
		return this;
	}

	public void unsetLoginTime() {
		this.loginTime = null;
	}

	/**
	 * Returns true if field loginTime is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetLoginTime() {
		return this.loginTime != null;
	}

	public void setLoginTimeIsSet(boolean value) {
		if (!value) {
			this.loginTime = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getIpLast() {
		return this.ipLast;
	}

	public Admin setIpLast(@org.apache.thrift.annotation.Nullable java.lang.String ipLast) {
		this.ipLast = ipLast;
		return this;
	}

	public void unsetIpLast() {
		this.ipLast = null;
	}

	/**
	 * Returns true if field ipLast is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetIpLast() {
		return this.ipLast != null;
	}

	public void setIpLastIsSet(boolean value) {
		if (!value) {
			this.ipLast = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getIpLastFail() {
		return this.ipLastFail;
	}

	public Admin setIpLastFail(@org.apache.thrift.annotation.Nullable java.lang.String ipLastFail) {
		this.ipLastFail = ipLastFail;
		return this;
	}

	public void unsetIpLastFail() {
		this.ipLastFail = null;
	}

	/**
	 * Returns true if field ipLastFail is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetIpLastFail() {
		return this.ipLastFail != null;
	}

	public void setIpLastFailIsSet(boolean value) {
		if (!value) {
			this.ipLastFail = null;
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

		case ADMIN_ID:
			if (value == null) {
				unsetAdminId();
			}
			else {
				setAdminId((java.lang.String) value);
			}
			break;

		case ADMIN_NAME:
			if (value == null) {
				unsetAdminName();
			}
			else {
				setAdminName((java.lang.String) value);
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

		case LOGIN_TIME:
			if (value == null) {
				unsetLoginTime();
			}
			else {
				setLoginTime((java.lang.String) value);
			}
			break;

		case IP_LAST:
			if (value == null) {
				unsetIpLast();
			}
			else {
				setIpLast((java.lang.String) value);
			}
			break;

		case IP_LAST_FAIL:
			if (value == null) {
				unsetIpLastFail();
			}
			else {
				setIpLastFail((java.lang.String) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case UID:
			return getUid();

		case ADMIN_ID:
			return getAdminId();

		case ADMIN_NAME:
			return getAdminName();

		case CREATE_TIME:
			return getCreateTime();

		case UPDATE_TIME:
			return getUpdateTime();

		case LOGIN_TIME:
			return getLoginTime();

		case IP_LAST:
			return getIpLast();

		case IP_LAST_FAIL:
			return getIpLastFail();

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
		case ADMIN_ID:
			return isSetAdminId();
		case ADMIN_NAME:
			return isSetAdminName();
		case CREATE_TIME:
			return isSetCreateTime();
		case UPDATE_TIME:
			return isSetUpdateTime();
		case LOGIN_TIME:
			return isSetLoginTime();
		case IP_LAST:
			return isSetIpLast();
		case IP_LAST_FAIL:
			return isSetIpLastFail();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof Admin)
			return this.equals((Admin) that);
		return false;
	}

	public boolean equals(Admin that) {
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

		boolean this_present_adminId = true && this.isSetAdminId();
		boolean that_present_adminId = true && that.isSetAdminId();
		if (this_present_adminId || that_present_adminId) {
			if (!(this_present_adminId && that_present_adminId))
				return false;
			if (!this.adminId.equals(that.adminId))
				return false;
		}

		boolean this_present_adminName = true && this.isSetAdminName();
		boolean that_present_adminName = true && that.isSetAdminName();
		if (this_present_adminName || that_present_adminName) {
			if (!(this_present_adminName && that_present_adminName))
				return false;
			if (!this.adminName.equals(that.adminName))
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

		boolean this_present_loginTime = true && this.isSetLoginTime();
		boolean that_present_loginTime = true && that.isSetLoginTime();
		if (this_present_loginTime || that_present_loginTime) {
			if (!(this_present_loginTime && that_present_loginTime))
				return false;
			if (!this.loginTime.equals(that.loginTime))
				return false;
		}

		boolean this_present_ipLast = true && this.isSetIpLast();
		boolean that_present_ipLast = true && that.isSetIpLast();
		if (this_present_ipLast || that_present_ipLast) {
			if (!(this_present_ipLast && that_present_ipLast))
				return false;
			if (!this.ipLast.equals(that.ipLast))
				return false;
		}

		boolean this_present_ipLastFail = true && this.isSetIpLastFail();
		boolean that_present_ipLastFail = true && that.isSetIpLastFail();
		if (this_present_ipLastFail || that_present_ipLastFail) {
			if (!(this_present_ipLastFail && that_present_ipLastFail))
				return false;
			if (!this.ipLastFail.equals(that.ipLastFail))
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

		hashCode = hashCode * 8191 + ((isSetAdminId()) ? 131071 : 524287);
		if (isSetAdminId())
			hashCode = hashCode * 8191 + adminId.hashCode();

		hashCode = hashCode * 8191 + ((isSetAdminName()) ? 131071 : 524287);
		if (isSetAdminName())
			hashCode = hashCode * 8191 + adminName.hashCode();

		hashCode = hashCode * 8191 + ((isSetCreateTime()) ? 131071 : 524287);
		if (isSetCreateTime())
			hashCode = hashCode * 8191 + createTime.hashCode();

		hashCode = hashCode * 8191 + ((isSetUpdateTime()) ? 131071 : 524287);
		if (isSetUpdateTime())
			hashCode = hashCode * 8191 + updateTime.hashCode();

		hashCode = hashCode * 8191 + ((isSetLoginTime()) ? 131071 : 524287);
		if (isSetLoginTime())
			hashCode = hashCode * 8191 + loginTime.hashCode();

		hashCode = hashCode * 8191 + ((isSetIpLast()) ? 131071 : 524287);
		if (isSetIpLast())
			hashCode = hashCode * 8191 + ipLast.hashCode();

		hashCode = hashCode * 8191 + ((isSetIpLastFail()) ? 131071 : 524287);
		if (isSetIpLastFail())
			hashCode = hashCode * 8191 + ipLastFail.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(Admin other) {
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
		lastComparison = java.lang.Boolean.valueOf(isSetAdminId()).compareTo(other.isSetAdminId());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetAdminId()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.adminId, other.adminId);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetAdminName()).compareTo(other.isSetAdminName());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetAdminName()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.adminName, other.adminName);
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
		lastComparison = java.lang.Boolean.valueOf(isSetLoginTime()).compareTo(other.isSetLoginTime());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetLoginTime()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.loginTime, other.loginTime);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetIpLast()).compareTo(other.isSetIpLast());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetIpLast()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ipLast, other.ipLast);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetIpLastFail()).compareTo(other.isSetIpLastFail());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetIpLastFail()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ipLastFail, other.ipLastFail);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("Admin(");
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
		sb.append("adminId:");
		if (this.adminId == null) {
			sb.append("null");
		}
		else {
			sb.append(this.adminId);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("adminName:");
		if (this.adminName == null) {
			sb.append("null");
		}
		else {
			sb.append(this.adminName);
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
		sb.append("loginTime:");
		if (this.loginTime == null) {
			sb.append("null");
		}
		else {
			sb.append(this.loginTime);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("ipLast:");
		if (this.ipLast == null) {
			sb.append("null");
		}
		else {
			sb.append(this.ipLast);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("ipLastFail:");
		if (this.ipLastFail == null) {
			sb.append("null");
		}
		else {
			sb.append(this.ipLastFail);
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

	private static class AdminStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public AdminStandardScheme getScheme() {
			return new AdminStandardScheme();
		}

	}

	private static class AdminStandardScheme extends org.apache.thrift.scheme.StandardScheme<Admin> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, Admin struct) throws org.apache.thrift.TException {
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
				case 2: // ADMIN_ID
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.adminId = iprot.readString();
						struct.setAdminIdIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // ADMIN_NAME
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.adminName = iprot.readString();
						struct.setAdminNameIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 4: // CREATE_TIME
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.createTime = iprot.readString();
						struct.setCreateTimeIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 5: // UPDATE_TIME
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.updateTime = iprot.readString();
						struct.setUpdateTimeIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 6: // LOGIN_TIME
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.loginTime = iprot.readString();
						struct.setLoginTimeIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 7: // IP_LAST
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.ipLast = iprot.readString();
						struct.setIpLastIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 8: // IP_LAST_FAIL
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.ipLastFail = iprot.readString();
						struct.setIpLastFailIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, Admin struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.uid != null) {
				oprot.writeFieldBegin(UID_FIELD_DESC);
				oprot.writeString(struct.uid);
				oprot.writeFieldEnd();
			}
			if (struct.adminId != null) {
				oprot.writeFieldBegin(ADMIN_ID_FIELD_DESC);
				oprot.writeString(struct.adminId);
				oprot.writeFieldEnd();
			}
			if (struct.adminName != null) {
				oprot.writeFieldBegin(ADMIN_NAME_FIELD_DESC);
				oprot.writeString(struct.adminName);
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
			if (struct.loginTime != null) {
				oprot.writeFieldBegin(LOGIN_TIME_FIELD_DESC);
				oprot.writeString(struct.loginTime);
				oprot.writeFieldEnd();
			}
			if (struct.ipLast != null) {
				oprot.writeFieldBegin(IP_LAST_FIELD_DESC);
				oprot.writeString(struct.ipLast);
				oprot.writeFieldEnd();
			}
			if (struct.ipLastFail != null) {
				oprot.writeFieldBegin(IP_LAST_FAIL_FIELD_DESC);
				oprot.writeString(struct.ipLastFail);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class AdminTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public AdminTupleScheme getScheme() {
			return new AdminTupleScheme();
		}

	}

	private static class AdminTupleScheme extends org.apache.thrift.scheme.TupleScheme<Admin> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, Admin struct) throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetUid()) {
				optionals.set(0);
			}
			if (struct.isSetAdminId()) {
				optionals.set(1);
			}
			if (struct.isSetAdminName()) {
				optionals.set(2);
			}
			if (struct.isSetCreateTime()) {
				optionals.set(3);
			}
			if (struct.isSetUpdateTime()) {
				optionals.set(4);
			}
			if (struct.isSetLoginTime()) {
				optionals.set(5);
			}
			if (struct.isSetIpLast()) {
				optionals.set(6);
			}
			if (struct.isSetIpLastFail()) {
				optionals.set(7);
			}
			oprot.writeBitSet(optionals, 8);
			if (struct.isSetUid()) {
				oprot.writeString(struct.uid);
			}
			if (struct.isSetAdminId()) {
				oprot.writeString(struct.adminId);
			}
			if (struct.isSetAdminName()) {
				oprot.writeString(struct.adminName);
			}
			if (struct.isSetCreateTime()) {
				oprot.writeString(struct.createTime);
			}
			if (struct.isSetUpdateTime()) {
				oprot.writeString(struct.updateTime);
			}
			if (struct.isSetLoginTime()) {
				oprot.writeString(struct.loginTime);
			}
			if (struct.isSetIpLast()) {
				oprot.writeString(struct.ipLast);
			}
			if (struct.isSetIpLastFail()) {
				oprot.writeString(struct.ipLastFail);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, Admin struct) throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(8);
			if (incoming.get(0)) {
				struct.uid = iprot.readString();
				struct.setUidIsSet(true);
			}
			if (incoming.get(1)) {
				struct.adminId = iprot.readString();
				struct.setAdminIdIsSet(true);
			}
			if (incoming.get(2)) {
				struct.adminName = iprot.readString();
				struct.setAdminNameIsSet(true);
			}
			if (incoming.get(3)) {
				struct.createTime = iprot.readString();
				struct.setCreateTimeIsSet(true);
			}
			if (incoming.get(4)) {
				struct.updateTime = iprot.readString();
				struct.setUpdateTimeIsSet(true);
			}
			if (incoming.get(5)) {
				struct.loginTime = iprot.readString();
				struct.setLoginTimeIsSet(true);
			}
			if (incoming.get(6)) {
				struct.ipLast = iprot.readString();
				struct.setIpLastIsSet(true);
			}
			if (incoming.get(7)) {
				struct.ipLastFail = iprot.readString();
				struct.setIpLastFailIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
