package com.programmingPratice.binaryTree;

import java.util.Stack;

public class fourthBinarySearch {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public Node(int data) {
            this.data = data;
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

    public static class BstPair {
        int min;
        int max;
        boolean isBst;
        Node root;
        int size;
    }

    public static BstPair largestBstSubTree(Node node) {
        if (node == null) {
            BstPair bp = new BstPair();
            bp.min = Integer.MAX_VALUE;
            bp.max = Integer.MIN_VALUE;
            bp.isBst = true;
            bp.root = null;
            bp.size = 0;
            return bp;
        }

        BstPair lf = largestBstSubTree(node.left);
        BstPair rf = largestBstSubTree(node.right);

        BstPair mp = new BstPair();

        mp.isBst = lf.isBst && rf.isBst && (node.data >= lf.max && node.data <= rf.min);

        mp.min = Math.min(node.data, Math.min(lf.min, rf.min));
        mp.max = Math.max(node.data, Math.max(lf.max, rf.max));

        if (mp.isBst) {
            mp.root = node;
            mp.size = lf.size + rf.size + 1;
        } else if (lf.size > rf.size) {
            mp.root = lf.root;
            mp.size = lf.size;
        } else {

            mp.root = rf.root;
            mp.size = rf.size;
        }
        return mp;
    }

    public static void main(String[] args) {
        Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, 40, null, null, 75, 62, null, 170, null, null, 87, null, null};

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
        BstPair bp = largestBstSubTree(root);
        System.out.println(bp.root.data + " " + bp.size);
    }
}
