package com.programmingPratice.tree1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class lowestCommmoAcentiure {
    public static class Node {
        int data;
        List<Node> children = new ArrayList<>();
    }

    public static ArrayList<Integer> nodeToRoot(Node node, int data) {

        if (node.data == data) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(node.data);
            return arrayList;
        }
        for (Node child : node.children) {
            ArrayList<Integer> ptc = nodeToRoot(child, data);

            if (ptc.size() > 0) {
                ptc.add(node.data);
                return ptc;
            }
        }
        return new ArrayList<>();
    }


    public static int lowestCommon(Node node, int d1, int d2) {

        ArrayList<Integer> l1 = nodeToRoot(node, d1);
        ArrayList<Integer> l2 = nodeToRoot(node, d2);

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

        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root = null;

        Stack<Node> stack = new Stack<>();

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
        System.out.println(lowestCommon(root, 70,120));

    }
}
