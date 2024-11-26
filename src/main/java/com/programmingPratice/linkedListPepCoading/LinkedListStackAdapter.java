package com.programmingPratice.linkedListPepCoading;


import java.util.LinkedList;

public class LinkedListStackAdapter {

    public static class LLToStackAdapter {
        LinkedList<Integer> list;

        public LLToStackAdapter() {
            list = new LinkedList<>();
        }

        int size() {
            return list.size();
        }

        void push(int val) {
            list.addFirst(val);
        }

        int pop() {
            if (size() == 0) {
                return -1;
            } else {
                return list.removeFirst();
            }
        }

        int top() {

            return list.getFirst();
        }
    }
}
