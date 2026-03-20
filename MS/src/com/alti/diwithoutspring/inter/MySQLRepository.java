package com.alti.diwithoutspring.inter;

public class MySQLRepository implements  UserRepository{
    @Override
    public void save() {
        System.out.println("Saving in MySQL");
    }
}
