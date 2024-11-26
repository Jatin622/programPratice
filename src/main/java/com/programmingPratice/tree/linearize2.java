package com.programmingPratice.tree;

import java.util.ArrayList;
import java.util.Stack;

public class linearize2 {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }


    public static Node linear2(Node node) {

        if (node.children.size() == 0) {
            return node;
        }
        Node lkt = linear2(node.children.get(node.children.size() - 1));
        while (node.children.size() > 1) {
            Node last = node.children.remove(node.children.size() - 1);
            Node sl = node.children.get(node.children.size() - 1);
            Node slkt = linear2(sl);
            slkt.children.add(last);
        }
        return lkt;
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

                    stack.peek().children.add(t);//
                } else {
                    root = t;//10//20
                }
                stack.push(t);
            }
        }
       System.out.println( linear2(root));
    }
}
