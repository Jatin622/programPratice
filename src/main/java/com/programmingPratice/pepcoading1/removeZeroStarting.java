package com.programmingPratice.pepcoading1;

public class removeZeroStarting {
    public static void main(String[]args){
        // Sample string input
        String str = "0001235609";
        String newstr = "";
        int ind = 0;
        for (int i = 0; i < str.length(); i++) {
            char p = str.charAt(i);
            if (p != '0') {
                ind = i;
                break;
            }
        }
        newstr = str.substring(ind, str.length());
        System.out.println(newstr);


    }
}
