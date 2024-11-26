package com.programmingPratice.recursion;

public class ArrayReverse {
    public static void main(String[]args){
        int []a = {10,20,30,40};
        int index=a.length;
        reverseArray(a,0);
    }
    public static void reverseArray(int[]a,int index){

        if(index==a.length){
            return;
        }

        reverseArray(a,index+1);
        System.out.println(a[index]);
    }
}
