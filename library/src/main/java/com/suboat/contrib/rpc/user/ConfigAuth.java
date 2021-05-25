/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.user;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * oauth配置
 */
public class ConfigAuth implements org.apache.thrift.TBase<ConfigAuth, ConfigAuth._Fields>, java.io.Serializable,
		Cloneable, Comparable<ConfigAuth> {

	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"ConfigAuth");

	private static final org.apache.thrift.protocol.TField PLATFORM_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"platform", org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final org.apache.thrift.protocol.TField APP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"appId", org.apache.thrift.protocol.TType.STRING, (short) 2);

	private static final org.apache.thrift.protocol.TField SECRET_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"secret", org.apache.thrift.protocol.TType.STRING, (short) 3);

	private static final org.apache.thrift.protocol.TField AES_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"aesKey", org.apache.thrift.protocol.TType.STRING, (short) 4);

	private static final org.apache.thrift.protocol.TField TIME_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"time", org.apache.thrift.protocol.TType.STRING, (short) 5);

	private static final org.apache.thrift.protocol.TField TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"token", org.apache.thrift.protocol.TType.STRING, (short) 6);

	private static final org.apache.thrift.protocol.TField TICKET_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"ticket", org.apache.thrift.protocol.TType.STRING, (short) 7);

	private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ConfigAuthStandardSchemeFactory();

	private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ConfigAuthTupleSchemeFactory();

	public @org.apache.thrift.annotation.Nullable java.lang.String platform; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String appId; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String secret; // optional

	public @org.apache.thrift.annotation.Nullable java.lang.String aesKey; // optional

	public @org.apache.thrift.annotation.Nullable java.lang.String time; // optional

	public @org.apache.thrift.annotation.Nullable java.lang.String token; // required

	public @org.apache.thrift.annotation.Nullable java.lang.String ticket; // required

	/**
	 * The set of fields this struct contains, along with convenience methods for finding
	 * and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {

		PLATFORM((short) 1, "platform"), APP_ID((short) 2, "appId"), SECRET((short) 3, "secret"), AES_KEY((short) 4,
				"aesKey"), TIME((short) 5, "time"), TOKEN((short) 6, "token"), TICKET((short) 7, "ticket");

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
			case 3: // SECRET
				return SECRET;
			case 4: // AES_KEY
				return AES_KEY;
			case 5: // TIME
				return TIME;
			case 6: // TOKEN
				return TOKEN;
			case 7: // TICKET
				return TICKET;
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
	private static final _Fields optionals[] = { _Fields.SECRET, _Fields.AES_KEY, _Fields.TIME };

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
		tmpMap.put(_Fields.SECRET,
				new org.apache.thrift.meta_data.FieldMetaData("secret",
						org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.AES_KEY,
				new org.apache.thrift.meta_data.FieldMetaData("aesKey",
						org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.TIME, new org.apache.thrift.meta_data.FieldMetaData("time",
				org.apache.thrift.TFieldRequirementType.OPTIONAL,
				new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING, "Time")));
		tmpMap.put(_Fields.TOKEN,
				new org.apache.thrift.meta_data.FieldMetaData("token", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.TICKET,
				new org.apache.thrift.meta_data.FieldMetaData("ticket", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ConfigAuth.class, metaDataMap);
	}

	public ConfigAuth() {
	}

	public ConfigAuth(java.lang.String platform, java.lang.String appId, java.lang.String token,
			java.lang.String ticket) {
		this();
		this.platform = platform;
		this.appId = appId;
		this.token = token;
		this.ticket = ticket;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public ConfigAuth(ConfigAuth other) {
		if (other.isSetPlatform()) {
			this.platform = other.platform;
		}
		if (other.isSetAppId()) {
			this.appId = other.appId;
		}
		if (other.isSetSecret()) {
			this.secret = other.secret;
		}
		if (other.isSetAesKey()) {
			this.aesKey = other.aesKey;
		}
		if (other.isSetTime()) {
			this.time = other.time;
		}
		if (other.isSetToken()) {
			this.token = other.token;
		}
		if (other.isSetTicket()) {
			this.ticket = other.ticket;
		}
	}

	public ConfigAuth deepCopy() {
		return new ConfigAuth(this);
	}

	@Override
	public void clear() {
		this.platform = null;
		this.appId = null;
		this.secret = null;
		this.aesKey = null;
		this.time = null;
		this.token = null;
		this.ticket = null;
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getPlatform() {
		return this.platform;
	}

	public ConfigAuth setPlatform(@org.apache.thrift.annotation.Nullable java.lang.String platform) {
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

	public ConfigAuth setAppId(@org.apache.thrift.annotation.Nullable java.lang.String appId) {
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

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getSecret() {
		return this.secret;
	}

	public ConfigAuth setSecret(@org.apache.thrift.annotation.Nullable java.lang.String secret) {
		this.secret = secret;
		return this;
	}

	public void unsetSecret() {
		this.secret = null;
	}

	/**
	 * Returns true if field secret is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetSecret() {
		return this.secret != null;
	}

	public void setSecretIsSet(boolean value) {
		if (!value) {
			this.secret = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getAesKey() {
		return this.aesKey;
	}

	public ConfigAuth setAesKey(@org.apache.thrift.annotation.Nullable java.lang.String aesKey) {
		this.aesKey = aesKey;
		return this;
	}

	public void unsetAesKey() {
		this.aesKey = null;
	}

	/**
	 * Returns true if field aesKey is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetAesKey() {
		return this.aesKey != null;
	}

	public void setAesKeyIsSet(boolean value) {
		if (!value) {
			this.aesKey = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getTime() {
		return this.time;
	}

	public ConfigAuth setTime(@org.apache.thrift.annotation.Nullable java.lang.String time) {
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
	public java.lang.String getToken() {
		return this.token;
	}

	public ConfigAuth setToken(@org.apache.thrift.annotation.Nullable java.lang.String token) {
		this.token = token;
		return this;
	}

	public void unsetToken() {
		this.token = null;
	}

	/**
	 * Returns true if field token is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetToken() {
		return this.token != null;
	}

	public void setTokenIsSet(boolean value) {
		if (!value) {
			this.token = null;
		}
	}

	@org.apache.thrift.annotation.Nullable
	public java.lang.String getTicket() {
		return this.ticket;
	}

	public ConfigAuth setTicket(@org.apache.thrift.annotation.Nullable java.lang.String ticket) {
		this.ticket = ticket;
		return this;
	}

	public void unsetTicket() {
		this.ticket = null;
	}

	/**
	 * Returns true if field ticket is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetTicket() {
		return this.ticket != null;
	}

	public void setTicketIsSet(boolean value) {
		if (!value) {
			this.ticket = null;
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

		case SECRET:
			if (value == null) {
				unsetSecret();
			}
			else {
				setSecret((java.lang.String) value);
			}
			break;

		case AES_KEY:
			if (value == null) {
				unsetAesKey();
			}
			else {
				setAesKey((java.lang.String) value);
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

		case TOKEN:
			if (value == null) {
				unsetToken();
			}
			else {
				setToken((java.lang.String) value);
			}
			break;

		case TICKET:
			if (value == null) {
				unsetTicket();
			}
			else {
				setTicket((java.lang.String) value);
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

		case SECRET:
			return getSecret();

		case AES_KEY:
			return getAesKey();

		case TIME:
			return getTime();

		case TOKEN:
			return getToken();

		case TICKET:
			return getTicket();

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
		case SECRET:
			return isSetSecret();
		case AES_KEY:
			return isSetAesKey();
		case TIME:
			return isSetTime();
		case TOKEN:
			return isSetToken();
		case TICKET:
			return isSetTicket();
		}
		throw new java.lang.IllegalStateException();
	}

	@Override
	public boolean equals(java.lang.Object that) {
		if (that == null)
			return false;
		if (that instanceof ConfigAuth)
			return this.equals((ConfigAuth) that);
		return false;
	}

	public boolean equals(ConfigAuth that) {
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

		boolean this_present_secret = true && this.isSetSecret();
		boolean that_present_secret = true && that.isSetSecret();
		if (this_present_secret || that_present_secret) {
			if (!(this_present_secret && that_present_secret))
				return false;
			if (!this.secret.equals(that.secret))
				return false;
		}

		boolean this_present_aesKey = true && this.isSetAesKey();
		boolean that_present_aesKey = true && that.isSetAesKey();
		if (this_present_aesKey || that_present_aesKey) {
			if (!(this_present_aesKey && that_present_aesKey))
				return false;
			if (!this.aesKey.equals(that.aesKey))
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

		boolean this_present_token = true && this.isSetToken();
		boolean that_present_token = true && that.isSetToken();
		if (this_present_token || that_present_token) {
			if (!(this_present_token && that_present_token))
				return false;
			if (!this.token.equals(that.token))
				return false;
		}

		boolean this_present_ticket = true && this.isSetTicket();
		boolean that_present_ticket = true && that.isSetTicket();
		if (this_present_ticket || that_present_ticket) {
			if (!(this_present_ticket && that_present_ticket))
				return false;
			if (!this.ticket.equals(that.ticket))
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

		hashCode = hashCode * 8191 + ((isSetSecret()) ? 131071 : 524287);
		if (isSetSecret())
			hashCode = hashCode * 8191 + secret.hashCode();

		hashCode = hashCode * 8191 + ((isSetAesKey()) ? 131071 : 524287);
		if (isSetAesKey())
			hashCode = hashCode * 8191 + aesKey.hashCode();

		hashCode = hashCode * 8191 + ((isSetTime()) ? 131071 : 524287);
		if (isSetTime())
			hashCode = hashCode * 8191 + time.hashCode();

		hashCode = hashCode * 8191 + ((isSetToken()) ? 131071 : 524287);
		if (isSetToken())
			hashCode = hashCode * 8191 + token.hashCode();

		hashCode = hashCode * 8191 + ((isSetTicket()) ? 131071 : 524287);
		if (isSetTicket())
			hashCode = hashCode * 8191 + ticket.hashCode();

		return hashCode;
	}

	@Override
	public int compareTo(ConfigAuth other) {
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
		lastComparison = java.lang.Boolean.valueOf(isSetSecret()).compareTo(other.isSetSecret());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetSecret()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.secret, other.secret);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetAesKey()).compareTo(other.isSetAesKey());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetAesKey()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.aesKey, other.aesKey);
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
		lastComparison = java.lang.Boolean.valueOf(isSetToken()).compareTo(other.isSetToken());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetToken()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.token, other.token);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = java.lang.Boolean.valueOf(isSetTicket()).compareTo(other.isSetTicket());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetTicket()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ticket, other.ticket);
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
		java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfigAuth(");
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
		if (isSetSecret()) {
			if (!first)
				sb.append(", ");
			sb.append("secret:");
			if (this.secret == null) {
				sb.append("null");
			}
			else {
				sb.append(this.secret);
			}
			first = false;
		}
		if (isSetAesKey()) {
			if (!first)
				sb.append(", ");
			sb.append("aesKey:");
			if (this.aesKey == null) {
				sb.append("null");
			}
			else {
				sb.append(this.aesKey);
			}
			first = false;
		}
		if (isSetTime()) {
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
		}
		if (!first)
			sb.append(", ");
		sb.append("token:");
		if (this.token == null) {
			sb.append("null");
		}
		else {
			sb.append(this.token);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("ticket:");
		if (this.ticket == null) {
			sb.append("null");
		}
		else {
			sb.append(this.ticket);
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

	private static class ConfigAuthStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ConfigAuthStandardScheme getScheme() {
			return new ConfigAuthStandardScheme();
		}

	}

	private static class ConfigAuthStandardScheme extends org.apache.thrift.scheme.StandardScheme<ConfigAuth> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, ConfigAuth struct)
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
				case 3: // SECRET
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.secret = iprot.readString();
						struct.setSecretIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 4: // AES_KEY
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.aesKey = iprot.readString();
						struct.setAesKeyIsSet(true);
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
				case 6: // TOKEN
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.token = iprot.readString();
						struct.setTokenIsSet(true);
					}
					else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 7: // TICKET
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.ticket = iprot.readString();
						struct.setTicketIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, ConfigAuth struct)
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
			if (struct.secret != null) {
				if (struct.isSetSecret()) {
					oprot.writeFieldBegin(SECRET_FIELD_DESC);
					oprot.writeString(struct.secret);
					oprot.writeFieldEnd();
				}
			}
			if (struct.aesKey != null) {
				if (struct.isSetAesKey()) {
					oprot.writeFieldBegin(AES_KEY_FIELD_DESC);
					oprot.writeString(struct.aesKey);
					oprot.writeFieldEnd();
				}
			}
			if (struct.time != null) {
				if (struct.isSetTime()) {
					oprot.writeFieldBegin(TIME_FIELD_DESC);
					oprot.writeString(struct.time);
					oprot.writeFieldEnd();
				}
			}
			if (struct.token != null) {
				oprot.writeFieldBegin(TOKEN_FIELD_DESC);
				oprot.writeString(struct.token);
				oprot.writeFieldEnd();
			}
			if (struct.ticket != null) {
				oprot.writeFieldBegin(TICKET_FIELD_DESC);
				oprot.writeString(struct.ticket);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class ConfigAuthTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

		public ConfigAuthTupleScheme getScheme() {
			return new ConfigAuthTupleScheme();
		}

	}

	private static class ConfigAuthTupleScheme extends org.apache.thrift.scheme.TupleScheme<ConfigAuth> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, ConfigAuth struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet optionals = new java.util.BitSet();
			if (struct.isSetPlatform()) {
				optionals.set(0);
			}
			if (struct.isSetAppId()) {
				optionals.set(1);
			}
			if (struct.isSetSecret()) {
				optionals.set(2);
			}
			if (struct.isSetAesKey()) {
				optionals.set(3);
			}
			if (struct.isSetTime()) {
				optionals.set(4);
			}
			if (struct.isSetToken()) {
				optionals.set(5);
			}
			if (struct.isSetTicket()) {
				optionals.set(6);
			}
			oprot.writeBitSet(optionals, 7);
			if (struct.isSetPlatform()) {
				oprot.writeString(struct.platform);
			}
			if (struct.isSetAppId()) {
				oprot.writeString(struct.appId);
			}
			if (struct.isSetSecret()) {
				oprot.writeString(struct.secret);
			}
			if (struct.isSetAesKey()) {
				oprot.writeString(struct.aesKey);
			}
			if (struct.isSetTime()) {
				oprot.writeString(struct.time);
			}
			if (struct.isSetToken()) {
				oprot.writeString(struct.token);
			}
			if (struct.isSetTicket()) {
				oprot.writeString(struct.ticket);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, ConfigAuth struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			java.util.BitSet incoming = iprot.readBitSet(7);
			if (incoming.get(0)) {
				struct.platform = iprot.readString();
				struct.setPlatformIsSet(true);
			}
			if (incoming.get(1)) {
				struct.appId = iprot.readString();
				struct.setAppIdIsSet(true);
			}
			if (incoming.get(2)) {
				struct.secret = iprot.readString();
				struct.setSecretIsSet(true);
			}
			if (incoming.get(3)) {
				struct.aesKey = iprot.readString();
				struct.setAesKeyIsSet(true);
			}
			if (incoming.get(4)) {
				struct.time = iprot.readString();
				struct.setTimeIsSet(true);
			}
			if (incoming.get(5)) {
				struct.token = iprot.readString();
				struct.setTokenIsSet(true);
			}
			if (incoming.get(6)) {
				struct.ticket = iprot.readString();
				struct.setTicketIsSet(true);
			}
		}

	}

	private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
		return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
				: TUPLE_SCHEME_FACTORY).getScheme();
	}

}
