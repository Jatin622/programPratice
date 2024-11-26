package com.programmingPratice.pepcoading1;

public class particularCharacterUpper {
    public static void main(String[] args) {

        String str = " my name is lap";
        StringBuilder stringBuilder = new StringBuilder();
        char newString ;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            newString = ch;
            if (ch == 'a') {
                char c = Character.toUpperCase(ch);
                newString = c;
            }
            stringBuilder.append(newString);
        }
        System.out.println(stringBuilder);


    }
}
