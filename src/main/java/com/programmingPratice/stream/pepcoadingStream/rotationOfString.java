package com.programmingPratice.stream.pepcoadingStream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class rotationOfString {
    public static void main(String[] args) {
        String s = "ABCD";
        String s1 = "CDAB";

        String rotatedString = IntStream.range(2, s.length())
                .mapToObj(i -> s.charAt(i))
                .map(String::valueOf)
                .collect(Collectors.joining());

        rotatedString += IntStream.range(0, 2)
                .mapToObj(i -> s.charAt(i))
                .map(String::valueOf)
                .collect(Collectors.joining());

        if (rotatedString.equals(s1)) {
            System.out.println("Strings are rotations of each other.");
        } else {
            System.out.println("Not rotations.");
        }
    }

}
