package com.str;

import java.util.Arrays;

public class ReverseSentence {
    static void main() {
        String str = "Hello How are you";
        String[] strArr = str.split("\\s+");
       StringBuilder sb = new StringBuilder();
        for(String input: strArr){
            char[] chArr = input.toCharArray();
            int left = 0;
            int right = chArr.length-1;
            while (left < right){
                char temp = chArr[left];
                chArr[left] = chArr[right];
                chArr[right] = temp;
                left++;
                right--;
            }
            sb.append(new String(chArr)).append(" ");
        }
        System.out.println(sb);
    }
}
