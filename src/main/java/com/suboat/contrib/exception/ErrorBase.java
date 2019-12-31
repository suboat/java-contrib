package com.suboat.contrib.exception;

import java.text.MessageFormat;

public class ErrorBase extends RuntimeException {

	protected Integer code = 0;

	protected String prefix = "base";

	protected String detail = "error";

	protected Object[] arguments;

	private String message;

	public ErrorBase(Object... args) {
		super("baseError");
		this.arguments = args;
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
