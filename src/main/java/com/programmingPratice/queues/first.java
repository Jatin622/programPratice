package com.programmingPratice.queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class first {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();// we can use new Queue because queue is interface.

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue);

        System.out.println(queue.peek());
    }
}
