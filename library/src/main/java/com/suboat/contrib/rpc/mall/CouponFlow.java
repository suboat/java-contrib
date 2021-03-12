/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.mall;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
public class CouponFlow implements org.apache.thrift.TBase<CouponFlow, CouponFlow._Fields>, java.io.Serializable,
		Cloneable, Comparable<CouponFlow> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"CouponFlow");

	private static final org.apache.thrift.protocol.TField FID_FIELD_DESC = new org.apache.thrift.protocol.TField("fid",
			org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.protocol.TField ACC_FIELD_DESC = new org.apache.thrift.protocol.TField("acc",
			org.apache.thrift.protocol.TType.STRING, (short) 2);

	private static final org.apache.thrift.protocol.TField USE_FLOAT_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"useFloat", org.apache.thrift.protocol.TType.DOUBLE, (short) 3);

	private static final org.apache.thrift.protocol.TField USE_INT_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"useInt", org.apache.thrift.protocol.TType.I32, (short) 4);

	private static final org.apache.thrift.protocol.TField COMMENT_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"comment", org.apache.thrift.protocol.TType.STRING, (short) 5);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CouponFlowStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CouponFlowTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String fid; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String acc; // required

	public double useFloat; // optional

	public int useInt; // optional

	public @org.apache.thrift.annotation.Nullable java.lang.String comment; // optional

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		FID((short) 1, "fid"), ACC((short) 2, "acc"), USE_FLOAT((short) 3, "useFloat"), USE_INT((short) 4,
				"useInt"), COMMENT((short) 5, "comment");

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
			case 1: // FID
				return FID;
			case 2: // ACC
				return ACC;
			case 3: // USE_FLOAT
				return USE_FLOAT;
			case 4: // USE_INT
				return USE_INT;
			case 5: // COMMENT
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
	private static final int __USEFLOAT_ISSET_ID = 0;

	private static final int __USEINT_ISSET_ID = 1;

	private byte __isset_bitfield = 0;

	private static final _Fields optionals[] = { _Fields.USE_FLOAT, _Fields.USE_INT, _Fields.COMMENT };

	public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.FID,
				new org.apache.thrift.meta_data.FieldMetaData("fid", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.ACC,
				new org.apache.thrift.meta_data.FieldMetaData("acc", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.USE_FLOAT,
				new org.apache.thrift.meta_data.FieldMetaData("useFloat",
						org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
		tmpMap.put(_Fields.USE_INT,
				new org.apache.thrift.meta_data.FieldMetaData("useInt",
						org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		tmpMap.put(_Fields.COMMENT,
				new org.apache.thrift.meta_data.FieldMetaData("comment",
						org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CouponFlow.class, metaDataMap);
	}

	public CouponFlow() {
	}

	public CouponFlow(java.lang.String fid, java.lang.String acc) {
		this();
		this.fid = fid;
		this.acc = acc;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public CouponFlow(CouponFlow other) {
		__isset_bitfield = other.__isset_bitfield;
		if (other.isSetFid()) {
			this.fid = other.fid;
		}
		if (other.isSetAcc()) {
			this.acc = other.acc;
		}
		this.useFloat = other.useFloat;
		this.useInt = other.useInt;
		if (other.isSetComment()) {
			this.comment = other.comment;
		}
	}

	public CouponFlow deepCopy() {
		return new CouponFlow(this);
	}

	@Override
	public void clear() {
		this.fid = null;
		this.acc = null;
		setUseFloatIsSet(false);
		this.useFloat = 0.0;
		setUseIntIsSet(false);
		this.useInt = 0;
		this.comment = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getFid() {
		return this.fid;
	}

	public CouponFlow setFid(@org.apache.thrift.annotation.Nullable java.lang.String fid) {
		this.fid = fid;
		return this;
	}

	public void unsetFid() {
		this.fid = null;
	}

	/**
	 * Returns true if field fid is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetFid() {
		return this.fid != null;
	}

	public void setFidIsSet(boolean value) {
		if (!value) {
			this.fid = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getAcc() {
		return this.acc;
	}

	public CouponFlow setAcc(@org.apache.thrift.annotation.Nullable java.lang.String acc) {
		this.acc = acc;
		return this;
	}

	public void unsetAcc() {
		this.acc = null;
	}

	/**
	 * Returns true if field acc is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetAcc() {
		return this.acc != null;
	}

	public void setAccIsSet(boolean value) {
		if (!value) {
			this.acc = null;
		}
	}

	public double getUseFloat() {
		return this.useFloat;
	}

	public CouponFlow setUseFloat(double useFloat) {
		this.useFloat = useFloat;
		setUseFloatIsSet(true);
		return this;
	}

	public void unsetUseFloat() {
		__isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USEFLOAT_ISSET_ID);
	}

	/**
	 * Returns true if field useFloat is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetUseFloat() {
		return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USEFLOAT_ISSET_ID);
	}

	public void setUseFloatIsSet(boolean value) {
		__isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USEFLOAT_ISSET_ID, value);
	}

	public int getUseInt() {
		return this.useInt;
	}

	public CouponFlow setUseInt(int useInt) {
		this.useInt = useInt;
		setUseIntIsSet(true);
		return this;
	}

	public void unsetUseInt() {
		__isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USEINT_ISSET_ID);
	}

	/**
	 * Returns true if field useInt is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetUseInt() {
		return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USEINT_ISSET_ID);
	}

	public void setUseIntIsSet(boolean value) {
		__isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USEINT_ISSET_ID, value);
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getComment() {
		return this.comment;
	}

	public CouponFlow setComment(@org.apache.thrift.annotation.Nullable java.lang.String comment) {
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
		case FID:
			if (value == null) {
				unsetFid();
			}
			else {
				setFid((java.lang.String) value);
			}
			break;

		case ACC:
			if (value == null) {
				unsetAcc();
			}
			else {
				setAcc((java.lang.String) value);
			}
			break;

		case USE_FLOAT:
			if (value == null) {
				unsetUseFloat();
			}
			else {
				setUseFloat((java.lang.Double) value);
			}
			break;

		case USE_INT:
			if (value == null) {
				unsetUseInt();
			}
			else {
				setUseInt((java.lang.Integer) value);
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
		case FID:
			return getFid();

		case ACC:
			return getAcc();

		case USE_FLOAT:
			return getUseFloat();

		case USE_INT:
			return getUseInt();

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
		case FID:
			return isSetFid();
		case ACC:
			return isSetAcc();
		case USE_FLOAT:
			return isSetUseFloat();
		case USE_INT:
			return isSetUseInt();
		case COMMENT:
			return isSetComment();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof CouponFlow)
			return this.equals((CouponFlow) that);
		return false;
	}

	public boolean equals(CouponFlow that) {
		if (that == null)
			return false;
		if (this == that)
			return true;

		boolean this_present_fid = true && this.isSetFid();
		boolean that_present_fid = true && that.isSetFid();
		if (this_present_fid || that_present_fid) {
			if (!(this_present_fid && that_present_fid))
				return false;
			if (!this.fid.equals(that.fid))
				return false;
		}

		boolean this_present_acc = true && this.isSetAcc();
		boolean that_present_acc = true && that.isSetAcc();
		if (this_present_acc || that_present_acc) {
			if (!(this_present_acc && that_present_acc))
				return false;
			if (!this.acc.equals(that.acc))
				return false;
		}

		boolean this_present_useFloat = true && this.isSetUseFloat();
		boolean that_present_useFloat = true && that.isSetUseFloat();
		if (this_present_useFloat || that_present_useFloat) {
			if (!(this_present_useFloat && that_present_useFloat))
				return false;
			if (this.useFloat != that.useFloat)
				return false;
		}

		boolean this_present_useInt = true && this.isSetUseInt();
		boolean that_present_useInt = true && that.isSetUseInt();
		if (this_present_useInt || that_present_useInt) {
			if (!(this_present_useInt && that_present_useInt))
				return false;
			if (this.useInt != that.useInt)
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

		hashCode = hashCode * 8191 + ((isSetFid()) ? 131071 : 524287);
		if (isSetFid())
			hashCode = hashCode * 8191 + fid.hashCode();

		hashCode = hashCode * 8191 + ((isSetAcc()) ? 131071 : 524287);
		if (isSetAcc())
			hashCode = hashCode * 8191 + acc.hashCode();

		hashCode = hashCode * 8191 + ((isSetUseFloat()) ? 131071 : 524287);
		if (isSetUseFloat())
			hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(useFloat);

		hashCode = hashCode * 8191 + ((isSetUseInt()) ? 131071 : 524287);
		if (isSetUseInt())
			hashCode = hashCode * 8191 + useInt;

		hashCode = hashCode * 8191 + ((isSetComment()) ? 131071 : 524287);
		if (isSetComment())
			hashCode = hashCode * 8191 + comment.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(CouponFlow other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = java.lang.Boolean.valueOf(isSetFid()).compareTo(other.isSetFid());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetFid()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fid, other.fid);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetAcc()).compareTo(other.isSetAcc());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetAcc()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.acc, other.acc);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetUseFloat()).compareTo(other.isSetUseFloat());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetUseFloat()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.useFloat, other.useFloat);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetUseInt()).compareTo(other.isSetUseInt());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetUseInt()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.useInt, other.useInt);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("CouponFlow(");
		boolean first = true;

		sb.append("fid:");
		if (this.fid == null) {
			sb.append("null");
		}
		else {
			sb.append(this.fid);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("acc:");
		if (this.acc == null) {
			sb.append("null");
		}
		else {
			sb.append(this.acc);
		}
		first = false;
		if (isSetUseFloat()) {
			if (!first)
				sb.append(", ");
			sb.append("useFloat:");
			sb.append(this.useFloat);
			first = false;
		}
		if (isSetUseInt()) {
			if (!first)
				sb.append(", ");
			sb.append("useInt:");
			sb.append(this.useInt);
			first = false;
		}
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

	private static class CouponFlowStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public CouponFlowStandardScheme getScheme() {
			return new CouponFlowStandardScheme();
		}

	}

	private static class CouponFlowStandardScheme extends org.apache.thrift.scheme.StandardScheme<CouponFlow> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, CouponFlow struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // FID
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.fid = iprot.readString();
						struct.setFidIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // ACC
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.acc = iprot.readString();
						struct.setAccIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // USE_FLOAT
					if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
						struct.useFloat = iprot.readDouble();
						struct.setUseFloatIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 4: // USE_INT
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.useInt = iprot.readI32();
						struct.setUseIntIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 5: // COMMENT
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, CouponFlow struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.fid != null) {
				oprot.writeFieldBegin(FID_FIELD_DESC);
				oprot.writeString(struct.fid);
				oprot.writeFieldEnd();
			}
			if (struct.acc != null) {
				oprot.writeFieldBegin(ACC_FIELD_DESC);
				oprot.writeString(struct.acc);
				oprot.writeFieldEnd();
			}
			if (struct.isSetUseFloat()) {
				oprot.writeFieldBegin(USE_FLOAT_FIELD_DESC);
				oprot.writeDouble(struct.useFloat);
				oprot.writeFieldEnd();
			}
			if (struct.isSetUseInt()) {
				oprot.writeFieldBegin(USE_INT_FIELD_DESC);
				oprot.writeI32(struct.useInt);
				oprot.writeFieldEnd();
			}
			if (struct.comment != null) {
				if (struct.isSetComment()) {
					oprot.writeFieldBegin(COMMENT_FIELD_DESC);
					oprot.writeString(struct.comment);
					oprot.writeFieldEnd();
				}
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class CouponFlowTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public CouponFlowTupleScheme getScheme() {
			return new CouponFlowTupleScheme();
		}

	}

	private static class CouponFlowTupleScheme extends org.apache.thrift.scheme.TupleScheme<CouponFlow> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, CouponFlow struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetFid()) {
				optionals.set(0);
			}
			if (struct.isSetAcc()) {
				optionals.set(1);
			}
			if (struct.isSetUseFloat()) {
				optionals.set(2);
			}
			if (struct.isSetUseInt()) {
				optionals.set(3);
			}
			if (struct.isSetComment()) {
				optionals.set(4);
			}
			oprot.writeBitSet(optionals, 5);
			if (struct.isSetFid()) {
				oprot.writeString(struct.fid);
			}
			if (struct.isSetAcc()) {
				oprot.writeString(struct.acc);
			}
			if (struct.isSetUseFloat()) {
				oprot.writeDouble(struct.useFloat);
			}
			if (struct.isSetUseInt()) {
				oprot.writeI32(struct.useInt);
			}
			if (struct.isSetComment()) {
				oprot.writeString(struct.comment);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, CouponFlow struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(5);
			if (incoming.get(0)) {
				struct.fid = iprot.readString();
				struct.setFidIsSet(true);
			}
			if (incoming.get(1)) {
				struct.acc = iprot.readString();
				struct.setAccIsSet(true);
			}
			if (incoming.get(2)) {
				struct.useFloat = iprot.readDouble();
				struct.setUseFloatIsSet(true);
			}
			if (incoming.get(3)) {
				struct.useInt = iprot.readI32();
				struct.setUseIntIsSet(true);
			}
			if (incoming.get(4)) {
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