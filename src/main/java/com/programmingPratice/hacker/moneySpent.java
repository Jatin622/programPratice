package com.programmingPratice.hacker;

public class moneySpent {
    public static void main(String[] args) {
        int b = 60;
        int[] keyboards = {40, 50, 60};

        int[] drives = {5, 8, 12};
        System.out.println(getMoneySpent(keyboards, drives, b));
    }

    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int total = 0;

        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {

                if (total < keyboards[i] + drives[j] && b > keyboards[i] + drives[j]) {

                    total = keyboards[i] + drives[j];

                }
            }
        }
        if(total==0){
            return -1;
        }
        return total;
    }
}
