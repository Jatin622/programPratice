package com.programmingPratice.stream.filter;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findEven {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(10, 15, 20, 25, 30);

        //FirstMethod

//        List<Integer>evenNumberList=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
//
//        System.out.println(evenNumberList); //[10, 20, 30]


        // SecondMethod

        numberList.stream().filter(n -> n % 2 == 0).forEach(k -> System.out.println(k)); // 10 ,20,30 //take one value and print
    }
}
