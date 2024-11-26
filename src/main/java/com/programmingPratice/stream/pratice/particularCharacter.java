package com.programmingPratice.stream.pratice;

public class particularCharacter {
    public static void main(String[]args){

        String str="geeks";
        char c='e';

        long cc=str.chars().filter(x->x==c).count();

        System.out.println(cc);
    }
}
