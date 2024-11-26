package com.programmingPratice.pepcoading;

public class comparingTwoArrayLoop {


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 3, 4, 5, 6}; // missing 2

        int missing = findMissingNumber(arr1, arr2);
        System.out.println("The missing number is " + missing);
    }

    public static int findMissingNumber(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }

        for (int j = 0; j< arr2.length; j++) {
            sum2 += arr2[j];
        }

        return sum1 - sum2;
    }
    }

