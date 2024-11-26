package com.programmingPratice.hacker;

public class findDiits {
    public static void main(String[] args) {
        int a = 1012;
        System.out.println(findDigits(a));
    }

    public static int findDigits(int n) {
        int val = n;
        int count = 0;

        while (val != 0) {

            int a = val % 10;
            val = val / 10;
            if (a != 0) {
                if (n % a == 0) {
                    count = count + 1;
                }
            }
        }
        return count;
    }
}
