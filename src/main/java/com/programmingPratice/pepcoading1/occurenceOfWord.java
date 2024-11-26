package com.programmingPratice.pepcoading1;

import java.util.HashMap;

public class occurenceOfWord {
    public static void main(String[]args) {
        String sentence = "my name is my";

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Create a HashMap to store word frequencies
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Iterate through each word
        for (String word : words) {
            // If the word is already in the HashMap, increment its count
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                // If the word is encountered for the first time, add it to the HashMap with count 1
                wordCount.put(word, 1);
            }
        }

        // Display the word frequencies
        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            System.out.println(word + ": " + count);
        }
    }
}
