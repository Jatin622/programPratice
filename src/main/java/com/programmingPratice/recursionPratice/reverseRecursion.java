package com.programmingPratice.recursionPratice;

public class reverseRecursion {
    public static void main(String[] args) {
        int a[] = {3, 2, 19, 99, 19};
        reverse(a, a.length-1);
    }

    public static void reverse(int[] arr, int index) {
        if (index < 0) {
            return;
        }
        System.out.println(arr[index]);
        reverse(arr, index - 1);

    }
}
