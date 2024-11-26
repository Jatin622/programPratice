package com.programmingPratice.stream.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class nameAdd {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Scott", "David", "John");
        List<String> list1 = Arrays.asList("Marry", "Luna", "Tom");
        List<String> list2 = Arrays.asList("Ken", "Jony", "Kitty");


        List<List<String>> finalList = Arrays.asList(list, list1, list2);

//        for (List<String> newWorld : finalList) { // using for loop
//            for (String name : newWorld) {
//                System.out.println(name);
//            }
//        }

        List<String> result = finalList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());

        System.out.println(result);

    }
}
