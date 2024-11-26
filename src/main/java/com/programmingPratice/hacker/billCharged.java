package com.programmingPratice.hacker;

public class billCharged {
    public static void main(String[] args) {

        int[] a = {3, 10, 2, 9};
        int k = 1;

        int bill = 12;
        billChargeds(a,k,bill);
    }

    public static void billChargeds(int[] a, int k, int bill) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] != a[k]) {
                sum += a[i];
            }
        }
        int s = sum / 2;

        if (s != bill) {

            System.out.println(s);
        } else {
            System.out.println("Bon Appetit");
        }

    }
}
