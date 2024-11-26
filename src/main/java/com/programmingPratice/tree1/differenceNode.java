package com.programmingPratice.tree1;


import java.util.ArrayList;
import java.util.Stack;

public class differenceNode {

    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
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

        ArrayList<Integer> p1 = nodeToRoot(node, d1);
        ArrayList<Integer> p2 = nodeToRoot(node, d2);

        int i = p1.size() - 1;
        int j = p2.size() - 1;

        while (i >= 0 && j >= 0 && p1.get(i) == p2.get(j)) {
            i--;
            j--;
        }
        i++;
        j++;
        return i + j;
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
        System.out.println(lowestCommon(root, 60, 120));
    }
}
