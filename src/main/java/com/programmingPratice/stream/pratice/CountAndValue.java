package com.programmingPratice.stream.pratice;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountAndValue {
    public static void main(String[]args) {

        String[] array = {"G", "e", "e", "k", "s"};

        String output = IntStream.range(0, array.length)
                .mapToObj(i -> i + " -> " + array[i]).collect(Collectors.toList()).toString();
        //     .collect(Collectors.joining(", ", "[", "]"));

        System.out.println(output);
    }
}
