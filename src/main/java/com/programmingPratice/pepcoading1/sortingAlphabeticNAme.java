package com.programmingPratice.pepcoading1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortingAlphabeticNAme {
    public static void main(String[] args) {
        String names[] = {"Rahul", "Ajay", "Gourav", "Riya"};
        String temp;
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {

                if (names[i].compareTo(names[j]) > 0) {
                    // swapping
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
//returns a list view   // sort String
//        List<String> slist = Arrays.asList("Tanu", "Kamal", "Suman", "Lucky", "Bunty", "Amit");
//        List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());
//        sortedList.forEach(System.out::println);


//sor integer
//    List<Integer> slist = Arrays.asList(10,9,3,4);
//    List<Integer> sortedList = slist.stream().sorted().collect(Collectors.toList());
//        sortedList.forEach(System.out::println);