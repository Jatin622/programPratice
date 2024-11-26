package com.programmingPratice.numberSystem;

public class AnyBseToDecimal {
    public static void main(String[] args) {
        // question = (1266)base 8 = ()base 10
        int a = 1266;
        int b = 8;
        int digit = getValueInDecimal(a, b);
        System.out.println(digit);


    }

    public static int getValueInDecimal(int a, int b) {
        int rv = 0;
        int power = 1;

        while (a > 0) {

            int dig = a % 10;
            a = a / 10;
            rv += dig * power;
            power = power * b;

        }
        return rv;
    }
}
