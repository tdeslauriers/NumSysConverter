package com.tom.NumSysConverter.service;

import com.tom.NumSysConverter.model.Boilerplate;

public class HandlerImpl implements Handler {

	public InputValidation iv = new InputValidationImpl();
	public Convert convert = new ConvertImpl();
	public Boilerplate bp = new Boilerplate();
		
	public String optionExecution(String[] args) {
		
		String arg0 = args[0];
		String arg1 = args[1];
		NumSysEnum option = NumSysEnum.valueOf(arg0);
		
		if (!iv.inputValArgsCount(args)
				&& !iv.inputValFirstArg(arg0)
				&& !iv.inputValSecondArg(arg1)) {
			
			return bp.getErrorText() + "\n\n" + bp.getHelpText();
		} else {
			
			switch (option) {
				case b:
					if (!iv.inputValBinary(arg1)) {
						return bp.getErrorText() + "\n\n" + bp.getHelpText();
					} else {
						String result = "\n" + bp.getConversionText() 
							+	"\n\t" + bp.getDecText() + convert.binToDec(arg1) 
							+ "\n\t" + bp.getHexText() + convert.binToHex(arg1);
						return result;
					}
				case d:
					if (!iv.inputValDecimal(arg1)) {
						return bp.getErrorText() + "\n\n" + bp.getHelpText();
					} else {
						String result = "\n" + bp.getConversionText() 
							+ "\n\t" + bp.getBinText() + convert.decToBin(arg1)
							+ "\n\t" + bp.getHexText() + convert.decToHex(arg1);
						return result;
					}
				case h:
					if (!iv.inputValHex(arg1)) {
						return bp.getErrorText() + "\n\n" + bp.getHelpText();
					} else {
						String result = "\n\n" + bp.getConversionText()
							+ "\n\t" + bp.getBinText() + convert.hexToBin(arg1)
							+ "\n\t" + bp.getDecText() + convert.hexToDec(arg1);
						return result;
					}
				case help:
					return bp.getHelpText();
				default:
					throw new IllegalArgumentException(
							bp.getErrorText() + "\n\n" + bp.getHelpText());
			}
		}
	}
}
