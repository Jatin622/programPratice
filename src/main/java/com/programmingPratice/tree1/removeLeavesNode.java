package com.programmingPratice.tree1;

import java.util.ArrayList;
import java.util.Stack;

//where i print

public class removeLeavesNode {
    private static class Node {
        int data;

        ArrayList<Node> children = new ArrayList<>();
    }

    public static void removeLeaves(Node node) {
        for (int i = node.children.size() - 1; i > 0; i--) {
            Node child = node.children.get(i);
            if (child.children.size() == 0) {
                node.children.remove(child);
            }
        }
        for (Node child : node.children) {
            removeLeaves(child);
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
        removeLeaves(root);
        print(root);

    }
    public static void print(Node node) {
        System.out.println(node.data);
        for (Node node1 : node.children) {
            print(node1);
        }
    }
}
