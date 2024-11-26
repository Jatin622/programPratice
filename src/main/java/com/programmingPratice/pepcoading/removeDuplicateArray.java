package com.programmingPratice.pepcoading;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicateArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 90, 80, 80, 60, 50, 90, 110,100};
        Set set = new HashSet<>();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            set.add(arr[i]);
        }

        System.out.println(set);
    }

}
