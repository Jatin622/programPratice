package com.programmingPratice.tree;

import java.util.*;

public class p {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node(int data) {
            this.data = data;
        }

        public Node() {
        }
    }

    public static void mirror(Node node) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);

        while (queue.size() > 0) {
            System.out.println(queue.peek().data);

            node = queue.poll();

            for (int i = node.children.size() - 1; i >= 0; i--) {
                Node child = node.children.get(i);
                queue.add(child);

            }
        }
    }

    public static void main(String[] args) {

        Stack<Node> stack = new Stack<>();

        Node root = null;

        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

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
        mirror(root);
    }
}
