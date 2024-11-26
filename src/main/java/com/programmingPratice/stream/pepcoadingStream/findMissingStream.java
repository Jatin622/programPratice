package com.programmingPratice.stream.pepcoadingStream;

import java.util.stream.IntStream;

public class findMissingStream {
    public static void main(String[] args) {
    int[] a = {1, 2, 4, 5, 6};


        IntStream.rangeClosed(1, a.length - 1)
            .filter(i -> a[i] - a[i - 1] != 1)
            .forEach(i -> {
        int missingNumber = a[i] - 1;
        System.out.println("Missing number: " + missingNumber);
    });
}
}

