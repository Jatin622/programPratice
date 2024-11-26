package com.programmingPratice.pepcoading1;

import java.util.Arrays;

public class secondHighest {
    public static void main(String[]args){

        int []arr={2,3,1,4,5,8,6,7};
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>arr[i-1]){
                System.out.println(arr[i-1]);
                break;
            }
        }
    }
}
