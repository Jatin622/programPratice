package com.programmingPratice.recursion;

public class Linear {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = powerLinear(a, b);
        System.out.println(c);
    }

    public static int powerLinear(int a, int b) {
        if (b == 0) {
            return a;
        }

        int total = powerLinear(a, b - 1);
        total = total * a;


        return total;
    }
}
