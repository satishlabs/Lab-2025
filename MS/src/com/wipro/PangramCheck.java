package com.wipro;

import java.util.HashSet;
import java.util.Set;

public class PangramCheck {
    static void main() {
        String str = "The quick brown fox jumps over the lazy dog";
       boolean isPangram = str.toLowerCase()
                .chars()
                .filter( c ->c >='a' && c <='z')
                .distinct()
                .count() == 26;
        System.out.println(isPangram);

        System.out.println("\n==================");
        Set<Character> set = new HashSet<>();
        for(char ch : str.toLowerCase().toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                set.add(ch);
            }
        }
        System.out.println(set.size() == 26);
    }
}
