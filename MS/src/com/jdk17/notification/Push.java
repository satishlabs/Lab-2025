package com.jdk17.notification;

public non-sealed class Push implements Notification {
    private final String deviceId;
    private final String msg;

    public Push(String deviceId, String msg) {
        this.deviceId = deviceId;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Push{" +
                "deviceId='" + deviceId + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
