package com.arr;

public class PalindromeNumber {
    static void main() {
        int num = 121;
        int rev = 0;
        int original = num;
        while(num >0){
            rev = rev*10+num%10;
            num = num/10;
        }
        System.out.println(original == rev ? "Palindrome": "Not Palindrome");
    }
}
