package com.suboat.contrib.error;

import lombok.Data;

import java.text.MessageFormat;

@Data
public class ErrorBase extends RuntimeException {

	protected int code = 0;

	protected String prefix = "base";

	protected String detail = "error";

	protected Object[] arguments;

	private String message;

	public ErrorBase(String prefix, int code, String detail) {
		super(String.format("%s%d|%s", prefix, code, detail));
		this.prefix = prefix;
		this.code = code;
		this.detail = detail;
	}

	public ErrorBase(Object... args) {
		super("baseError");
		this.arguments = args;
	}

	public ErrorBase() {
		super("baseError");
	}

	@Override
	public String getMessage() {
		if (this.message == null) {
			if (!this.detail.contains("{0}") && this.arguments.length > 0) {
				this.detail = this.detail + "|{0}";
			}
			MessageFormat txtFmt = new MessageFormat(this.detail);
			this.message = MessageFormat.format("{0}{1}|", this.prefix, this.code) + txtFmt.format(this.arguments);
		}
		return this.message;
	}

	@Override
	public Throwable fillInStackTrace() {
		return this;
	}

}
