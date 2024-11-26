package com.programmingPratice.stream.pratice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class occurenceOfWord {
    public static void main(String[] args) {
        String text = "the quick brown fox jumps over the lazy dog";

        Map<String, Long> wordOccurrences = countWordOccurrences(text);

        System.out.println(wordOccurrences);
    }

    public static Map<String, Long> countWordOccurrences(String text) {
        return Arrays.stream(text.split("\\s+"))
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
    }
}
