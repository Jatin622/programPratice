package com.programmingPratice.recursionPratice;

public class SumOfdigitRecursion {
    public static void main(String[] args) {
        int a = 12345;

        int sum = 0;
        sumofdigit(a,sum);
    }

    public static void sumofdigit(int a, int sum) {
        if (a == 0) {
            return;
        }
        int c = a % 10;
        a = a / 10;
        sum += c;
        sumofdigit(a, sum);
        System.out.println(sum);
    }
}
