package com.programmingPratice.hacker;

import java.util.HashMap;

public class pairCalculate {
    public static void main(String[] args) {

        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        calculatePair(ar);
    }

    public static void calculatePair(int[] ar) {

        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : ar) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        System.out.println(hashMap);
        for (int key : hashMap.keySet()) {
            int c = hashMap.get(key);

            if (c % 2 == 0) {
                int x=c/2;
                count+=x;
            } else {
                int x = c / 2;
                count += x;
            }
        }
        System.out.println(count);
    }
}
