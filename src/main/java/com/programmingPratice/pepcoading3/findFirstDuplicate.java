package com.programmingPratice.pepcoading3;

import java.util.HashSet;

public class findFirstDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 3, 5, 4};
        firstDuplicate(arr);
    }

    public static void firstDuplicate(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();

        for (int ar : arr) {

            if (seen.contains(ar)) {
                System.out.println(ar);
                break;
            } else {
                seen.add(ar);
            }
        }

    }
}
