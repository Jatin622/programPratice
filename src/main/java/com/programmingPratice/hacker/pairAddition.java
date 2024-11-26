package com.programmingPratice.hacker;

public class pairAddition {
    public static void main(String[] args) {
        int[] ar = {1, 3, 2, 6, 1, 2};
        int k = 3;
        System.out.println(pairCalculate(ar, k));
    }

    public static int pairCalculate(int[] arr, int k) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if ((arr[i] + arr[j]) % k == 0) {
                    count++;

                }
            }
        }
        return count;

    }
}
