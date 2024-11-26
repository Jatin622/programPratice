package com.programmingPratice.recursionPratice;

public class binarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 44, 55, 66, 77, 88, 99};
        int target = 77;
        search(arr, target, 0, arr.length - 1);
    }

    public static void search(int[] arr, int target, int low, int high) {

        int mid = (low + high) / 2;
        int midValue = arr[mid];

        if (midValue == target) {
            System.out.println("Element found at index: " + mid);
            return;
        } else if (midValue < target) {
            search(arr, target, mid + 1, high);
        } else {
            search(arr, target, low, mid - 1);
        }
    }

}
