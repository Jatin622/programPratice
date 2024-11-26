package com.programmingPratice.recursion;

public class PrintArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};

        ArrayPrint(a, 0);
    }

    public static void ArrayPrint(int[] a, int index) {

        if (index == a.length) {
            return;

        }
        System.out.println(a[index]);
        ArrayPrint(a, index + 1);
    }
}
