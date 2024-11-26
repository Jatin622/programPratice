package com.programmingPratice.functionAndArray;

public class findElementIndex {
    public static void main(String[]args){

        int []a={10,20,30,40,50};
        int b=60;
        for(int i=0; i<a.length;i++){
            if(a[i]==b){

                System.out.println(i);
            }
        }

    }
}
