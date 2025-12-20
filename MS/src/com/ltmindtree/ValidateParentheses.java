package com.ltmindtree;

import java.util.Stack;

public class ValidateParentheses {
    static void main() {
        String str = "{[(]}";
        if(isParenthesesValid(str)){
            System.out.println("Valid");
        }else{
            System.out.println("NotValid");
        }
    }

    private static boolean isParenthesesValid(String str) {
        Stack<Character> st = new Stack<>();
       for(Character c: str.toCharArray()){
           if(c == '(' || c == '{' || c == '['){
               st.push(c);
           }else if(c == ')' && !st.isEmpty() && st.peek() == '('){
               st.pop();
           }else if(c == '}' && !st.isEmpty() && st.peek() == '{'){
               st.pop();
           }else if(c == ']' && !st.isEmpty() && st.peek() == '['){
               st.pop();
           }else{
               return false;
           }
       }
       return st.isEmpty();
    }
}
