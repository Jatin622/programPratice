package com.programmingPratice.stream.pepcoadingStream;

import java.util.Arrays;
import java.util.List;

public class start1 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

        myList.stream().map(x-> x+"").filter(x->x.startsWith("1")).forEach(System.out::println);
    }
}
