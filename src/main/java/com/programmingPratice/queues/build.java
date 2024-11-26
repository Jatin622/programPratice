package com.programmingPratice.queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class build {
    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();
        if (queue.size() > 5) {
            System.out.println("overflow");
        }else {
            queue.add(10);
            queue.add(20);
            queue.add(30);
            queue.add(40);
            queue.add(60);
        }

        System.out.println(queue);
    }
}
