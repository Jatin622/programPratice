package com.programmingPratice.recursionPratice;

public class PrintIncreasingDecreasing {
    public static void main(String[] args) {
        int n = 5;
        decreasingIncreasing(n);
    }

    public static void decreasingIncreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        decreasingIncreasing(n - 1);
        System.out.println(n);
    }
}
