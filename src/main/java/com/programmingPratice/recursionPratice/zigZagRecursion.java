package com.programmingPratice.recursionPratice;

public class zigZagRecursion {
    public static void main(String[] args) {
        int a = 3   ;
        pzz(a);
    }

    public static void pzz(int a) {
        if (a == 0) {
            return;
        }
        System.out.println("pre" + a);
        pzz(a - 1);
        System.out.println("in" + a);
        pzz(a - 1);
        System.out.println("post" + a);

    }
}
