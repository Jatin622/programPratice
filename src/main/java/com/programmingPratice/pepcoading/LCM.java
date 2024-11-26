package com.programmingPratice.pepcoading;

import java.util.List;

public class LCM {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int i;
        int lcm;
        for (i = 1; i < a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                break;
            }
        }
        lcm = i;
        System.out.println(lcm);

    }
}
