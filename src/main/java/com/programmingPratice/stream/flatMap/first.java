package com.programmingPratice.stream.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class first {
    public static void main(String[] args) {

        //map() = they take the one value and operation and return

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().map(n -> n + 5).forEach(n -> System.out.println(n));

        //flatmap() = they take the multiple value at a tine..one full object and do operation

        List<Integer> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(3, 4);
        List<Integer> list3 = Arrays.asList(5, 6);

        List<List<Integer>> finalList = Arrays.asList(list1, list2, list3);


        List<Integer> resultSum = finalList.stream().flatMap(x -> x.stream().map(n -> n + 5)).collect(Collectors.toList());

        List<Integer> resultSimple = finalList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());

        //first stream for take the data , 2 stream for take one object and do opeation

        System.out.println(resultSum);
        System.out.println(resultSimple);


    }
}
