package com.programmingPratice.hacker;

public class diffNumber {
    public static void main(String[] args) {

        int i = 20;
        int j = 23;
        double k = 6;
        beautifulDays(i, j, k);
    }

    public static void beautifulDays(int i, int j, double k) {

        int n = 0;
        int dup = 0;
        for (int l = i; l <= j; l++) {
            dup = l;
            while (dup > 0) {
                n=n*10;
                n = (dup % 10)+n;
                dup = dup / 10;
            }
            double total = (l - n) / k;


            System.out.println(total);
            n=0;
        }

    }
}
