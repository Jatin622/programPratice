package com.programmingPratice.pepcoading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class comparingTwoArray {
    public static void main(String[] args) {
        Integer[] first = {1, 2, 3, 4, 5};
        Integer[] second = {2, 3, 1, 0, 5};

        System.out.println(getMissingNumbers(first, second));

    }

    private static List<Integer> getMissingNumbers(Integer[] first, Integer[] second) {
        List<Integer> missing = new ArrayList<Integer>(new HashSet<Integer>(Arrays.asList(first)));
        for (Integer num : second) {
            missing.remove(num);
        }
        return missing;
    }
}
