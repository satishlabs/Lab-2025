package com.jdk17.notification;

public record SMS(String to, String message) implements Notification{
}
