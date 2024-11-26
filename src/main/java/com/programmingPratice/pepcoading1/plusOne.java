package com.programmingPratice.pepcoading1;

import java.util.Arrays;

public class plusOne {
    public static int plus(int []a){

        int i=0;

        for(i=a.length-1;i>0;i--){

            if(i>i-1){
                a[i]+=1;

            }
        }
        return a[i];
    }
    public static void main(String[]args){
        int []a={2,3,4,5};
        plus(a);
        System.out.println(Arrays.toString(a));
    }
}
