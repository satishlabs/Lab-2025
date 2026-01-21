package com.str;

public class ReverseStringWithoutInbuilt {
    static void main(String[] args) {
        String str = "JavaInterview";
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length-1;

        while(left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        String reversed = "";
        for(char c: chars){
            reversed += c;
        }
        System.out.printf("Revered String: "+reversed);
    }
}
