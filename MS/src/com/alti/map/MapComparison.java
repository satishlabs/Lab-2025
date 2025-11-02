package com.alti.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapComparison {
    public static void main(String[] args) {
        Map<String,Integer> hashtable = new Hashtable<>();
        Map<String, Integer> syncMap = Collections.synchronizedMap(new HashMap<>());
        Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        hashtable.put("A",1);
        syncMap.put("B", 2);
        concurrentMap.put("C", 3);

        System.out.println("Hashtable: " + hashtable);
        System.out.println("SynchronizedMap: " + syncMap);
        System.out.println("ConcurrentHashMap: " + concurrentMap);
    }
}
