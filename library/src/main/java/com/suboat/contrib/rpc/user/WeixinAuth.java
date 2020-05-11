/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.user;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * 微信验证实例
 */
public class WeixinAuth implements org.apache.thrift.TBase<WeixinAuth, WeixinAuth._Fields>, java.io.Serializable,
		Cloneable, Comparable<WeixinAuth> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"WeixinAuth");

	private static final org.apache.thrift.protocol.TField PLATFORM_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"platform", org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.protocol.TField APP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"appId", org.apache.thrift.protocol.TType.STRING, (short) 2);

	private static final org.apache.thrift.protocol.TField TIME_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"time", org.apache.thrift.protocol.TType.I32, (short) 3);

	private static final org.apache.thrift.protocol.TField NONCE_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"nonce", org.apache.thrift.protocol.TType.STRING, (short) 4);

	private static final org.apache.thrift.protocol.TField TICKET_API_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"ticketApi", org.apache.thrift.protocol.TType.STRING, (short) 5);

	private static final org.apache.thrift.protocol.TField SIGN_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"sign", org.apache.thrift.protocol.TType.STRING, (short) 6);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new WeixinAuthStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new WeixinAuthTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String platform; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String appId; // required

	public int time; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String nonce; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String ticketApi; // optional

	public @org.apache.thrift.annotation.Nullable java.lang.String sign; // optional

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		PLATFORM((short) 1, "platform"), APP_ID((short) 2, "appId"), TIME((short) 3, "time"), NONCE((short) 4,
				"nonce"), TICKET_API((short) 5, "ticketApi"), SIGN((short) 6, "sign");

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
			case 1: // PLATFORM
				return PLATFORM;
			case 2: // APP_ID
				return APP_ID;
			case 3: // TIME
				return TIME;
			case 4: // NONCE
				return NONCE;
			case 5: // TICKET_API
				return TICKET_API;
			case 6: // SIGN
				return SIGN;
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
	private static final int __TIME_ISSET_ID = 0;

	private byte __isset_bitfield = 0;

	private static final _Fields optionals[] = { _Fields.TICKET_API, _Fields.SIGN };

	public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.PLATFORM,
				new org.apache.thrift.meta_data.FieldMetaData("platform",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.APP_ID,
				new org.apache.thrift.meta_data.FieldMetaData("appId", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.TIME,
				new org.apache.thrift.meta_data.FieldMetaData("time", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		tmpMap.put(_Fields.NONCE,
				new org.apache.thrift.meta_data.FieldMetaData("nonce", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.TICKET_API,
				new org.apache.thrift.meta_data.FieldMetaData("ticketApi",
						org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.SIGN,
				new org.apache.thrift.meta_data.FieldMetaData("sign", org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WeixinAuth.class, metaDataMap);
	}

	public WeixinAuth() {
	}

	public WeixinAuth(java.lang.String platform, java.lang.String appId, int time, java.lang.String nonce) {
		this();
		this.platform = platform;
		this.appId = appId;
		this.time = time;
		setTimeIsSet(true);
		this.nonce = nonce;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public WeixinAuth(WeixinAuth other) {
		__isset_bitfield = other.__isset_bitfield;
		if (other.isSetPlatform()) {
			this.platform = other.platform;
		}
		if (other.isSetAppId()) {
			this.appId = other.appId;
		}
		this.time = other.time;
		if (other.isSetNonce()) {
			this.nonce = other.nonce;
		}
		if (other.isSetTicketApi()) {
			this.ticketApi = other.ticketApi;
		}
		if (other.isSetSign()) {
			this.sign = other.sign;
		}
	}

	public WeixinAuth deepCopy() {
		return new WeixinAuth(this);
	}

	@Override
	public void clear() {
		this.platform = null;
		this.appId = null;
		setTimeIsSet(false);
		this.time = 0;
		this.nonce = null;
		this.ticketApi = null;
		this.sign = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getPlatform() {
		return this.platform;
	}

	public WeixinAuth setPlatform(@org.apache.thrift.annotation.Nullable java.lang.String platform) {
		this.platform = platform;
		return this;
	}

	public void unsetPlatform() {
		this.platform = null;
	}

	/**
	 * Returns true if field platform is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetPlatform() {
		return this.platform != null;
	}

	public void setPlatformIsSet(boolean value) {
		if (!value) {
			this.platform = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getAppId() {
		return this.appId;
	}

	public WeixinAuth setAppId(@org.apache.thrift.annotation.Nullable java.lang.String appId) {
		this.appId = appId;
		return this;
	}

	public void unsetAppId() {
		this.appId = null;
	}

	/**
	 * Returns true if field appId is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetAppId() {
		return this.appId != null;
	}

	public void setAppIdIsSet(boolean value) {
		if (!value) {
			this.appId = null;
		}
	}

	public int getTime() {
		return this.time;
	}

	public WeixinAuth setTime(int time) {
		this.time = time;
		setTimeIsSet(true);
		return this;
	}

	public void unsetTime() {
		__isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TIME_ISSET_ID);
	}

	/**
	 * Returns true if field time is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetTime() {
		return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TIME_ISSET_ID);
	}

	public void setTimeIsSet(boolean value) {
		__isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TIME_ISSET_ID, value);
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getNonce() {
		return this.nonce;
	}

	public WeixinAuth setNonce(@org.apache.thrift.annotation.Nullable java.lang.String nonce) {
		this.nonce = nonce;
		return this;
	}

	public void unsetNonce() {
		this.nonce = null;
	}

	/**
	 * Returns true if field nonce is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetNonce() {
		return this.nonce != null;
	}

	public void setNonceIsSet(boolean value) {
		if (!value) {
			this.nonce = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getTicketApi() {
		return this.ticketApi;
	}

	public WeixinAuth setTicketApi(@org.apache.thrift.annotation.Nullable java.lang.String ticketApi) {
		this.ticketApi = ticketApi;
		return this;
	}

	public void unsetTicketApi() {
		this.ticketApi = null;
	}

	/**
	 * Returns true if field ticketApi is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetTicketApi() {
		return this.ticketApi != null;
	}

	public void setTicketApiIsSet(boolean value) {
		if (!value) {
			this.ticketApi = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getSign() {
		return this.sign;
	}

	public WeixinAuth setSign(@org.apache.thrift.annotation.Nullable java.lang.String sign) {
		this.sign = sign;
		return this;
	}

	public void unsetSign() {
		this.sign = null;
	}

	/**
	 * Returns true if field sign is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetSign() {
		return this.sign != null;
	}

	public void setSignIsSet(boolean value) {
		if (!value) {
			this.sign = null;
		}
	}

	public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
		switch (field) {
		case PLATFORM:
			if (value == null) {
				unsetPlatform();
			}
			else {
				setPlatform((java.lang.String) value);
			}
			break;

		case APP_ID:
			if (value == null) {
				unsetAppId();
			}
			else {
				setAppId((java.lang.String) value);
			}
			break;

		case TIME:
			if (value == null) {
				unsetTime();
			}
			else {
				setTime((java.lang.Integer) value);
			}
			break;

		case NONCE:
			if (value == null) {
				unsetNonce();
			}
			else {
				setNonce((java.lang.String) value);
			}
			break;

		case TICKET_API:
			if (value == null) {
				unsetTicketApi();
			}
			else {
				setTicketApi((java.lang.String) value);
			}
			break;

		case SIGN:
			if (value == null) {
				unsetSign();
			}
			else {
				setSign((java.lang.String) value);
			}
			break;

		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.Object getFieldValue(_Fields field) {
		switch (field) {
		case PLATFORM:
			return getPlatform();

		case APP_ID:
			return getAppId();

		case TIME:
			return getTime();

		case NONCE:
			return getNonce();

		case TICKET_API:
			return getTicketApi();

		case SIGN:
			return getSign();

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
		case PLATFORM:
			return isSetPlatform();
		case APP_ID:
			return isSetAppId();
		case TIME:
			return isSetTime();
		case NONCE:
			return isSetNonce();
		case TICKET_API:
			return isSetTicketApi();
		case SIGN:
			return isSetSign();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof WeixinAuth)
			return this.equals((WeixinAuth) that);
		return false;
	}

	public boolean equals(WeixinAuth that) {
		if (that == null)
			return false;
		if (this == that)
			return true;

		boolean this_present_platform = true && this.isSetPlatform();
		boolean that_present_platform = true && that.isSetPlatform();
		if (this_present_platform || that_present_platform) {
			if (!(this_present_platform && that_present_platform))
				return false;
			if (!this.platform.equals(that.platform))
				return false;
		}

		boolean this_present_appId = true && this.isSetAppId();
		boolean that_present_appId = true && that.isSetAppId();
		if (this_present_appId || that_present_appId) {
			if (!(this_present_appId && that_present_appId))
				return false;
			if (!this.appId.equals(that.appId))
				return false;
		}

		boolean this_present_time = true;
		boolean that_present_time = true;
		if (this_present_time || that_present_time) {
			if (!(this_present_time && that_present_time))
				return false;
			if (this.time != that.time)
				return false;
		}

		boolean this_present_nonce = true && this.isSetNonce();
		boolean that_present_nonce = true && that.isSetNonce();
		if (this_present_nonce || that_present_nonce) {
			if (!(this_present_nonce && that_present_nonce))
				return false;
			if (!this.nonce.equals(that.nonce))
				return false;
		}

		boolean this_present_ticketApi = true && this.isSetTicketApi();
		boolean that_present_ticketApi = true && that.isSetTicketApi();
		if (this_present_ticketApi || that_present_ticketApi) {
			if (!(this_present_ticketApi && that_present_ticketApi))
				return false;
			if (!this.ticketApi.equals(that.ticketApi))
				return false;
		}

		boolean this_present_sign = true && this.isSetSign();
		boolean that_present_sign = true && that.isSetSign();
		if (this_present_sign || that_present_sign) {
			if (!(this_present_sign && that_present_sign))
				return false;
			if (!this.sign.equals(that.sign))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int hashCode = 1;

		hashCode = hashCode * 8191 + ((isSetPlatform()) ? 131071 : 524287);
		if (isSetPlatform())
			hashCode = hashCode * 8191 + platform.hashCode();

		hashCode = hashCode * 8191 + ((isSetAppId()) ? 131071 : 524287);
		if (isSetAppId())
			hashCode = hashCode * 8191 + appId.hashCode();

		hashCode = hashCode * 8191 + time;

		hashCode = hashCode * 8191 + ((isSetNonce()) ? 131071 : 524287);
		if (isSetNonce())
			hashCode = hashCode * 8191 + nonce.hashCode();

		hashCode = hashCode * 8191 + ((isSetTicketApi()) ? 131071 : 524287);
		if (isSetTicketApi())
			hashCode = hashCode * 8191 + ticketApi.hashCode();

		hashCode = hashCode * 8191 + ((isSetSign()) ? 131071 : 524287);
		if (isSetSign())
			hashCode = hashCode * 8191 + sign.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(WeixinAuth other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = java.lang.Boolean.valueOf(isSetPlatform()).compareTo(other.isSetPlatform());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetPlatform()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.platform, other.platform);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetAppId()).compareTo(other.isSetAppId());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetAppId()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.appId, other.appId);
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
		lastComparison = java.lang.Boolean.valueOf(isSetNonce()).compareTo(other.isSetNonce());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetNonce()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nonce, other.nonce);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetTicketApi()).compareTo(other.isSetTicketApi());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetTicketApi()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ticketApi, other.ticketApi);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetSign()).compareTo(other.isSetSign());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetSign()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sign, other.sign);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("WeixinAuth(");
		boolean first = true;

		sb.append("platform:");
		if (this.platform == null) {
			sb.append("null");
		}
		else {
			sb.append(this.platform);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("appId:");
		if (this.appId == null) {
			sb.append("null");
		}
		else {
			sb.append(this.appId);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("time:");
		sb.append(this.time);
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("nonce:");
		if (this.nonce == null) {
			sb.append("null");
		}
		else {
			sb.append(this.nonce);
		}
		first = false;
		if (isSetTicketApi()) {
			if (!first)
				sb.append(", ");
			sb.append("ticketApi:");
			if (this.ticketApi == null) {
				sb.append("null");
			}
			else {
				sb.append(this.ticketApi);
			}
			first = false;
		}
		if (isSetSign()) {
			if (!first)
				sb.append(", ");
			sb.append("sign:");
			if (this.sign == null) {
				sb.append("null");
			}
			else {
				sb.append(this.sign);
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

	private static class WeixinAuthStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public WeixinAuthStandardScheme getScheme() {
			return new WeixinAuthStandardScheme();
		}

	}

	private static class WeixinAuthStandardScheme extends org.apache.thrift.scheme.StandardScheme<WeixinAuth> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, WeixinAuth struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // PLATFORM
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.platform = iprot.readString();
						struct.setPlatformIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // APP_ID
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.appId = iprot.readString();
						struct.setAppIdIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // TIME
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.time = iprot.readI32();
						struct.setTimeIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 4: // NONCE
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.nonce = iprot.readString();
						struct.setNonceIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 5: // TICKET_API
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.ticketApi = iprot.readString();
						struct.setTicketApiIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 6: // SIGN
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.sign = iprot.readString();
						struct.setSignIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, WeixinAuth struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.platform != null) {
				oprot.writeFieldBegin(PLATFORM_FIELD_DESC);
				oprot.writeString(struct.platform);
				oprot.writeFieldEnd();
			}
			if (struct.appId != null) {
				oprot.writeFieldBegin(APP_ID_FIELD_DESC);
				oprot.writeString(struct.appId);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldBegin(TIME_FIELD_DESC);
			oprot.writeI32(struct.time);
			oprot.writeFieldEnd();
			if (struct.nonce != null) {
				oprot.writeFieldBegin(NONCE_FIELD_DESC);
				oprot.writeString(struct.nonce);
				oprot.writeFieldEnd();
			}
			if (struct.ticketApi != null) {
				if (struct.isSetTicketApi()) {
					oprot.writeFieldBegin(TICKET_API_FIELD_DESC);
					oprot.writeString(struct.ticketApi);
					oprot.writeFieldEnd();
				}
			}
			if (struct.sign != null) {
				if (struct.isSetSign()) {
					oprot.writeFieldBegin(SIGN_FIELD_DESC);
					oprot.writeString(struct.sign);
					oprot.writeFieldEnd();
				}
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class WeixinAuthTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public WeixinAuthTupleScheme getScheme() {
			return new WeixinAuthTupleScheme();
		}

	}

	private static class WeixinAuthTupleScheme extends org.apache.thrift.scheme.TupleScheme<WeixinAuth> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, WeixinAuth struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetPlatform()) {
				optionals.set(0);
			}
			if (struct.isSetAppId()) {
				optionals.set(1);
			}
			if (struct.isSetTime()) {
				optionals.set(2);
			}
			if (struct.isSetNonce()) {
				optionals.set(3);
			}
			if (struct.isSetTicketApi()) {
				optionals.set(4);
			}
			if (struct.isSetSign()) {
				optionals.set(5);
			}
			oprot.writeBitSet(optionals, 6);
			if (struct.isSetPlatform()) {
				oprot.writeString(struct.platform);
			}
			if (struct.isSetAppId()) {
				oprot.writeString(struct.appId);
			}
			if (struct.isSetTime()) {
				oprot.writeI32(struct.time);
			}
			if (struct.isSetNonce()) {
				oprot.writeString(struct.nonce);
			}
			if (struct.isSetTicketApi()) {
				oprot.writeString(struct.ticketApi);
			}
			if (struct.isSetSign()) {
				oprot.writeString(struct.sign);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, WeixinAuth struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(6);
			if (incoming.get(0)) {
				struct.platform = iprot.readString();
				struct.setPlatformIsSet(true);
			}
			if (incoming.get(1)) {
				struct.appId = iprot.readString();
				struct.setAppIdIsSet(true);
			}
			if (incoming.get(2)) {
				struct.time = iprot.readI32();
				struct.setTimeIsSet(true);
			}
			if (incoming.get(3)) {
				struct.nonce = iprot.readString();
				struct.setNonceIsSet(true);
			}
			if (incoming.get(4)) {
				struct.ticketApi = iprot.readString();
				struct.setTicketApiIsSet(true);
			}
			if (incoming.get(5)) {
				struct.sign = iprot.readString();
				struct.setSignIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
