package com.programmingPratice;

public class max {
    public static void main(String[]args){
        int []arr= {10,20,50,70};
        System.out.println(maximum(arr));
    }
    public static int maximum(int[]arr){
            int maxvalue=arr[0];
        for(int i=1; i< arr.length;i++){
            if(arr[i]>maxvalue){
                maxvalue=arr[i];
            }
        }
        return maxvalue;
    }
}
