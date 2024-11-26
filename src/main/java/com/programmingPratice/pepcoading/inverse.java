package com.programmingPratice.pepcoading;

import java.util.Scanner;

public class inverse {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int n = 21453;

        int inv=0;
        int originalPlace = 1;


        while(n !=0){
            int originalDigit =n %10; //35412
            int invertedDigit =originalPlace;//12345(inverse)
            int invertedPlace =originalDigit;//35412

            //make change to inv using ip and id
            inv = inv + invertedDigit * (int)Math.pow(10,invertedPlace-1); //0 +

            n =n /10;
            originalPlace++;

        }
        System.out.println(inv);
    }
}
