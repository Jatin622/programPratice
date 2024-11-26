package com.programmingPratice.pepcoading1;

public class remove {
    public static void main(String[] args) {

        String str = " my name is lap";
        StringBuilder stringBuilder = new StringBuilder();
        String newString = null;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            newString = String.valueOf(ch);
            if (ch == 'a') {
                char c = Character.toUpperCase(ch);
                newString = String.valueOf(c);
            }
            stringBuilder.append(newString);
        }
        System.out.println(stringBuilder);


    }
}
