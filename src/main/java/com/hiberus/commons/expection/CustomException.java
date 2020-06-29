package com.hiberus.commons.expection;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CustomException extends Exception {

	private static final long serialVersionUID = -6628372263603848109L;
	private final Integer httpStatus;
	private final String message;

	public CustomException(Integer httpStatus, String message) {
		this.httpStatus = httpStatus;
		this.message = message;
	}

	public CustomException(Integer httpStatus, Enum<?> message) {
		this.httpStatus = httpStatus;
		this.message = message.name();
	}

	public Integer getHttpStatus() {
		return httpStatus;
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public synchronized Throwable fillInStackTrace() {
		return this;
	}

}
