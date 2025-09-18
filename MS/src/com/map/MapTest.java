package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		
		map.put(1, new Student(1, "Satihs"));
		map.put(1, new Student(1, "Ranjit"));
		
		System.out.println(map);
		
		System.out.println("\n===========================");
		Map<Student, Integer> map1 = new HashMap<Student, Integer>();
		map1.put(new Student(1, "Satish"), 1);
		map1.put(new Student(1, "Satish"), 2);
		
		System.out.println(map1);
	}
}
