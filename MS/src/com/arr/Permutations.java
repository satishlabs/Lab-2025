package com.arr;

public class Permutations {
    public static void main(String[] args) {
        premute("ABC");
    }

    private static void premute(String str) {
        premute("", str);
    }

    private static void premute(String str, String input) {
        if(input.length() == 0){
            System.out.println(str);
        }else{
            for(int i=0; i<input.length(); i++){
                premute(str+input.charAt(i), input.substring(0,i)+input.substring(i+1, input.length()));
            }
        }
    }
}
