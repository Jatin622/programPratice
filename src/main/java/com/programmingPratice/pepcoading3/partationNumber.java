package com.programmingPratice.pepcoading3;

public class partationNumber {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1};

        zeroOnes(arr);
        printNumber(arr);
    }

    public static void zeroOnes(int[] arr) {

        int i = 0;
        int j = 0;

        for (int a : arr) {

            if (a != 0) {
                i++;
            } else {
                swap(arr, i, j);
                i++;
                j++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printNumber(int[] arr) {
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
