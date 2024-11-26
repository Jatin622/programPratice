package com.programmingPratice.pepcoading;

public class findMissingNumber {
    public static void main(String[]args) {
        int[] a = {1, 2,3 ,4,6};

        for(int i=1;i<a.length;i++){

            int current =a[i];
            int previous =a[i-1];

            if(current-previous!=1){
                previous+=1;
                System.out.println(previous);
            }
            System.out.println(a[i]);
        }
    }
}
