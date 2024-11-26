package com.programmingPratice.tree1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class similarTree {
    public static class Node {
        int data;
        List<Node> children = new ArrayList<>();
    }

    public static boolean similarBothTree(Node node1, Node node2) {

        while (node1.children.size() != node2.children.size()) {
            return false;
        }

        for (int i = 0; i < node1.children.size(); i++) {

            Node n1 = node1.children.get(i);
            Node n2 = node2.children.get(i);

            boolean b = similarBothTree(n1, n2);
            if (b == false) {
                return false;
            }
        }
        return true;
    }


    public static Node constructTree(int[] arr) {

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
        return root;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        int[] arr2 = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        Node root1 = constructTree(arr1);
        Node root2 = constructTree(arr2);
        System.out.println(similarBothTree(root1, root2));
    }
}

