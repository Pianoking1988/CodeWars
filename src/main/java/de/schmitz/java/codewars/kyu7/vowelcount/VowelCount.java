package de.schmitz.java.codewars.kyu7.vowelcount;

import java.util.Arrays;

public class VowelCount {
	
	public static int getCount(String str) {
		String withoutVowels = str
				.replace("a", "")
				.replace("e", "")
				.replace("i", "")
				.replace("o", "")
				.replace("u", "");

		return str.length() - 
				withoutVowels.length();
	}
	
}
