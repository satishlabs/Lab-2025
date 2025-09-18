package com.enums;

public enum Color implements Printable{
    RED, GREEN, BLUE;

    @Override
    public void print() {
        System.out.println("Color is : "+this.name());
    }
}
