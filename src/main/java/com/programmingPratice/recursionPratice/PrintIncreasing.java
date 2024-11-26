package com.programmingPratice.recursionPratice;

public class PrintIncreasing {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        printNumber(n, a);
    }

    public static void printNumber(int n, int a) {
        a++;
        if (n == a) {
            System.out.println(a);
            return;
        }
        System.out.println(a);
        printNumber(n, a);
    }
}
