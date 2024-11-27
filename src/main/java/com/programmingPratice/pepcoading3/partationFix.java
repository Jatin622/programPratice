package com.programmingPratice.pepcoading3;

public class partationFix {
    public static void main(String[] args) {
        int[] arr = {7, 2, 4, 3, 6, 5, 10};
        int pivot = 6;
        //1 2 3 4 6 7 9
        partationFixPivot(arr, pivot);
        printNumber(arr);
    }

    public static void partationFixPivot(int[] arr, int pivot) {

        int i = 0;
        int j = 0;

        for (int a : arr) {

            if (a < pivot) {
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
