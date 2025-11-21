package com.jdk17.notification;

public record Email(String to, String message) implements Notification{
}
