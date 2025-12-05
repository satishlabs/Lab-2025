package com.cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache1<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;
    public LruCache1(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() >capacity;
    }

    static void main() {
        LruCache1<Integer, String> lru = new LruCache1<>(3);
        lru.put(1, "A");
        lru.put(2, "B");
        lru.put(3, "C");
        System.out.println(lru);
        lru.put(4, "D");
        System.out.println(lru);
        lru.get(3);
        System.out.println(lru);
    }
}
