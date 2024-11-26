package com.programmingPratice.pepcoading;

public class Reverse {
    public static void main(String[]args) {
        int a = 12345;

        while(a>0){
            int n = a %10;
            a = a /10;
            System.out.println(n);
        }
    }
}
