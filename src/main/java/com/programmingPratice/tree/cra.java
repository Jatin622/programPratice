package com.programmingPratice.tree;

import java.util.*;

public class cra {
    public static class Node {
        int data;

        List<Node> children = new ArrayList<>();

        public Node(int data) {
            this.data = data;
        }

        public Node() {
        }
    }

    private static void printNodeRelationships(Node node, Stack<Node> stack) {

        stack.push(node);
        List<Integer> parentData = new ArrayList<>();

        for (Node parent : stack) {
            parentData.add(parent.data);
        }

        System.out.println(node.data + " -> " + parentData);

        for (Node child : node.children) {
            printNodeRelationships(child, stack);
        }

        //  stack.pop();
    }

    public static void trav(Node node, List<Integer> ancestors) {
        List<Integer> currentPath = new ArrayList<>(ancestors);
        currentPath.add(node.data);

        if (node.children.isEmpty()) {
            System.out.println(node.data + " -> " + ancestors);
        }

        for (Node child : node.children) {
            trav(child, currentPath);
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
         printNodeRelationships(root, new Stack<>());
        //trav(root, new ArrayList<>());
    }
}
