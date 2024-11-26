package com.programmingPratice.hacker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class optimiseHurdle {
    public static void main(String[] args) {

        int k = 4;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(3);
        list.add(5);
        list.add(2);
        System.out.println(hurdleRace(k, list));
    }

    public static int hurdleRace(int k, List<Integer> arr) {

        int max = Collections.max(arr);

        if (k > max) {
            return 0;
        } else {
            return max - k;
        }
    }

}
