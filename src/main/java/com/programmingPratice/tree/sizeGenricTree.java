package com.programmingPratice.tree;

import java.util.ArrayList;
import java.util.Stack;

public class sizeGenricTree {

    private static class Node {
        int data;

        ArrayList<Node> children = new ArrayList<>();
    }

    public static int displaySize(Node node) {

        int s = 0;
        for (Node child : node.children) {
            int childSize = displaySize(child);
            s += childSize;
        }
        s += 1;//for self add
        System.out.println(s);
        return s;
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

                    stack.peek().children.add(t);
                } else {
                    root = t;
                }
                stack.push(t);

            }
        }
        displaySize(root);
    }
}
