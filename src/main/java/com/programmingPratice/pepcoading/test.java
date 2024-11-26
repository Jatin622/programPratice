package com.programmingPratice.pepcoading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        // Input: arr1 = [1, 2, 3, 4, 5], arr2 = [3, 4, 5, 6, 7]

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        List list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {

            if (list.contains(arr2[i])) {
                System.out.println(arr2[i]);
            }
        }

    }
}
