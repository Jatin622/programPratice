package com.programmingPratice.pepcoading;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class atry {
    public static void main(String[] args) {

        String input = "x1y2";
        String str1 = "12";
        String str2 = "xy";

        String finalString = str1 + str2;
        HashSet<Character> hashSet = new HashSet<>();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < finalString.length(); i++) {

            char ch = finalString.charAt(i);

            hashSet.add(ch);
            stringBuilder.append(ch);//12xy
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (!hashSet.contains(ch)) {
                hashSet.add(ch);
            }
        }
        if (hashSet.isEmpty()) {
            System.out.println("valid");
        }

    }
}
