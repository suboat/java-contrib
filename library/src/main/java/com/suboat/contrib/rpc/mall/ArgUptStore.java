/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.mall;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-05-11")
public class ArgUptStore implements org.apache.thrift.TBase<ArgUptStore, ArgUptStore._Fields>, java.io.Serializable,
		Cloneable, Comparable<ArgUptStore> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"ArgUptStore");

	private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid",
			org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ArgUptStoreStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ArgUptStoreTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String uid; // optional

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		UID((short) 1, "uid");

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
	private static final _Fields optionals[] = { _Fields.UID };

	public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.UID,
				new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ArgUptStore.class, metaDataMap);
	}

	public ArgUptStore() {
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public ArgUptStore(ArgUptStore other) {
		if (other.isSetUid()) {
			this.uid = other.uid;
		}
	}

	public ArgUptStore deepCopy() {
		return new ArgUptStore(this);
	}

	@Override
	public void clear() {
		this.uid = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getUid() {
		return this.uid;
	}

	public ArgUptStore setUid(@org.apache.thrift.annotation.Nullable java.lang.String uid) {
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

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case UID:
			return getUid();

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
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof ArgUptStore)
			return this.equals((ArgUptStore) that);
		return false;
	}

	public boolean equals(ArgUptStore that) {
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

		return true;
	}

	@Override
	public int hashCode() {
		int hashCode = 1;

		hashCode = hashCode * 8191 + ((isSetUid()) ? 131071 : 524287);
		if (isSetUid())
			hashCode = hashCode * 8191 + uid.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(ArgUptStore other) {
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("ArgUptStore(");
		boolean first = true;

		if (isSetUid()) {
			sb.append("uid:");
			if (this.uid == null) {
				sb.append("null");
			}
			else {
				sb.append(this.uid);
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

	private static class ArgUptStoreStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ArgUptStoreStandardScheme getScheme() {
			return new ArgUptStoreStandardScheme();
		}

	}

	private static class ArgUptStoreStandardScheme extends org.apache.thrift.scheme.StandardScheme<ArgUptStore> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, ArgUptStore struct)
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, ArgUptStore struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.uid != null) {
				if (struct.isSetUid()) {
					oprot.writeFieldBegin(UID_FIELD_DESC);
					oprot.writeString(struct.uid);
					oprot.writeFieldEnd();
				}
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class ArgUptStoreTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ArgUptStoreTupleScheme getScheme() {
			return new ArgUptStoreTupleScheme();
		}

	}

	private static class ArgUptStoreTupleScheme extends org.apache.thrift.scheme.TupleScheme<ArgUptStore> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, ArgUptStore struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetUid()) {
				optionals.set(0);
			}
			oprot.writeBitSet(optionals, 1);
			if (struct.isSetUid()) {
				oprot.writeString(struct.uid);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, ArgUptStore struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(1);
			if (incoming.get(0)) {
				struct.uid = iprot.readString();
				struct.setUidIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
