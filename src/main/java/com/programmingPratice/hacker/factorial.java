package com.programmingPratice.hacker;

public class factorial {
    public static void main(String[] args) {

        int n = 25;
        System.out.println(extraLongFactorials(n));
    }

    public static Long extraLongFactorials(int n) {

        Long result = 1L;
        for (int i = n; i >=1; i--) {
            result *= i;
        }
        return result;
    }
}
