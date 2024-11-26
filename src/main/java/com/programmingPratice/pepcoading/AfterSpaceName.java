package com.programmingPratice.pepcoading;

public class AfterSpaceName {
    public static void main(String[] args) {
        String s = "this is laptop";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                ch = s.charAt(i + 1);
                ch = Character.toUpperCase(ch);
                stringBuilder.append(ch);
                i++;
            } else {
                stringBuilder.append(ch);
            }
        }
        System.out.println(stringBuilder);
    }
}
