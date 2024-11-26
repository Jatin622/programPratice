package com.programmingPratice.stream.pratice;

import java.util.stream.IntStream;

public class findIndex {
    public static void main(String[] args) {
        int[] a = {10, 20, 40};
        int b = 20;

        int index = IntStream.range(0, a.length)
                .filter(i -> a[i] == b)
                .findFirst()
                .orElse(-1);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
