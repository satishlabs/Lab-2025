package com.cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache1<K, V> extends LinkedHashMap<K,V> {
    int capacity;

    public LRUCache1(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache1 cache1 = new LRUCache1(3);
        cache1.put(1, "A");
        cache1.put(2, "B");
        cache1.put(3, "C");
        System.out.println(cache1);
        cache1.get(2);
        System.out.println(cache1);
    }
}
