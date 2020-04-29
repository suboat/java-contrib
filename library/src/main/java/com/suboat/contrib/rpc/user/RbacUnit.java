/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.user;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * Rbac描述单元
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-04-23")
public class RbacUnit implements org.apache.thrift.TBase<RbacUnit, RbacUnit._Fields>, java.io.Serializable, Cloneable,
		Comparable<RbacUnit> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"RbacUnit");

	private static final org.apache.thrift.protocol.TField CATE_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"cate", org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key",
			org.apache.thrift.protocol.TType.STRING, (short) 2);

	private static final org.apache.thrift.protocol.TField VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("val",
			org.apache.thrift.protocol.TType.STRING, (short) 3);

	private static final org.apache.thrift.protocol.TField COMMENT_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"comment", org.apache.thrift.protocol.TType.STRUCT, (short) 4);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RbacUnitStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RbacUnitTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String cate; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String key; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String val; // required

	public @org.apache.thrift.annotation.Nullable RbacComment comment; // optional

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		CATE((short) 1, "cate"), KEY((short) 2, "key"), VAL((short) 3, "val"), COMMENT((short) 4, "comment");

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
			case 1: // CATE
				return CATE;
			case 2: // KEY
				return KEY;
			case 3: // VAL
				return VAL;
			case 4: // COMMENT
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
	private static final _Fields optionals[] = { _Fields.COMMENT };

	public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.CATE,
				new org.apache.thrift.meta_data.FieldMetaData("cate", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.KEY,
				new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.VAL,
				new org.apache.thrift.meta_data.FieldMetaData("val", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.COMMENT,
				new org.apache.thrift.meta_data.FieldMetaData("comment",
						org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT,
								"RbacComment")));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RbacUnit.class, metaDataMap);
	}

	public RbacUnit() {
	}

	public RbacUnit(java.lang.String cate, java.lang.String key, java.lang.String val) {
		this();
		this.cate = cate;
		this.key = key;
		this.val = val;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public RbacUnit(RbacUnit other) {
		if (other.isSetCate()) {
			this.cate = other.cate;
		}
		if (other.isSetKey()) {
			this.key = other.key;
		}
		if (other.isSetVal()) {
			this.val = other.val;
		}
		if (other.isSetComment()) {
			this.comment = new RbacComment(other.comment);
		}
	}

	public RbacUnit deepCopy() {
		return new RbacUnit(this);
	}

	@Override
	public void clear() {
		this.cate = null;
		this.key = null;
		this.val = null;
		this.comment = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getCate() {
		return this.cate;
	}

	public RbacUnit setCate(@org.apache.thrift.annotation.Nullable java.lang.String cate) {
		this.cate = cate;
		return this;
	}

	public void unsetCate() {
		this.cate = null;
	}

	/**
	 * Returns true if field cate is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetCate() {
		return this.cate != null;
	}

	public void setCateIsSet(boolean value) {
		if (!value) {
			this.cate = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getKey() {
		return this.key;
	}

	public RbacUnit setKey(@org.apache.thrift.annotation.Nullable java.lang.String key) {
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

	public RbacUnit setVal(@org.apache.thrift.annotation.Nullable java.lang.String val) {
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
	public RbacComment getComment() {
		return this.comment;
	}

	public RbacUnit setComment(@org.apache.thrift.annotation.Nullable RbacComment comment) {
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
		case CATE:
			if (value == null) {
				unsetCate();
			}
			else {
				setCate((java.lang.String) value);
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

		case COMMENT:
			if (value == null) {
				unsetComment();
			}
			else {
				setComment((RbacComment) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case CATE:
			return getCate();

		case KEY:
			return getKey();

		case VAL:
			return getVal();

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
		case CATE:
			return isSetCate();
		case KEY:
			return isSetKey();
		case VAL:
			return isSetVal();
		case COMMENT:
			return isSetComment();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof RbacUnit)
			return this.equals((RbacUnit) that);
		return false;
	}

	public boolean equals(RbacUnit that) {
		if (that == null)
			return false;
		if (this == that)
			return true;

		boolean this_present_cate = true && this.isSetCate();
		boolean that_present_cate = true && that.isSetCate();
		if (this_present_cate || that_present_cate) {
			if (!(this_present_cate && that_present_cate))
				return false;
			if (!this.cate.equals(that.cate))
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

		hashCode = hashCode * 8191 + ((isSetCate()) ? 131071 : 524287);
		if (isSetCate())
			hashCode = hashCode * 8191 + cate.hashCode();

		hashCode = hashCode * 8191 + ((isSetKey()) ? 131071 : 524287);
		if (isSetKey())
			hashCode = hashCode * 8191 + key.hashCode();

		hashCode = hashCode * 8191 + ((isSetVal()) ? 131071 : 524287);
		if (isSetVal())
			hashCode = hashCode * 8191 + val.hashCode();

		hashCode = hashCode * 8191 + ((isSetComment()) ? 131071 : 524287);
		if (isSetComment())
			hashCode = hashCode * 8191 + comment.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(RbacUnit other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = java.lang.Boolean.valueOf(isSetCate()).compareTo(other.isSetCate());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetCate()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cate, other.cate);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("RbacUnit(");
		boolean first = true;

		sb.append("cate:");
		if (this.cate == null) {
			sb.append("null");
		}
		else {
			sb.append(this.cate);
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
		if (isSetComment()) {
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

	private static class RbacUnitStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public RbacUnitStandardScheme getScheme() {
			return new RbacUnitStandardScheme();
		}

	}

	private static class RbacUnitStandardScheme extends org.apache.thrift.scheme.StandardScheme<RbacUnit> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, RbacUnit struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // CATE
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.cate = iprot.readString();
						struct.setCateIsSet(true);
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
				case 4: // COMMENT
					if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
						struct.comment = new RbacComment();
						struct.comment.read(iprot);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, RbacUnit struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.cate != null) {
				oprot.writeFieldBegin(CATE_FIELD_DESC);
				oprot.writeString(struct.cate);
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
			if (struct.comment != null) {
				if (struct.isSetComment()) {
					oprot.writeFieldBegin(COMMENT_FIELD_DESC);
					struct.comment.write(oprot);
					oprot.writeFieldEnd();
				}
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class RbacUnitTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public RbacUnitTupleScheme getScheme() {
			return new RbacUnitTupleScheme();
		}

	}

	private static class RbacUnitTupleScheme extends org.apache.thrift.scheme.TupleScheme<RbacUnit> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, RbacUnit struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetCate()) {
				optionals.set(0);
			}
			if (struct.isSetKey()) {
				optionals.set(1);
			}
			if (struct.isSetVal()) {
				optionals.set(2);
			}
			if (struct.isSetComment()) {
				optionals.set(3);
			}
			oprot.writeBitSet(optionals, 4);
			if (struct.isSetCate()) {
				oprot.writeString(struct.cate);
			}
			if (struct.isSetKey()) {
				oprot.writeString(struct.key);
			}
			if (struct.isSetVal()) {
				oprot.writeString(struct.val);
			}
			if (struct.isSetComment()) {
				struct.comment.write(oprot);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, RbacUnit struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(4);
			if (incoming.get(0)) {
				struct.cate = iprot.readString();
				struct.setCateIsSet(true);
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
				struct.comment = new RbacComment();
				struct.comment.read(iprot);
				struct.setCommentIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}