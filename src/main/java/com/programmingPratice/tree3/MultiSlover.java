package com.programmingPratice.tree3;


import java.util.ArrayList;
import java.util.Stack;

public class MultiSlover {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    static int size;
    static int max;
    static int min=Integer.MIN_VALUE;
    static int height=0;

    public static void multiSover(Node node, int depth) {
        size++;
        max = Math.max(max, node.data);
        min = Math.min(min, node.data);
        height = Math.max(height, depth);

        for (Node child : node.children) {
            multiSover(child, depth + 1);
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

                    stack.peek().children.add(t);//
                } else {
                    root = t;//10//20
                }
                stack.push(t);

            }
        }
        multiSover(root, 24);
        System.out.println(max);
        System.out.println(min);
        System.out.println(height);
        System.out.println(size);
    }
}
