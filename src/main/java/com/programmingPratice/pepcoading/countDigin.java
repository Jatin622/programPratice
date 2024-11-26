package com.programmingPratice.pepcoading;

public class countDigin {
    public static void main(String[] args) {
        int count = 0;
        int i = 234;
        while (i != 0) {
            i = i / 10;
            count++;
        }
        System.out.println(count);
    }

}