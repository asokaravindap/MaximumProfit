package com.latitude.stockprofit.util;

/**
 * This is the constant class for defining the string messages for exceptions
 * @author Asok
 *
 */
public final class Constants {
	
	// exception message constant for 'no profit' scenario
	public static final String NOPROFITEXCEPTION_MESSAGE = "A profit cannot be found for the given stocks array";
	
	// exception message constant for the 'empty/null array' scenario
	public static final String EMPTYARRAYEXCEPTION_MESSAGE = "stocks array is null or empty";
	
	// exception message constant for 'not sufficient elements in array' scenario
	public static final String NOTSUFFICIENTELEMENTSEXCEPTION_MESSAGE = "stocks array do not have sufficient elements";
	
	// exception message constant for the 'negative element in array' scenario
	public static final String NEGATIVEELEMENTINARRAYEXCEPTION_MESSAGE = "stocks array has a negative price";


}
