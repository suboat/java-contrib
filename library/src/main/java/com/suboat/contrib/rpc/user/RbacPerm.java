/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.user;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * 权限实例
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-01-12")
public class RbacPerm implements org.apache.thrift.TBase<RbacPerm, RbacPerm._Fields>, java.io.Serializable, Cloneable,
		Comparable<RbacPerm> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"RbacPerm");

	private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key",
			org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.protocol.TField DES_FIELD_DESC = new org.apache.thrift.protocol.TField("des",
			org.apache.thrift.protocol.TType.STRING, (short) 2);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RbacPermStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RbacPermTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String key; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String des; // required

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		KEY((short) 1, "key"), DES((short) 2, "des");

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
			case 1: // KEY
				return KEY;
			case 2: // DES
				return DES;
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
		tmpMap.put(_Fields.KEY,
				new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.DES,
				new org.apache.thrift.meta_data.FieldMetaData("des", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RbacPerm.class, metaDataMap);
	}

	public RbacPerm() {
	}

	public RbacPerm(java.lang.String key, java.lang.String des) {
		this();
		this.key = key;
		this.des = des;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public RbacPerm(RbacPerm other) {
		if (other.isSetKey()) {
			this.key = other.key;
		}
		if (other.isSetDes()) {
			this.des = other.des;
		}
	}

	public RbacPerm deepCopy() {
		return new RbacPerm(this);
	}

	@Override
	public void clear() {
		this.key = null;
		this.des = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getKey() {
		return this.key;
	}

	public RbacPerm setKey(@org.apache.thrift.annotation.Nullable java.lang.String key) {
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
	public java.lang.String getDes() {
		return this.des;
	}

	public RbacPerm setDes(@org.apache.thrift.annotation.Nullable java.lang.String des) {
		this.des = des;
		return this;
	}

	public void unsetDes() {
		this.des = null;
	}

	/**
	 * Returns true if field des is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetDes() {
		return this.des != null;
	}

	public void setDesIsSet(boolean value) {
		if (!value) {
			this.des = null;
		}
	}

	public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
		switch (field) {
		case KEY:
			if (value == null) {
				unsetKey();
			}
			else {
				setKey((java.lang.String) value);
			}
			break;

		case DES:
			if (value == null) {
				unsetDes();
			}
			else {
				setDes((java.lang.String) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case KEY:
			return getKey();

		case DES:
			return getDes();

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
		case KEY:
			return isSetKey();
		case DES:
			return isSetDes();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof RbacPerm)
			return this.equals((RbacPerm) that);
		return false;
	}

	public boolean equals(RbacPerm that) {
		if (that == null)
			return false;
		if (this == that)
			return true;

		boolean this_present_key = true && this.isSetKey();
		boolean that_present_key = true && that.isSetKey();
		if (this_present_key || that_present_key) {
			if (!(this_present_key && that_present_key))
				return false;
			if (!this.key.equals(that.key))
				return false;
		}

		boolean this_present_des = true && this.isSetDes();
		boolean that_present_des = true && that.isSetDes();
		if (this_present_des || that_present_des) {
			if (!(this_present_des && that_present_des))
				return false;
			if (!this.des.equals(that.des))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int hashCode = 1;

		hashCode = hashCode * 8191 + ((isSetKey()) ? 131071 : 524287);
		if (isSetKey())
			hashCode = hashCode * 8191 + key.hashCode();

		hashCode = hashCode * 8191 + ((isSetDes()) ? 131071 : 524287);
		if (isSetDes())
			hashCode = hashCode * 8191 + des.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(RbacPerm other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

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
		lastComparison = java.lang.Boolean.valueOf(isSetDes()).compareTo(other.isSetDes());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetDes()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.des, other.des);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("RbacPerm(");
		boolean first = true;

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
		sb.append("des:");
		if (this.des == null) {
			sb.append("null");
		}
		else {
			sb.append(this.des);
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

	private static class RbacPermStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public RbacPermStandardScheme getScheme() {
			return new RbacPermStandardScheme();
		}

	}

	private static class RbacPermStandardScheme extends org.apache.thrift.scheme.StandardScheme<RbacPerm> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, RbacPerm struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // KEY
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.key = iprot.readString();
						struct.setKeyIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // DES
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.des = iprot.readString();
						struct.setDesIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, RbacPerm struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.key != null) {
				oprot.writeFieldBegin(KEY_FIELD_DESC);
				oprot.writeString(struct.key);
				oprot.writeFieldEnd();
			}
			if (struct.des != null) {
				oprot.writeFieldBegin(DES_FIELD_DESC);
				oprot.writeString(struct.des);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class RbacPermTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public RbacPermTupleScheme getScheme() {
			return new RbacPermTupleScheme();
		}

	}

	private static class RbacPermTupleScheme extends org.apache.thrift.scheme.TupleScheme<RbacPerm> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, RbacPerm struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetKey()) {
				optionals.set(0);
			}
			if (struct.isSetDes()) {
				optionals.set(1);
			}
			oprot.writeBitSet(optionals, 2);
			if (struct.isSetKey()) {
				oprot.writeString(struct.key);
			}
			if (struct.isSetDes()) {
				oprot.writeString(struct.des);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, RbacPerm struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(2);
			if (incoming.get(0)) {
				struct.key = iprot.readString();
				struct.setKeyIsSet(true);
			}
			if (incoming.get(1)) {
				struct.des = iprot.readString();
				struct.setDesIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
