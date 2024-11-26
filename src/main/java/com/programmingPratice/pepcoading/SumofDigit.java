package com.programmingPratice.pepcoading;

public class SumofDigit {
    public static void main(String[] args) {
        int a = 12345;

        int sum = 0;

        while (a != 0) {
            int c = a % 10;
            a = a / 10;
            sum += c;
        }
        System.out.println(sum);
    }
}
