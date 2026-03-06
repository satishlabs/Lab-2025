package com.ltmindtree;

public class ReverseString {
    static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.trim().split("\\s+");
        String rev = " ";
        for(int i= words.length-1; i>=0; i--){
            rev += words[i];
            if(i != 0){
                rev +=" ";
            }
        }
        System.out.println(rev);
    }
}
