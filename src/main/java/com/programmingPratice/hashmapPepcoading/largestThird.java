package com.programmingPratice.hashmapPepcoading;

import java.util.PriorityQueue;

public class largestThird {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int[] ranks = {22, 99, 3, 11, 88, 4, 1};
        int k = 3;


        for (int i = 0; i < ranks.length; i++) {

            if (i < k) {
                pq.add(ranks[i]);
            } else {
                if (ranks[i] > pq.peek()) {

                    pq.remove();
                    pq.add(ranks[i]);
                }
            }
        }
        while (pq.size() > 0) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}

