package com.str;

import java.util.stream.Collectors;

public class RemoveWhiteSpace {
    static void main() {
        String input = " Java   is \t very \n easy ";
        String output = input.replaceAll("\\s","");
        System.out.println(output);

        System.out.println("\n==================");
        input = " Java   is \t very \n easy ";
        StringBuilder sb = new StringBuilder();
        for(char c : input.toCharArray()){
            if(!Character.isWhitespace(c)){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());

        System.out.println("\n==================");
        input = " Java   is \t very \n easy ";
        String result = input.chars()
                .filter(c -> !Character.isWhitespace(c))
                .mapToObj(c ->String.valueOf((char)c))
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
