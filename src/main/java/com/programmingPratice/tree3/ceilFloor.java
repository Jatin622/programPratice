package com.programmingPratice.tree3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ceilFloor {
    public static class Node {
        int data;
        List<Node> children = new ArrayList<>();
    }

    //30
    static int ceilValue = Integer.MAX_VALUE;//40
    static int floorValue = Integer.MIN_VALUE;

    public static void data(Node node, int value) {

        if (node.data > value) {
            if (node.data < ceilValue)
                ceilValue = node.data;
        }
        if (node.data < value) {
            if (node.data > floorValue) {
                floorValue = node.data;
            }
        }
        for (Node child : node.children) {
            data(child, value);
        }
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
        data(root, 30);
        System.out.println(ceilValue);
        System.out.println(floorValue);
    }
}
