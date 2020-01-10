/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.user;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * 用户权限, 基于RBAC规范
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-01-10")
public class UserRBAC implements org.apache.thrift.TBase<UserRBAC, UserRBAC._Fields>, java.io.Serializable, Cloneable,
		Comparable<UserRBAC> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"UserRBAC");

	private static final org.apache.thrift.protocol.TField ROLES_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"roles", org.apache.thrift.protocol.TType.MAP, (short) 1);

	private static final org.apache.thrift.protocol.TField INHER_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"inher", org.apache.thrift.protocol.TType.MAP, (short) 2);

	private static final org.apache.thrift.protocol.TField PERMS_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"perms", org.apache.thrift.protocol.TType.LIST, (short) 3);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UserRBACStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UserRBACTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String, java.util.List<java.lang.String>> roles; // required

	public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String, java.util.List<java.lang.String>> inher; // required

	public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> perms; // required

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		ROLES((short) 1, "roles"), INHER((short) 2, "inher"), PERMS((short) 3, "perms");

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
			case 1: // ROLES
				return ROLES;
			case 2: // INHER
				return INHER;
			case 3: // PERMS
				return PERMS;
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
		tmpMap.put(_Fields.ROLES, new org.apache.thrift.meta_data.FieldMetaData("roles",
				org.apache.thrift.TFieldRequirementType.DEFAULT,
				new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING),
						new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST,
								new org.apache.thrift.meta_data.FieldValueMetaData(
										org.apache.thrift.protocol.TType.STRING)))));
		tmpMap.put(_Fields.INHER, new org.apache.thrift.meta_data.FieldMetaData("inher",
				org.apache.thrift.TFieldRequirementType.DEFAULT,
				new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING),
						new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST,
								new org.apache.thrift.meta_data.FieldValueMetaData(
										org.apache.thrift.protocol.TType.STRING)))));
		tmpMap.put(_Fields.PERMS, new org.apache.thrift.meta_data.FieldMetaData("perms",
				org.apache.thrift.TFieldRequirementType.DEFAULT,
				new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserRBAC.class, metaDataMap);
	}

	public UserRBAC() {
	}

	public UserRBAC(java.util.Map<java.lang.String, java.util.List<java.lang.String>> roles,
			java.util.Map<java.lang.String, java.util.List<java.lang.String>> inher,
			java.util.List<java.lang.String> perms) {
		this();
		this.roles = roles;
		this.inher = inher;
		this.perms = perms;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public UserRBAC(UserRBAC other) {
		if (other.isSetRoles()) {
			java.util.Map<java.lang.String, java.util.List<java.lang.String>> __this__roles = new java.util.HashMap<java.lang.String, java.util.List<java.lang.String>>(
					other.roles.size());
			for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> other_element : other.roles
					.entrySet()) {

				java.lang.String other_element_key = other_element.getKey();
				java.util.List<java.lang.String> other_element_value = other_element.getValue();

				java.lang.String __this__roles_copy_key = other_element_key;

				java.util.List<java.lang.String> __this__roles_copy_value = new java.util.ArrayList<java.lang.String>(
						other_element_value);

				__this__roles.put(__this__roles_copy_key, __this__roles_copy_value);
			}
			this.roles = __this__roles;
		}
		if (other.isSetInher()) {
			java.util.Map<java.lang.String, java.util.List<java.lang.String>> __this__inher = new java.util.HashMap<java.lang.String, java.util.List<java.lang.String>>(
					other.inher.size());
			for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> other_element : other.inher
					.entrySet()) {

				java.lang.String other_element_key = other_element.getKey();
				java.util.List<java.lang.String> other_element_value = other_element.getValue();

				java.lang.String __this__inher_copy_key = other_element_key;

				java.util.List<java.lang.String> __this__inher_copy_value = new java.util.ArrayList<java.lang.String>(
						other_element_value);

				__this__inher.put(__this__inher_copy_key, __this__inher_copy_value);
			}
			this.inher = __this__inher;
		}
		if (other.isSetPerms()) {
			java.util.List<java.lang.String> __this__perms = new java.util.ArrayList<java.lang.String>(other.perms);
			this.perms = __this__perms;
		}
	}

	public UserRBAC deepCopy() {
		return new UserRBAC(this);
	}

	@Override
	public void clear() {
		this.roles = null;
		this.inher = null;
		this.perms = null;
	}

	public int getRolesSize() {
		return (this.roles == null) ? 0 : this.roles.size();
	}

	public void putToRoles(java.lang.String key, java.util.List<java.lang.String> val) {
		if (this.roles == null) {
			this.roles = new java.util.HashMap<java.lang.String, java.util.List<java.lang.String>>();
		}
		this.roles.put(key, val);
	}

	@org.apache.thrift.annotation.Nullable
	public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getRoles() {
		return this.roles;
	}

	public UserRBAC setRoles(
			@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String, java.util.List<java.lang.String>> roles) {
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

	public int getInherSize() {
		return (this.inher == null) ? 0 : this.inher.size();
	}

	public void putToInher(java.lang.String key, java.util.List<java.lang.String> val) {
		if (this.inher == null) {
			this.inher = new java.util.HashMap<java.lang.String, java.util.List<java.lang.String>>();
		}
		this.inher.put(key, val);
	}

	@org.apache.thrift.annotation.Nullable
	public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getInher() {
		return this.inher;
	}

	public UserRBAC setInher(
			@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String, java.util.List<java.lang.String>> inher) {
		this.inher = inher;
		return this;
	}

	public void unsetInher() {
		this.inher = null;
	}

	/**
	 * Returns true if field inher is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetInher() {
		return this.inher != null;
	}

	public void setInherIsSet(boolean value) {
		if (!value) {
			this.inher = null;
		}
	}

	public int getPermsSize() {
		return (this.perms == null) ? 0 : this.perms.size();
	}

	@org.apache.thrift.annotation.Nullable
	public java.util.Iterator<java.lang.String> getPermsIterator() {
		return (this.perms == null) ? null : this.perms.iterator();
	}

	public void addToPerms(java.lang.String elem) {
		if (this.perms == null) {
			this.perms = new java.util.ArrayList<java.lang.String>();
		}
		this.perms.add(elem);
	}

	@org.apache.thrift.annotation.Nullable
	public java.util.List<java.lang.String> getPerms() {
		return this.perms;
	}

	public UserRBAC setPerms(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> perms) {
		this.perms = perms;
		return this;
	}

	public void unsetPerms() {
		this.perms = null;
	}

	/**
	 * Returns true if field perms is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetPerms() {
		return this.perms != null;
	}

	public void setPermsIsSet(boolean value) {
		if (!value) {
			this.perms = null;
		}
	}

	public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
		switch (field) {
		case ROLES:
			if (value == null) {
				unsetRoles();
			}
			else {
				setRoles((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) value);
			}
			break;

		case INHER:
			if (value == null) {
				unsetInher();
			}
			else {
				setInher((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) value);
			}
			break;

		case PERMS:
			if (value == null) {
				unsetPerms();
			}
			else {
				setPerms((java.util.List<java.lang.String>) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case ROLES:
			return getRoles();

		case INHER:
			return getInher();

		case PERMS:
			return getPerms();

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
		case ROLES:
			return isSetRoles();
		case INHER:
			return isSetInher();
		case PERMS:
			return isSetPerms();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof UserRBAC)
			return this.equals((UserRBAC) that);
		return false;
	}

	public boolean equals(UserRBAC that) {
		if (that == null)
			return false;
		if (this == that)
			return true;

		boolean this_present_roles = true && this.isSetRoles();
		boolean that_present_roles = true && that.isSetRoles();
		if (this_present_roles || that_present_roles) {
			if (!(this_present_roles && that_present_roles))
				return false;
			if (!this.roles.equals(that.roles))
				return false;
		}

		boolean this_present_inher = true && this.isSetInher();
		boolean that_present_inher = true && that.isSetInher();
		if (this_present_inher || that_present_inher) {
			if (!(this_present_inher && that_present_inher))
				return false;
			if (!this.inher.equals(that.inher))
				return false;
		}

		boolean this_present_perms = true && this.isSetPerms();
		boolean that_present_perms = true && that.isSetPerms();
		if (this_present_perms || that_present_perms) {
			if (!(this_present_perms && that_present_perms))
				return false;
			if (!this.perms.equals(that.perms))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int hashCode = 1;

		hashCode = hashCode * 8191 + ((isSetRoles()) ? 131071 : 524287);
		if (isSetRoles())
			hashCode = hashCode * 8191 + roles.hashCode();

		hashCode = hashCode * 8191 + ((isSetInher()) ? 131071 : 524287);
		if (isSetInher())
			hashCode = hashCode * 8191 + inher.hashCode();

		hashCode = hashCode * 8191 + ((isSetPerms()) ? 131071 : 524287);
		if (isSetPerms())
			hashCode = hashCode * 8191 + perms.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(UserRBAC other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

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
		lastComparison = java.lang.Boolean.valueOf(isSetInher()).compareTo(other.isSetInher());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetInher()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inher, other.inher);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetPerms()).compareTo(other.isSetPerms());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetPerms()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.perms, other.perms);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("UserRBAC(");
		boolean first = true;

		sb.append("roles:");
		if (this.roles == null) {
			sb.append("null");
		}
		else {
			sb.append(this.roles);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("inher:");
		if (this.inher == null) {
			sb.append("null");
		}
		else {
			sb.append(this.inher);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("perms:");
		if (this.perms == null) {
			sb.append("null");
		}
		else {
			sb.append(this.perms);
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

	private static class UserRBACStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public UserRBACStandardScheme getScheme() {
			return new UserRBACStandardScheme();
		}

	}

	private static class UserRBACStandardScheme extends org.apache.thrift.scheme.StandardScheme<UserRBAC> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, UserRBAC struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // ROLES
					if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
						{
							org.apache.thrift.protocol.TMap _map32 = iprot.readMapBegin();
							struct.roles = new java.util.HashMap<java.lang.String, java.util.List<java.lang.String>>(
									2 * _map32.size);
							@org.apache.thrift.annotation.Nullable
							java.lang.String _key33;
							@org.apache.thrift.annotation.Nullable
							java.util.List<java.lang.String> _val34;
							for (int _i35 = 0; _i35 < _map32.size; ++_i35) {
								_key33 = iprot.readString();
								{
									org.apache.thrift.protocol.TList _list36 = iprot.readListBegin();
									_val34 = new java.util.ArrayList<java.lang.String>(_list36.size);
									@org.apache.thrift.annotation.Nullable
									java.lang.String _elem37;
									for (int _i38 = 0; _i38 < _list36.size; ++_i38) {
										_elem37 = iprot.readString();
										_val34.add(_elem37);
									}
									iprot.readListEnd();
								}
								struct.roles.put(_key33, _val34);
							}
							iprot.readMapEnd();
						}
						struct.setRolesIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // INHER
					if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
						{
							org.apache.thrift.protocol.TMap _map39 = iprot.readMapBegin();
							struct.inher = new java.util.HashMap<java.lang.String, java.util.List<java.lang.String>>(
									2 * _map39.size);
							@org.apache.thrift.annotation.Nullable
							java.lang.String _key40;
							@org.apache.thrift.annotation.Nullable
							java.util.List<java.lang.String> _val41;
							for (int _i42 = 0; _i42 < _map39.size; ++_i42) {
								_key40 = iprot.readString();
								{
									org.apache.thrift.protocol.TList _list43 = iprot.readListBegin();
									_val41 = new java.util.ArrayList<java.lang.String>(_list43.size);
									@org.apache.thrift.annotation.Nullable
									java.lang.String _elem44;
									for (int _i45 = 0; _i45 < _list43.size; ++_i45) {
										_elem44 = iprot.readString();
										_val41.add(_elem44);
									}
									iprot.readListEnd();
								}
								struct.inher.put(_key40, _val41);
							}
							iprot.readMapEnd();
						}
						struct.setInherIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // PERMS
					if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
						{
							org.apache.thrift.protocol.TList _list46 = iprot.readListBegin();
							struct.perms = new java.util.ArrayList<java.lang.String>(_list46.size);
							@org.apache.thrift.annotation.Nullable
							java.lang.String _elem47;
							for (int _i48 = 0; _i48 < _list46.size; ++_i48) {
								_elem47 = iprot.readString();
								struct.perms.add(_elem47);
							}
							iprot.readListEnd();
						}
						struct.setPermsIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, UserRBAC struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.roles != null) {
				oprot.writeFieldBegin(ROLES_FIELD_DESC);
				{
					oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING,
							org.apache.thrift.protocol.TType.LIST, struct.roles.size()));
					for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> _iter49 : struct.roles
							.entrySet()) {
						oprot.writeString(_iter49.getKey());
						{
							oprot.writeListBegin(new org.apache.thrift.protocol.TList(
									org.apache.thrift.protocol.TType.STRING, _iter49.getValue().size()));
							for (java.lang.String _iter50 : _iter49.getValue()) {
								oprot.writeString(_iter50);
							}
							oprot.writeListEnd();
						}
					}
					oprot.writeMapEnd();
				}
				oprot.writeFieldEnd();
			}
			if (struct.inher != null) {
				oprot.writeFieldBegin(INHER_FIELD_DESC);
				{
					oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING,
							org.apache.thrift.protocol.TType.LIST, struct.inher.size()));
					for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> _iter51 : struct.inher
							.entrySet()) {
						oprot.writeString(_iter51.getKey());
						{
							oprot.writeListBegin(new org.apache.thrift.protocol.TList(
									org.apache.thrift.protocol.TType.STRING, _iter51.getValue().size()));
							for (java.lang.String _iter52 : _iter51.getValue()) {
								oprot.writeString(_iter52);
							}
							oprot.writeListEnd();
						}
					}
					oprot.writeMapEnd();
				}
				oprot.writeFieldEnd();
			}
			if (struct.perms != null) {
				oprot.writeFieldBegin(PERMS_FIELD_DESC);
				{
					oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING,
							struct.perms.size()));
					for (java.lang.String _iter53 : struct.perms) {
						oprot.writeString(_iter53);
					}
					oprot.writeListEnd();
				}
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class UserRBACTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public UserRBACTupleScheme getScheme() {
			return new UserRBACTupleScheme();
		}

	}

	private static class UserRBACTupleScheme extends org.apache.thrift.scheme.TupleScheme<UserRBAC> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, UserRBAC struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetRoles()) {
				optionals.set(0);
			}
			if (struct.isSetInher()) {
				optionals.set(1);
			}
			if (struct.isSetPerms()) {
				optionals.set(2);
			}
			oprot.writeBitSet(optionals, 3);
			if (struct.isSetRoles()) {
				{
					oprot.writeI32(struct.roles.size());
					for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> _iter54 : struct.roles
							.entrySet()) {
						oprot.writeString(_iter54.getKey());
						{
							oprot.writeI32(_iter54.getValue().size());
							for (java.lang.String _iter55 : _iter54.getValue()) {
								oprot.writeString(_iter55);
							}
						}
					}
				}
			}
			if (struct.isSetInher()) {
				{
					oprot.writeI32(struct.inher.size());
					for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> _iter56 : struct.inher
							.entrySet()) {
						oprot.writeString(_iter56.getKey());
						{
							oprot.writeI32(_iter56.getValue().size());
							for (java.lang.String _iter57 : _iter56.getValue()) {
								oprot.writeString(_iter57);
							}
						}
					}
				}
			}
			if (struct.isSetPerms()) {
				{
					oprot.writeI32(struct.perms.size());
					for (java.lang.String _iter58 : struct.perms) {
						oprot.writeString(_iter58);
					}
				}
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, UserRBAC struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(3);
			if (incoming.get(0)) {
				{
					org.apache.thrift.protocol.TMap _map59 = new org.apache.thrift.protocol.TMap(
							org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST,
							iprot.readI32());
					struct.roles = new java.util.HashMap<java.lang.String, java.util.List<java.lang.String>>(
							2 * _map59.size);
					@org.apache.thrift.annotation.Nullable
					java.lang.String _key60;
					@org.apache.thrift.annotation.Nullable
					java.util.List<java.lang.String> _val61;
					for (int _i62 = 0; _i62 < _map59.size; ++_i62) {
						_key60 = iprot.readString();
						{
							org.apache.thrift.protocol.TList _list63 = new org.apache.thrift.protocol.TList(
									org.apache.thrift.protocol.TType.STRING, iprot.readI32());
							_val61 = new java.util.ArrayList<java.lang.String>(_list63.size);
							@org.apache.thrift.annotation.Nullable
							java.lang.String _elem64;
							for (int _i65 = 0; _i65 < _list63.size; ++_i65) {
								_elem64 = iprot.readString();
								_val61.add(_elem64);
							}
						}
						struct.roles.put(_key60, _val61);
					}
				}
				struct.setRolesIsSet(true);
			}
			if (incoming.get(1)) {
				{
					org.apache.thrift.protocol.TMap _map66 = new org.apache.thrift.protocol.TMap(
							org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST,
							iprot.readI32());
					struct.inher = new java.util.HashMap<java.lang.String, java.util.List<java.lang.String>>(
							2 * _map66.size);
					@org.apache.thrift.annotation.Nullable
					java.lang.String _key67;
					@org.apache.thrift.annotation.Nullable
					java.util.List<java.lang.String> _val68;
					for (int _i69 = 0; _i69 < _map66.size; ++_i69) {
						_key67 = iprot.readString();
						{
							org.apache.thrift.protocol.TList _list70 = new org.apache.thrift.protocol.TList(
									org.apache.thrift.protocol.TType.STRING, iprot.readI32());
							_val68 = new java.util.ArrayList<java.lang.String>(_list70.size);
							@org.apache.thrift.annotation.Nullable
							java.lang.String _elem71;
							for (int _i72 = 0; _i72 < _list70.size; ++_i72) {
								_elem71 = iprot.readString();
								_val68.add(_elem71);
							}
						}
						struct.inher.put(_key67, _val68);
					}
				}
				struct.setInherIsSet(true);
			}
			if (incoming.get(2)) {
				{
					org.apache.thrift.protocol.TList _list73 = new org.apache.thrift.protocol.TList(
							org.apache.thrift.protocol.TType.STRING, iprot.readI32());
					struct.perms = new java.util.ArrayList<java.lang.String>(_list73.size);
					@org.apache.thrift.annotation.Nullable
					java.lang.String _elem74;
					for (int _i75 = 0; _i75 < _list73.size; ++_i75) {
						_elem74 = iprot.readString();
						struct.perms.add(_elem74);
					}
				}
				struct.setPermsIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}