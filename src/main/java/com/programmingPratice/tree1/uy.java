package com.programmingPratice.tree1;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class uy {
    public static class Node {
        int data;
        List<Node> children = new ArrayList<>();
    }

    public static List<Integer> findElemet(Node node, int element) {

        if (node.data == element) {
            List<Integer> ls = new ArrayList<>();
            ls.add(node.data);
            return ls;
        }

        for (Node child : node.children) {

            List<Integer> res = findElemet(child, element);

            if (!res.isEmpty()) {
                res.add(node.data);
                return res;
            }
        }
        return new ArrayList<>();
    }

    public static int lowestC(Node node, int d1, int d2) {

        List<Integer> l1 = findElemet(node, d1);
        List<Integer> l2 = findElemet(node, d2);

        int finalOutput = 0;

        for (int i = 0; i < l1.size(); i++) {

            if (l2.contains(l1.get(i))) {
                if (finalOutput < l1.get(i)) {
                    finalOutput = l1.get(i);
                }
            }
        }
        return finalOutput;

    }

    public static void main(String[] args) {

        Stack<Node> stack = new Stack<>();

        Node root = null;
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

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
        System.out.println(lowestC(root, 90, 120));
    }
}
