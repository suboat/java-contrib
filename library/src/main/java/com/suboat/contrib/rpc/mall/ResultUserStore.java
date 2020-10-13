/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.mall;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
public class ResultUserStore implements org.apache.thrift.TBase<ResultUserStore, ResultUserStore._Fields>,
		java.io.Serializable, Cloneable, Comparable<ResultUserStore> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"ResultUserStore");

	private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"data", org.apache.thrift.protocol.TType.LIST, (short) 1);

	private static final org.apache.thrift.protocol.TField META_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"meta", org.apache.thrift.protocol.TType.STRUCT, (short) 2);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ResultUserStoreStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ResultUserStoreTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.util.List<UserStore> data; // required

	public @org.apache.thrift.annotation.Nullable com.suboat.contrib.rpc.base.QueryMeta meta; // required

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		DATA((short) 1, "data"), META((short) 2, "meta");

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
			case 1: // DATA
				return DATA;
			case 2: // META
				return META;
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
		tmpMap.put(_Fields.DATA,
				new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST,
								new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT,
										UserStore.class))));
		tmpMap.put(_Fields.META,
				new org.apache.thrift.meta_data.FieldMetaData("meta", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT,
								com.suboat.contrib.rpc.base.QueryMeta.class)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ResultUserStore.class, metaDataMap);
	}

	public ResultUserStore() {
	}

	public ResultUserStore(java.util.List<UserStore> data, com.suboat.contrib.rpc.base.QueryMeta meta) {
		this();
		this.data = data;
		this.meta = meta;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public ResultUserStore(ResultUserStore other) {
		if (other.isSetData()) {
			java.util.List<UserStore> __this__data = new java.util.ArrayList<UserStore>(other.data.size());
			for (UserStore other_element : other.data) {
				__this__data.add(new UserStore(other_element));
			}
			this.data = __this__data;
		}
		if (other.isSetMeta()) {
			this.meta = new com.suboat.contrib.rpc.base.QueryMeta(other.meta);
		}
	}

	public ResultUserStore deepCopy() {
		return new ResultUserStore(this);
	}

	@Override
	public void clear() {
		this.data = null;
		this.meta = null;
	}

	public int getDataSize() {
		return (this.data == null) ? 0 : this.data.size();
	}

	@org.apache.thrift.annotation.Nullable
	public java.util.Iterator<UserStore> getDataIterator() {
		return (this.data == null) ? null : this.data.iterator();
	}

	public void addToData(UserStore elem) {
		if (this.data == null) {
			this.data = new java.util.ArrayList<UserStore>();
		}
		this.data.add(elem);
	}

	@org.apache.thrift.annotation.Nullable
	public java.util.List<UserStore> getData() {
		return this.data;
	}

	public ResultUserStore setData(@org.apache.thrift.annotation.Nullable java.util.List<UserStore> data) {
		this.data = data;
		return this;
	}

	public void unsetData() {
		this.data = null;
	}

	/**
	 * Returns true if field data is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetData() {
		return this.data != null;
	}

	public void setDataIsSet(boolean value) {
		if (!value) {
			this.data = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public com.suboat.contrib.rpc.base.QueryMeta getMeta() {
		return this.meta;
	}

	public ResultUserStore setMeta(@org.apache.thrift.annotation.Nullable com.suboat.contrib.rpc.base.QueryMeta meta) {
		this.meta = meta;
		return this;
	}

	public void unsetMeta() {
		this.meta = null;
	}

	/**
	 * Returns true if field meta is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetMeta() {
		return this.meta != null;
	}

	public void setMetaIsSet(boolean value) {
		if (!value) {
			this.meta = null;
		}
	}

	public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
		switch (field) {
		case DATA:
			if (value == null) {
				unsetData();
			}
			else {
				setData((java.util.List<UserStore>) value);
			}
			break;

		case META:
			if (value == null) {
				unsetMeta();
			}
			else {
				setMeta((com.suboat.contrib.rpc.base.QueryMeta) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case DATA:
			return getData();

		case META:
			return getMeta();

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
		case DATA:
			return isSetData();
		case META:
			return isSetMeta();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof ResultUserStore)
			return this.equals((ResultUserStore) that);
		return false;
	}

	public boolean equals(ResultUserStore that) {
		if (that == null)
			return false;
		if (this == that)
			return true;

		boolean this_present_data = true && this.isSetData();
		boolean that_present_data = true && that.isSetData();
		if (this_present_data || that_present_data) {
			if (!(this_present_data && that_present_data))
				return false;
			if (!this.data.equals(that.data))
				return false;
		}

		boolean this_present_meta = true && this.isSetMeta();
		boolean that_present_meta = true && that.isSetMeta();
		if (this_present_meta || that_present_meta) {
			if (!(this_present_meta && that_present_meta))
				return false;
			if (!this.meta.equals(that.meta))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int hashCode = 1;

		hashCode = hashCode * 8191 + ((isSetData()) ? 131071 : 524287);
		if (isSetData())
			hashCode = hashCode * 8191 + data.hashCode();

		hashCode = hashCode * 8191 + ((isSetMeta()) ? 131071 : 524287);
		if (isSetMeta())
			hashCode = hashCode * 8191 + meta.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(ResultUserStore other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = java.lang.Boolean.valueOf(isSetData()).compareTo(other.isSetData());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetData()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, other.data);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetMeta()).compareTo(other.isSetMeta());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetMeta()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.meta, other.meta);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("ResultUserStore(");
		boolean first = true;

		sb.append("data:");
		if (this.data == null) {
			sb.append("null");
		}
		else {
			sb.append(this.data);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("meta:");
		if (this.meta == null) {
			sb.append("null");
		}
		else {
			sb.append(this.meta);
		}
		first = false;
		sb.append(")");
		return sb.toString();
	}

	public void validate() throws org.apache.thrift.TException {
		// check for required fields
		// check for sub-struct validity
		if (meta != null) {
			meta.validate();
		}
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

	private static class ResultUserStoreStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ResultUserStoreStandardScheme getScheme() {
			return new ResultUserStoreStandardScheme();
		}

	}

	private static class ResultUserStoreStandardScheme
			extends org.apache.thrift.scheme.StandardScheme<ResultUserStore> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, ResultUserStore struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // DATA
					if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
						{
							org.apache.thrift.protocol.TList _list182 = iprot.readListBegin();
							struct.data = new java.util.ArrayList<UserStore>(_list182.size);
							@org.apache.thrift.annotation.Nullable
							UserStore _elem183;
							for (int _i184 = 0; _i184 < _list182.size; ++_i184) {
								_elem183 = new UserStore();
								_elem183.read(iprot);
								struct.data.add(_elem183);
							}
							iprot.readListEnd();
						}
						struct.setDataIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // META
					if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
						struct.meta = new com.suboat.contrib.rpc.base.QueryMeta();
						struct.meta.read(iprot);
						struct.setMetaIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, ResultUserStore struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.data != null) {
				oprot.writeFieldBegin(DATA_FIELD_DESC);
				{
					oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT,
							struct.data.size()));
					for (UserStore _iter185 : struct.data) {
						_iter185.write(oprot);
					}
					oprot.writeListEnd();
				}
				oprot.writeFieldEnd();
			}
			if (struct.meta != null) {
				oprot.writeFieldBegin(META_FIELD_DESC);
				struct.meta.write(oprot);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class ResultUserStoreTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ResultUserStoreTupleScheme getScheme() {
			return new ResultUserStoreTupleScheme();
		}

	}

	private static class ResultUserStoreTupleScheme extends org.apache.thrift.scheme.TupleScheme<ResultUserStore> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, ResultUserStore struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetData()) {
				optionals.set(0);
			}
			if (struct.isSetMeta()) {
				optionals.set(1);
			}
			oprot.writeBitSet(optionals, 2);
			if (struct.isSetData()) {
				{
					oprot.writeI32(struct.data.size());
					for (UserStore _iter186 : struct.data) {
						_iter186.write(oprot);
					}
				}
			}
			if (struct.isSetMeta()) {
				struct.meta.write(oprot);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, ResultUserStore struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(2);
			if (incoming.get(0)) {
				{
					org.apache.thrift.protocol.TList _list187 = new org.apache.thrift.protocol.TList(
							org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
					struct.data = new java.util.ArrayList<UserStore>(_list187.size);
					@org.apache.thrift.annotation.Nullable
					UserStore _elem188;
					for (int _i189 = 0; _i189 < _list187.size; ++_i189) {
						_elem188 = new UserStore();
						_elem188.read(iprot);
						struct.data.add(_elem188);
					}
				}
				struct.setDataIsSet(true);
			}
			if (incoming.get(1)) {
				struct.meta = new com.suboat.contrib.rpc.base.QueryMeta();
				struct.meta.read(iprot);
				struct.setMetaIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
