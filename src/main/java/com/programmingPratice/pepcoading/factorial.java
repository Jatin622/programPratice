package com.programmingPratice.pepcoading;

public class factorial {
    public static void main(String[] args) {
        int a = 4;
        int b=2;
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;

        }
        int nprfact=1;
        for(int i=1; i<=a-b;i++){
            nprfact=nprfact*1;
        }
        int npr=fact/nprfact;
        System.out.println(a +"p"+ b +"=" +npr);
    }
}
