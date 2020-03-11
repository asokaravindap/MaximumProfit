package com.latitude.stockprofit;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.latitude.stockprofit.exception.EmptyArrayException;
import com.latitude.stockprofit.exception.NegativeElementInArrayException;
import com.latitude.stockprofit.exception.NoProfitException;
import com.latitude.stockprofit.exception.NotSufficientElementsException;
import com.latitude.stockprofit.util.Constants;

/**
 * 
 * @author Asok 
 * This is the LatitudeStock class which provides a method to calculate the maximum profit in Latitude stocks
 */
public class LatitudeStock {

    private static final Logger LOGGER = Logger.getLogger(LatitudeStock.class.getName());

	/**
	 * getMaximumProfit method calculates the maximum profit from a stocks values collected at each minute
	 * @param stocks array which contains the stock prices
	 * @return maximum Profit
	 * @throws NoProfitException 
	 * @throws NegativeElementInArrayException 
	 * @throws EmptyArrayException 
	 * @throws NotSufficientElementsException 
	 */
	public int getMaximumProfit(int[] stocks) throws NoProfitException, NotSufficientElementsException, EmptyArrayException, NegativeElementInArrayException {
			
		LOGGER.info("Validating stocks array : " + Arrays.toString(stocks));

		//validates the stock array
		validateStocks(stocks);
		
		LOGGER.info("Stocks array is valid");
		
		int stocksLength = stocks.length;		
		int maxProfit = Integer.MIN_VALUE;		
		int tempMax = stocks[stocksLength-1];	
		
		LOGGER.info("Calculating maximum profit");
		
		// tail to head array traversing to ensure buy before sell behavior
		for (int i = stocksLength - 2; i >= 0; i--)
		{
			
			if (stocks[i] > tempMax) {
				// update intermediate maximum value
				tempMax = stocks[i];
			}
			else {
				// update the intermediate maximum profit value
				maxProfit = Integer.max(maxProfit, tempMax - stocks[i]);
			}
		}

		// check if a profit is calculated properly based on the given values in the stocks array
		if(maxProfit == Integer.MIN_VALUE) {
			
			LOGGER.log(Level.SEVERE,"A profit cannot be calculated from the given stocks array");
			
			// throw NoProfitException
			throw new NoProfitException(Constants.NOPROFITEXCEPTION_MESSAGE);
		}
		
		LOGGER.info("Maximum Profit : " + maxProfit);
		
		// after the loop, the calculated maximum profit is returned
		return maxProfit;
	}
	
	/**
	 * validateStocks method validates the stocks array values
	 * @param stocks
	 * @throws NotSufficientElementsException
	 * @throws EmptyArrayException
	 * @throws NegativeElementInArrayException 
	 */
	private void validateStocks(int[] stocks) throws NotSufficientElementsException, EmptyArrayException, NegativeElementInArrayException {
		
		// check if the stocks array is null or empty
		if((null == stocks) || (stocks.length == 0)) {
			
			LOGGER.log(Level.SEVERE,"Stocks array is null or empty");
			
			//throw EmptyArrayException
			throw new EmptyArrayException(Constants.EMPTYARRAYEXCEPTION_MESSAGE);
		}
		
		// check if the stocks array doesn't have sufficient elements
		if((stocks.length < 2)) {
	 
			LOGGER.log(Level.SEVERE,"Stocks array doesn't have sufficient elements");
			
			//throw NotSufficientElementsException 
			throw new NotSufficientElementsException(Constants.NOTSUFFICIENTELEMENTSEXCEPTION_MESSAGE);
		}
		
		// check if the stocks array contains negative prices
		if(Arrays.stream(stocks).anyMatch(i -> i < 0)) {
	    	
	    	LOGGER.log(Level.SEVERE,"Stocks array contains negative price(s)");
	    	
	    	//throw NegativeElementInArrayException
	    	throw new NegativeElementInArrayException(Constants.NEGATIVEELEMENTINARRAYEXCEPTION_MESSAGE);
	    }		
	}
	
}