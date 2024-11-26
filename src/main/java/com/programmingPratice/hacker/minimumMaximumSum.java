package com.programmingPratice.hacker;

public class minimumMaximumSum {
    public static void main(String[] args) {

        int[] arr = {1, 2,3, 4,5};
        sumOfBigNumber(arr);
    }

    public static void sumOfBigNumber(int[] arr) {

        int smallest = 11110;
        int largest = 0;
        int total = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            temp = total;
            temp -= arr[i];

            if (smallest > temp) {
                smallest = temp;
            }
            if (largest < temp) {
                largest = temp;
            }
            temp = total;
        }
        System.out.println(smallest + " " + largest);
    }
}
