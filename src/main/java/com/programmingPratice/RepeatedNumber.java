package com.programmingPratice;

public class RepeatedNumber {
    public static void main(String[] args) {
        int i=99098;

        int count =0;
        while (i>0){
            int remainder =i%10;
            if(remainder==9){
                count++;
            }
            i =i/10;
        }
        System.out.println(count);
    }


}
