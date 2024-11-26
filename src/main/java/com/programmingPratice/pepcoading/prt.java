package com.programmingPratice.pepcoading;

import java.util.PriorityQueue;

public class prt {
    public static void main(String[] args) {

        int[] a = {100, 120, 40, 30, 60};
        int k = 2;

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < a.length; i++) {

            queue.add(a[i]);

            if (queue.size() > k) {
                queue.poll();
            }
        }
        System.out.println(queue.peek());

    }

}
