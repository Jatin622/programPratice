package com.programmingPratice.pepcoading;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class longestSubsequence {

    public static void main(String[] args) {
        int[] a = {2, 400, 500, 600, 700, 800, 900, 3, 1, 2, 4, 5, 6, 7, 8, 9, 10};

        Stack<Integer> stack = new Stack<>();
        List<Integer> current = new ArrayList<>();
        List<Integer> longest = new ArrayList<>();
        stack.push(a[0]);
        current.add(a[0]);

        for (int i = 1; i < a.length; i++) {
            if (!stack.empty()) {
                if (stack.peek() < a[i]) {
                    stack.push(a[i]);
                    current.add(a[i]);
                } else {
                    if (current.size() > longest.size()) {
                        longest = new ArrayList<>(current);
                    }
                    current.clear();
                    stack.clear();
                    stack.push(a[i]);
                    current.add(a[i]);
                }
            }
        }
        if (current.size() > longest.size()) {
            longest = new ArrayList<>(current);
        }
        System.out.println(longest);
    }
}
