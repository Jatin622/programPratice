package com.programmingPratice.binaryTree;

import org.springframework.util.ObjectUtils;

import java.util.Stack;

public class thirdBinarySearch {
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

    public static class BSTPair {
        boolean isBst;
        int min;
        int max;
    }

    public static BSTPair isBst(Node node) { // binarySearchSmallLeftToRight original one Q 48
        if (node == null) {

            BSTPair bp = new BSTPair();
            bp.min = Integer.MIN_VALUE;
            bp.max = Integer.MAX_VALUE;
            bp.isBst = true;
            return bp;
        }

        BSTPair lp = isBst(node.left);
        BSTPair rp = isBst(node.right);

        BSTPair mp = new BSTPair();

        //lp.isBst = tum left ka sb sa bst hona chiya
        // rp.isbst = tum right ka sb sa bst hona chaiya
        // node.data >= lp.max = tumara data left ka max sa bda h
        //node.data <= rp.min = tumara data right ka min sa chota h
        mp.isBst = lp.isBst && rp.isBst && (node.data >= lp.max && node.data <= rp.min);

        mp.min = Math.min(node.data, Math.min(lp.min, rp.min));
        mp.max = Math.max(node.data, Math.max(lp.max, rp.max));
        return mp;
    }


    public static void binarySearchSmallLeftToRight(Node node) {

        if (node == null) {
            return;
        }
        binarySearchSmallLeftToRight(node.left);
        binarySearchSmallLeftToRight(node.right);

        if (!ObjectUtils.isEmpty(node.left) || !ObjectUtils.isEmpty(node.right)) {
            Node left = node.left == null ? new Node(0) : node.left;
            Node right = node.right == null ? new Node(0) : node.right;

            if (left.data > right.data) {
                System.out.println(false);
            }

        }
    }

// ---------------


    static boolean isBal = true;

    public static int balancedBinary(Node node) { //Q=50 //first approch

        if (node == null) {
            return 0;
        }
        int lh = balancedBinary(node.left);
        int rh = balancedBinary(node.right);

        int gap = Math.abs(lh - rh);

        if (gap > 1) {
            isBal = false;
        }
        int th = Math.max(lh, rh) + 1;
        return th;
    }

    //secondApproch

    public static class BalPair {
        int ht;
        boolean isBal;
    }

    public static BalPair isBalT(Node node) {
        if (node == null) {
            BalPair bp = new BalPair();
            bp.ht = 0;
            bp.isBal = true;
            return bp;
        }
        BalPair lp = isBalT(node.left);
        BalPair rp = isBalT(node.right);

        BalPair mp = new BalPair();
        mp.isBal = Math.abs(lp.ht - rp.ht) < 1 && lp.isBal && rp.isBal;

        mp.ht = Math.max(lp.ht, rp.ht) + 1;
        return mp;
    }

    public static boolean isSymmetric(Node root) {

        if (root == null) {
            return true;
        }

        return isMirror(root.left, root.right);
    }

    public static boolean isMirror(Node nodeL, Node nodeR) {

        if (nodeL.left == null && nodeR.right == null) {
            return true;
        }
        if (nodeL.left == null || nodeR.right == null) {
            return false;
        }

        return (nodeL.data == nodeR.data)
                && isMirror(nodeL.left, nodeR.right)
                && isMirror(nodeR.right, nodeL.left);
    }

    public static boolean pathSum(Node root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return root.data == targetSum;
        }

        int newTargetSum = targetSum - root.data;

        return pathSum(root.left, newTargetSum) || pathSum(root.right, newTargetSum);
    }

    public static int maxDepth(Node root) {

        if (root == null) {
            return 0;
        }

        int leftData = maxDepth(root.left);
        int rightData = maxDepth(root.right);

        int total = Math.max(leftData, rightData) + 1;

        return total;
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
//       binarySearch(root);
        BSTPair bp = isBst(root);
        System.out.println(bp.isBst);
        //      System.out.println(balancedBinary(root));
//
//        BalPair balPair = isBalT(root); //second approch
//        System.out.println(balPair.isBal);
//        System.out.println(isSymmetric(root));
//       System.out.println(pathSum(root, 142));
//        System.out.println(maxDepth(root));
    }
}
