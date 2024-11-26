package com.programmingPratice.tree1;


import java.awt.geom.QuadCurve2D;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;


// use count
public class lineWiseTraverseFourth {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static class Pair {
        int level;
        Node node;

        public Pair(Node node, int level) {
            this.level = level;
            this.node = node;
        }
    }

    public static void treaversal(Node node) {

        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(node, 1));
        int level = 1;
        while (queue.size() > 0) {
            Pair remove = queue.remove();
            if (remove.level > level) {
                level = remove.level;
                System.out.println();
            }
            System.out.println(remove.node.data + " ");
            for (Node child : remove.node.children) {
                Pair cp = new Pair(child, remove.level + 1);
                queue.add(cp);
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
        treaversal(root);
    }
}
