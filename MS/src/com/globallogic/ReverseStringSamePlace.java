package com.globallogic;

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
    }
}
