package com.epam;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheTest<K,V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCacheTest( int capacity) {
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    static void main() {
        LRUCacheTest<Integer, String> cache = new LRUCacheTest<>(3);
        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        System.out.println(cache);
        cache.get(2);
        System.out.println(cache);
        cache.put(4, "D");
        System.out.println(cache);
    }
}
