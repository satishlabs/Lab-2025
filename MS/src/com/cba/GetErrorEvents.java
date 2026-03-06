package com.cba;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GetErrorEvents {
    static void main(String[] args) {
        List<Event> eventList = List.of(
                new Event("AuthSvc","ERROR","Invalid Token"),
                new Event("PaymentSVC","INFO","Payment Completed"),
                new Event("AuthSvc","ERROR","Authentication failed")

        );

        eventList.stream()
                .filter(e -> "ERROR".equals(e.level()))
                .collect(Collectors.groupingBy(Event::service, Collectors.counting()))
                .forEach((k,v) -> System.out.println(k + " : " + v));

        System.out.println("\n============================");
        eventList.stream()
                .filter(e ->"ERROR".equals(e.level()))
                .collect(Collectors.groupingBy(Event::service, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);
    }
}
