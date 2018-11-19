package com.tom.NumSysConverter.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.tom.NumSysConverter.model.Boilerplate;

public class InputValidationImpl implements InputValidation {
	
	@Override
	public Boolean inputValArgsCount(String[] args) {
		
		if (args.length == 2) {
			return true;
		} else {
		return false; 
		}
	}	
	
	@Override
	public Boolean inputValFirstArg(String arg) {
		
		Boolean outcome = false;
		for (NumSysEnum choice : NumSysEnum.values()) {
			if (choice.equals(arg)) {
				outcome = true;
				break;
			} else {
				outcome = false;
			}
		}
		return outcome;
	}	
	
	@Override
	public Boolean inputValSecondArg(String arg) {
		
		String regex = "^[A-Fa-f0-9 ]++$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(arg);
		
		if (matcher.matches() && arg.length() < 100) {
			return true;
		} else {
			return false;
		}
	}
			
	@Override
	public Boolean inputValBinary(String arg) {
		
		String regex = "[0-1]++$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(arg);
		
		if (matcher.matches() && !arg.startsWith("0") && arg.length() < 100) {
			return true;
		} else {
			return false;
		}		
	}
	
	@Override
	public Boolean inputValDecimal(String arg) {
		
		String regex = "[0-9]++$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(arg);
		
		if (matcher.matches() && arg.length() < 100) {
			return true;
		} else {
			return false;
		}		
	}
	
	@Override
	public Boolean inputValHex(String arg) {
		
		String regex = "[a-fA-F0-9]++$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(arg);
		
		if (matcher.matches() && arg.length() < 100) {
			return true;
		} else {
			return false;
		}		
	}

}
