package com.programmingPratice.numberSystem;

public class AnyBaseToBase {
    public static void main(String[] args) {

        int n = 172;
        int sourceBase = 8;
        int destBase = 2;

        int res = getValue(n, sourceBase, destBase);
        System.out.println(res);
    }

    public static int getValue(int n, int b1, int b2) {
        int dec = getValueInDecimal(n, b1);
        int dn = getValueInBase(dec, b2);
        return dn;
    }

    public static int getValueInBase(int n, int b) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % b;
            n = n / b;
            rv = rv + (dig * p);
            p = p * 10;
        }
        return rv;

    }

    public static int getValueInDecimal(int n, int b) {
        int rv = 0;
        int p = 1;

        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            rv = rv + (dig * p);

            p = p * b;
        }
        return rv;
    }

}
