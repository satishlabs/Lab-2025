package com.test;

public class Lab1 {
    static void main() {

        String dayName;

        //Traditional Switch Statements
        int dayOfWeek = 3;
        switch (dayOfWeek){
            case 1: dayName = "Monday";
                break;
            case 2: dayName = "Tuesday";
                break;
            case 3: dayName = "Wednesday";
                break;
            default: dayName = "Unkown";
        }
        System.out.println(dayName);
        System.out.println("\n==============");
        //Basic Switch Expression

        dayName = switch (dayOfWeek){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Unknown";
        };
        System.out.println(dayName);

        System.out.println("\n===============");
        dayName = switch (dayOfWeek){
            case 1, 2, 3 ->{
                System.out.println("Weekday");
                yield "Weekday";
            }
            case 4, 5 -> "Almost weekend";
            case 6,7 -> "Weekend";
            default -> "Unknown";
        };
        System.out.println(dayName);
    }
}
