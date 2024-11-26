package com.programmingPratice.stream.pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class startWith1 {
    public static void main(String[] args) {

        String[] first = {"Aman", "nikhil", "rishab", "Aman"};
        String[] second = {"Aman", "nikhil"};
//
//        List<String> duplicates = Arrays.stream(first)
//                .filter(Arrays.asList(second)::contains)
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(duplicates);

        //SecondMethod
 //       List<String> list = new ArrayList<>();
//        for (String str : first) {
//            Arrays.stream(second).anyMatch(x -> x.equalsIgnoreCase(str));
//            list.add(str);
//        }
//
//        System.out.println(list);

 // third method
        List<String> l = Arrays.stream(first).filter(x -> Arrays.stream(second).
                anyMatch(y -> y.equalsIgnoreCase(x))).collect(Collectors.toList());
//
//        System.out.println(l);
    }
}


//
//public static void main(String[] args) {
//        int[] a = {2, 400, 500,600, 3, 1, 2, 4,5,6};
//
//        Stack<Integer> stack = new Stack<>();
//        List<Integer> list = new ArrayList<>();
//        stack.push(a[0]);
//        list.add(0);
//
//        for (int i = 1; i < a.length; i++) {
//        if (!stack.empty()) {
//        if (stack.peek() < a[i]) {
//        stack.push(a[i]);
//        } else {
//        if (list.size() < stack.size()) {
//        list.clear();
//        while (!stack.empty()) {
//        list.add(stack.pop());
//        }
//        }
//        stack.push(a[i]);
//        }
//        }
//
//        }