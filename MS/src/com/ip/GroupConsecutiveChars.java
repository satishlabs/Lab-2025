package com.ip;

import java.util.*;

public class GroupConsecutiveChars {
    public static void main(String[] args) {
        String input = "aaaaBbsssz";

        List<String> groups = new ArrayList<>();
        StringBuilder currentGroup = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (currentGroup.length() == 0 ||
                    Character.toLowerCase(ch) == Character.toLowerCase(currentGroup.charAt(currentGroup.length() - 1))) {
                currentGroup.append(ch);
            } else {
                groups.add(currentGroup.toString());
                currentGroup = new StringBuilder().append(ch);
            }
        }

        // add the last group
        if (currentGroup.length() > 0) {
            groups.add(currentGroup.toString());
        }

        // print
        groups.forEach(group -> System.out.println(group.length() + " " + group));
    }
}