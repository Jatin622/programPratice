package com.programmingPratice.pepcoading;

import java.util.Arrays;

public class seperateNegativePoistive {
    public static void main(String[]args){
        int arr[] = { 10, -20, -90, 80, -30 };

        int j = 0, temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
