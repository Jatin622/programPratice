package com.programmingPratice.string;

public class StrCompression {
    public static void main(String[] args) {
        String a = "aaabbbcccdd";
        System.out.println(compression(a));
    }

    public static String compression(String str) {
        String s = str.substring(0, 1);

        for (int i = 1; i < str.length(); i++) {

            char current = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (current != prev) {
                s += current;
            }
        }
        return s;
    }
}
