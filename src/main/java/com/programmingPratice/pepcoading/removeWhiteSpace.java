package com.programmingPratice.pepcoading;

public class removeWhiteSpace {
    public static void main(String[] args) {
        String str = " abcd  s ";

//        str=str.replaceAll("\\s" ,"");
//        System.out.println(str); // using regex
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                continue;
            }
            stringBuilder.append(ch);
        }
        System.out.println(stringBuilder);
    }
}
