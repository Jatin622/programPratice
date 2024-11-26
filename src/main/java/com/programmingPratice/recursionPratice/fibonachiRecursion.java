package com.programmingPratice.recursionPratice;

public class fibonachiRecursion {
    public static void main(String[] args) {

        fibo(0, 1, 10);
    }

    static void fibo(int a, int b, int n) {
        if (n == -1) {
            return;
        }

        int total = a + b;
        a = b;
        b = total;
        System.out.println(total);
        fibo(a, b, n - 1);

    }
}
