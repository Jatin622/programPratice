package com.programmingPratice.level2Binary;

import java.util.ArrayList;
import java.util.Stack;

//inorder in optimise way

public class InOrderMorris {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
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

    public static ArrayList<Integer> morrisTraversal(Node node) {

        ArrayList<Integer> ans = new ArrayList<>();

        Node curr = node;

        while (curr != null) {
            Node leftNode = curr.left;

            if (leftNode == null) {
                ans.add(curr.data);
                curr = curr.right;
            } else {
                Node rightMostNode = getRightMostNode(leftNode, curr);

                if (rightMostNode.right == null) { // threas create
                    rightMostNode.right = curr;
                    curr = curr.left;
                } else {// thread cut down
                    rightMostNode.right = null;
                    ans.add(curr.data);
                    curr = curr.right;
                }
            }
        }
        return ans;
    }

    public static Node getRightMostNode(Node leftNode, Node curr) {

        while (leftNode.right != null && leftNode.right != curr) {
            leftNode = leftNode.right;
        }
        return leftNode;
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
        System.out.println(morrisTraversal(root));
    }
}