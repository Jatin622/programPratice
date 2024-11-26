package com.programmingPratice.recursionPratice;

import java.util.ArrayList;
import java.util.List;

public class r {
    public static void main(String[] args) {
        int a[] = {3, 2, 19, 99, 19};
        int target = 19;
        System.out.println(searchElement(a, 0, target));
    }

    public static List<Integer> searchElement(int[] arr, int index, int target) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        if (index == arr.length) {
            return arrayList;
        }

        if (arr[index] == target) {
            arrayList.add(index);
        }
        arrayList.addAll(searchElement(arr, index + 1, target));

        return arrayList;
    }
}
