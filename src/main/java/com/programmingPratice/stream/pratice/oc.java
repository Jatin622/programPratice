package com.programmingPratice.stream.pratice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class oc {
    public static void main(String[]args){

        String text = "the quick brown fox jumps over the lazy dog";


        Map<Character, Long> characterCounts = text.chars()
                .mapToObj(c -> (char) c) // Convert integer values back to characters
                .collect(Collectors.groupingBy(Character::valueOf, Collectors.counting()));

        System.out.println(characterCounts);

    }
}
