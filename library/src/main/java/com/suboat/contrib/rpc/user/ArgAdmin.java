/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.user;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * 特定参数: 管理员 有效条件: 用户名、电话、邮箱至少填一个 注意: 1.verify参数仅当填写时验证 2.ensure方法不验证verify参数
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-01-14")
public class ArgAdmin implements org.apache.thrift.TBase<ArgAdmin, ArgAdmin._Fields>, java.io.Serializable, Cloneable,
		Comparable<ArgAdmin> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"ArgAdmin");

	private static final org.apache.thrift.protocol.TField ADMIN_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"adminName", org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.protocol.TField ADMIN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"adminId", org.apache.thrift.protocol.TType.STRING, (short) 2);

	private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid",
			org.apache.thrift.protocol.TType.STRING, (short) 3);

	private static final org.apache.thrift.protocol.TField ROLES_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"roles", org.apache.thrift.protocol.TType.LIST, (short) 4);

	private static final org.apache.thrift.protocol.TField AREAS_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"areas", org.apache.thrift.protocol.TType.LIST, (short) 5);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ArgAdminStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ArgAdminTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String adminName; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String adminId; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String uid; // required

	public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> roles; // optional

	public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> areas; // optional

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		ADMIN_NAME((short) 1, "adminName"), ADMIN_ID((short) 2, "adminId"), UID((short) 3, "uid"), ROLES((short) 4,
				"roles"), AREAS((short) 5, "areas");

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
			case 1: // ADMIN_NAME
				return ADMIN_NAME;
			case 2: // ADMIN_ID
				return ADMIN_ID;
			case 3: // UID
				return UID;
			case 4: // ROLES
				return ROLES;
			case 5: // AREAS
				return AREAS;
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
	private static final _Fields optionals[] = { _Fields.ROLES, _Fields.AREAS };

	public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.ADMIN_NAME,
				new org.apache.thrift.meta_data.FieldMetaData("adminName",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.ADMIN_ID,
				new org.apache.thrift.meta_data.FieldMetaData("adminId",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.UID,
				new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.ROLES, new org.apache.thrift.meta_data.FieldMetaData("roles",
				org.apache.thrift.TFieldRequirementType.OPTIONAL,
				new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
		tmpMap.put(_Fields.AREAS, new org.apache.thrift.meta_data.FieldMetaData("areas",
				org.apache.thrift.TFieldRequirementType.OPTIONAL,
				new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ArgAdmin.class, metaDataMap);
	}

	public ArgAdmin() {
	}

	public ArgAdmin(java.lang.String adminName, java.lang.String adminId, java.lang.String uid) {
		this();
		this.adminName = adminName;
		this.adminId = adminId;
		this.uid = uid;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public ArgAdmin(ArgAdmin other) {
		if (other.isSetAdminName()) {
			this.adminName = other.adminName;
		}
		if (other.isSetAdminId()) {
			this.adminId = other.adminId;
		}
		if (other.isSetUid()) {
			this.uid = other.uid;
		}
		if (other.isSetRoles()) {
			java.util.List<java.lang.String> __this__roles = new java.util.ArrayList<java.lang.String>(other.roles);
			this.roles = __this__roles;
		}
		if (other.isSetAreas()) {
			java.util.List<java.lang.String> __this__areas = new java.util.ArrayList<java.lang.String>(other.areas);
			this.areas = __this__areas;
		}
	}

	public ArgAdmin deepCopy() {
		return new ArgAdmin(this);
	}

	@Override
	public void clear() {
		this.adminName = null;
		this.adminId = null;
		this.uid = null;
		this.roles = null;
		this.areas = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getAdminName() {
		return this.adminName;
	}

	public ArgAdmin setAdminName(@org.apache.thrift.annotation.Nullable java.lang.String adminName) {
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
	public java.lang.String getAdminId() {
		return this.adminId;
	}

	public ArgAdmin setAdminId(@org.apache.thrift.annotation.Nullable java.lang.String adminId) {
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
	public java.lang.String getUid() {
		return this.uid;
	}

	public ArgAdmin setUid(@org.apache.thrift.annotation.Nullable java.lang.String uid) {
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

	public int getRolesSize() {
		return (this.roles == null) ? 0 : this.roles.size();
	}

	@org.apache.thrift.annotation.Nullable
	public java.util.Iterator<java.lang.String> getRolesIterator() {
		return (this.roles == null) ? null : this.roles.iterator();
	}

	public void addToRoles(java.lang.String elem) {
		if (this.roles == null) {
			this.roles = new java.util.ArrayList<java.lang.String>();
		}
		this.roles.add(elem);
	}

	@org.apache.thrift.annotation.Nullable
	public java.util.List<java.lang.String> getRoles() {
		return this.roles;
	}

	public ArgAdmin setRoles(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> roles) {
		this.roles = roles;
		return this;
	}

	public void unsetRoles() {
		this.roles = null;
	}

	/**
	 * Returns true if field roles is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetRoles() {
		return this.roles != null;
	}

	public void setRolesIsSet(boolean value) {
		if (!value) {
			this.roles = null;
		}
	}

	public int getAreasSize() {
		return (this.areas == null) ? 0 : this.areas.size();
	}

	@org.apache.thrift.annotation.Nullable
	public java.util.Iterator<java.lang.String> getAreasIterator() {
		return (this.areas == null) ? null : this.areas.iterator();
	}

	public void addToAreas(java.lang.String elem) {
		if (this.areas == null) {
			this.areas = new java.util.ArrayList<java.lang.String>();
		}
		this.areas.add(elem);
	}

	@org.apache.thrift.annotation.Nullable
	public java.util.List<java.lang.String> getAreas() {
		return this.areas;
	}

	public ArgAdmin setAreas(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> areas) {
		this.areas = areas;
		return this;
	}

	public void unsetAreas() {
		this.areas = null;
	}

	/**
	 * Returns true if field areas is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetAreas() {
		return this.areas != null;
	}

	public void setAreasIsSet(boolean value) {
		if (!value) {
			this.areas = null;
		}
	}

	public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
		switch (field) {
		case ADMIN_NAME:
			if (value == null) {
				unsetAdminName();
			}
			else {
				setAdminName((java.lang.String) value);
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

		case UID:
			if (value == null) {
				unsetUid();
			}
			else {
				setUid((java.lang.String) value);
			}
			break;

		case ROLES:
			if (value == null) {
				unsetRoles();
			}
			else {
				setRoles((java.util.List<java.lang.String>) value);
			}
			break;

		case AREAS:
			if (value == null) {
				unsetAreas();
			}
			else {
				setAreas((java.util.List<java.lang.String>) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case ADMIN_NAME:
			return getAdminName();

		case ADMIN_ID:
			return getAdminId();

		case UID:
			return getUid();

		case ROLES:
			return getRoles();

		case AREAS:
			return getAreas();

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
		case ADMIN_NAME:
			return isSetAdminName();
		case ADMIN_ID:
			return isSetAdminId();
		case UID:
			return isSetUid();
		case ROLES:
			return isSetRoles();
		case AREAS:
			return isSetAreas();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof ArgAdmin)
			return this.equals((ArgAdmin) that);
		return false;
	}

	public boolean equals(ArgAdmin that) {
		if (that == null)
			return false;
		if (this == that)
			return true;

		boolean this_present_adminName = true && this.isSetAdminName();
		boolean that_present_adminName = true && that.isSetAdminName();
		if (this_present_adminName || that_present_adminName) {
			if (!(this_present_adminName && that_present_adminName))
				return false;
			if (!this.adminName.equals(that.adminName))
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

		boolean this_present_uid = true && this.isSetUid();
		boolean that_present_uid = true && that.isSetUid();
		if (this_present_uid || that_present_uid) {
			if (!(this_present_uid && that_present_uid))
				return false;
			if (!this.uid.equals(that.uid))
				return false;
		}

		boolean this_present_roles = true && this.isSetRoles();
		boolean that_present_roles = true && that.isSetRoles();
		if (this_present_roles || that_present_roles) {
			if (!(this_present_roles && that_present_roles))
				return false;
			if (!this.roles.equals(that.roles))
				return false;
		}

		boolean this_present_areas = true && this.isSetAreas();
		boolean that_present_areas = true && that.isSetAreas();
		if (this_present_areas || that_present_areas) {
			if (!(this_present_areas && that_present_areas))
				return false;
			if (!this.areas.equals(that.areas))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int hashCode = 1;

		hashCode = hashCode * 8191 + ((isSetAdminName()) ? 131071 : 524287);
		if (isSetAdminName())
			hashCode = hashCode * 8191 + adminName.hashCode();

		hashCode = hashCode * 8191 + ((isSetAdminId()) ? 131071 : 524287);
		if (isSetAdminId())
			hashCode = hashCode * 8191 + adminId.hashCode();

		hashCode = hashCode * 8191 + ((isSetUid()) ? 131071 : 524287);
		if (isSetUid())
			hashCode = hashCode * 8191 + uid.hashCode();

		hashCode = hashCode * 8191 + ((isSetRoles()) ? 131071 : 524287);
		if (isSetRoles())
			hashCode = hashCode * 8191 + roles.hashCode();

		hashCode = hashCode * 8191 + ((isSetAreas()) ? 131071 : 524287);
		if (isSetAreas())
			hashCode = hashCode * 8191 + areas.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(ArgAdmin other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

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
		lastComparison = java.lang.Boolean.valueOf(isSetRoles()).compareTo(other.isSetRoles());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetRoles()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roles, other.roles);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetAreas()).compareTo(other.isSetAreas());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetAreas()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.areas, other.areas);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("ArgAdmin(");
		boolean first = true;

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
		sb.append("uid:");
		if (this.uid == null) {
			sb.append("null");
		}
		else {
			sb.append(this.uid);
		}
		first = false;
		if (isSetRoles()) {
			if (!first)
				sb.append(", ");
			sb.append("roles:");
			if (this.roles == null) {
				sb.append("null");
			}
			else {
				sb.append(this.roles);
			}
			first = false;
		}
		if (isSetAreas()) {
			if (!first)
				sb.append(", ");
			sb.append("areas:");
			if (this.areas == null) {
				sb.append("null");
			}
			else {
				sb.append(this.areas);
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
			read(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(in)));
		}
		catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private static class ArgAdminStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ArgAdminStandardScheme getScheme() {
			return new ArgAdminStandardScheme();
		}

	}

	private static class ArgAdminStandardScheme extends org.apache.thrift.scheme.StandardScheme<ArgAdmin> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, ArgAdmin struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // ADMIN_NAME
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.adminName = iprot.readString();
						struct.setAdminNameIsSet(true);
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
				case 3: // UID
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.uid = iprot.readString();
						struct.setUidIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 4: // ROLES
					if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
						{
							org.apache.thrift.protocol.TList _list100 = iprot.readListBegin();
							struct.roles = new java.util.ArrayList<java.lang.String>(_list100.size);
							@org.apache.thrift.annotation.Nullable
							java.lang.String _elem101;
							for (int _i102 = 0; _i102 < _list100.size; ++_i102) {
								_elem101 = iprot.readString();
								struct.roles.add(_elem101);
							}
							iprot.readListEnd();
						}
						struct.setRolesIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 5: // AREAS
					if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
						{
							org.apache.thrift.protocol.TList _list103 = iprot.readListBegin();
							struct.areas = new java.util.ArrayList<java.lang.String>(_list103.size);
							@org.apache.thrift.annotation.Nullable
							java.lang.String _elem104;
							for (int _i105 = 0; _i105 < _list103.size; ++_i105) {
								_elem104 = iprot.readString();
								struct.areas.add(_elem104);
							}
							iprot.readListEnd();
						}
						struct.setAreasIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, ArgAdmin struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.adminName != null) {
				oprot.writeFieldBegin(ADMIN_NAME_FIELD_DESC);
				oprot.writeString(struct.adminName);
				oprot.writeFieldEnd();
			}
			if (struct.adminId != null) {
				oprot.writeFieldBegin(ADMIN_ID_FIELD_DESC);
				oprot.writeString(struct.adminId);
				oprot.writeFieldEnd();
			}
			if (struct.uid != null) {
				oprot.writeFieldBegin(UID_FIELD_DESC);
				oprot.writeString(struct.uid);
				oprot.writeFieldEnd();
			}
			if (struct.roles != null) {
				if (struct.isSetRoles()) {
					oprot.writeFieldBegin(ROLES_FIELD_DESC);
					{
						oprot.writeListBegin(new org.apache.thrift.protocol.TList(
								org.apache.thrift.protocol.TType.STRING, struct.roles.size()));
						for (java.lang.String _iter106 : struct.roles) {
							oprot.writeString(_iter106);
						}
						oprot.writeListEnd();
					}
					oprot.writeFieldEnd();
				}
			}
			if (struct.areas != null) {
				if (struct.isSetAreas()) {
					oprot.writeFieldBegin(AREAS_FIELD_DESC);
					{
						oprot.writeListBegin(new org.apache.thrift.protocol.TList(
								org.apache.thrift.protocol.TType.STRING, struct.areas.size()));
						for (java.lang.String _iter107 : struct.areas) {
							oprot.writeString(_iter107);
						}
						oprot.writeListEnd();
					}
					oprot.writeFieldEnd();
				}
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class ArgAdminTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ArgAdminTupleScheme getScheme() {
			return new ArgAdminTupleScheme();
		}

	}

	private static class ArgAdminTupleScheme extends org.apache.thrift.scheme.TupleScheme<ArgAdmin> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, ArgAdmin struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetAdminName()) {
				optionals.set(0);
			}
			if (struct.isSetAdminId()) {
				optionals.set(1);
			}
			if (struct.isSetUid()) {
				optionals.set(2);
			}
			if (struct.isSetRoles()) {
				optionals.set(3);
			}
			if (struct.isSetAreas()) {
				optionals.set(4);
			}
			oprot.writeBitSet(optionals, 5);
			if (struct.isSetAdminName()) {
				oprot.writeString(struct.adminName);
			}
			if (struct.isSetAdminId()) {
				oprot.writeString(struct.adminId);
			}
			if (struct.isSetUid()) {
				oprot.writeString(struct.uid);
			}
			if (struct.isSetRoles()) {
				{
					oprot.writeI32(struct.roles.size());
					for (java.lang.String _iter108 : struct.roles) {
						oprot.writeString(_iter108);
					}
				}
			}
			if (struct.isSetAreas()) {
				{
					oprot.writeI32(struct.areas.size());
					for (java.lang.String _iter109 : struct.areas) {
						oprot.writeString(_iter109);
					}
				}
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, ArgAdmin struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(5);
			if (incoming.get(0)) {
				struct.adminName = iprot.readString();
				struct.setAdminNameIsSet(true);
			}
			if (incoming.get(1)) {
				struct.adminId = iprot.readString();
				struct.setAdminIdIsSet(true);
			}
			if (incoming.get(2)) {
				struct.uid = iprot.readString();
				struct.setUidIsSet(true);
			}
			if (incoming.get(3)) {
				{
					org.apache.thrift.protocol.TList _list110 = new org.apache.thrift.protocol.TList(
							org.apache.thrift.protocol.TType.STRING, iprot.readI32());
					struct.roles = new java.util.ArrayList<java.lang.String>(_list110.size);
					@org.apache.thrift.annotation.Nullable
					java.lang.String _elem111;
					for (int _i112 = 0; _i112 < _list110.size; ++_i112) {
						_elem111 = iprot.readString();
						struct.roles.add(_elem111);
					}
				}
				struct.setRolesIsSet(true);
			}
			if (incoming.get(4)) {
				{
					org.apache.thrift.protocol.TList _list113 = new org.apache.thrift.protocol.TList(
							org.apache.thrift.protocol.TType.STRING, iprot.readI32());
					struct.areas = new java.util.ArrayList<java.lang.String>(_list113.size);
					@org.apache.thrift.annotation.Nullable
					java.lang.String _elem114;
					for (int _i115 = 0; _i115 < _list113.size; ++_i115) {
						_elem114 = iprot.readString();
						struct.areas.add(_elem114);
					}
				}
				struct.setAreasIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
