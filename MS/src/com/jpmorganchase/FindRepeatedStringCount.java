package com.jpmorganchase;

import java.util.List;
import java.util.stream.Collectors;

public class FindRepeatedStringCount {
    static void main() {
        List<String> list = List.of(
                "Pen", "Book", "NoteBook", "Pen", "Book", "Book"
        ) ;
        list.stream()
                .collect(Collectors.groupingBy(w ->w, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(w ->w.getValue() >1)
                .forEach(System.out::println);
    }
}
