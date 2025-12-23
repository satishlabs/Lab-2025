package com.globallogic;
//Write a Java program to find the longest common prefix among a set of strings.
public class CommonLongestPrefixInString {
    static void main() {
        String[] str = {"flower","flow","flight"};
        System.out.println(longestCommonString(str));
    }

    private static String longestCommonString(String[] str) {
        if(str == null || str.length == 0){
            return "";
        }

        String prefix = str[0];
        for(int i=1; i<str.length; i++){
            while(!str[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){
                    return  "";
                }
            }
        }
        return prefix;
    }
}
