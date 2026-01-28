package com.infogain;

public class SpecialReverse {
    static void main() {
        String input = "My name is Satish !";
        //Output: Ym eman si Hsitas !
        System.out.println(transform(input));
    }

    private static String transform(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            if(word.length() <= 1){
                sb.append(word).append(" ");
                continue;
            }

            String reverse = new StringBuilder(word).reverse().toString();
            if(Character.isUpperCase(word.charAt(0))){
                reverse = Character.toUpperCase(reverse.charAt(0))+ reverse.substring(1).toLowerCase();
            }

            sb.append(reverse).append(" ");
        }
        return sb.toString().trim();
    }
}
