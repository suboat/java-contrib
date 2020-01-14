/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.suboat.contrib.rpc.base;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-01-14")
public class BaseService {

	public interface Iface {

		public Version version() throws Error, org.apache.thrift.TException;

	}

	public interface AsyncIface {

		public void version(org.apache.thrift.async.AsyncMethodCallback<Version> resultHandler)
				throws org.apache.thrift.TException;

	}

	public static class Client extends org.apache.thrift.TServiceClient implements Iface {

		public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {

			public Factory() {
			}

			public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
				return new Client(prot);
			}

			public Client getClient(org.apache.thrift.protocol.TProtocol iprot,
					org.apache.thrift.protocol.TProtocol oprot) {
				return new Client(iprot, oprot);
			}

		}

		public Client(org.apache.thrift.protocol.TProtocol prot) {
			super(prot, prot);
		}

		public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
			super(iprot, oprot);
		}

		public Version version() throws Error, org.apache.thrift.TException {
			send_version();
			return recv_version();
		}

		public void send_version() throws org.apache.thrift.TException {
			version_args args = new version_args();
			sendBase("version", args);
		}

		public Version recv_version() throws Error, org.apache.thrift.TException {
			version_result result = new version_result();
			receiveBase(result, "version");
			if (result.isSetSuccess()) {
				return result.success;
			}
			if (result.err != null) {
				throw result.err;
			}
			throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT,
					"version failed: unknown result");
		}

	}

	public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {

		public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {

			private org.apache.thrift.async.TAsyncClientManager clientManager;

			private org.apache.thrift.protocol.TProtocolFactory protocolFactory;

			public Factory(org.apache.thrift.async.TAsyncClientManager clientManager,
					org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
				this.clientManager = clientManager;
				this.protocolFactory = protocolFactory;
			}

			public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
				return new AsyncClient(protocolFactory, clientManager, transport);
			}

		}

		public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory,
				org.apache.thrift.async.TAsyncClientManager clientManager,
				org.apache.thrift.transport.TNonblockingTransport transport) {
			super(protocolFactory, clientManager, transport);
		}

		public void version(org.apache.thrift.async.AsyncMethodCallback<Version> resultHandler)
				throws org.apache.thrift.TException {
			checkReady();
			version_call method_call = new version_call(resultHandler, this, ___protocolFactory, ___transport);
			this.___currentMethod = method_call;
			___manager.call(method_call);
		}

		public static class version_call extends org.apache.thrift.async.TAsyncMethodCall<Version> {

			public version_call(org.apache.thrift.async.AsyncMethodCallback<Version> resultHandler,
					org.apache.thrift.async.TAsyncClient client,
					org.apache.thrift.protocol.TProtocolFactory protocolFactory,
					org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
				super(client, protocolFactory, transport, resultHandler, false);
			}

			public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
				prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("version",
						org.apache.thrift.protocol.TMessageType.CALL, 0));
				version_args args = new version_args();
				args.write(prot);
				prot.writeMessageEnd();
			}

			public Version getResult() throws Error, org.apache.thrift.TException {
				if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
					throw new java.lang.IllegalStateException("Method call not finished!");
				}
				org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(
						getFrameBuffer().array());
				org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
				return (new Client(prot)).recv_version();
			}

		}

	}

	public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I>
			implements org.apache.thrift.TProcessor {

		private static final org.slf4j.Logger _LOGGER = org.slf4j.LoggerFactory.getLogger(Processor.class.getName());

		public Processor(I iface) {
			super(iface, getProcessMap(
					new java.util.HashMap<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
		}

		protected Processor(I iface,
				java.util.Map<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>> processMap) {
			super(iface, getProcessMap(processMap));
		}

		private static <I extends Iface> java.util.Map<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>> getProcessMap(
				java.util.Map<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>> processMap) {
			processMap.put("version", new version());
			return processMap;
		}

		public static class version<I extends Iface> extends org.apache.thrift.ProcessFunction<I, version_args> {

			public version() {
				super("version");
			}

			public version_args getEmptyArgsInstance() {
				return new version_args();
			}

			protected boolean isOneway() {
				return false;
			}

			@Override
			protected boolean rethrowUnhandledExceptions() {
				return false;
			}

			public version_result getResult(I iface, version_args args) throws org.apache.thrift.TException {
				version_result result = new version_result();
				try {
					result.success = iface.version();
				}
				catch (Error err) {
					result.err = err;
				}
				return result;
			}

		}

	}

	public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {

		private static final org.slf4j.Logger _LOGGER = org.slf4j.LoggerFactory
				.getLogger(AsyncProcessor.class.getName());

		public AsyncProcessor(I iface) {
			super(iface, getProcessMap(
					new java.util.HashMap<java.lang.String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
		}

		protected AsyncProcessor(I iface,
				java.util.Map<java.lang.String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>> processMap) {
			super(iface, getProcessMap(processMap));
		}

		private static <I extends AsyncIface> java.util.Map<java.lang.String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>> getProcessMap(
				java.util.Map<java.lang.String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>> processMap) {
			processMap.put("version", new version());
			return processMap;
		}

		public static class version<I extends AsyncIface>
				extends org.apache.thrift.AsyncProcessFunction<I, version_args, Version> {

			public version() {
				super("version");
			}

			public version_args getEmptyArgsInstance() {
				return new version_args();
			}

			public org.apache.thrift.async.AsyncMethodCallback<Version> getResultHandler(
					final org.apache.thrift.server.AbstractNonblockingServer.AsyncFrameBuffer fb, final int seqid) {
				final org.apache.thrift.AsyncProcessFunction fcall = this;
				return new org.apache.thrift.async.AsyncMethodCallback<Version>() {
					public void onComplete(Version o) {
						version_result result = new version_result();
						result.success = o;
						try {
							fcall.sendResponse(fb, result, org.apache.thrift.protocol.TMessageType.REPLY, seqid);
						}
						catch (org.apache.thrift.transport.TTransportException e) {
							_LOGGER.error("TTransportException writing to internal frame buffer", e);
							fb.close();
						}
						catch (java.lang.Exception e) {
							_LOGGER.error("Exception writing to internal frame buffer", e);
							onError(e);
						}
					}

					public void onError(java.lang.Exception e) {
						byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
						org.apache.thrift.TSerializable msg;
						version_result result = new version_result();
						if (e instanceof Error) {
							result.err = (Error) e;
							result.setErrIsSet(true);
							msg = result;
						}
						else if (e instanceof org.apache.thrift.transport.TTransportException) {
							_LOGGER.error("TTransportException inside handler", e);
							fb.close();
							return;
						}
						else if (e instanceof org.apache.thrift.TApplicationException) {
							_LOGGER.error("TApplicationException inside handler", e);
							msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
							msg = (org.apache.thrift.TApplicationException) e;
						}
						else {
							_LOGGER.error("Exception inside handler", e);
							msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
							msg = new org.apache.thrift.TApplicationException(
									org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
						}
						try {
							fcall.sendResponse(fb, msg, msgType, seqid);
						}
						catch (java.lang.Exception ex) {
							_LOGGER.error("Exception writing to internal frame buffer", ex);
							fb.close();
						}
					}
				};
			}

			protected boolean isOneway() {
				return false;
			}

			public void start(I iface, version_args args,
					org.apache.thrift.async.AsyncMethodCallback<Version> resultHandler)
					throws org.apache.thrift.TException {
				iface.version(resultHandler);
			}

		}

	}

	public static class version_args implements org.apache.thrift.TBase<version_args, version_args._Fields>,
			java.io.Serializable, Cloneable, Comparable<version_args> {

		private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
				"version_args");

		private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new version_argsStandardSchemeFactory();

		private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new version_argsTupleSchemeFactory();

		/**
		 * The set of fields this struct contains, along with convenience methods for
		 * finding and manipulating them.
		 */
		public enum _Fields implements org.apache.thrift.TFieldIdEnum {

			;

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
				default:
					return null;
				}
			}

			/**
			 * Find the _Fields constant that matches fieldId, throwing an exception if it
			 * is not found.
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

		public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
		static {
			java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
					_Fields.class);
			metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
			org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(version_args.class, metaDataMap);
		}

		public version_args() {
		}

		/**
		 * Performs a deep copy on <i>other</i>.
		 */
		public version_args(version_args other) {
		}

		public version_args deepCopy() {
			return new version_args(this);
		}

		@Override
		public void clear() {
		}

		public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
			switch (field) {
			}
		}

		@org.apache.thrift.annotation.Nullable
		public java.lang.Object getFieldValue(_Fields field) {
			switch (field) {
			}
			throw new java.lang.IllegalStateException();
		}

		/**
		 * Returns true if field corresponding to fieldID is set (has been assigned a
		 * value) and false otherwise
		 */
		public boolean isSet(_Fields field) {
			if (field == null) {
				throw new java.lang.IllegalArgumentException();
			}

			switch (field) {
			}
			throw new java.lang.IllegalStateException();
		}

		@Override
		public boolean equals(java.lang.Object that) {
			if (that == null)
				return false;
			if (that instanceof version_args)
				return this.equals((version_args) that);
			return false;
		}

		public boolean equals(version_args that) {
			if (that == null)
				return false;
			if (this == that)
				return true;

			return true;
		}

		@Override
		public int hashCode() {
			int hashCode = 1;

			return hashCode;
		}

		@Override
		public int compareTo(version_args other) {
			if (!getClass().equals(other.getClass())) {
				return getClass().getName().compareTo(other.getClass().getName());
			}

			int lastComparison = 0;

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
			java.lang.StringBuilder sb = new java.lang.StringBuilder("version_args(");
			boolean first = true;

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

		private void readObject(java.io.ObjectInputStream in)
				throws java.io.IOException, java.lang.ClassNotFoundException {
			try {
				read(new org.apache.thrift.protocol.TCompactProtocol(
						new org.apache.thrift.transport.TIOStreamTransport(in)));
			}
			catch (org.apache.thrift.TException te) {
				throw new java.io.IOException(te);
			}
		}

		private static class version_argsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

			public version_argsStandardScheme getScheme() {
				return new version_argsStandardScheme();
			}

		}

		private static class version_argsStandardScheme extends org.apache.thrift.scheme.StandardScheme<version_args> {

			public void read(org.apache.thrift.protocol.TProtocol iprot, version_args struct)
					throws org.apache.thrift.TException {
				org.apache.thrift.protocol.TField schemeField;
				iprot.readStructBegin();
				while (true) {
					schemeField = iprot.readFieldBegin();
					if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
						break;
					}
					switch (schemeField.id) {
					default:
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					iprot.readFieldEnd();
				}
				iprot.readStructEnd();

				// check for required fields of primitive type, which can't be checked in
				// the validate method
				struct.validate();
			}

			public void write(org.apache.thrift.protocol.TProtocol oprot, version_args struct)
					throws org.apache.thrift.TException {
				struct.validate();

				oprot.writeStructBegin(STRUCT_DESC);
				oprot.writeFieldStop();
				oprot.writeStructEnd();
			}

		}

		private static class version_argsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

			public version_argsTupleScheme getScheme() {
				return new version_argsTupleScheme();
			}

		}

		private static class version_argsTupleScheme extends org.apache.thrift.scheme.TupleScheme<version_args> {

			@Override
			public void write(org.apache.thrift.protocol.TProtocol prot, version_args struct)
					throws org.apache.thrift.TException {
				org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			}

			@Override
			public void read(org.apache.thrift.protocol.TProtocol prot, version_args struct)
					throws org.apache.thrift.TException {
				org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
			}

		}

		private static <S extends org.apache.thrift.scheme.IScheme> S scheme(
				org.apache.thrift.protocol.TProtocol proto) {
			return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
					: TUPLE_SCHEME_FACTORY).getScheme();
		}

	}

	public static class version_result implements org.apache.thrift.TBase<version_result, version_result._Fields>,
			java.io.Serializable, Cloneable, Comparable<version_result> {

		private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
				"version_result");

		private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField(
				"success", org.apache.thrift.protocol.TType.STRUCT, (short) 0);

		private static final org.apache.thrift.protocol.TField ERR_FIELD_DESC = new org.apache.thrift.protocol.TField(
				"err", org.apache.thrift.protocol.TType.STRUCT, (short) 1);

		private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new version_resultStandardSchemeFactory();

		private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new version_resultTupleSchemeFactory();

		public @org.apache.thrift.annotation.Nullable Version success; // required

		public @org.apache.thrift.annotation.Nullable Error err; // required

		/**
		 * The set of fields this struct contains, along with convenience methods for
		 * finding and manipulating them.
		 */
		public enum _Fields implements org.apache.thrift.TFieldIdEnum {

			SUCCESS((short) 0, "success"), ERR((short) 1, "err");

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
				case 0: // SUCCESS
					return SUCCESS;
				case 1: // ERR
					return ERR;
				default:
					return null;
				}
			}

			/**
			 * Find the _Fields constant that matches fieldId, throwing an exception if it
			 * is not found.
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
			tmpMap.put(_Fields.SUCCESS,
					new org.apache.thrift.meta_data.FieldMetaData("success",
							org.apache.thrift.TFieldRequirementType.DEFAULT,
							new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT,
									Version.class)));
			tmpMap.put(_Fields.ERR,
					new org.apache.thrift.meta_data.FieldMetaData("err",
							org.apache.thrift.TFieldRequirementType.DEFAULT,
							new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT,
									Error.class)));
			metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
			org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(version_result.class, metaDataMap);
		}

		public version_result() {
		}

		public version_result(Version success, Error err) {
			this();
			this.success = success;
			this.err = err;
		}

		/**
		 * Performs a deep copy on <i>other</i>.
		 */
		public version_result(version_result other) {
			if (other.isSetSuccess()) {
				this.success = new Version(other.success);
			}
			if (other.isSetErr()) {
				this.err = new Error(other.err);
			}
		}

		public version_result deepCopy() {
			return new version_result(this);
		}

		@Override
		public void clear() {
			this.success = null;
			this.err = null;
		}

		@org.apache.thrift.annotation.Nullable
		public Version getSuccess() {
			return this.success;
		}

		public version_result setSuccess(@org.apache.thrift.annotation.Nullable Version success) {
			this.success = success;
			return this;
		}

		public void unsetSuccess() {
			this.success = null;
		}

		/**
		 * Returns true if field success is set (has been assigned a value) and false
		 * otherwise
		 */
		public boolean isSetSuccess() {
			return this.success != null;
		}

		public void setSuccessIsSet(boolean value) {
			if (!value) {
				this.success = null;
			}
		}

		@org.apache.thrift.annotation.Nullable
		public Error getErr() {
			return this.err;
		}

		public version_result setErr(@org.apache.thrift.annotation.Nullable Error err) {
			this.err = err;
			return this;
		}

		public void unsetErr() {
			this.err = null;
		}

		/**
		 * Returns true if field err is set (has been assigned a value) and false
		 * otherwise
		 */
		public boolean isSetErr() {
			return this.err != null;
		}

		public void setErrIsSet(boolean value) {
			if (!value) {
				this.err = null;
			}
		}

		public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
			switch (field) {
			case SUCCESS:
				if (value == null) {
					unsetSuccess();
				}
				else {
					setSuccess((Version) value);
				}
				break;

			case ERR:
				if (value == null) {
					unsetErr();
				}
				else {
					setErr((Error) value);
				}
				break;

			}
		}

		@org.apache.thrift.annotation.Nullable
		public java.lang.Object getFieldValue(_Fields field) {
			switch (field) {
			case SUCCESS:
				return getSuccess();

			case ERR:
				return getErr();

			}
			throw new java.lang.IllegalStateException();
		}

		/**
		 * Returns true if field corresponding to fieldID is set (has been assigned a
		 * value) and false otherwise
		 */
		public boolean isSet(_Fields field) {
			if (field == null) {
				throw new java.lang.IllegalArgumentException();
			}

			switch (field) {
			case SUCCESS:
				return isSetSuccess();
			case ERR:
				return isSetErr();
			}
			throw new java.lang.IllegalStateException();
		}

		@Override
		public boolean equals(java.lang.Object that) {
			if (that == null)
				return false;
			if (that instanceof version_result)
				return this.equals((version_result) that);
			return false;
		}

		public boolean equals(version_result that) {
			if (that == null)
				return false;
			if (this == that)
				return true;

			boolean this_present_success = true && this.isSetSuccess();
			boolean that_present_success = true && that.isSetSuccess();
			if (this_present_success || that_present_success) {
				if (!(this_present_success && that_present_success))
					return false;
				if (!this.success.equals(that.success))
					return false;
			}

			boolean this_present_err = true && this.isSetErr();
			boolean that_present_err = true && that.isSetErr();
			if (this_present_err || that_present_err) {
				if (!(this_present_err && that_present_err))
					return false;
				if (!this.err.equals(that.err))
					return false;
			}

			return true;
		}

		@Override
		public int hashCode() {
			int hashCode = 1;

			hashCode = hashCode * 8191 + ((isSetSuccess()) ? 131071 : 524287);
			if (isSetSuccess())
				hashCode = hashCode * 8191 + success.hashCode();

			hashCode = hashCode * 8191 + ((isSetErr()) ? 131071 : 524287);
			if (isSetErr())
				hashCode = hashCode * 8191 + err.hashCode();

			return hashCode;
		}

		@Override
		public int compareTo(version_result other) {
			if (!getClass().equals(other.getClass())) {
				return getClass().getName().compareTo(other.getClass().getName());
			}

			int lastComparison = 0;

			lastComparison = java.lang.Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
			if (lastComparison != 0) {
				return lastComparison;
			}
			if (isSetSuccess()) {
				lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
				if (lastComparison != 0) {
					return lastComparison;
				}
			}
			lastComparison = java.lang.Boolean.valueOf(isSetErr()).compareTo(other.isSetErr());
			if (lastComparison != 0) {
				return lastComparison;
			}
			if (isSetErr()) {
				lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.err, other.err);
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
			java.lang.StringBuilder sb = new java.lang.StringBuilder("version_result(");
			boolean first = true;

			sb.append("success:");
			if (this.success == null) {
				sb.append("null");
			}
			else {
				sb.append(this.success);
			}
			first = false;
			if (!first)
				sb.append(", ");
			sb.append("err:");
			if (this.err == null) {
				sb.append("null");
			}
			else {
				sb.append(this.err);
			}
			first = false;
			sb.append(")");
			return sb.toString();
		}

		public void validate() throws org.apache.thrift.TException {
			// check for required fields
			// check for sub-struct validity
			if (success != null) {
				success.validate();
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

		private void readObject(java.io.ObjectInputStream in)
				throws java.io.IOException, java.lang.ClassNotFoundException {
			try {
				read(new org.apache.thrift.protocol.TCompactProtocol(
						new org.apache.thrift.transport.TIOStreamTransport(in)));
			}
			catch (org.apache.thrift.TException te) {
				throw new java.io.IOException(te);
			}
		}

		private static class version_resultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

			public version_resultStandardScheme getScheme() {
				return new version_resultStandardScheme();
			}

		}

		private static class version_resultStandardScheme
				extends org.apache.thrift.scheme.StandardScheme<version_result> {

			public void read(org.apache.thrift.protocol.TProtocol iprot, version_result struct)
					throws org.apache.thrift.TException {
				org.apache.thrift.protocol.TField schemeField;
				iprot.readStructBegin();
				while (true) {
					schemeField = iprot.readFieldBegin();
					if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
						break;
					}
					switch (schemeField.id) {
					case 0: // SUCCESS
						if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
							struct.success = new Version();
							struct.success.read(iprot);
							struct.setSuccessIsSet(true);
						}
						else {
							org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
						}
						break;
					case 1: // ERR
						if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
							struct.err = new Error();
							struct.err.read(iprot);
							struct.setErrIsSet(true);
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

				// check for required fields of primitive type, which can't be checked in
				// the validate method
				struct.validate();
			}

			public void write(org.apache.thrift.protocol.TProtocol oprot, version_result struct)
					throws org.apache.thrift.TException {
				struct.validate();

				oprot.writeStructBegin(STRUCT_DESC);
				if (struct.success != null) {
					oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
					struct.success.write(oprot);
					oprot.writeFieldEnd();
				}
				if (struct.err != null) {
					oprot.writeFieldBegin(ERR_FIELD_DESC);
					struct.err.write(oprot);
					oprot.writeFieldEnd();
				}
				oprot.writeFieldStop();
				oprot.writeStructEnd();
			}

		}

		private static class version_resultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {

			public version_resultTupleScheme getScheme() {
				return new version_resultTupleScheme();
			}

		}

		private static class version_resultTupleScheme extends org.apache.thrift.scheme.TupleScheme<version_result> {

			@Override
			public void write(org.apache.thrift.protocol.TProtocol prot, version_result struct)
					throws org.apache.thrift.TException {
				org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
				java.util.BitSet optionals = new java.util.BitSet();
				if (struct.isSetSuccess()) {
					optionals.set(0);
				}
				if (struct.isSetErr()) {
					optionals.set(1);
				}
				oprot.writeBitSet(optionals, 2);
				if (struct.isSetSuccess()) {
					struct.success.write(oprot);
				}
				if (struct.isSetErr()) {
					struct.err.write(oprot);
				}
			}

			@Override
			public void read(org.apache.thrift.protocol.TProtocol prot, version_result struct)
					throws org.apache.thrift.TException {
				org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
				java.util.BitSet incoming = iprot.readBitSet(2);
				if (incoming.get(0)) {
					struct.success = new Version();
					struct.success.read(iprot);
					struct.setSuccessIsSet(true);
				}
				if (incoming.get(1)) {
					struct.err = new Error();
					struct.err.read(iprot);
					struct.setErrIsSet(true);
				}
			}

		}

		private static <S extends org.apache.thrift.scheme.IScheme> S scheme(
				org.apache.thrift.protocol.TProtocol proto) {
			return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY
					: TUPLE_SCHEME_FACTORY).getScheme();
		}

	}

}
