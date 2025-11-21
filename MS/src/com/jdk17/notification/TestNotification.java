package com.jdk17.notification;

public class TestNotification {
    static void main() {
        Notification n1 = new Email("abc@test.com", "Hello Email");
        System.out.println(n1);
        Notification n2 = new SMS("Test1233", "Hello SMS");
        System.out.println(n2);
        Notification n3 = new Push("DEVICEID123", "Push Message!");
        System.out.println(n3);
    }
}
