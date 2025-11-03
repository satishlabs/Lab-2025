package com.file;

import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class TopUsersByTimeSpent {
    public static void main(String[] args) throws Exception {
        String filePath = "I:\\File\\user_logs.xlsx";
        Map<String, LocalTime> loginTimes = new HashMap<>();
        Map<String, Long> totalTimeSpent = new HashMap<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String userId = parts[0];
                LocalTime time = LocalTime.parse(parts[1], formatter);
                String action = parts[2];

                if (action.equalsIgnoreCase("login")) {
                    loginTimes.put(userId, time);
                } else if (action.equalsIgnoreCase("logout") && loginTimes.containsKey(userId)) {
                    long minutes = Duration.between(loginTimes.get(userId), time).toMinutes();
                    totalTimeSpent.put(userId, totalTimeSpent.getOrDefault(userId, 0L) + minutes);
                    loginTimes.remove(userId); // clear current session
                }
            }
        }

        // Sort by time spent (descending) and take top 10
        List<Map.Entry<String, Long>> top10 = totalTimeSpent.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("Top 10 Users by Time Spent:");
        for (Map.Entry<String, Long> entry : top10) {
            System.out.println("User: " + entry.getKey() + ", Time Spent: " + entry.getValue() + " minutes");
        }
    }
}
