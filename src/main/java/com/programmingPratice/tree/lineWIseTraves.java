package com.programmingPratice.tree;

import java.util.*;

public class lineWIseTraves {
    public static class Node {
        int data;
        List<Node> children = new ArrayList<>();
    }

    public static void levelOrder(Node node) {
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);
        Queue<Node> cq = new ArrayDeque<>();
        while (mq.size() > 0) {
            node = mq.remove();

            System.out.println(node.data + " ");
            for (Node child : node.children) {
                cq.add(child);
            }

            if (mq.size() == 0) {
                mq = cq;
                cq = new ArrayDeque<>();
                System.out.println();
            }
        }
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
        levelOrder(root);

    }
}
