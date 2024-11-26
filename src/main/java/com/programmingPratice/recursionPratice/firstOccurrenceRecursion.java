package com.programmingPratice.recursionPratice;

public class firstOccurrenceRecursion {
    public static void main(String[] args) {
        int a[] = {3, 2, 19, 99, 19};
        int target = 2;
        System.out.println(firstOccurrence(a, target, 0));
    }

    public static int firstOccurrence(int[] arr, int target, int index) {
        // Base case: if index exceeds the array length, target is not found.
        if (index >= arr.length) {
            return -1;
        }

        // Check if the current element is the target.
        if (arr[index] == target) {
            return index;
        }

        // Recursive call to search for the target in the rest of the array.
        return firstOccurrence(arr, target, index + 1);
    }

}


//public class firstOccurrenceRecursion {
//    public static void main(String[] args) {
//        int a[] = {3, 2, 19, 99, 19};
//
//        int target = 19;
//        System.out.println(firstOccurrence(a, target, 0));
//    }
//
//    public static int firstOccurrence(int[] arr, int target, int index) {
//
//
//        if (arr[index] == target) {
//            return index;
//        }
//        firstOccurrence(arr, target, index + 1);
//
//        return index;
//    }