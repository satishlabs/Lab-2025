package com.jdk17.notification;

public sealed interface Notification permits Email, SMS, Push{
}
