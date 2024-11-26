package com.programmingPratice.hacker;

public class breakRecord {
    public static void main(String[] args) {
        int[] a = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        breakRecordBasket(a);
    }

    public static void breakRecordBasket(int[] a) {
        int lowestCount = 0;
        int highestCount = 0;

        int lowestScore = a[0];
        int HIghestScore = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] < lowestScore) {
                lowestScore = a[i];
                lowestCount++;
            } else if (a[i] > HIghestScore) {
                HIghestScore = a[i];
                highestCount++;
            }
        }
        System.out.println(highestCount + " " + lowestCount);
    }

}
