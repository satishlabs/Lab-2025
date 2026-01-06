package com.epam;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public record Transaction(int userId, double amount) {

    static void main() {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(1, 100),
                new Transaction(2, 200),
                new Transaction(1, 150),
                new Transaction(3, 300),
                new Transaction(2, 50)
        );

        //Total amount by User Id
        Map<Integer, DoubleSummaryStatistics> collect = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::userId, Collectors.summarizingDouble(Transaction::amount)));
        collect.forEach((k,v) ->{
            System.out.println("User: "+k+" -> Total = "+v);
        });
    }
}
