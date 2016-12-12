package de.schmitz.java.codewars.kyu6.findodd;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOdd {
	
	public static int findIt(int[] A) {
        Map<Integer, Long> occurences = Arrays.stream(A).boxed().collect(
        		Collectors.groupingBy(Function.identity(), Collectors.counting()));
                
        return occurences.keySet().stream()
        		.filter(key -> occurences.get(key) % 2 == 1)
        		.findFirst().get();
	}
	
}
