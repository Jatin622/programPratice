package com.programmingPratice.level2Binary;

import java.util.Stack;

public class houseRobery {
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

    public static class housePair {
        int withRobery = 0;
        int withoutRobery = 0;
    }

    public static housePair houyseRobery(Node node) {

        if (node == null) {
            return new housePair();
        }

        housePair left = houyseRobery(node.left);
        housePair rihgt = houyseRobery(node.right);

        housePair ans = new housePair();

        ans.withRobery = left.withoutRobery + node.data + rihgt.withoutRobery; //questiom left =30 , how they understand this vlsue come in withrovery or without rover

        ans.withoutRobery = Math.max(left.withRobery, left.withoutRobery) + Math.max(rihgt.withRobery, rihgt.withoutRobery);
        return ans;
    }

    public static int HouseRobery(Node node) {

        housePair res = houyseRobery(node);

        return Math.max(res.withRobery, res.withoutRobery);
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
        System.out.println(HouseRobery(root));
    }
}
