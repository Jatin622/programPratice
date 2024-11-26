package com.programmingPratice.hacker;

public class tallestCandles {
    public static void main(String[] args) {
        int[] a = {44 ,53, 31, 27, 77, 60, 66, 77, 26, 36};
        unitPrintLargest(a);

    }

    public static void unitPrintLargest(int[] a) {

        int count = 0;
        int largest = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] > largest) {
                count = 0;
                largest = a[i];
                count+=1;
            } else if (a[i] == largest) {
                count++;
            }

        }
        System.out.println(count);
    }
}
