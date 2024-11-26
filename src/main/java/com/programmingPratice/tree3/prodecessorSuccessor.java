package com.programmingPratice.tree3;


import java.util.*;

public class prodecessorSuccessor {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    static Node predecessor;
    static Node successor;
    static int state=0;

    public static void prodecessorSuccessorData(Node node, int data) {

        if (state == 0) {
            if (node.data == data) {
                state = 1;
            } else {
                predecessor = node;
            }
        } else if (state == 1) {
            successor = node;
            state = 2;

        }
        for (Node child : node.children) {
            prodecessorSuccessorData(child, data);
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
        prodecessorSuccessorData(root, 70);
        System.out.println(successor.data);
        System.out.println(predecessor.data);
    }
}
