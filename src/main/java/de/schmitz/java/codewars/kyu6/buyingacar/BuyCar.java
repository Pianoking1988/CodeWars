package de.schmitz.java.codewars.kyu6.buyingacar;

public class BuyCar {
	
	public static int[] nbMonths(int startPriceOld, int startPriceNew,
			int savingperMonth, double percentLossByMonth) {
		double priceOld = startPriceOld;
		double priceNew = startPriceNew;
		
		int currentSavings = 0;
		int currentMonth = 0;
		while (priceOld + currentSavings < priceNew) {
			currentSavings += savingperMonth;
			percentLossByMonth += currentMonth % 2 * 0.5;
			priceOld *= (1 - percentLossByMonth / 100.0);
			priceNew *= (1 - percentLossByMonth / 100.0);
			currentMonth++;
		}
		
		return new int[] { currentMonth, (int) Math.round(priceOld + currentSavings - priceNew)};
	}
	
}
