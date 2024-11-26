package com.programmingPratice.stream.pepcoadingStream;

public class countStream {

    public static void main(String[]args){

        int a=12222;

        String s=Integer.toString(a);

        long l=s.chars().count();

        System.out.println(l);
    }
}
