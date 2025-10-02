package com.alti;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseWithStreams {
    public static void main(String[] args) {
        String str = "Satish";
        String reversed = IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(str.length()-1-i))
                .map(String:: valueOf)
                .collect(Collectors.joining());

        System.out.println("Reversed with Streams: " + reversed);
    }
}
