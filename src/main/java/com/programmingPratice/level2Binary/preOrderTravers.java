package com.programmingPratice.level2Binary;


//print :
//    1) when left child is null then print current node
//    2) as soon as we create  thread then print curr thread

//when we go right?
//    1)  when left child is null then go the right
//    2) when we cut down  the thread  then go the right child

import java.util.ArrayList;
import java.util.Stack;

public class preOrderTravers {
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

    public static ArrayList<Integer> morrisPreOrderTraversal(Node node) {

        ArrayList<Integer> ans = new ArrayList<>();

        Node curr = node;

        while (curr != null) {
            Node leftNode = curr.left;

            if (leftNode == null) {
                ans.add(curr.data);
                curr = curr.right;
            } else {
                Node rightMostNode = getRightMostNode(leftNode, curr);

                if (rightMostNode.right == null) { // thread have to create
                    ans.add(curr.data);
                    rightMostNode.right = curr;//thread creation
                    curr = curr.left;
                } else {// thread is present

                    rightMostNode.right = null;
                    curr = curr.right;
                }
            }
        }
        return ans;
    }

    public static Node getRightMostNode(Node rightMost, Node curr) {

        while (rightMost.right != null && rightMost.right != curr) {

            rightMost = rightMost.right;
        }
        return rightMost;
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
        System.out.println(morrisPreOrderTraversal(root));
    }
}