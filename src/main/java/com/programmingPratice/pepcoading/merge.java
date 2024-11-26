package com.programmingPratice.pepcoading;

import java.util.PriorityQueue;

public class merge {
    public static void main(String[] args) {

        int[] a = {30, 10, 50, 100, 90};
        int k = 1;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < a.length; i++) {

            priorityQueue.add(a[i]);

            if (priorityQueue.size() > 1) {

                priorityQueue.poll();

            }
        }
        System.out.println(priorityQueue.peek());
    }
}
