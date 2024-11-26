package com.programmingPratice.pepcoading;

public class mergeAndSort {
    public static void main(String[] args) {
        int[] a = {2, 5, 12, 18, 20};
        int[] b = {7, 9, 11, 15, 25, 28, 30};
        int[] r = mergeTwoSort(a, b);

        for (int s : r) {
            System.out.println(s);
        }

    }

    public static int[] mergeTwoSort(int[] a, int[] b) {

        int[] res = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {

                res[k] = a[i];
                i++;
                k++;
            } else {
                res[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length) {
            res[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            res[k] = b[i];
            j++;
            k++;
        }
        return res;
    }
}
