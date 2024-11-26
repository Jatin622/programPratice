package com.programmingPratice.level2Binary;

import java.util.Stack;

public class longestZigZagPath {

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

    public static class zigZag {
        int forwardSlop = -1;
        int backwardSlop = -1;
        int maxLength = 0;
    }

    public static zigZag longestZigZag(Node node) {

        if (node == null) {

            return new zigZag();
        }
        zigZag left = longestZigZag(node.left);
        zigZag right = longestZigZag(node.right);

        zigZag myAns = new zigZag();

        // myAns.maxLength = Math.max(left.backwardSlop, right.forwardSlop) + 1;//if we do this always  check root , but it is not compulsary ki root sa
        //sbsa bda zig zag path ho

        myAns.maxLength = Math.max(Math.max(left.maxLength, right.maxLength), Math.max(left.backwardSlop, right.forwardSlop) + 1); // i got answer

        myAns.forwardSlop = left.backwardSlop + 1;
        myAns.backwardSlop = right.forwardSlop + 1;

        return myAns;
    }

    public static int longestZigZagPath(Node node) {

        zigZag ans = longestZigZag(node);
        return ans.maxLength;
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
        System.out.println(longestZigZagPath(root));
    }
}