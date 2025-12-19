package com.embetal;

import java.util.Optional;

public class Test {
    static void main() {
        Employee emp = null;
      emp =  Optional.ofNullable(emp)
                .orElseGet(Employee::new);
        System.out.println(emp);
    }
}
