package com.programmingPratice.pepcoading;

import java.util.*;

public class RemoveDuplicateInString {
    public static void main(String[] args) {

        ArrayList<Integer> listWithDuplicates = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 3, 2, 2, 3));
        Set<Integer> set = new HashSet<>();
        set.addAll(listWithDuplicates);

        System.out.println(set);
    }
}
