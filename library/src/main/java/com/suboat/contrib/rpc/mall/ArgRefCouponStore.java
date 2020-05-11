/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.mall;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
public class ArgRefCouponStore implements org.apache.thrift.TBase<ArgRefCouponStore, ArgRefCouponStore._Fields>,
		java.io.Serializable, Cloneable, Comparable<ArgRefCouponStore> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"ArgRefCouponStore");

	private static final org.apache.thrift.protocol.TField CID_FIELD_DESC = new org.apache.thrift.protocol.TField("cid",
			org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ArgRefCouponStoreStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ArgRefCouponStoreTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String cid; // optional

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		CID((short) 1, "cid");

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
			case 1: // CID
				return CID;
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
	private static final _Fields optionals[] = { _Fields.CID };

	public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.CID,
				new org.apache.thrift.meta_data.FieldMetaData("cid", org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ArgRefCouponStore.class, metaDataMap);
	}

	public ArgRefCouponStore() {
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public ArgRefCouponStore(ArgRefCouponStore other) {
		if (other.isSetCid()) {
			this.cid = other.cid;
		}
	}

	public ArgRefCouponStore deepCopy() {
		return new ArgRefCouponStore(this);
	}

	@Override
	public void clear() {
		this.cid = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getCid() {
		return this.cid;
	}

	public ArgRefCouponStore setCid(@org.apache.thrift.annotation.Nullable java.lang.String cid) {
		this.cid = cid;
		return this;
	}

	public void unsetCid() {
		this.cid = null;
	}

	/**
	 * Returns true if field cid is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetCid() {
		return this.cid != null;
	}

	public void setCidIsSet(boolean value) {
		if (!value) {
			this.cid = null;
		}
	}

	public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
		switch (field) {
		case CID:
			if (value == null) {
				unsetCid();
			}
			else {
				setCid((java.lang.String) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case CID:
			return getCid();

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
		case CID:
			return isSetCid();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof ArgRefCouponStore)
			return this.equals((ArgRefCouponStore) that);
		return false;
	}

	public boolean equals(ArgRefCouponStore that) {
		if (that == null)
			return false;
		if (this == that)
			return true;

		boolean this_present_cid = true && this.isSetCid();
		boolean that_present_cid = true && that.isSetCid();
		if (this_present_cid || that_present_cid) {
			if (!(this_present_cid && that_present_cid))
				return false;
			if (!this.cid.equals(that.cid))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int hashCode = 1;

		hashCode = hashCode * 8191 + ((isSetCid()) ? 131071 : 524287);
		if (isSetCid())
			hashCode = hashCode * 8191 + cid.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(ArgRefCouponStore other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = java.lang.Boolean.valueOf(isSetCid()).compareTo(other.isSetCid());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetCid()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cid, other.cid);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("ArgRefCouponStore(");
		boolean first = true;

		if (isSetCid()) {
			sb.append("cid:");
			if (this.cid == null) {
				sb.append("null");
			}
			else {
				sb.append(this.cid);
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

	private static class ArgRefCouponStoreStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ArgRefCouponStoreStandardScheme getScheme() {
			return new ArgRefCouponStoreStandardScheme();
		}

	}

	private static class ArgRefCouponStoreStandardScheme
			extends org.apache.thrift.scheme.StandardScheme<ArgRefCouponStore> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, ArgRefCouponStore struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // CID
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.cid = iprot.readString();
						struct.setCidIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, ArgRefCouponStore struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.cid != null) {
				if (struct.isSetCid()) {
					oprot.writeFieldBegin(CID_FIELD_DESC);
					oprot.writeString(struct.cid);
					oprot.writeFieldEnd();
				}
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class ArgRefCouponStoreTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ArgRefCouponStoreTupleScheme getScheme() {
			return new ArgRefCouponStoreTupleScheme();
		}

	}

	private static class ArgRefCouponStoreTupleScheme extends org.apache.thrift.scheme.TupleScheme<ArgRefCouponStore> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, ArgRefCouponStore struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetCid()) {
				optionals.set(0);
			}
			oprot.writeBitSet(optionals, 1);
			if (struct.isSetCid()) {
				oprot.writeString(struct.cid);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, ArgRefCouponStore struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(1);
			if (incoming.get(0)) {
				struct.cid = iprot.readString();
				struct.setCidIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
