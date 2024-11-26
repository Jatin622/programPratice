package com.programmingPratice.tree3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class maximumSubtree {
    public static class Node {
        int data;
        List<Node> children = new ArrayList<>();
    }

    static int msn = 0;
    static int ms = Integer.MIN_VALUE;

    static int retSumAndCacuslter(Node node) {

        int sum = 0;
        for (Node child : node.children) {
            int csum = retSumAndCacuslter(child);
            sum += csum;
        }
        sum += node.data;
        if (sum > ms) {
            msn = node.data;
            ms = sum;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root = null;

        Stack<Node> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == -1) {
                stack.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (stack.size() > 0) {

                    stack.peek().children.add(t);//
                } else {
                    root = t;//10//20
                }
                stack.push(t);
            }
        }
       System.out.println(retSumAndCacuslter(root));
        System.out.println(msn+"="+ms);
    }
}
