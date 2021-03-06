/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.user;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * Rbac描述单元的备注
 */
public class RbacComment implements org.apache.thrift.TBase<RbacComment, RbacComment._Fields>, java.io.Serializable,
		Cloneable, Comparable<RbacComment> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"RbacComment");

	private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"name", org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.protocol.TField DESC_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"desc", org.apache.thrift.protocol.TType.STRING, (short) 2);

	private static final org.apache.thrift.protocol.TField LABEL_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"label", org.apache.thrift.protocol.TType.STRING, (short) 3);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RbacCommentStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RbacCommentTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String name; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String desc; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String label; // required

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		NAME((short) 1, "name"), DESC((short) 2, "desc"), LABEL((short) 3, "label");

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
			case 1: // NAME
				return NAME;
			case 2: // DESC
				return DESC;
			case 3: // LABEL
				return LABEL;
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
		tmpMap.put(_Fields.NAME,
				new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.DESC,
				new org.apache.thrift.meta_data.FieldMetaData("desc", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.LABEL,
				new org.apache.thrift.meta_data.FieldMetaData("label", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RbacComment.class, metaDataMap);
	}

	public RbacComment() {
	}

	public RbacComment(java.lang.String name, java.lang.String desc, java.lang.String label) {
		this();
		this.name = name;
		this.desc = desc;
		this.label = label;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public RbacComment(RbacComment other) {
		if (other.isSetName()) {
			this.name = other.name;
		}
		if (other.isSetDesc()) {
			this.desc = other.desc;
		}
		if (other.isSetLabel()) {
			this.label = other.label;
		}
	}

	public RbacComment deepCopy() {
		return new RbacComment(this);
	}

	@Override
	public void clear() {
		this.name = null;
		this.desc = null;
		this.label = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getName() {
		return this.name;
	}

	public RbacComment setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
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
	public java.lang.String getDesc() {
		return this.desc;
	}

	public RbacComment setDesc(@org.apache.thrift.annotation.Nullable java.lang.String desc) {
		this.desc = desc;
		return this;
	}

	public void unsetDesc() {
		this.desc = null;
	}

	/**
	 * Returns true if field desc is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetDesc() {
		return this.desc != null;
	}

	public void setDescIsSet(boolean value) {
		if (!value) {
			this.desc = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getLabel() {
		return this.label;
	}

	public RbacComment setLabel(@org.apache.thrift.annotation.Nullable java.lang.String label) {
		this.label = label;
		return this;
	}

	public void unsetLabel() {
		this.label = null;
	}

	/**
	 * Returns true if field label is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetLabel() {
		return this.label != null;
	}

	public void setLabelIsSet(boolean value) {
		if (!value) {
			this.label = null;
		}
	}

	public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
		switch (field) {
		case NAME:
			if (value == null) {
				unsetName();
			}
			else {
				setName((java.lang.String) value);
			}
			break;

		case DESC:
			if (value == null) {
				unsetDesc();
			}
			else {
				setDesc((java.lang.String) value);
			}
			break;

		case LABEL:
			if (value == null) {
				unsetLabel();
			}
			else {
				setLabel((java.lang.String) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case NAME:
			return getName();

		case DESC:
			return getDesc();

		case LABEL:
			return getLabel();

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
		case NAME:
			return isSetName();
		case DESC:
			return isSetDesc();
		case LABEL:
			return isSetLabel();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof RbacComment)
			return this.equals((RbacComment) that);
		return false;
	}

	public boolean equals(RbacComment that) {
		if (that == null)
			return false;
		if (this == that)
			return true;

		boolean this_present_name = true && this.isSetName();
		boolean that_present_name = true && that.isSetName();
		if (this_present_name || that_present_name) {
			if (!(this_present_name && that_present_name))
				return false;
			if (!this.name.equals(that.name))
				return false;
		}

		boolean this_present_desc = true && this.isSetDesc();
		boolean that_present_desc = true && that.isSetDesc();
		if (this_present_desc || that_present_desc) {
			if (!(this_present_desc && that_present_desc))
				return false;
			if (!this.desc.equals(that.desc))
				return false;
		}

		boolean this_present_label = true && this.isSetLabel();
		boolean that_present_label = true && that.isSetLabel();
		if (this_present_label || that_present_label) {
			if (!(this_present_label && that_present_label))
				return false;
			if (!this.label.equals(that.label))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int hashCode = 1;

		hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
		if (isSetName())
			hashCode = hashCode * 8191 + name.hashCode();

		hashCode = hashCode * 8191 + ((isSetDesc()) ? 131071 : 524287);
		if (isSetDesc())
			hashCode = hashCode * 8191 + desc.hashCode();

		hashCode = hashCode * 8191 + ((isSetLabel()) ? 131071 : 524287);
		if (isSetLabel())
			hashCode = hashCode * 8191 + label.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(RbacComment other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

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
		lastComparison = java.lang.Boolean.valueOf(isSetDesc()).compareTo(other.isSetDesc());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetDesc()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.desc, other.desc);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetLabel()).compareTo(other.isSetLabel());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetLabel()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.label, other.label);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("RbacComment(");
		boolean first = true;

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
		sb.append("desc:");
		if (this.desc == null) {
			sb.append("null");
		}
		else {
			sb.append(this.desc);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("label:");
		if (this.label == null) {
			sb.append("null");
		}
		else {
			sb.append(this.label);
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

	private static class RbacCommentStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public RbacCommentStandardScheme getScheme() {
			return new RbacCommentStandardScheme();
		}

	}

	private static class RbacCommentStandardScheme extends org.apache.thrift.scheme.StandardScheme<RbacComment> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, RbacComment struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // NAME
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.name = iprot.readString();
						struct.setNameIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // DESC
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.desc = iprot.readString();
						struct.setDescIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // LABEL
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.label = iprot.readString();
						struct.setLabelIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, RbacComment struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.name != null) {
				oprot.writeFieldBegin(NAME_FIELD_DESC);
				oprot.writeString(struct.name);
				oprot.writeFieldEnd();
			}
			if (struct.desc != null) {
				oprot.writeFieldBegin(DESC_FIELD_DESC);
				oprot.writeString(struct.desc);
				oprot.writeFieldEnd();
			}
			if (struct.label != null) {
				oprot.writeFieldBegin(LABEL_FIELD_DESC);
				oprot.writeString(struct.label);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class RbacCommentTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public RbacCommentTupleScheme getScheme() {
			return new RbacCommentTupleScheme();
		}

	}

	private static class RbacCommentTupleScheme extends org.apache.thrift.scheme.TupleScheme<RbacComment> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, RbacComment struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetName()) {
				optionals.set(0);
			}
			if (struct.isSetDesc()) {
				optionals.set(1);
			}
			if (struct.isSetLabel()) {
				optionals.set(2);
			}
			oprot.writeBitSet(optionals, 3);
			if (struct.isSetName()) {
				oprot.writeString(struct.name);
			}
			if (struct.isSetDesc()) {
				oprot.writeString(struct.desc);
			}
			if (struct.isSetLabel()) {
				oprot.writeString(struct.label);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, RbacComment struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(3);
			if (incoming.get(0)) {
				struct.name = iprot.readString();
				struct.setNameIsSet(true);
			}
			if (incoming.get(1)) {
				struct.desc = iprot.readString();
				struct.setDescIsSet(true);
			}
			if (incoming.get(2)) {
				struct.label = iprot.readString();
				struct.setLabelIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
