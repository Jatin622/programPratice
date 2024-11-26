package com.programmingPratice.pepcoading;

import java.util.Arrays;

public class SortArrayMaxLastThree {
    public static void main(String[] args) {
        int arr[] = {50, 10, 20, 60, 40, 40, 50, 60, 80, 100, 60};
        int b = 3;
        Arrays.sort(arr);
        for(int i=arr.length-1;i>arr.length-1-b;i--) {
            System.out.println(arr[i]);
        }
    }
}
