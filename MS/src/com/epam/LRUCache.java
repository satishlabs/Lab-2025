package com.epam;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private final int capacity;
    private final Map<Integer, Node1> map;
    private final Node1 head;
    private final Node1 tail;

    public LRUCache(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node1(0,0); //dummy head;
        tail = new Node1(0,0); //dummy tail

        head.next = tail;
        tail.prev = head;
    }

    static void main() {
        LRUCache cache = new LRUCache(3);
        cache.put(1, 10);
        cache.put(2, 20);
        cache.put(3, 30);

        System.out.println(cache);
        System.out.println(cache.get(2));
        System.out.println(cache);
    }

    private int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node1 node = map.get(key);
        moveToFront(node);
        return node.value;
    }

    private void put(int key, int value) {
        if(map.containsKey(key)){
            Node1 node = map.get(key);
            node.value = value;
            moveToFront(node);

        }else{
            if(map.size() == capacity){
                Node1 lru = tail.prev;
                removeNode(lru);
                map.remove(lru.key);
            }
            Node1 newNode = new Node1(key,value);
            map.put(key, newNode);
            addToFront(newNode);
        }
    }

    private void removeNode(Node1 node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToFront(Node1 newNode) {
        newNode.next = head.next;
        newNode.prev = head;
        head.next.prev = newNode;
        head.next = newNode;
    }

    private void moveToFront(Node1 node) {

    }
}
