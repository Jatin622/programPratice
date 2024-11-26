package com.programmingPratice.stream.pratice;

import java.util.stream.IntStream;

public class reverse {
    public static void main(String[]args){
        int[]a={12,3,4,5};

//IntStream.rangeClosed method to generate a stream of indices from 1 to the length of the array
// IntStream rangeClosed(int startInclusive, int endInclusive)


        IntStream.rangeClosed(1, a.length)
                .map(i -> a[a.length - i])
                .forEach(System.out::println);
    }
}
