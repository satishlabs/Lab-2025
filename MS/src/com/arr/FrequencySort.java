package com.arr;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencySort {
	public static void main(String[] args) {
		int[] arr = {4, 6, 2, 4, 3, 2, 2, 4, 6, 5};
		
		 // Step 1: Count frequency
		Map<Integer, Long> frequencyMap = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		
		System.out.println(frequencyMap);
		List<Integer> sortedList = Arrays.stream(arr)
				.boxed()
				.sorted((a,b) ->{
					int freqCompare = frequencyMap.get(a).compareTo(frequencyMap.get(b));
					if(freqCompare != 0) {
						return freqCompare; //Sort by frequency first
					}
					return a.compareTo(b); //sort by value if frequency is same
				})
				.collect(Collectors.toList());
		System.out.println(sortedList);
	}
}
