package com.programmingPratice.stream.pepcoadingStream;

import java.util.stream.IntStream;

public class factStream {
    public static void main(String[]args){
        int mul=1;

        int result=IntStream.rangeClosed(1,5).reduce(mul,(x,y)->x*y);

        System.out.println(result);
    }
}
