package com.programmingPratice.numberSystem;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        int n = 694; // value
        int b = 8; // in what we convert
        //question= (694) = () base 8
        int digit = getValueInBase(n, b);
        System.out.println(digit);

    }

    public static int getValueInBase(int n, int b) {
        int rv = 0;

        int p = 1;
        while (n > 0) {
            int dig = n % b;
            n = n / b;

            rv += dig * p;

            p = p * 10; // this step and before step to nicha ki value first pa aana ka liya

        }
        return rv;
    }
}
