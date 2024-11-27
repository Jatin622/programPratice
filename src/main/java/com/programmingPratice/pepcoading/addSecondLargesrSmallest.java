package com.programmingPratice.pepcoading;

import java.util.Collections;
import java.util.PriorityQueue;

public class addSecondLargesrSmallest {
    public static void main(String[] args) {

        int[] arr = {45, 23, 7, 33, 3, 11};
        System.out.println(secondLargest(arr));

        int sum = secondSmallest(arr) + secondLargest(arr);

        System.out.println(sum);

    }

    public static int secondLargest(int[] arr) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {

            queue.add(arr[i]);

            if (queue.size() > 2) {
                queue.poll();
            }
        }
        return queue.peek();
    }

    public static int secondSmallest(int[] arr) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {

            queue.add(arr[i]);
            if (queue.size() > 2) {
                queue.poll();
            }
        }
        return queue.peek();
    }
}
