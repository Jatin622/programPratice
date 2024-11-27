package com.programmingPratice.pepcoading3;

import java.util.HashMap;
import java.util.Map;

public class DistinctElementFount {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 2, 3, 4, 5, 4, 5, 1};
        findDistinctElement(arr);
    }

    public static void findDistinctElement(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            if (hashMap.containsKey(arr[i])) {

                int getValur = hashMap.get(arr[i]);
                hashMap.put(arr[i], getValur + 1);
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}