package com.epam;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    static void main() {
        String str = "satish";
        Map<Character, Integer> map = new HashMap<>();
        for(Character c: str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(Character c: str.toCharArray()){
            if(map.get(c) == 1){
                System.out.println("First Non-repeated character: "+c);
                return;
            }
        }
    }
}
