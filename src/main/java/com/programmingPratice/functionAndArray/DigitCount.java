package com.programmingPratice.functionAndArray;

public class DigitCount {
    public static void main(String[] args) {
        int a = 12234;
        int b = 2;

        int c = check(a, b);
        System.out.println(c);
    }

    public static int check(int a, int b) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            int rem = a % 10;

            a = a / 10;
            if (rem == b) {
                count++;
            }
        }
        return count;
    }

}
