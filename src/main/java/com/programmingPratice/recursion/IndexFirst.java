package com.programmingPratice.recursion;

public class IndexFirst {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 30};
        int b = 30;
        int d = findIndex(a, b, 0);
        System.out.println(d);
    }

    public static int findIndex(int[] a, int b, int index) {

        if (index == a.length) {
            return -1;
        }
        if (a[index] == b) {
            return index;
        } else {
            int fissa = findIndex(a, b, index + 1);
            return fissa;
        }

    }
}
