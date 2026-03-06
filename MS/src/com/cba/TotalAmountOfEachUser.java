package com.cba;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
users = amount
user1  100
user2  200
user1  300
user3  400
user2  100
* */
public class TotalAmountOfEachUser {
    static void main(String[] args) {
        List<User> list = Arrays.asList(
                new User("user1", 100),
                new User("user2", 200),
                new User("user1", 300),
                new User("user3", 400),
                new User("user2", 100)
        );
        list.stream()
                .collect(Collectors.groupingBy(User::getUser, Collectors.summingDouble(u ->u.amount)))
                .entrySet()
                .forEach(System.out::println);

        System.out.println("\n===========================");
        Map<String,Integer> map = new HashMap<>();
        map.put("user1",100);
        map.put("user2", 200);
        map.put("user1", 300);
        map.put("user3", 400);
        map.put("user2", 100);

        map.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.summingInt(Map.Entry::getValue)))
                .forEach((k,v)-> System.out.println(k+" "+v));
    }
}
