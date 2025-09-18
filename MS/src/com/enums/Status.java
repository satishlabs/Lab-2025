package com.enums;

public enum Status {
    SUCCESS(200), ERROR(500), PENDING(102);
    private int code;
    Status(int code) {
        this.code = code;
    }

    public int getCode(){
        return code;
    }
}
