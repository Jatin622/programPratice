package com.programmingPratice.recursionPratice;

import java.util.ArrayList;
import java.util.List;

public class allIndexRecursion {
    public static void main(String[] args) {
        int a[] = {3, 2, 99, 99, 18};
        int target = 99;
        System.out.println(allIndex(a, target, 0));
    }

    public static List<Integer> allIndex(int[] arr, int target, int index) {


        if (index >= arr.length) {
            return new ArrayList<>();
        }

        List<Integer> list = new ArrayList<>();

        List<Integer> recursiveResult = allIndex(arr, target, index + 1);

        if (arr[index] == target) {
            list.add(index);
        }
        list.addAll(recursiveResult);

        return list;
    }
}
