package com.programmingPratice.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

//put -1
public class lineWIseTravesSecondApproch {
    public static class Node {

        int data;
        ArrayList<Node> children = new ArrayList<>();


        public Node(int data) {
            this.data = data;
        }

        public Node() {
        }
    }


    public static void lineTraverseSingleQueue(Node node) {

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        queue.add(new Node(-1));
        while (queue.size() > 0) {
            node = queue.remove();
            if (node.data != -1) {

                System.out.println(node.data + " ");
                for (Node child : node.children) {
                    queue.add(child);
                }
            } else {
                if (queue.size() > 0) {
                    queue.add(new Node(-1));
                    System.out.println();
                }
            }
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
        lineTraverseSingleQueue(root);
    }
}
