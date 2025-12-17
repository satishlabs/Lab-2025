package com.hcl;

import java.util.Arrays;
import java.util.List;

public class FindOutput {
    static void main() {
        int[] numbers = {1,2,3,4,5};
        // for(final int num: numbers){
        for( int num: numbers){
            num = num+1;
            System.out.println(num);
        }

        List<String> names = Arrays.asList("Alice","Bob","Charlie");
        String prefix = "Mr. ";
        names.forEach(name -> System.out.println(prefix+ name));
        /*prefix = "Mrs. ";  //Variable used in lambda expression should be final or effectively final
        names.forEach(name -> System.out.println(prefix + name));*/

    }
}
