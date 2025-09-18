package com.dp.builder;

public class BuilderMain {
    public static void main(String[] args) {
        User user = new User.Builder(1, "Satish")
                .email("sa@gmail.com")
                .address("Ranchi")
                .build();
        System.out.println(user);
    }
}
