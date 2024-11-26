package com.programmingPratice.pepcoading;

public class rotationOfString {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();//CDAB
        String s = "ABCD";

        String s1 = "CDAB";
        for (int i = 2; i < s.length(); i++) {
            char ch = s.charAt(i);
            stringBuilder.append(ch);//CD
        }
        for (int i = 0; i < s.length(); i++) {
            if (i < 2) {
                char ch = s.charAt(i);
                stringBuilder.append(ch);//AB
            }
        }
        if (stringBuilder.toString().equals(s1)) {
            System.out.println("String are rotation for each other");
        } else {
            System.out.println("Not rotation");
        }
    }
}