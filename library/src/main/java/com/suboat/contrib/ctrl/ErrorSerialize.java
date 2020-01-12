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
