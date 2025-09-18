package com.arr;

public class FirstOccurrenceFinder {
	public static void main(String[] args) {
		int[] nums = {4,5,6,7,5,8};
		int index = findFirstOccurence(nums,8);
		System.out.println("First occurence index: "+index);
	}

	private static int findFirstOccurence(int[] arr, int element) {
		if(arr == null || arr.length == 0)
			return -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == element) {
				return i;
			}
		}
		return -1;
	}
}
