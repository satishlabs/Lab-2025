package com.sap;

public class PotentialPalindrome {
    static void main() {
        System.out.println(checkPotentialPalindrome("abca"));
    }

    private static boolean checkPotentialPalindrome(String str) {
        int left = 0;
        int right = str.length()-1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return isPalindrome(str, right, left+1) || isPalindrome(str, left, right-1);
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindrome(String str, int left, int right) {
        while(left < right){
            if(str.charAt(left) != str.charAt(right))
                return false;
                left++;
                right--;

        }
        return true;
    }
}
