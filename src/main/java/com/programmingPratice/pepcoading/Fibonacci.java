package com.programmingPratice.pepcoading;

public class Fibonacci {
    public static void main(String[]args){
        int i =0,j=1,k,count=10,o;

        for(o=2;o<count;++o){
            k = i+j;
            System.out.println(k);
            i=j;
            j=k;

        }
    }
}
