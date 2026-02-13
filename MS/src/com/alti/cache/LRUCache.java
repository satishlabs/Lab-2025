package com.alti.cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
       return size()>capacity;
    }


    static void main() {
        LRUCache<Integer, String> cache = new LRUCache<>(3);
        cache.put(1, "A");
        cache.put(2, "A");
        cache.put(3, "A");
        System.out.println(cache);
        cache.get(2);
        System.out.println(cache);
        cache.put(4, "D");
        System.out.println(cache);
    }
}
