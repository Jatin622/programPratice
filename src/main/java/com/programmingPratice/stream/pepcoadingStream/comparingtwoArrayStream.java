package com.programmingPratice.stream.pepcoadingStream;

import java.util.Arrays;
import java.util.HashSet;

public class comparingtwoArrayStream {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5};
        int[] b = {1, 4, 6, 5};
        HashSet<Integer> hashSet = new HashSet<>();


        Arrays.stream(a).mapToObj(hashSet::add).forEach(e -> {
        });

        Arrays.stream(b).filter(x -> !hashSet.contains(x)).forEach(y -> System.out.println(y));
    }

}