package com.programmingPratice.functionAndArray;

public class spanOfArray {
    public static void main(String[] args) {
        int[] a = {30, 30, 4, 2, 9};

        int max=a[0];
        int min=a[0];
        for(int i =1; i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        int span = max-min;
        System.out.println(span);
    }
}
