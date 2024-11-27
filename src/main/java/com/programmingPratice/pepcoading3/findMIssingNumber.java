package com.programmingPratice.pepcoading3;

public class findMIssingNumber {
    public static void main(String[] args) {

        int[] arr = {11, 12, 14, 15, 16, 17, 18};
        missNumber(arr);
    }

    public static void missNumber(int[] arr) {

        int start = 11;
        int end = 20;
        int currentIndex = 0;

        for (int i = start; i <= end; i++) {

            if (currentIndex < arr.length && arr[currentIndex] == i) {

                currentIndex++;
            } else {
                System.out.println(i);
            }
        }
    }
}
