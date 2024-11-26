package com.programmingPratice.hacker;

public class aliceBobComparing {
    public static void main(String[] args) {
        int[] a = {17, 28, 30};
        int[] b = {99, 16, 8};
        comp(a, b);
    }

    public static void comp(int[] a, int[] b) {

        int d = 0;
        int e = 0;
        for (int i = 0, j = 0; i < a.length && j < b.length; i++, j++) {

            if (a[i] > b[j]) {

                d += 1;
            } else if (a[i] < b[j]) {
                e += 1;
            }
        }
        System.out.println(d+" "+e);

    }

}
