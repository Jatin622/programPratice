package com.programmingPratice.recursion;

public class maxArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int max=max(a,0);
        System.out.println(max);

    }
    public static int max(int []a,int index){
        if(index==a.length-1){
            return a[index];
        }

        int misa= max(a,index+1);

        if(misa>a[index]){
            return misa;
        }
        else{
            return a[index];
        }

    }

}
