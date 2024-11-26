package com.programmingPratice.pepcoading1;

public class sumParticularPosition {
    public static void main(String[] args) {

        int[] a = {2, 3, 4, 15, 6};
        int start = 1;
        int end = 3;

        int sum = 0;

        for (int i = start; i <= end; i++) {

            sum += a[i];
        }
        System.out.println(sum);

    }
}
