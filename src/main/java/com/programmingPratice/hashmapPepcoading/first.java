package com.programmingPratice.hashmapPepcoading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class first {
    public static void main(String[] args) {

        List<String> str = Arrays.asList("a", "b", "r", "b");

        HashMap<String, Integer> hashMap = new HashMap<>();


        for (int i = 0; i < str.size(); i++) {

            String ch = str.get(i);

            if (hashMap.containsKey(ch)) {
                int of = hashMap.get(ch);
                int val = of + 1;
                hashMap.put(ch, val);
            } else {
                hashMap.put(ch, 1);
            }
        }

        System.out.println(hashMap);
    }
}
