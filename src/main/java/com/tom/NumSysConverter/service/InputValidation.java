package com.tom.NumSysConverter.service;

public interface InputValidation {
	
	// These methods perform input validation;
	Boolean inputValArgsCount(String[] args);
	Boolean inputValFirstArg(String arg);
	Boolean inputValSecondArg(String arg);
	Boolean inputValBinary(String arg);
	Boolean inputValDecimal(String arg);
	Boolean inputValHex(String arg);
	
}
