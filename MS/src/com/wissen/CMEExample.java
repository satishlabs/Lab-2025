package com.wissen;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CMEExample {
    public static void main(String[] args) {

        Map<String, String> map = new ConcurrentHashMap<>();
        map.put("India", "AA");
        map.put("AUS", "BB");
        map.put("Nepal", "CC");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getKey().equals("India")) {
                map.put("Japan", "AA"); // ✅ safe now
                map.put("Sri", "DD");
            }
        }

        System.out.println(map);
    }
}