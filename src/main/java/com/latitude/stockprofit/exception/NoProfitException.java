package com.latitude.stockprofit.exception;

/**
 * NoProfitException is thrown when the stock array do not have a profit in any buying and selling combination
 * @author Asok
 *
 */
public class NoProfitException extends Exception{
	
	/**
	 * NoProfitException constructor
	 * @param message
	 */
	public NoProfitException(String message) {
		super(message);
	}
}
