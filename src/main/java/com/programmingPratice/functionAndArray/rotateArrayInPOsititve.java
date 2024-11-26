package com.programmingPratice.functionAndArray;

public class rotateArrayInPOsititve {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};

        int N = arr.length;
        int d = 2;

        // Function calling
        Rotate(arr, d, N);
        PrintTheArray(arr, N);
    }
    static void Rotate(int arr[], int d, int n) {
        // Storing rotated version of array
        int temp[] = new int[n];

        // Keeping track of the current index
        // of temp[]
        int k = 0;

        // Storing the n - d elements of
        // array arr[] to the front of temp[]
        for (int i = d; i < n; i++) {
            temp[k] = arr[i];
            k++;
        }

        // Storing the first d elements of array arr[]
        //  into temp
        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }

        // Copying the elements of temp[] in arr[]
        // to get the final rotated array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    // Function to print elements of array
    static void PrintTheArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
