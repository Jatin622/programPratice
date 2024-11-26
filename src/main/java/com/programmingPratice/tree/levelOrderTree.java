package com.programmingPratice.tree;

import java.util.*;

public class levelOrderTree {
    public static class Node {
        int data;
        List<Node> children = new ArrayList<>();
    }

    public static void level(Node node) {
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        while (q.size() > 0) {
            node = q.remove();//10//20
            System.out.println(node.data + " ");//10

            for (Node child : node.children) {//20 30 40
                q.add(child);
            }
        }
        System.out.println(".");
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Stack<Node> stack = new Stack<>();
        Node root = null;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == -1) {

                stack.pop();
            } else {
                Node node = new Node();
                node.data = arr[i];

                if (!stack.empty()) {
                    stack.peek().children.add(node);
                } else if (stack.empty()) {
                    root = node;
                }
                stack.push(node);
            }
        }
        level(root);
    }
}