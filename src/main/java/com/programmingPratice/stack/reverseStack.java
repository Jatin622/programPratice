package com.programmingPratice.stack;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
    Stack<Integer> input = new Stack<Integer>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);
    Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < input.size(); i++) {

        stack.push(input.pop());
    }
        System.out.println(stack);
}
}
