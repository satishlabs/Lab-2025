package com.enums;

public enum Direction {
    NORTH, SOUTH, EAST, WEST;

    public void showDirection(){
        System.out.println("Moving towards : "+this.name());
    }
}
