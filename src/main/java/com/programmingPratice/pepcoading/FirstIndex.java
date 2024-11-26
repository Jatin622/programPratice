package com.programmingPratice.pepcoading;

public class    FirstIndex {
    public static void main(String[]args){
        int []a={10,20,30,40,30,60};
        int b=30;

        for(int i=0;i<a.length;i++){
            if(a[i]==b){
                System.out.println(i);
                break;
            }
        }
    }
}
