package com.ip;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class SecondLargestInArray {
	public static void main(String[] args) {
		int[] array = {12, 35, 1, 10, 34, 1};

        try {
                System.out.println("Original Array: " + Arrays.toString(array));
                System.out.println("\n===== All Ways to Find Second Largest =====");

                System.out.println("1. Iterative Method: " + findSecondLargest(array));
                System.out.println("2. Using Sorting: " + findSecondLargestUsingSorting(array));
               System.out.println("3. Using TreeSet: " + findSecondLargestUsingTreeSet(array));
               System.out.println("4. Using Streams: " + findSecondLargestUsingStreams(array));
               System.out.println("5. Using PriorityQueue: " + findSecondLargestUsingHeap(array));

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
	}
        	

	// 1. Iterative method
	private static int findSecondLargest(int[] array) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for(int num : array) {
			if(num > first) {
				second = first;
				first = num;
			}else if( num > second && num != first) {
				second = num;
			}
		}
		return second;
	}
	
	 // 2. Using sorting
	private static int findSecondLargestUsingSorting(int[] arr) {
		if(arr == null || arr.length < 2) {
			throw new IllegalArgumentException("Array must have at least two elements.");
		}
		
		int[] copy = Arrays.copyOf(arr, arr.length); // To avoid modifying original
		Arrays.sort(copy); // Ascending order
		
		for(int i = copy.length-2; i >= 0 ; i--) {
			if(copy[i] != copy[copy.length-1]) {
				return copy[i];
			}
		}
		 throw new RuntimeException("No second largest element found.");
	}
	
	 // 3. Using TreeSet (removes duplicates and sorts)
	 private static int findSecondLargestUsingTreeSet(int[] arr) {
		 	TreeSet<Integer> ts = new TreeSet<Integer>();
		 	for(int num : arr)
		 		ts.add(num);
		 	if(ts.size() < 2) {
		 		throw new RuntimeException("No Second largest element found");
		 	}
		 	ts.remove(ts.last());
		 	
			return ts.last();
		}
	 
	// 4. Using Streams
	 private static int findSecondLargestUsingStreams(int[] arr) {
			return Arrays.stream(arr)
					.boxed()
					.distinct()
					.sorted(Comparator.reverseOrder())
					.skip(1)
					.findFirst()
					.orElseThrow(() -> new RuntimeException("No second largest element found."));
		}
	 
	    // 5. Using PriorityQueue (Max Heap)
		private static int findSecondLargestUsingHeap(int[] arr) {
			PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
			for(int num : arr) {
				maxHeap.offer(num);
			}
			int largest = maxHeap.poll();
			while(!maxHeap.isEmpty()) {
				int next = maxHeap.poll();
				if(next != largest) {
					return next;
				}
			}
			throw new RuntimeException("No Second largest element found");
		}
		
}
