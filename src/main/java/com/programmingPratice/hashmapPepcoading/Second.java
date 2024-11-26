package com.programmingPratice.hashmapPepcoading;

import java.util.HashMap;

public class Second {
    public static void main(String[] args) {

        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        int[] a = {10, 5, 9, 1, 11, 8, 6, 15, 3, 12, 2};

        for (int val : a) {
            hashMap.put(val, true);
        }

        for (int val : a) {
            if (hashMap.containsKey(val - 1)) {
                hashMap.put(val, false);
            }
        }
        int maxStartPoint = 0;
        int maximumLength = 0;

        for (int val : a) {

            if (hashMap.get(val) == true) {

                int temperaryLength = 1;
                int temperoryStartPoint = val;

                while (hashMap.containsKey(temperoryStartPoint + temperaryLength)) {
                    temperaryLength++;
                }
                if (temperaryLength > maximumLength) {
                    maxStartPoint = temperoryStartPoint;
                    maximumLength = temperaryLength;
                }
            }
        }
        for (int i = 0; i < maximumLength; i++) {

            System.out.println(maxStartPoint + i);
        }
    }

}
