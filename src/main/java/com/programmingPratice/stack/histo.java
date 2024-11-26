package com.programmingPratice.stack;

import java.util.Stack;

public class histo {
    public static void main(String[] args) {
        int[] a = {6, 3, 2, 5, 4, 5, 1, 7};
        int reverseCount = 0;

        int forwardCount = 0;
        int total = 0;

        Stack<Integer> s = new Stack<>();
        s.push(a[0]);
        for (int i = 1; i < a.length; i++) {

            while (s.peek() > a[i]) {
                reverseCount++;

                break;
            }
            while (s.peek() < a[i]) {
                forwardCount++;
                break;
            }
            s.push(a[i]);

            int sum = (reverseCount + forwardCount) * a[i];

            if (total < sum) {
                total = sum;
            }
            reverseCount=1;
            forwardCount=1;
        }
        System.out.println(total);

    }
}
