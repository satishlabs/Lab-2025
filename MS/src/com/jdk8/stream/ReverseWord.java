package com.jdk8.stream;

import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseWord {
    static void main() {
        String collect = "Satish".chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return list.stream();
                }))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(collect);
    }
}
/*
1️⃣ word.chars()
Converts string into IntStream
Each character becomes its ASCII/Unicode int value
Example for "Sat" → [83, 97, 116]

2️⃣ mapToObj(c -> (char) c)
Converts int → Character
Because streams of objects are needed for further processing
Now stream becomes:
['S', 'a', 't', 'i', 's', 'h']

3️⃣ collect(Collectors.collectingAndThen(...))
Special collector that:
Collects stream into a List
Applies an extra finishing step
Think of it as:
"Collect, then do something"

4️⃣ Collections.reverse(list)
Reverses the list in-place
List changes from:
[S, a, t, i, s, h] → [h, s, i, t, a, S]

5️⃣ map(String::valueOf)
Converts each character to string
Needed before joining
['h','s','i','t','a','S'] → ["h","s","i","t","a","S"]

6️⃣ Collectors.joining()
Joins stream elements into single string
Final output: "hsitaS"
* */