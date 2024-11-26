package com.programmingPratice.tree1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

//find queue size
public class lineWiseTreeThirdApproch {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void traversal(Node node) {

        Queue<Node> queue = new ArrayDeque<>();

        queue.add(node);

        while (queue.size() > 0) {

            for (int i = 0; i <queue.size(); i++) {
                node = queue.remove();
                System.out.println(node.data + " ");

                for (Node child : node.children) {
                    queue.add(child);
                }
            }
            System.out.println();

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
        traversal(root);
    }
}
