package com.programmingPratice.recursionPratice;

public class sortArrayRecursion {
    public static void main(String[] args) {
        int[] a = {1, 2, 1,9};
        System.out.println(sortArray(a, 0));


    }

    public static boolean sortArray(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sortArray(arr, index + 1);
    }

}
