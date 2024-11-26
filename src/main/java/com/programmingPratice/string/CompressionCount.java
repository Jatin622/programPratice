package com.programmingPratice.string;

public class CompressionCount {
    public static void main(String[] args) {
        String a = "aaabbbcccdddde";
        String s=compression(a);

        System.out.println(s);
    }
    public static String compression(String str) {

        String s = str.substring(0, 1);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            char previous = str.charAt(i - 1);

            if (current == previous) { // this is for if prev one is same for current
                count++;
            } else {
                if (count > 1) { // this is for before adding new word add no count of that word
                    s = s+count;
                    count = 1;

                }
                s += current;
            }
        }
        return s;
    }
}
