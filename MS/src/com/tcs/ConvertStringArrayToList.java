package com.tcs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringArrayToList {
    static void main() {
        String commaSeparated = "apple, banana, cherry, date";
        List<String> list = Arrays.stream(commaSeparated.split(", "))
                .map(String::valueOf)  // remove spaces
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
