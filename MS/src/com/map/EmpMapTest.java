package com.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EmpMapTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Satish");
        Employee e2 = new Employee(101, "Satish");

        System.out.println(e1.equals(e2));
        Map<Employee, Integer> map = new HashMap<>();
        map.put(e1, 1);
        map.put(e2, 2);
        System.out.println("\n "+map);

        HashSet<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);

        System.out.println(set.size());
    }
}
