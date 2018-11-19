package com.tom.NumSysConverter;

import com.tom.NumSysConverter.service.Handler;
import com.tom.NumSysConverter.service.HandlerImpl;

/**
 * Number System Converter for top 3
 * Binary, Decimal, Hexadecimal
 * Will be able to convert between any of the three.
 * These operations are core library methods, this is just for fun.
 * Includes basic error handling/input validation.
 */
public class App {
		
	 public static void main( String[] args ){
        
		 Handler handler = new HandlerImpl();
		 System.out.println(handler.optionExecution(args));
    }
}
