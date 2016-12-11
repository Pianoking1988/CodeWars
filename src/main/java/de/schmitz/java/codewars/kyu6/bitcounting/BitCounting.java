package de.schmitz.java.codewars.kyu6.bitcounting;

public class BitCounting {

	public static int countBits(int n){
		return (int) Integer.toBinaryString(n).chars()
				.mapToLong(c -> (char) c)
				.filter(c -> ((char) c) == '1')
				.count();
	}
	
}
