package com.programmingPratice.functionAndArray;

public class SubArray {
    public static void main(String[]args){
        int []a={10,20,30};

        for(int i=0;i<a.length;i++){
           for(int j=i;j<a.length;j++){
               for(int k=i;k<=j;k++)
                System.out.println(a[k] + "\t");

            }
           System.out.println();
        }
    }
}
