package com.latitude.stockprofit.exception;

/**
 * NotSufficientElementsException is thrown when the stock array do not have sufficient elements for the function
 * @author Asok
 *
 */
public class NotSufficientElementsException extends Exception {
	
	/**
	 * NotSufficientElementsException constructor
	 * @param message
	 */
	public NotSufficientElementsException(String message) {
		super(message);
	}
}
