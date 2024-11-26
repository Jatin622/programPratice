package com.programmingPratice;

public class maximumInParticular {
    public static void main(String[]args){
        int[]arr={10,20,30,40,50};
        System.out.println(maximum(arr,1,3));
    }
    public static int maximum(int []arr,int start,int end){
        int maxvalue=arr[start];
        for(int i =start;i<=end;i++){
            if(arr[i]>maxvalue){
                maxvalue=arr[i];
            }
        }
        return  maxvalue;
    }
}
