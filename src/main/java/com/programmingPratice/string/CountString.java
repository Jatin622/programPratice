package com.programmingPratice.string;

public class CountString {
    public static void main(String[]args) {
        String string = "abd";
        int count = 0;

        for(int i=0;i<string.length();i++){

            char ch = string.charAt(i);
            if(ch!=' '){
                count++;
            }
        }
        System.out.println(count);
    }

}
