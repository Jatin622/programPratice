package com.programmingPratice.pepcoading;

import java.util.Collections;
import java.util.PriorityQueue;

public class KlowestValue {
    public static void main(String[] args) {


        // Array input
        int[] a = {10, 20, 40, 30, 60, 5, 15};

        int k = 2;

        // Max-heap to store the top k smallest elements
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Iterate through the array
        for (int num : a) {
            maxHeap.add(num); // Add elements to the heap
            if (maxHeap.size() > k) {
                maxHeap.poll(); // Remove the largest element if size exceeds k
            }
        }

        // The root of the max-heap is the kth smallest number
        System.out.println("The " + k + "th smallest number is: " + maxHeap.peek());
    }
}
