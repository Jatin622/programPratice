package com.programmingPratice.pepcoading;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class removeDuplicateLoop {
    public static void removeDuplicateUsingSorting(int arr[]) {

        Arrays.sort(arr);

        int len = arr.length;
        int j = 0;

        for (int i = 0; i < len - 1; i++) {

            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }

        arr[j++] = arr[len - 1];

        for (int k = 0; k < j; k++) {
            System.out.print(arr[k] + " ");
        }
    }


    public static void main(String[] args) {

        int arr[] = {50, 10, 20, 60, 40, 40, 50, 60, 80, 70, 60};
        removeDuplicateUsingSorting(arr);


    }
}
