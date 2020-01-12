/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.base;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-01-12")
public class Version implements org.apache.thrift.TBase<Version, Version._Fields>, java.io.Serializable, Cloneable,
		Comparable<Version> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"Version");

	private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"version", org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.protocol.TField NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"number", org.apache.thrift.protocol.TType.I32, (short) 2);

	private static final org.apache.thrift.protocol.TField MODEL_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"model", org.apache.thrift.protocol.TType.STRING, (short) 3);

	private static final org.apache.thrift.protocol.TField COMMIT_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"commit", org.apache.thrift.protocol.TType.STRING, (short) 4);

	private static final org.apache.thrift.protocol.TField TIME_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"time", org.apache.thrift.protocol.TType.STRING, (short) 5);

	private static final org.apache.thrift.protocol.TField COMMENT_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"comment", org.apache.thrift.protocol.TType.STRING, (short) 6);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new VersionStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new VersionTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String version; // required

	public int number; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String model; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String commit; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String time; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String comment; // required

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		VERSION((short) 1, "version"), NUMBER((short) 2, "number"), MODEL((short) 3, "model"), COMMIT((short) 4,
				"commit"), TIME((short) 5, "time"), COMMENT((short) 6, "comment");

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
			case 1: // VERSION
				return VERSION;
			case 2: // NUMBER
				return NUMBER;
			case 3: // MODEL
				return MODEL;
			case 4: // COMMIT
				return COMMIT;
			case 5: // TIME
				return TIME;
			case 6: // COMMENT
				return COMMENT;
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
	private static final int __NUMBER_ISSET_ID = 0;

	private byte __isset_bitfield = 0;

	public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.VERSION,
				new org.apache.thrift.meta_data.FieldMetaData("version",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.NUMBER,
				new org.apache.thrift.meta_data.FieldMetaData("number", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		tmpMap.put(_Fields.MODEL,
				new org.apache.thrift.meta_data.FieldMetaData("model", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.COMMIT,
				new org.apache.thrift.meta_data.FieldMetaData("commit", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.TIME, new org.apache.thrift.meta_data.FieldMetaData("time",
				org.apache.thrift.TFieldRequirementType.DEFAULT,
				new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING, "Time")));
		tmpMap.put(_Fields.COMMENT,
				new org.apache.thrift.meta_data.FieldMetaData("comment",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Version.class, metaDataMap);
	}

	public Version() {
	}

	public Version(java.lang.String version, int number, java.lang.String model, java.lang.String commit,
			java.lang.String time, java.lang.String comment) {
		this();
		this.version = version;
		this.number = number;
		setNumberIsSet(true);
		this.model = model;
		this.commit = commit;
		this.time = time;
		this.comment = comment;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public Version(Version other) {
		__isset_bitfield = other.__isset_bitfield;
		if (other.isSetVersion()) {
			this.version = other.version;
		}
		this.number = other.number;
		if (other.isSetModel()) {
			this.model = other.model;
		}
		if (other.isSetCommit()) {
			this.commit = other.commit;
		}
		if (other.isSetTime()) {
			this.time = other.time;
		}
		if (other.isSetComment()) {
			this.comment = other.comment;
		}
	}

	public Version deepCopy() {
		return new Version(this);
	}

	@Override
	public void clear() {
		this.version = null;
		setNumberIsSet(false);
		this.number = 0;
		this.model = null;
		this.commit = null;
		this.time = null;
		this.comment = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getVersion() {
		return this.version;
	}

	public Version setVersion(@org.apache.thrift.annotation.Nullable java.lang.String version) {
		this.version = version;
		return this;
	}

	public void unsetVersion() {
		this.version = null;
	}

	/**
	 * Returns true if field version is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetVersion() {
		return this.version != null;
	}

	public void setVersionIsSet(boolean value) {
		if (!value) {
			this.version = null;
		}
	}

	public int getNumber() {
		return this.number;
	}

	public Version setNumber(int number) {
		this.number = number;
		setNumberIsSet(true);
		return this;
	}

	public void unsetNumber() {
		__isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NUMBER_ISSET_ID);
	}

	/**
	 * Returns true if field number is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetNumber() {
		return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NUMBER_ISSET_ID);
	}

	public void setNumberIsSet(boolean value) {
		__isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NUMBER_ISSET_ID, value);
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getModel() {
		return this.model;
	}

	public Version setModel(@org.apache.thrift.annotation.Nullable java.lang.String model) {
		this.model = model;
		return this;
	}

	public void unsetModel() {
		this.model = null;
	}

	/**
	 * Returns true if field model is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetModel() {
		return this.model != null;
	}

	public void setModelIsSet(boolean value) {
		if (!value) {
			this.model = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getCommit() {
		return this.commit;
	}

	public Version setCommit(@org.apache.thrift.annotation.Nullable java.lang.String commit) {
		this.commit = commit;
		return this;
	}

	public void unsetCommit() {
		this.commit = null;
	}

	/**
	 * Returns true if field commit is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetCommit() {
		return this.commit != null;
	}

	public void setCommitIsSet(boolean value) {
		if (!value) {
			this.commit = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getTime() {
		return this.time;
	}

	public Version setTime(@org.apache.thrift.annotation.Nullable java.lang.String time) {
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

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getComment() {
		return this.comment;
	}

	public Version setComment(@org.apache.thrift.annotation.Nullable java.lang.String comment) {
		this.comment = comment;
		return this;
	}

	public void unsetComment() {
		this.comment = null;
	}

	/**
	 * Returns true if field comment is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetComment() {
		return this.comment != null;
	}

	public void setCommentIsSet(boolean value) {
		if (!value) {
			this.comment = null;
		}
	}

	public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
		switch (field) {
		case VERSION:
			if (value == null) {
				unsetVersion();
			}
			else {
				setVersion((java.lang.String) value);
			}
			break;

		case NUMBER:
			if (value == null) {
				unsetNumber();
			}
			else {
				setNumber((java.lang.Integer) value);
			}
			break;

		case MODEL:
			if (value == null) {
				unsetModel();
			}
			else {
				setModel((java.lang.String) value);
			}
			break;

		case COMMIT:
			if (value == null) {
				unsetCommit();
			}
			else {
				setCommit((java.lang.String) value);
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

		case COMMENT:
			if (value == null) {
				unsetComment();
			}
			else {
				setComment((java.lang.String) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case VERSION:
			return getVersion();

		case NUMBER:
			return getNumber();

		case MODEL:
			return getModel();

		case COMMIT:
			return getCommit();

		case TIME:
			return getTime();

		case COMMENT:
			return getComment();

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
		case VERSION:
			return isSetVersion();
		case NUMBER:
			return isSetNumber();
		case MODEL:
			return isSetModel();
		case COMMIT:
			return isSetCommit();
		case TIME:
			return isSetTime();
		case COMMENT:
			return isSetComment();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof Version)
			return this.equals((Version) that);
		return false;
	}

	public boolean equals(Version that) {
		if (that == null)
			return false;
		if (this == that)
			return true;

		boolean this_present_version = true && this.isSetVersion();
		boolean that_present_version = true && that.isSetVersion();
		if (this_present_version || that_present_version) {
			if (!(this_present_version && that_present_version))
				return false;
			if (!this.version.equals(that.version))
				return false;
		}

		boolean this_present_number = true;
		boolean that_present_number = true;
		if (this_present_number || that_present_number) {
			if (!(this_present_number && that_present_number))
				return false;
			if (this.number != that.number)
				return false;
		}

		boolean this_present_model = true && this.isSetModel();
		boolean that_present_model = true && that.isSetModel();
		if (this_present_model || that_present_model) {
			if (!(this_present_model && that_present_model))
				return false;
			if (!this.model.equals(that.model))
				return false;
		}

		boolean this_present_commit = true && this.isSetCommit();
		boolean that_present_commit = true && that.isSetCommit();
		if (this_present_commit || that_present_commit) {
			if (!(this_present_commit && that_present_commit))
				return false;
			if (!this.commit.equals(that.commit))
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

		boolean this_present_comment = true && this.isSetComment();
		boolean that_present_comment = true && that.isSetComment();
		if (this_present_comment || that_present_comment) {
			if (!(this_present_comment && that_present_comment))
				return false;
			if (!this.comment.equals(that.comment))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int hashCode = 1;

		hashCode = hashCode * 8191 + ((isSetVersion()) ? 131071 : 524287);
		if (isSetVersion())
			hashCode = hashCode * 8191 + version.hashCode();

		hashCode = hashCode * 8191 + number;

		hashCode = hashCode * 8191 + ((isSetModel()) ? 131071 : 524287);
		if (isSetModel())
			hashCode = hashCode * 8191 + model.hashCode();

		hashCode = hashCode * 8191 + ((isSetCommit()) ? 131071 : 524287);
		if (isSetCommit())
			hashCode = hashCode * 8191 + commit.hashCode();

		hashCode = hashCode * 8191 + ((isSetTime()) ? 131071 : 524287);
		if (isSetTime())
			hashCode = hashCode * 8191 + time.hashCode();

		hashCode = hashCode * 8191 + ((isSetComment()) ? 131071 : 524287);
		if (isSetComment())
			hashCode = hashCode * 8191 + comment.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(Version other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = java.lang.Boolean.valueOf(isSetVersion()).compareTo(other.isSetVersion());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetVersion()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
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
		lastComparison = java.lang.Boolean.valueOf(isSetModel()).compareTo(other.isSetModel());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetModel()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.model, other.model);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetCommit()).compareTo(other.isSetCommit());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetCommit()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.commit, other.commit);
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
		lastComparison = java.lang.Boolean.valueOf(isSetComment()).compareTo(other.isSetComment());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetComment()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.comment, other.comment);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("Version(");
		boolean first = true;

		sb.append("version:");
		if (this.version == null) {
			sb.append("null");
		}
		else {
			sb.append(this.version);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("number:");
		sb.append(this.number);
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("model:");
		if (this.model == null) {
			sb.append("null");
		}
		else {
			sb.append(this.model);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("commit:");
		if (this.commit == null) {
			sb.append("null");
		}
		else {
			sb.append(this.commit);
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
		if (!first)
			sb.append(", ");
		sb.append("comment:");
		if (this.comment == null) {
			sb.append("null");
		}
		else {
			sb.append(this.comment);
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

	private static class VersionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public VersionStandardScheme getScheme() {
			return new VersionStandardScheme();
		}

	}

	private static class VersionStandardScheme extends org.apache.thrift.scheme.StandardScheme<Version> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, Version struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // VERSION
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.version = iprot.readString();
						struct.setVersionIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // NUMBER
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.number = iprot.readI32();
						struct.setNumberIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // MODEL
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.model = iprot.readString();
						struct.setModelIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 4: // COMMIT
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.commit = iprot.readString();
						struct.setCommitIsSet(true);
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
				case 6: // COMMENT
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.comment = iprot.readString();
						struct.setCommentIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, Version struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.version != null) {
				oprot.writeFieldBegin(VERSION_FIELD_DESC);
				oprot.writeString(struct.version);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldBegin(NUMBER_FIELD_DESC);
			oprot.writeI32(struct.number);
			oprot.writeFieldEnd();
			if (struct.model != null) {
				oprot.writeFieldBegin(MODEL_FIELD_DESC);
				oprot.writeString(struct.model);
				oprot.writeFieldEnd();
			}
			if (struct.commit != null) {
				oprot.writeFieldBegin(COMMIT_FIELD_DESC);
				oprot.writeString(struct.commit);
				oprot.writeFieldEnd();
			}
			if (struct.time != null) {
				oprot.writeFieldBegin(TIME_FIELD_DESC);
				oprot.writeString(struct.time);
				oprot.writeFieldEnd();
			}
			if (struct.comment != null) {
				oprot.writeFieldBegin(COMMENT_FIELD_DESC);
				oprot.writeString(struct.comment);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class VersionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public VersionTupleScheme getScheme() {
			return new VersionTupleScheme();
		}

	}

	private static class VersionTupleScheme extends org.apache.thrift.scheme.TupleScheme<Version> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, Version struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetVersion()) {
				optionals.set(0);
			}
			if (struct.isSetNumber()) {
				optionals.set(1);
			}
			if (struct.isSetModel()) {
				optionals.set(2);
			}
			if (struct.isSetCommit()) {
				optionals.set(3);
			}
			if (struct.isSetTime()) {
				optionals.set(4);
			}
			if (struct.isSetComment()) {
				optionals.set(5);
			}
			oprot.writeBitSet(optionals, 6);
			if (struct.isSetVersion()) {
				oprot.writeString(struct.version);
			}
			if (struct.isSetNumber()) {
				oprot.writeI32(struct.number);
			}
			if (struct.isSetModel()) {
				oprot.writeString(struct.model);
			}
			if (struct.isSetCommit()) {
				oprot.writeString(struct.commit);
			}
			if (struct.isSetTime()) {
				oprot.writeString(struct.time);
			}
			if (struct.isSetComment()) {
				oprot.writeString(struct.comment);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, Version struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(6);
			if (incoming.get(0)) {
				struct.version = iprot.readString();
				struct.setVersionIsSet(true);
			}
			if (incoming.get(1)) {
				struct.number = iprot.readI32();
				struct.setNumberIsSet(true);
			}
			if (incoming.get(2)) {
				struct.model = iprot.readString();
				struct.setModelIsSet(true);
			}
			if (incoming.get(3)) {
				struct.commit = iprot.readString();
				struct.setCommitIsSet(true);
			}
			if (incoming.get(4)) {
				struct.time = iprot.readString();
				struct.setTimeIsSet(true);
			}
			if (incoming.get(5)) {
				struct.comment = iprot.readString();
				struct.setCommentIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
