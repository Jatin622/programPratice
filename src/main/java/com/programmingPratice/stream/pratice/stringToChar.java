package com.programmingPratice.stream.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stringToChar {
    public static void main(String[] args) {
        String s = "hello";

        List<Character> l = s.chars().mapToObj(x -> (char) x).collect(Collectors.toList());
        System.out.println(l);

    }
}
