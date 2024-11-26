package com.programmingPratice.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//comaparator by default using one abstract method so we can use lambda expression
public class MyComparatorLambda {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(30);
        System.out.println(arrayList);
        Comparator<Integer> c = (o1, o2) -> (o1 < o2) ? -1 : (o1 > o2) ? 1 : 0;

        Collections.sort(arrayList, c);
        System.out.println(arrayList);
        arrayList.stream().forEach(System.out::println);
    }
}
