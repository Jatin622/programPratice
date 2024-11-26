package com.programmingPratice.pepcoading;

import java.util.PriorityQueue;

//priority queue wirtie the value in soritng order in smallest value first
public class secondHighestApproch {
    public static void main(String[] args) {
        int[] a = {100, 120, 40, 30, 60};
        int k = 2;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < a.length; i++) {

            minHeap.add(a[i]);

            if (minHeap.size() > k) {

                minHeap.poll();
            }
        }
        System.out.println("The " + k + "th highest number is: " + minHeap.peek());

    }
}
