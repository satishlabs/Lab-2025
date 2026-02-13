package com.alti.str;

public class PalindromeCheck {
    static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car")); // false
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length()-1;
        while (left < right){
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(str.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
