package com.ip;

import java.util.Stack;

public class ReverseExpression {
    public static void main(String[] args) {
        String str = "2*50+3-10";
        String[] operators = {"\\+","-","\\*","/"};
        for(String op : operators){
            str = str.replaceAll(op, " "+op+" ");
        }
        String[] sp = str.split(" ");
        Stack st = new Stack();
        for(int i=0; i<sp.length; i++){
            st.push(sp[i]);
        }
        while (!st.isEmpty()){
            System.out.print(st.pop());
        }
        System.out.println("\n================");
        // Split into tokens (numbers + operators)
        String[] tokens = str.split("(?<=\\D)|(?=\\D)");

        // Reverse tokens
        StringBuilder sb = new StringBuilder();
        for (int i = tokens.length - 1; i >= 0; i--) {
            sb.append(tokens[i]);
        }

        System.out.println("Input : " + str);
        System.out.println("Output: " + sb.toString());
    }
}
