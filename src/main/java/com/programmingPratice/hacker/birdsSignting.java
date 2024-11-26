package com.programmingPratice.hacker;

import java.util.HashMap;
import java.util.Map;

public class birdsSignting {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        System.out.println(callculateHighestOccur(arr));
    }

    public static int callculateHighestOccur(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : arr) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        System.out.println(hashMap);

        int maxCount = Integer.MIN_VALUE;
        int keyWithMaxCount = -1;
        for (int key : hashMap.keySet()) {
            int count = hashMap.get(key);
            if (count > maxCount) {
                maxCount = count;
                keyWithMaxCount = key;
            }
        }
        return keyWithMaxCount;
    }
}
