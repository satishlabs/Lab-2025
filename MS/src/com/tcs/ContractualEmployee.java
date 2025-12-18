package com.tcs;

public class ContractualEmployee implements Employee{
    private int id;
    private String name;
    private double hourlyRate;

    public ContractualEmployee(int id, String name, double hourlyRate) {
        this.id = id;
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return "";
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}
