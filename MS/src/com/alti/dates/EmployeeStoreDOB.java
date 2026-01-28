package com.alti.dates;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

public class EmployeeStoreDOB {
    private final TreeMap<LocalDate, List<Employee>> dobMap = new TreeMap<>();

    public void addEmployee(Employee emp){
        dobMap.computeIfAbsent(emp.dob, k -> new ArrayList<>()).add(emp);
    }
    
    public List<Employee> getEmployeesBetween(LocalDate start, LocalDate end){
        List<Employee> result = new ArrayList<>();

        NavigableMap<LocalDate, List<Employee>> range = dobMap.subMap(start, true, end, true);

        for(List<Employee> list: range.values()){
            result.addAll(list);
        }
        return result;
    }
}
