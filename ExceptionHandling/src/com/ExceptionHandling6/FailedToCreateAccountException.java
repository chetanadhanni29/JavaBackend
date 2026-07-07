package com.ExceptionHandling6;

public class FailedToCreateAccountException extends RuntimeException {
	FailedToCreateAccountException(String msg) {
		super(msg);
	}
}