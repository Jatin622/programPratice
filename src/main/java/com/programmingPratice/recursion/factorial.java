package com.programmingPratice.recursion;

public class factorial {
    public static void main(String[] args) {

        int a = 5;
        int b = fact(a);
        System.out.println(b);
    }

    public static int fact(int a) {
        if (a == 1) {
            return 1;
        }

        int total = fact(a - 1);
        total = total * a;

        return total;
    }
}
