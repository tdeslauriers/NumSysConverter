package com.tom.NumSysConverter.service;

public class ConvertImpl implements Convert{
	
	public String binToDec(String inputValue) {
		
		Integer decimal = Integer.parseInt(inputValue, 2);
		return decimal.toString();
	}

	public String binToHex(String inputValue) {
		
		Integer decimal = Integer.parseInt(inputValue, 2);
		String hexStr = Integer.toString(decimal, 16);
		return hexStr;
	}
	
	public String decToBin(String inputValue) {
		
		Integer input = Integer.parseInt(inputValue);
		String i = Integer.toString(input, 2);
		return i;		
	}	
	
	public String decToHex(String inputValue) {
		
		Integer input = Integer.parseInt(inputValue);
		String i = Integer.toString(input, 16);
		return i;
	}
	
	public String hexToBin(String inputValue) {
		
		Integer input = Integer.parseInt(inputValue, 16);
		String i = Integer.toString(input, 2);
		return i;
	}
	
	public String hexToDec(String inputValue) {
		
		Integer input = Integer.parseInt(inputValue, 16);
		String i = Integer.toString(input);
		return i;
	}
}
