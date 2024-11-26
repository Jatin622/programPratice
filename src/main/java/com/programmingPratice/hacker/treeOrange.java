package com.programmingPratice.hacker;

public class treeOrange {
    public static void main(String[] args) {
        int s = 7;
        int t = 11;

        int[] apple = {5, -3, -2, -5};
        int[] orange = { 15, 2, 2, 6};
        int appleTreeDistance = 4;
        int orangeTreeDistance = 12;
        countApplesAndOranges(s, t, apple, orange, appleTreeDistance, orangeTreeDistance);

    }

    public static void countApplesAndOranges(int s, int t, int[] apple, int[] orange, int appleTreeDistance, int orangeTreeDistance) {

        int orangeCount = 0;
        int appleCount = 0;

        for (int i = 0; i < apple.length; i++) {

            if (apple[i] + appleTreeDistance >= s) {
                appleCount++;
            }
        }

        for (int i = 0; i < apple.length; i++) {

            if (orange[i] + orangeTreeDistance >= t) {
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}
