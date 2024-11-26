package com.programmingPratice.stream.pratice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class findIndexSecond {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        int target = 5;
        int index = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList())
                .indexOf(target);

        if (index != -1) {
            System.out.println("Number found at index: " + index);
        } else {
            throw new IllegalArgumentException("Number not found in the array.");
        }
    }
}
