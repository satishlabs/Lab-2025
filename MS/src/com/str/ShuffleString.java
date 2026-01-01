package com.str;

import java.util.stream.IntStream;

public class ShuffleString {
    static void main() {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String result = restoreString(s, indices);
        System.out.println(result);
        System.out.println("\n===================");
        String result1 = restoreStringStream(s, indices);
        System.out.println(result1);
    }

    private static String restoreStringStream(String s, int[] indices) {
        char[] result = new char[s.length()];

        IntStream.range(0, s.length())
                .forEach(i -> result[indices[i]] = s.charAt(i));
        return new String(result);
    }

    private static String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];

        for(int i=0; i< s.length(); i++){
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }
}
