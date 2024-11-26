package com.programmingPratice.recursion;

public class ZingZag {
    public static void main(String[]args){
        int a=2;
        pzz(a);
    }
    public static void pzz(int a){
        if(a==0){
            return;
        }
        System.out.println("1");
        pzz(a-1);//1
        System.out.println("2");
        pzz(a-1);
        System.out.println("3");
    }
}
