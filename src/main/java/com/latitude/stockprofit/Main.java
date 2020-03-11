package com.latitude.stockprofit;

public class Main {

	public static void main(String[] args) {

		// creating latitudeStock object
		LatitudeStock latitudeStock = new LatitudeStock();
		
		// sample stock array
		int[] stocks = new int[]{1,3,5,10}; 
		
		try {
			// printing the maximum profit 
			System.out.println(latitudeStock.getMaximumProfit(stocks));
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
