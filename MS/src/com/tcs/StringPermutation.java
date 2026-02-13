package com.tcs;

public class StringPermutation {
    static void main() {
        String str = "abc";
        permuation(str,"");
    }

    private static void permuation(String str, String res) {
        if(str.length() == 0){
            System.out.println(res+" ");
            return;
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            String result = str.substring(0,i)+str.substring(i+1);

            permuation(result,res+ch);
        }
    }
}
