package com.programmingPratice.binaryTree;

import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;


public class oct {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public Node() {
        }
    }

    public static class Pair {
        Node node;
        int state;

        public Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static boolean sum(Node node, int data) {

        if (node == null) {
            return false;
        }

        boolean leftD = sum(node.left, data);

        if (data == node.data) {
            return true;
        }
        boolean rightD = sum(node.right, data);
        if (rightD) {
            return true;
        }
        return false;
    }

    public static Node invert(Node node) {

        if (node == null) {
            return new Node();
        }


        Node left = invert(node.left);
        Node right = invert(node.right);

        node.left = right;
        node.right = left;

        return node;
    }

    static String path = "";

    public static void rootLeafPath(Node node) {

        if (node == null) {
            return;
        }
        path += node.data + ", ";
        if (node.left == null && node.right == null) {
            System.out.println(path);
        }
        rootLeafPath(node.left);
        rootLeafPath(node.right);
    }

    public static void inordert(Node node) {

        if (node == null) {
            return;
        }
        inordert(node.left);
        System.out.println(node.data);
        inordert(node.right);
    }


    public static void main(String[] args) {
        Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};

        Node root = new Node(arr[0], null, null);

        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);
        int idx = 0;
        while (st.size() > 0) {

            Pair top = st.peek();

            if (top.state == 1) {
                idx++;
                if (arr[idx] != null) {

                    Node ln = new Node(arr[idx], null, null);
                    top.node.left = ln;

                    Pair lp = new Pair(ln, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }
                top.state++;
            } else if (top.state == 2) {
                idx++;
                if (arr[idx] != null) {

                    Node rn = new Node(arr[idx], null, null);
                    top.node.right = rn;

                    Pair lp = new Pair(rn, 1);
                    st.push(lp);
                } else {
                    top.node.right = null;
                }
                top.state++;
            } else {
                st.pop();
            }
        }
        // System.out.println(sum(root, 37));
//        rootLeafPath(root);
        inordert(root);
    }
}
