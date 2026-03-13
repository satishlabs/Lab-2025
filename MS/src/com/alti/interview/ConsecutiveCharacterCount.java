package com.alti.interview;

public class ConsecutiveCharacterCount {
    static void main(String[] args) {
        String input = "aaaaBbsssz";
        int count=1;
        for(int i=1; i<=input.length(); i++){
            if(i <input.length() && Character.toLowerCase(input.charAt(i)) == Character.toLowerCase(input.charAt(i-1))){
                count++;
            }else{
                String group = input.substring(i-count,i);
                System.out.println(count+" "+group);
                count=1;
            }
        }
    }
}
