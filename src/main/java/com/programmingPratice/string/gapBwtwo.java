package com.programmingPratice.string;

public class gapBwtwo {

    public static void main(String[] args) {
        String a = "abdc";

        String b = gaps(a);

        System.out.println(b);
    }

    public static String gaps(String str) {
        String chr = str.substring(0, 1);

        for (int i = 1; i < str.length(); i++) {

            char current = str.charAt(i);
            char prev = str.charAt(i - 1);

            int gap = current - prev;

            chr += gap;
            chr += current;

        }
        return chr;

    }
}
