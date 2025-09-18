package com.ip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FindKeyValueGiven {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "Fruit");
		map.put("B", "Fruit");
		map.put("C", "Vegetable");
		
		//1. Linear search (get first matching key)
		String valueToFind = "Fruit";
		String key = getKeyByValue(map, valueToFind);
		System.out.println("Linear Search - Key for value : "+valueToFind+" 'is: "+key);
		
		
		 // 2. Reverse map (assuming values are unique)
        Map<String, String> reverseMap = buildReverseMap(map);
        System.out.println("Reverse Map (unique values): " + reverseMap);
        System.out.println("Get key using reverse map: " + reverseMap.get("Vegetable"));
        
        // 3. Reverse map with duplicate values
        Map<String, List<String>> reverseMultiMap = buildMultiValueReverseMap(map);
        System.out.println("Reverse Map (duplicate values): " + reverseMultiMap);
        System.out.println("Keys for value 'Fruit': " + reverseMultiMap.get("Fruit"));
	}






	private static String getKeyByValue(Map<String, String> map, String value) {
		for(Entry<String, String> entry : map.entrySet()) {
			if(value.equals(entry.getValue())) {
				return entry.getKey();
			}
		}
		return null;
	}






	//1. Linear Search O(n)
	/*
	 * public static <K, V> K getKeyByValue(Map<K, V> map, V value) {
	 * for(Map.Entry<K, V>entry : map.entrySet()) {
	 * if(value.equals(entry.getValue())) { return entry.getKey();// returns first
	 * match } } return null; }
	 */
	
	// 2. Reverse Map (value → key), assumes values are unique
    public static <K, V> Map<V, K> buildReverseMap(Map<K, V> map) {
        Map<V, K> reverseMap = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }
        return reverseMap;
    }
    
 // 3. Reverse Map (value → list of keys) to handle duplicate values
    /*public static <K, V> Map<V, List<K>> buildMultiValueReverseMap(Map<K, V> map) {
        Map<V, List<K>> reverseMultiMap = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            reverseMultiMap
                .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                .add(entry.getKey());
        }
        return reverseMultiMap;
    }*/
    
	private static Map<String, List<String>> buildMultiValueReverseMap(Map<String, String> map) {
		Map<String, List<String>> reverseMap = new HashMap<String, List<String>>();
		for(Map.Entry<String, String> entry : map.entrySet()) {
			reverseMap.computeIfAbsent(entry.getValue(), key -> new ArrayList<String>())
			.add(entry.getKey());
		}
		return reverseMap;
	}

}
