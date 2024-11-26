package com.programmingPratice.pepcoading1;

public class addTwoArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};

        int[] a1 = {10, 20, 30};

        int i = 0;
        int j = 0;

        for (; i < a.length && j<a1.length; i++,j++) {

            int c=a[i]+a1[j];
            System.out.println(c);
        }
    }
}
