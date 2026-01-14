package com.mphasis;

public class SubsequenceCheck {
    static void main() {
        System.out.println(checkSubSequence("sti","Satish"));
        System.out.println(checkSubSequence("tis","Satish"));
        System.out.println(checkSubSequence("abc","xyazmnbzc"));

    }

    private static boolean checkSubSequence(String str1, String str2) {
        int i=0;
        int j=0;
        while(i<str1.length() && j< str2.length()){
            if(str1.charAt(i) ==  str2.charAt(j)){
                i++; //
            }else{
                j++;
            }
        }
        return i == str1.length();
    }
}
