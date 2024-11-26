package com.programmingPratice.hacker;

import java.util.Arrays;
import java.util.stream.IntStream;

public class childPlaying {
    public static void main(String[] args) {

        int[] c = {0, 0, 1, 0, 0, 1, 1, 0};
        int k = 2;
        System.out.println(jumpingOnClouds(c, k));
    }

    public static int jumpingOnClouds(int[] c, int k) {
        int e = 100;
//        for (int i = k; i < c.length; i += 2) {
//
//            if (c[i] == 0) {
//                e = e - 1;
//            } else if (c[i] == 1) {
//                e = e - 3;
//            }
//        }

        e = IntStream.range(k, c.length) // Create a stream of indices from `k` to `c.length - 1`
                .filter(i -> i % 2 == 0) // Filter to include only indices with step 2
                .map(i -> c[i]) // Map the indices to their corresponding values in `c`
                .map(value -> value == 0 ? -1 : value == 1 ? -3 : 0) // Map values to their decrements
                .reduce(e, Integer::sum);
        return e;
    }
}
