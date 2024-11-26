package com.programmingPratice.tree;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

public class ZigZagTree {
    public static class Node {
        int data;
        List<Node> children = new ArrayList<>();
    }

    public static void zigZag(Node node) {
        Stack<Node> ms = new Stack<>();
        ms.push(node);
        Stack<Node> cs = new Stack<>();
        int level = 1;
        while (ms.size() > 0) {

            node = ms.pop();
            System.out.println(node.data + " ");

            if (level % 2 == 0) {
                for (int i = 0; i < node.children.size(); i++) {
                    Node child = node.children.get(i);
                    cs.push(child);
                }
            } else {
                for (int i = node.children.size() - 1; i >=0; i--) {
                    Node child = node.children.get(i);
                    cs.push(child);

                }
            }

            if (ms.size() == 0) {

                ms = cs;
                cs = new Stack<>();
                level++;
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
        zigZag(root);
    }
}

