package com.programmingPratice.pepcoading;

import java.util.Scanner;

public class RotateNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 123456; // number of digit
        int k = 2; // rotation how much

        int temp = n;
        int count = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++; // find count of no

        }
//        k = k % count;
//        if (k < 0) {
//            k = k + count;
//        }

        int div = 1;
        int mult = 1;
        //i<2 , 2=2
        //div =100 mul = 1000;
        for (int i = 1; i <= count; i++) {
            if (i <= k) {
                div = div * 10;

            } else {
                mult = mult * 10;
            }
        }
        int q = n    / div; // 123456 / 100 = 1234 , reminder = 56 , q = 1234
        int r = n % div; // r=56
        int root = r * mult + q; // 56  *1000 + 1234 =  561234
        System.out.println(root);
    }
}
