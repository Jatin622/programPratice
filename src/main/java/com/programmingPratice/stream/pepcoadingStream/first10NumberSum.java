package com.programmingPratice.stream.pepcoadingStream;

import java.util.stream.IntStream;

public class first10NumberSum {
    public static void main(String[]args){

        int total=IntStream.rangeClosed(0,10).sum();

        System.out.println(total);
    }
}
