package com.programmingPratice.hacker;

public class jailPoision {
    public static void main(String[] args) {

        int n = 4; //number
        int m = 6;// people
        int s = 2;//where we start
        System.out.println(saveThePrisoner(n, m, s));
    }

    //2,3,4,1,2,3
    public static int saveThePrisoner(int n, int m, int s) {

        m = m % s;
        s = s + m - 1;
        if (s > n) {
            s = s % n;
        }
        if (s == 0) {
            return n;
        }
        return s;
    }
}
