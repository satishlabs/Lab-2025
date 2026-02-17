package com.jpmorganchase;

public class CheckStringPalindrome {
    static void main(String[] args) {
        System.out.println(isPalindrome("radar"));
        System.out.println(isPalindrome("hello"));
        System.out.println("\n===================");
        System.out.println(isPalindrome1("No lemon, no melon"));
        System.out.println(isPalindrome1("Hello test, Test Hello"));

    }

    private static boolean isPalindrome1(String str) {
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

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length()-1;
        while (left <right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
