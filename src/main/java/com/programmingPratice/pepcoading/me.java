package com.programmingPratice.pepcoading;

public class me {
    public static void main(String[] args) {
        int[] array1 = {5, 3, 8, 1};
        int[] array2 = {7, 2, 6, 4};

        // Step 1: Merge the arrays
        int[] mergedArray = mergeArrays(array1, array2);

        // Step 2: Sort the merged array using Merge Sort
        mergeSort(mergedArray, 0, mergedArray.length - 1);

        // Display the sorted merged array
        System.out.print("Sorted Merged Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    // Method to merge two arrays
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int index = 0;

        // Copy elements from the first array
        for (int i = 0; i < array1.length; i++) {
            mergedArray[index++] = array1[i];
        }

        // Copy elements from the second array
        for (int i = 0; i < array2.length; i++) {
            mergedArray[index++] = array2[i];
        }

        return mergedArray;
    }

    // Merge Sort Implementation
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sort the left half
            mergeSort(array, left, mid);

            // Sort the right half
            mergeSort(array, mid + 1, right);

            // Merge the two halves
            merge(array, left, mid, right);
        }
    }

    // Merge function for Merge Sort
    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray (if any)
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray (if any)
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
