package com.programmingPratice.stream.pepcoadingStream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class addTwoA {
    public static void main(String[] args) {
        int[] a = {10, 20, 40};
        int[] a1 = {10, 20, 30};

        int[] c = IntStream.range(0, a.length)
                .map(i -> a[i] + a1[i])
                .toArray();

        System.out.println(Arrays.toString(c));

    }
}
