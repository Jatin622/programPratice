package com.programmingPratice.binaryTree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class firstBinaryTree {
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

    // state = 1= left push
    // 2= right push
    //3 pop
    public static class Pair {
        Node node;
        int state;

        public Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void display(Node node) {

        if (node == null) {
            return;
        }
        String str = "";

        str += node.left == null ? "." : node.left.data + "";
        str += "<-" + node.data + "->";

        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);

        display(node.left);
        display(node.right);

    }


    public static int size(Node node) {
        if (node == null) {
            return 0;
        }
        int leftSize = size(node.left);
        int rightSize = size(node.right);

        int total = leftSize + rightSize + 1;
        return total;
    }

    public static int sum(Node node) {
        if (node == null) {
            return 0;
        }
        int leftSum = sum(node.left);
        int rightSum = sum(node.right);

        int totalsum = leftSum + rightSum + node.data;

        return totalsum;
    }

    public static int max(Node node) {
        if (node == null) {
            return 0;
        }
        int s = -1;

        int left = max(node.left);
        int right = max(node.right);

        int tm = Math.max(node.data, Math.max(left, right));
        return tm;
    }

    public static void traversal(Node node) {

        if (node == null) {
            return;
        }
        System.out.println(node.data + " pre order");
        traversal(node.left);
        System.out.println(node.data + " inorder");
        traversal(node.right);
        System.out.println(node.data + " postorder");
    }

    public static void traversalLine(Node node) {

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);

        while (!queue.isEmpty()) {

            int count = queue.size();
            for (int i = 0; i < count; i++) {

                node = queue.remove();
                System.out.println(node.data + " ");

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            System.out.println();
        }
    }

    public static void traverPosition(Node node) {

        Stack<Pair> st = new Stack<>();
        Pair rtp = new Pair(node, 1);
        st.push(rtp);

        String pre = "";
        String in = "";
        String post = "";

        while (st.size() > 0) {

            Pair top = st.peek();

            if (top.state == 1) {

                pre += top.node.data + ",";
                top.state++;

                if (top.node.left != null) {
                    Pair rp = new Pair(top.node.left, 1);
                    st.push(rp);
                }
            } else if (top.state == 2) {


                in += top.node.data + ",";
                top.state++;

                if (top.node.right != null) {
                    Pair lp = new Pair(top.node.right, 1);
                    st.push(lp);
                }
            } else {
                post += top.node.data + ",";
                st.pop();
            }

        }
        System.out.println(pre);
        System.out.println(post);
        System.out.println(in);

    }

    public static int height(Node node) {
        if (node == null) {
            return -1;
        }
        int left = height(node.left);
        int right = height(node.right);

        int th = Math.max(left, right) + 1;
        return th;
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

     //   display(root);
           System.out.println(size(root));
        //     System.out.println(sum(root));
        //    System.out.println(max(root));
       //  traversal(root);
       traversalLine(root);
          traverPosition(root);
//        System.out.println(height(root));

    }
}
