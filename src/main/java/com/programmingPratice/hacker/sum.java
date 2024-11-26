package com.programmingPratice.hacker;

import java.util.Scanner;

public class sum {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        System.out.println(sumInt(a,b));
    }
    public static int sumInt(int a, int b){
         int c =a+b;
         return c;
    }
}
