package com.programmingPratice.stack;

import java.util.Stack;

//addition 4-4 group
public class additionGroup {
    public static void main(String[] args) {
        int[] a = {2, 9, 3, 8, 1, 7, 12, 6, 14, 4, 32, 0, 7, 19, 8, 12, 6};
        int k = 4;

        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (int i = 0; i < a.length; i++) {

            if (stack.size() < k) {
                stack.push(a[i]);
                sum += stack.peek();
                if (stack.size() == 4) {
                    System.out.println(sum);
                    sum = 0;
                }
            } else {
                while (!stack.isEmpty()) {
                    stack.pop();
                }

            }

        }

    }
}
