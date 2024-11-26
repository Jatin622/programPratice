package com.programmingPratice.pepcoading;

import java.util.HashSet;

public class duplicateInString {
    public static void main(String[] args) {
        String s = "aaapppaapapaeee";

        HashSet<Character> set = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                stringBuilder.append(c);
            }
        }
        System.out.println(stringBuilder);
    }
}
