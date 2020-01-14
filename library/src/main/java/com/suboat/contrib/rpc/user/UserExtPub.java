/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.user;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * 用户通用拓展数据
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-01-14")
public class UserExtPub implements org.apache.thrift.TBase<UserExtPub, UserExtPub._Fields>, java.io.Serializable,
		Cloneable, Comparable<UserExtPub> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"UserExtPub");

	private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid",
			org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key",
			org.apache.thrift.protocol.TType.STRING, (short) 2);

	private static final org.apache.thrift.protocol.TField VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("val",
			org.apache.thrift.protocol.TType.STRING, (short) 3);

	private static final org.apache.thrift.protocol.TField JSON_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"json", org.apache.thrift.protocol.TType.STRING, (short) 4);

	private static final org.apache.thrift.protocol.TField TIME_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"time", org.apache.thrift.protocol.TType.STRING, (short) 5);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UserExtPubStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UserExtPubTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String uid; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String key; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String val; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String json; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String time; // required

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		UID((short) 1, "uid"), KEY((short) 2, "key"), VAL((short) 3, "val"), JSON((short) 4, "json"), TIME((short) 5,
				"time");

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
			case 2: // KEY
				return KEY;
			case 3: // VAL
				return VAL;
			case 4: // JSON
				return JSON;
			case 5: // TIME
				return TIME;
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
		tmpMap.put(_Fields.KEY,
				new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.VAL,
				new org.apache.thrift.meta_data.FieldMetaData("val", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.JSON,
				new org.apache.thrift.meta_data.FieldMetaData("json", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.TIME, new org.apache.thrift.meta_data.FieldMetaData("time",
				org.apache.thrift.TFieldRequirementType.DEFAULT,
				new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING, "Time")));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserExtPub.class, metaDataMap);
	}

	public UserExtPub() {
	}

	public UserExtPub(java.lang.String uid, java.lang.String key, java.lang.String val, java.lang.String json,
			java.lang.String time) {
		this();
		this.uid = uid;
		this.key = key;
		this.val = val;
		this.json = json;
		this.time = time;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public UserExtPub(UserExtPub other) {
		if (other.isSetUid()) {
			this.uid = other.uid;
		}
		if (other.isSetKey()) {
			this.key = other.key;
		}
		if (other.isSetVal()) {
			this.val = other.val;
		}
		if (other.isSetJson()) {
			this.json = other.json;
		}
		if (other.isSetTime()) {
			this.time = other.time;
		}
	}

	public UserExtPub deepCopy() {
		return new UserExtPub(this);
	}

	@Override
	public void clear() {
		this.uid = null;
		this.key = null;
		this.val = null;
		this.json = null;
		this.time = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getUid() {
		return this.uid;
	}

	public UserExtPub setUid(@org.apache.thrift.annotation.Nullable java.lang.String uid) {
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
	public java.lang.String getKey() {
		return this.key;
	}

	public UserExtPub setKey(@org.apache.thrift.annotation.Nullable java.lang.String key) {
		this.key = key;
		return this;
	}

	public void unsetKey() {
		this.key = null;
	}

	/**
	 * Returns true if field key is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetKey() {
		return this.key != null;
	}

	public void setKeyIsSet(boolean value) {
		if (!value) {
			this.key = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getVal() {
		return this.val;
	}

	public UserExtPub setVal(@org.apache.thrift.annotation.Nullable java.lang.String val) {
		this.val = val;
		return this;
	}

	public void unsetVal() {
		this.val = null;
	}

	/**
	 * Returns true if field val is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetVal() {
		return this.val != null;
	}

	public void setValIsSet(boolean value) {
		if (!value) {
			this.val = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getJson() {
		return this.json;
	}

	public UserExtPub setJson(@org.apache.thrift.annotation.Nullable java.lang.String json) {
		this.json = json;
		return this;
	}

	public void unsetJson() {
		this.json = null;
	}

	/**
	 * Returns true if field json is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetJson() {
		return this.json != null;
	}

	public void setJsonIsSet(boolean value) {
		if (!value) {
			this.json = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getTime() {
		return this.time;
	}

	public UserExtPub setTime(@org.apache.thrift.annotation.Nullable java.lang.String time) {
		this.time = time;
		return this;
	}

	public void unsetTime() {
		this.time = null;
	}

	/**
	 * Returns true if field time is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetTime() {
		return this.time != null;
	}

	public void setTimeIsSet(boolean value) {
		if (!value) {
			this.time = null;
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

		case KEY:
			if (value == null) {
				unsetKey();
			}
			else {
				setKey((java.lang.String) value);
			}
			break;

		case VAL:
			if (value == null) {
				unsetVal();
			}
			else {
				setVal((java.lang.String) value);
			}
			break;

		case JSON:
			if (value == null) {
				unsetJson();
			}
			else {
				setJson((java.lang.String) value);
			}
			break;

		case TIME:
			if (value == null) {
				unsetTime();
			}
			else {
				setTime((java.lang.String) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case UID:
			return getUid();

		case KEY:
			return getKey();

		case VAL:
			return getVal();

		case JSON:
			return getJson();

		case TIME:
			return getTime();

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
		case KEY:
			return isSetKey();
		case VAL:
			return isSetVal();
		case JSON:
			return isSetJson();
		case TIME:
			return isSetTime();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof UserExtPub)
			return this.equals((UserExtPub) that);
		return false;
	}

	public boolean equals(UserExtPub that) {
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

		boolean this_present_key = true && this.isSetKey();
		boolean that_present_key = true && that.isSetKey();
		if (this_present_key || that_present_key) {
			if (!(this_present_key && that_present_key))
				return false;
			if (!this.key.equals(that.key))
				return false;
		}

		boolean this_present_val = true && this.isSetVal();
		boolean that_present_val = true && that.isSetVal();
		if (this_present_val || that_present_val) {
			if (!(this_present_val && that_present_val))
				return false;
			if (!this.val.equals(that.val))
				return false;
		}

		boolean this_present_json = true && this.isSetJson();
		boolean that_present_json = true && that.isSetJson();
		if (this_present_json || that_present_json) {
			if (!(this_present_json && that_present_json))
				return false;
			if (!this.json.equals(that.json))
				return false;
		}

		boolean this_present_time = true && this.isSetTime();
		boolean that_present_time = true && that.isSetTime();
		if (this_present_time || that_present_time) {
			if (!(this_present_time && that_present_time))
				return false;
			if (!this.time.equals(that.time))
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

		hashCode = hashCode * 8191 + ((isSetKey()) ? 131071 : 524287);
		if (isSetKey())
			hashCode = hashCode * 8191 + key.hashCode();

		hashCode = hashCode * 8191 + ((isSetVal()) ? 131071 : 524287);
		if (isSetVal())
			hashCode = hashCode * 8191 + val.hashCode();

		hashCode = hashCode * 8191 + ((isSetJson()) ? 131071 : 524287);
		if (isSetJson())
			hashCode = hashCode * 8191 + json.hashCode();

		hashCode = hashCode * 8191 + ((isSetTime()) ? 131071 : 524287);
		if (isSetTime())
			hashCode = hashCode * 8191 + time.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(UserExtPub other) {
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
		lastComparison = java.lang.Boolean.valueOf(isSetKey()).compareTo(other.isSetKey());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetKey()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key, other.key);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetVal()).compareTo(other.isSetVal());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetVal()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.val, other.val);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetJson()).compareTo(other.isSetJson());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetJson()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.json, other.json);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetTime()).compareTo(other.isSetTime());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetTime()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.time, other.time);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("UserExtPub(");
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
		sb.append("key:");
		if (this.key == null) {
			sb.append("null");
		}
		else {
			sb.append(this.key);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("val:");
		if (this.val == null) {
			sb.append("null");
		}
		else {
			sb.append(this.val);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("json:");
		if (this.json == null) {
			sb.append("null");
		}
		else {
			sb.append(this.json);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("time:");
		if (this.time == null) {
			sb.append("null");
		}
		else {
			sb.append(this.time);
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

	private static class UserExtPubStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public UserExtPubStandardScheme getScheme() {
			return new UserExtPubStandardScheme();
		}

	}

	private static class UserExtPubStandardScheme extends org.apache.thrift.scheme.StandardScheme<UserExtPub> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, UserExtPub struct)
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
				case 2: // KEY
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.key = iprot.readString();
						struct.setKeyIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // VAL
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.val = iprot.readString();
						struct.setValIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 4: // JSON
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.json = iprot.readString();
						struct.setJsonIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 5: // TIME
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.time = iprot.readString();
						struct.setTimeIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, UserExtPub struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.uid != null) {
				oprot.writeFieldBegin(UID_FIELD_DESC);
				oprot.writeString(struct.uid);
				oprot.writeFieldEnd();
			}
			if (struct.key != null) {
				oprot.writeFieldBegin(KEY_FIELD_DESC);
				oprot.writeString(struct.key);
				oprot.writeFieldEnd();
			}
			if (struct.val != null) {
				oprot.writeFieldBegin(VAL_FIELD_DESC);
				oprot.writeString(struct.val);
				oprot.writeFieldEnd();
			}
			if (struct.json != null) {
				oprot.writeFieldBegin(JSON_FIELD_DESC);
				oprot.writeString(struct.json);
				oprot.writeFieldEnd();
			}
			if (struct.time != null) {
				oprot.writeFieldBegin(TIME_FIELD_DESC);
				oprot.writeString(struct.time);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class UserExtPubTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public UserExtPubTupleScheme getScheme() {
			return new UserExtPubTupleScheme();
		}

	}

	private static class UserExtPubTupleScheme extends org.apache.thrift.scheme.TupleScheme<UserExtPub> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, UserExtPub struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetUid()) {
				optionals.set(0);
			}
			if (struct.isSetKey()) {
				optionals.set(1);
			}
			if (struct.isSetVal()) {
				optionals.set(2);
			}
			if (struct.isSetJson()) {
				optionals.set(3);
			}
			if (struct.isSetTime()) {
				optionals.set(4);
			}
			oprot.writeBitSet(optionals, 5);
			if (struct.isSetUid()) {
				oprot.writeString(struct.uid);
			}
			if (struct.isSetKey()) {
				oprot.writeString(struct.key);
			}
			if (struct.isSetVal()) {
				oprot.writeString(struct.val);
			}
			if (struct.isSetJson()) {
				oprot.writeString(struct.json);
			}
			if (struct.isSetTime()) {
				oprot.writeString(struct.time);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, UserExtPub struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(5);
			if (incoming.get(0)) {
				struct.uid = iprot.readString();
				struct.setUidIsSet(true);
			}
			if (incoming.get(1)) {
				struct.key = iprot.readString();
				struct.setKeyIsSet(true);
			}
			if (incoming.get(2)) {
				struct.val = iprot.readString();
				struct.setValIsSet(true);
			}
			if (incoming.get(3)) {
				struct.json = iprot.readString();
				struct.setJsonIsSet(true);
			}
			if (incoming.get(4)) {
				struct.time = iprot.readString();
				struct.setTimeIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
