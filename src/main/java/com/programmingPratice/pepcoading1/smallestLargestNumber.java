package com.programmingPratice.pepcoading1;

public class smallestLargestNumber {
    public static void main(String[]args){

        int[]a={2,3,4,9,5};

        int greatest=a[0];
        int smallest=a[0];

        for(int i=1;i<a.length;i++){
            if(a[i]>greatest){
                greatest=a[i];
            }
            if(a[i]<smallest){
                smallest=a[i];
            }
        }
        System.out.println(greatest);
        System.out.println(smallest);


    }}
