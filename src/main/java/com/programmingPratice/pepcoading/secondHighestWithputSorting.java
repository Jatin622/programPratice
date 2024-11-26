package com.programmingPratice.pepcoading;

import java.util.HashSet;

public class secondHighestWithputSorting {
    public static void main(String[] args) {

        int[] a = {10, 20, 40, 30, 60};
        int b =2;
        int temp;
        HashSet<Integer> set = new HashSet<>();

        for (int i = a.length - 1; i > b; i--) {
            for (int j = i - 1; j > 0; j--) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                set.add(a[i]);
            }
        }
        System.out.println(set);

//        int maxNumber = set.stream()
//                .mapToInt(Integer::intValue)
//                .min()
//                .orElse(Integer.MIN_VALUE);
//        System.out.println(maxNumber);
    }
}
