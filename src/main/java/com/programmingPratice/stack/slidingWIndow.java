package com.programmingPratice.stack;

import java.util.Stack;

// take 3 -3 in group and find maximum of that
//index=1,2,3
//index=2,3,4 etc

public class slidingWIndow {
    public static void main(String[] args) {
        int[] a = {10, 200, 30, 40, 50, 600, 70, 80, 100};
        int k = 3;
        int b = a.length;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= b - k; i++) {
            stack.push(a[i]);

            for (int j = 1; j < k; j++) {
                if (a[i + j] > stack.peek()) {
                    stack.pop();
                    stack.push(a[i + j]);
                }
            }
        }
        System.out.println(stack);

    }

}
