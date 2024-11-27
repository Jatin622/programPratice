package com.programmingPratice.pepcoading3;

public class PartationOfArray {
    public static void main(String[] args) {
// i have 5 pivot i want to go left side for less then 5 and go right side greater than 5
        int[] arr = {7, 9, 4, 3, 6, 2, 1};
        int pivot = 5;
        partation(arr, pivot);
        printArray(arr);
    }

    public static void partation(int[] arr, int pivot) {

        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] > pivot) {
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
