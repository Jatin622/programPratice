package com.programmingPratice.recursion;

public class printDec {
    public static void main(String[] args) {
    int n=5;

    decreasing(n);
    }

    public static void decreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);//dec
        decreasing(n - 1);
        System.out.println(n); // inc
    }
}
