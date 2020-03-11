package com.latitude.stockprofit.exception;

/**
 * EmptyArrayException is thrown when the stock array is empty or null
 * @author Asok
 *
 */
public class EmptyArrayException extends Exception{
	
	/**
	 * EmptyArrayException constructor
	 * @param message
	 */
	public EmptyArrayException(String message) {
		super(message);
	}
}
