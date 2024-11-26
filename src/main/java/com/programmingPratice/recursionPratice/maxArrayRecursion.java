package com.programmingPratice.recursionPratice;

public class maxArrayRecursion {
    public static void main(String[] args) {
        int a[] = {3, 2, 19, 99, 19,20};
        System.out.println(maximum(a, 0));
    }

    public static int maximum(int[] arr, int index) {

        if (index == arr.length - 1) {
            return arr[index];
        }

        int misa = maximum(arr, index + 1);

        if (misa > arr[index]) {
            return misa;
        } else {
            return arr[index];
        }

    }
}
