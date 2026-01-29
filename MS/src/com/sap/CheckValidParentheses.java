package com.sap;

import java.util.Stack;

public class CheckValidParentheses {
    static void main() {
        System.out.println(isValidParentTheses("[{()}]"));
        System.out.println(isValidParentTheses("[{(})]"));
    }

    private static boolean isValidParentTheses(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chaArr = str.toCharArray();

        for(char ch : chaArr){
            if(ch == '('|| ch == '{' || ch == '['){
                stack.push(ch);
            }else if(ch == '}' || ch == ')' || ch == ']'){
               char top = stack.pop();
               if((ch == '}' && top != '{') ||(ch == ']' && top != '[') || (ch == ')' && top != '(') ){
                   return false;
               }
            }
            //stack.isEmpty()
        }
        return stack.isEmpty();
    }
}
