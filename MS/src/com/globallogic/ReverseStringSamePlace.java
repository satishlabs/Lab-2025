package com.globallogic;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseStringSamePlace {
    static void main() {
        String str = "I Love India";
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch != ' '){
                word.append(ch);
            }else{
                sb.append(word.reverse().append(" "));
                word.setLength(0);
            }
        }
        sb.append(word.reverse());
        System.out.println(sb.toString());

        System.out.println("\n===============================");
       String result = Arrays.stream(str.split(" "))
                .map(w -> new StringBuilder(w).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
