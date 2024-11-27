package com.programmingPratice.pepcoading3;

public class findMIssingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6, 7, 8};
        missNumber(arr);
    }

    public static void missNumber(int[] arr) {
        int j = 0;
        for (int i = 0; i <=10; i++) {

            j = j + 1;

            if (arr[i] != j) {
                System.out.println(j);
                i--;
            }
        }
    }
}
