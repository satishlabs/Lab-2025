package com.arr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ThirdMostRepeatedChar {
	public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'a', 'b', 'a', 'c', 'b', 'd', 'c', 'c', 'e'};
        
        //Step1: Count frequency of each character
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char ch : chars) {
        	map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
        //Step2: Sort by frequency
        List<Entry<Character, Integer>> sortedList = new ArrayList<>(map.entrySet());
        sortedList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        
        //Step3: Get the 3rd most repeated character
        if(sortedList.size() >= 3) {
        	Entry<Character, Integer> thirdMost = sortedList.get(2);
        	System.out.println("3rd most repeated character: '" + thirdMost.getKey() + 
                    "' occurred " + thirdMost.getValue() + " times");
        }else {
            System.out.println("Not enough unique characters to determine the 3rd most repeated.");
        }
	}
}
