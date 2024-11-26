package com.programmingPratice.recursionPratice;

public class powerLinearRecursion {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        int xn = powerLinear(a, b);
        System.out.println(xn);
    }

    public static int powerLinear(int a, int b) {

        if (b == 0) {
            return 1;
        }
        int xnm = powerLinear(a, b - 1);
        int xn = a * xnm;
        return xn;

    }
}
