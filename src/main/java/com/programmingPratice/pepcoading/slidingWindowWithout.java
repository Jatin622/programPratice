package com.programmingPratice.pepcoading;

public class slidingWindowWithout {
    public static void main(String[] ars) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int k = 4;
        printKMax(arr, arr.length, k);

    }

    public static void printKMax(int[] arr, int n, int k) {

        int j, max;

        for (int i = 0; i <= n - k; i++) {
            max = arr[i];

            for (j = 1; j < k; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }
            System.out.println(max + "");
        }
    }
}
