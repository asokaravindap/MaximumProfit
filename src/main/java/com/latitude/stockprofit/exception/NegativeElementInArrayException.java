package com.latitude.stockprofit.exception;

/**
 * NegativeElementInArrayException is thrown when there are negative prices in the stock array
 * @author Asok
 *
 */
public class NegativeElementInArrayException extends Exception {
	
	/**
	 * NegativeElementInArrayException constructor
	 * @param message
	 */
	public NegativeElementInArrayException(String message) {
		super(message);
	}
}
