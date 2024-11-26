package com.programmingPratice.stream.pratice;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class twoList {
    public static void main(String[]args) {
        List<List<Integer>> intList = List.of(List.of(2,6,7,8,2,45,90));
      //  List<Integer>list=intList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
     //   intList.stream().flatMap(Collection::stream).forEach(System.out::println);
        List<Integer>list=intList.stream().flatMap(Collection::stream).collect(Collectors.toList());

        System.out.println(list);

    }
}
