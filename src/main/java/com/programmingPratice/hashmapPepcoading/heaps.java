package com.programmingPratice.hashmapPepcoading;

import java.util.PriorityQueue;

public class heaps {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int[] ranks = {22, 99, 3, 11, 88, 4, 1};

        for (int val : ranks) {
            pq.add(val);
        }
        while (pq.size() > 0) {

            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
