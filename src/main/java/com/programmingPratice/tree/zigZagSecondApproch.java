package com.programmingPratice.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class zigZagSecondApproch {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }
    public static void display(Node node) {

        int level = 1;
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);

        while (queue.size() > 0) {
            System.out.println(queue.peek().data);
            node=queue.poll();
            if (level % 2 == 0) {
                for (int i = 0; i < node.children.size(); i++) {
                    Node childs = node.children.get(i);
                    queue.add(childs);
                }
            } else {
                for (int i = node.children.size() - 1; i >= 0; i--) {
                    Node childs = node.children.get(i);
                    queue.add(childs);
                }
            }
          level++;
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
        display(root);
    }
}
