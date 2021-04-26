package com.suboat.contrib.ctrl;

import com.suboat.contrib.error.ErrorBase;
import com.suboat.contrib.rpc.base.Error;
import graphql.ErrorType;
import graphql.ExceptionWhileDataFetching;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.List;
import java.util.Map;

// 序列化错误
public class ErrorSerialize implements GraphQLError {

	private GraphQLError error;

	private String message;

	public ErrorSerialize(GraphQLError error) {
		this.error = error;
		if (error instanceof ExceptionWhileDataFetching) {
			Throwable throwable = ((ExceptionWhileDataFetching) error).getException();
			if (throwable instanceof Error) {
				// 是RPC错误
				Error errorRpc = (Error) throwable;
				this.message = String.format("%s%d|%s", errorRpc.getPrefix(), errorRpc.getCode(), errorRpc.getDetail());
			}
			else if (throwable instanceof ErrorBase) {
				// 是标准错误
				ErrorBase errorBase = (ErrorBase) throwable;
				this.message = errorBase.getMessage();
			}
			else if (throwable instanceof NullPointerException) {
				Exception errNull = (NullPointerException) throwable;
				if (errNull.getStackTrace().length > 0) {
					String[] att = errNull.getStackTrace()[0].toString().split("\\.");
					if (att.length >= 2) {
						this.message = String.format("空指针|%s.%s", att[att.length - 2], att[att.length - 1]);
					}
				}
			}
			else if (throwable instanceof Exception) {
				Exception errExcept = (Exception) throwable;
				if (errExcept.getStackTrace().length > 0) {
					String[] att = errExcept.getStackTrace()[0].toString().split("\\.");
					if (att.length >= 2) {
						this.message = String.format("程序错误|%s.%s", att[att.length - 2], att[att.length - 1]);
					}
				}
			}
		}
		else {
			this.message = "内部错误";
		}
	}

	@Override
	public Map<String, Object> getExtensions() {
		return error.getExtensions();
	}

	@Override
	public List<SourceLocation> getLocations() {
		return error.getLocations();
	}

	@Override
	public ErrorType getErrorType() {
		return (ErrorType) error.getErrorType();
	}

	@Override
	public List<Object> getPath() {
		return error.getPath();
	}

	@Override
	public Map<String, Object> toSpecification() {
		Map<String, Object> ret = error.toSpecification();
		// 自定义错误格式
		if (this.message != null && this.message.length() > 0) {
			ret.put("message", this.message);
		}
		return ret;
	}

	@Override
	public String getMessage() {
		if (this.message != null && this.message.length() > 0) {
			return this.message;
		}
		else {
			return (error instanceof ExceptionWhileDataFetching)
					? ((ExceptionWhileDataFetching) error).getException().getMessage() : error.getMessage();
		}
	}

}
