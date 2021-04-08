/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.msg;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * 特定参数: 设置一个用户的机器人参数 有效条件: 必填项必填
 */
public class ArgUserBot implements org.apache.thrift.TBase<ArgUserBot, ArgUserBot._Fields>, java.io.Serializable,
		Cloneable, Comparable<ArgUserBot> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"ArgUserBot");

	private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid",
			org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.protocol.TField IS_BOT_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"isBot", org.apache.thrift.protocol.TType.BOOL, (short) 2);

	private static final org.apache.thrift.protocol.TField PROXY_URL_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"proxyUrl", org.apache.thrift.protocol.TType.STRING, (short) 3);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ArgUserBotStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ArgUserBotTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String uid; // required

	public boolean isBot; // optional

	public @org.apache.thrift.annotation.Nullable java.lang.String proxyUrl; // optional

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		UID((short) 1, "uid"), IS_BOT((short) 2, "isBot"), PROXY_URL((short) 3, "proxyUrl");

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
			case 2: // IS_BOT
				return IS_BOT;
			case 3: // PROXY_URL
				return PROXY_URL;
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
	private static final int __ISBOT_ISSET_ID = 0;

	private byte __isset_bitfield = 0;

	private static final _Fields optionals[] = { _Fields.IS_BOT, _Fields.PROXY_URL };

	public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.UID,
				new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.IS_BOT,
				new org.apache.thrift.meta_data.FieldMetaData("isBot", org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
		tmpMap.put(_Fields.PROXY_URL,
				new org.apache.thrift.meta_data.FieldMetaData("proxyUrl",
						org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ArgUserBot.class, metaDataMap);
	}

	public ArgUserBot() {
	}

	public ArgUserBot(java.lang.String uid) {
		this();
		this.uid = uid;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public ArgUserBot(ArgUserBot other) {
		__isset_bitfield = other.__isset_bitfield;
		if (other.isSetUid()) {
			this.uid = other.uid;
		}
		this.isBot = other.isBot;
		if (other.isSetProxyUrl()) {
			this.proxyUrl = other.proxyUrl;
		}
	}

	public ArgUserBot deepCopy() {
		return new ArgUserBot(this);
	}

	@Override
	public void clear() {
		this.uid = null;
		setIsBotIsSet(false);
		this.isBot = false;
		this.proxyUrl = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getUid() {
		return this.uid;
	}

	public ArgUserBot setUid(@org.apache.thrift.annotation.Nullable java.lang.String uid) {
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

	public boolean isIsBot() {
		return this.isBot;
	}

	public ArgUserBot setIsBot(boolean isBot) {
		this.isBot = isBot;
		setIsBotIsSet(true);
		return this;
	}

	public void unsetIsBot() {
		__isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISBOT_ISSET_ID);
	}

	/**
	 * Returns true if field isBot is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetIsBot() {
		return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISBOT_ISSET_ID);
	}

	public void setIsBotIsSet(boolean value) {
		__isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISBOT_ISSET_ID, value);
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getProxyUrl() {
		return this.proxyUrl;
	}

	public ArgUserBot setProxyUrl(@org.apache.thrift.annotation.Nullable java.lang.String proxyUrl) {
		this.proxyUrl = proxyUrl;
		return this;
	}

	public void unsetProxyUrl() {
		this.proxyUrl = null;
	}

	/**
	 * Returns true if field proxyUrl is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetProxyUrl() {
		return this.proxyUrl != null;
	}

	public void setProxyUrlIsSet(boolean value) {
		if (!value) {
			this.proxyUrl = null;
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

		case IS_BOT:
			if (value == null) {
				unsetIsBot();
			}
			else {
				setIsBot((java.lang.Boolean) value);
			}
			break;

		case PROXY_URL:
			if (value == null) {
				unsetProxyUrl();
			}
			else {
				setProxyUrl((java.lang.String) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case UID:
			return getUid();

		case IS_BOT:
			return isIsBot();

		case PROXY_URL:
			return getProxyUrl();

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
		case IS_BOT:
			return isSetIsBot();
		case PROXY_URL:
			return isSetProxyUrl();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof ArgUserBot)
			return this.equals((ArgUserBot) that);
		return false;
	}

	public boolean equals(ArgUserBot that) {
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

		boolean this_present_isBot = true && this.isSetIsBot();
		boolean that_present_isBot = true && that.isSetIsBot();
		if (this_present_isBot || that_present_isBot) {
			if (!(this_present_isBot && that_present_isBot))
				return false;
			if (this.isBot != that.isBot)
				return false;
		}

		boolean this_present_proxyUrl = true && this.isSetProxyUrl();
		boolean that_present_proxyUrl = true && that.isSetProxyUrl();
		if (this_present_proxyUrl || that_present_proxyUrl) {
			if (!(this_present_proxyUrl && that_present_proxyUrl))
				return false;
			if (!this.proxyUrl.equals(that.proxyUrl))
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

		hashCode = hashCode * 8191 + ((isSetIsBot()) ? 131071 : 524287);
		if (isSetIsBot())
			hashCode = hashCode * 8191 + ((isBot) ? 131071 : 524287);

		hashCode = hashCode * 8191 + ((isSetProxyUrl()) ? 131071 : 524287);
		if (isSetProxyUrl())
			hashCode = hashCode * 8191 + proxyUrl.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(ArgUserBot other) {
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
		lastComparison = java.lang.Boolean.valueOf(isSetIsBot()).compareTo(other.isSetIsBot());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetIsBot()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isBot, other.isBot);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetProxyUrl()).compareTo(other.isSetProxyUrl());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetProxyUrl()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.proxyUrl, other.proxyUrl);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("ArgUserBot(");
		boolean first = true;

		sb.append("uid:");
		if (this.uid == null) {
			sb.append("null");
		}
		else {
			sb.append(this.uid);
		}
		first = false;
		if (isSetIsBot()) {
			if (!first)
				sb.append(", ");
			sb.append("isBot:");
			sb.append(this.isBot);
			first = false;
		}
		if (isSetProxyUrl()) {
			if (!first)
				sb.append(", ");
			sb.append("proxyUrl:");
			if (this.proxyUrl == null) {
				sb.append("null");
			}
			else {
				sb.append(this.proxyUrl);
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

	private static class ArgUserBotStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ArgUserBotStandardScheme getScheme() {
			return new ArgUserBotStandardScheme();
		}

	}

	private static class ArgUserBotStandardScheme extends org.apache.thrift.scheme.StandardScheme<ArgUserBot> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, ArgUserBot struct)
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
				case 2: // IS_BOT
					if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
						struct.isBot = iprot.readBool();
						struct.setIsBotIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // PROXY_URL
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.proxyUrl = iprot.readString();
						struct.setProxyUrlIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, ArgUserBot struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.uid != null) {
				oprot.writeFieldBegin(UID_FIELD_DESC);
				oprot.writeString(struct.uid);
				oprot.writeFieldEnd();
			}
			if (struct.isSetIsBot()) {
				oprot.writeFieldBegin(IS_BOT_FIELD_DESC);
				oprot.writeBool(struct.isBot);
				oprot.writeFieldEnd();
			}
			if (struct.proxyUrl != null) {
				if (struct.isSetProxyUrl()) {
					oprot.writeFieldBegin(PROXY_URL_FIELD_DESC);
					oprot.writeString(struct.proxyUrl);
					oprot.writeFieldEnd();
				}
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class ArgUserBotTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ArgUserBotTupleScheme getScheme() {
			return new ArgUserBotTupleScheme();
		}

	}

	private static class ArgUserBotTupleScheme extends org.apache.thrift.scheme.TupleScheme<ArgUserBot> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, ArgUserBot struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetUid()) {
				optionals.set(0);
			}
			if (struct.isSetIsBot()) {
				optionals.set(1);
			}
			if (struct.isSetProxyUrl()) {
				optionals.set(2);
			}
			oprot.writeBitSet(optionals, 3);
			if (struct.isSetUid()) {
				oprot.writeString(struct.uid);
			}
			if (struct.isSetIsBot()) {
				oprot.writeBool(struct.isBot);
			}
			if (struct.isSetProxyUrl()) {
				oprot.writeString(struct.proxyUrl);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, ArgUserBot struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(3);
			if (incoming.get(0)) {
				struct.uid = iprot.readString();
				struct.setUidIsSet(true);
			}
			if (incoming.get(1)) {
				struct.isBot = iprot.readBool();
				struct.setIsBotIsSet(true);
			}
			if (incoming.get(2)) {
				struct.proxyUrl = iprot.readString();
				struct.setProxyUrlIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
