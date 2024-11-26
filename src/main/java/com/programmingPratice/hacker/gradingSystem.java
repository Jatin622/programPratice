package com.programmingPratice.hacker;

import java.util.Scanner;

public class gradingSystem {
    public static void main(String[] args) {
        int[] a = {73, 67, 38, 33};
        grading(a);
    }

    public static void grading(int[] a) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 38) {
                c = a[i];
                System.out.println(c);
            } else if (a[i] % 5 == 0) {
                c = a[i];
                System.out.println(c);
            } else if ((a[i] + 1) % 5 == 0) {
                c = a[i] + 1;
                System.out.println(c);
            } else if ((a[i] + 2) % 5 == 0) {
                c = a[i] + 2;
                System.out.println(c);
            } else {
                System.out.println(a[i]);
            }

        }
    }


}
