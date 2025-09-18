package com.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindNonRepeatedChar {
    public static void main(String[] args) {
        String str = "swiss";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char ch: str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        map.forEach((k,v) ->{
            if(v ==1){
                System.out.println(k+" "+v);
            }
        });
    }
}
