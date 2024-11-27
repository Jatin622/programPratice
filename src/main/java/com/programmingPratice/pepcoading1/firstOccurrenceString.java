package com.programmingPratice.pepcoading1;

public class firstOccurrenceString {
    public static void main(String[] args) {

        String str1 = "GeeksforGeeksforGeeks";
        String str2 = "Geeks";
        comp(str1, str2);

    }

    public static void comp(String str, String str2) {

        int n = str2.length();
        for (int i = 0; i <= str.length() - n; i++) {

            String subStr = str.substring(i, i + n);

            if (subStr.equals(str2)) {
                System.out.println(i);

            }
        }
    }

}
