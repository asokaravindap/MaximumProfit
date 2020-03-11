import org.junit.jupiter.api.Test;
import com.latitude.stockprofit.LatitudeStock;
import com.latitude.stockprofit.exception.EmptyArrayException;
import com.latitude.stockprofit.exception.NegativeElementInArrayException;
import com.latitude.stockprofit.exception.NotSufficientElementsException;
import com.latitude.stockprofit.exception.NoProfitException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;

/**
 * 
 * @author Asok
 * This is the JUnit test class for LatitudeStock class
 */
public class TestLatitudeStock {
	
	/**
	 * Test case for testing the first success case
	 */
	@Test
    public void testFirstSuccessCase() {
		
		int[] stocks = new int[]{10,7,5,8,11,9}; 
		
		LatitudeStock latitudeStockTestObj = new LatitudeStock();
		
        try {
			assertEquals(6,latitudeStockTestObj.getMaximumProfit(stocks));
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	
	/**
	 * Test case for testing the second success case
	 */
	@Test
    public void testSecondSuccessCase() {
		
		int[] stocks = new int[]{2,3,3,4,4,1,1,1,1,5,11,11}; 
		
		LatitudeStock latitudeStockTestObj = new LatitudeStock();
		
        try {
			assertEquals(10,latitudeStockTestObj.getMaximumProfit(stocks));
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	
	/**
	 * Test case for testing Empty stocks array scenario
	 */
	@Test
	public void testFirstEmptyArrayException() {
		
		int[] stocks = new int[]{}; 
		LatitudeStock latitudeStockTestObj = new LatitudeStock();
		
		Assertions.assertThrows(EmptyArrayException.class, () -> {
			latitudeStockTestObj.getMaximumProfit(stocks);
		});
	 
	}
	
	/**
	 * Test case for testing null stocks array scenario
	 */
	@Test
	public void testSecondEmptyArrayException() {
		
		int[] stocks = null; 
		LatitudeStock latitudeStockTestObj = new LatitudeStock();
		
		Assertions.assertThrows(EmptyArrayException.class, () -> {
			latitudeStockTestObj.getMaximumProfit(stocks);
		});
	 
	}
	
	/**
	 * Test case for single element stocks array scenario
	 */
	@Test
	public void testNotSufficientElementsException() {
		
		int[] stocks = new int[]{1}; 
		LatitudeStock latitudeStockTestObj = new LatitudeStock();
		
		Assertions.assertThrows(NotSufficientElementsException.class, () -> {
			latitudeStockTestObj.getMaximumProfit(stocks);
		});
	 
	}
	
	/**
	 * Test case for negative values in stocks array scenario
	 */
	@Test
	public void testNegativeElementInArrayException() {
		
		int[] stocks = new int[]{10,7,5,8,-11,9}; 
		LatitudeStock latitudeStockTestObj = new LatitudeStock();
		
		Assertions.assertThrows(NegativeElementInArrayException.class, () -> {
			latitudeStockTestObj.getMaximumProfit(stocks);
		});
	 
	}
	
	/**
	 * Test case for a stocks array with no profit
	 */
	@Test
	public void testNoProfitException() {
		
		int[] stocks = new int[]{11,9,7,5,3,1}; 
		LatitudeStock latitudeStockTestObj = new LatitudeStock();
	
		Assertions.assertThrows(NoProfitException.class, () -> {
			latitudeStockTestObj.getMaximumProfit(stocks);
		});
	 
	}
}
