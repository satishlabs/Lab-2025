package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class NonRepeatedOrRepeatedCharInString {
	public static void main(String[] args) {
		String str = "SatishPrasad";
		char[] chars = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char ch: chars) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			
			}else {
				map.put(ch, 1);
			}
		}
		
		
		//map.forEach((k,v) -> System.out.println(k+" "+v));
		
		Optional<Character> first = map.entrySet().stream()
			.filter(e -> e.getValue()>1)
			.map(e -> e.getKey())
			.findFirst();
		if(first.isPresent()) {
			System.out.println(first.get()+" repeated: "+first);
		}
		System.out.println("\n========================");
		
		for(char ch:  chars) {
			if(ch != ' ') {
				map.put(ch, map.getOrDefault(ch, 0)+1);
			}
		}
		
		System.out.println(map);
	}
}
