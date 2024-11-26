package com.programmingPratice.stack;

import java.util.Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public int minStack() {
        int min = Integer.MAX_VALUE;

        while (!isEmpty()) {
            int x = pop();
            if (x < min) {
                min = x;
            }
        }

        return min;
    }

    public boolean push(int item) {
        if (isfull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("can not pop empty stack");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("can not peek empty stack");
        }
        return data[ptr];
    }

    public boolean isfull() {
        return ptr == data.length - 1; // ptr at last index
    }


    public boolean isEmpty() {
        return ptr == -1; // stack is empty
    }
}

class stackMain {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        //DynamicStack stack = new DynamicStack(5);// we can call dynamic stack
        stack.push(45);
        stack.push(5);
        stack.push(15);
        stack.push(25);
        stack.push(35);
        stack.push(45);
        System.out.println(stack.minStack());

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    }
}
