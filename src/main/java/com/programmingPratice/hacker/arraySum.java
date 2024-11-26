package com.programmingPratice.hacker;

import java.util.Scanner;

public class arraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int n = in.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
    }

    public static int sumArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
