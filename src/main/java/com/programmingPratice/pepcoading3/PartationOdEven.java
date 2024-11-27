package com.programmingPratice.pepcoading3;

public class PartationOdEven {
    public static void main(String[] args) {

        int[] arr = {7, 9, 4, 3, 6, 2, 1};
        partationOddEven(arr);
        printArray(arr);
        //odd=1,3,7,9
        //even =4,6,2
    }

    public static void partationOddEven(int[] arr) {

        int i = 0;
        int j = 0;
        while (i < arr.length) {

            if (arr[i] % 2 != 0) {
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

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

