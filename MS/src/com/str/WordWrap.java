package com.str;
/*
* Write program for Word wrap.
* a. ex. Input : "I will be working as Software Engineer."
* b. Maximum length can be 10, per line.
* c. Once reached to the max length, start new line.
* */


public class WordWrap {
    public static void main(String[] args) {
        String input = "I will be working as Software Engineer.";
        int maxLength = 10;

        String[] words = input.split(" ");
        StringBuilder line = new StringBuilder();

        for (String word : words) {
            // If current line is empty, just add the word
            if (line.length() == 0) {
                line.append(word);
            }
            // If adding this word exceeds max length → print current line, reset, then add word
            else if (line.length() + 1 + word.length() > maxLength) {
                System.out.println(line.toString());
                line.setLength(0);
                line.append(word);
            }
            // Otherwise, add the word with space
            else {
                line.append(" ").append(word);
            }
        }

        // Print last line
        if (line.length() > 0) {
            System.out.println(line.toString());
        }
    }
}