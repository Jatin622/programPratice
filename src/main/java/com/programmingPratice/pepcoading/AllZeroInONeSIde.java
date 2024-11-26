package com.programmingPratice.pepcoading;

import java.util.Arrays;

public class AllZeroInONeSIde {
    public static void main(String[]args){
        int []a={0,3,4,1,0,2,5,0,0};

        int j=0;
        int temp;

        for(int i=0;i<a.length;i++){
                if(a[i]>0){
                if(i!=j){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
