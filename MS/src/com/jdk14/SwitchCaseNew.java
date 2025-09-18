package com.jdk14;

public class SwitchCaseNew {
    public static void main(String[] args) {
        Days day = Days.Friday;
        String type = switch (day){
            case Monday, Tuesday, Wednesday -> "Its a weekday( Mon - Wed)";
            case Thursday, Friday -> "Its a weekday (Thu-Fri)";
            case Saturday, Sunday -> "Its Weekend!";
        };
        System.out.println(type);
    }
}
