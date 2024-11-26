package com.programmingPratice.binaryTree;

import java.util.ArrayList;
import java.util.Stack;

public class secondBinary {
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

    static ArrayList<Integer> arrayList = new ArrayList<>();

    public static boolean findElementandNodeRootPath(Node node, int data) {

        if (node == null) {
            return false;
        }
        if (node.data == data) {
            arrayList.add(node.data);
            return true;
        }
        boolean flc = findElementandNodeRootPath(node.left, data);
        if (flc) {
            arrayList.add(node.data);
            return true;
        }
        boolean frc = findElementandNodeRootPath(node.right, data);

        if (frc) {
            arrayList.add(node.data);
            return true;
        }
        return false;
    }


    private static void kLevelDownHelper(Node node, int k) {
        if (node == null) {
            return;
        }

        if (k == 0) {
            System.out.println(node.data);
        }

        kLevelDownHelper(node.left, k - 1); // Decrement k for left subtree
        kLevelDownHelper(node.right, k - 1); // Decrement k for right subtree
    }

    public static void leafToRoot(Node node, String path) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {

            System.out.println(path + node.data);

        }
        leafToRoot(node.left, path + node.data + ".");
        leafToRoot(node.right, path + node.data + ".");
        return;

    }

    public static Node transFormCloneLeftTree(Node node) {

        if (node == null) {
            return null;
        }

        Node lcr = transFormCloneLeftTree(node.left);
        Node rcr = transFormCloneLeftTree(node.right);

        Node nn = new Node(node.data, lcr, null);

        node.left = nn;
        node.right = rcr;

        return node;
    }

    public static Node transBackFromLeftClone(Node node) {

        if (node == null) {
            return null;
        }
        Node lcr = transBackFromLeftClone(node.left.left);// they skip one node that we make clone
        Node rcr = transBackFromLeftClone(node.right);

        node.left = lcr;
        node.right = rcr;

        return node;

    }


    public static Node printSingleParentNode(Node node, Node parent) {
        if (node == null) {
            return null;
        }
        if (parent != null && parent.left == node && parent.right == null) {
            System.out.println(node.data);
        } else if (parent != null && parent.right == node && parent.left == null) {
            System.out.println(node.data);
        }

        printSingleParentNode(node.left, node);
        printSingleParentNode(node.right, node);
        return node;
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

    public static int diameter(Node node) {

        if (node == null) {
            return 0;
        }
        //maximum distance bw two node for left side
        int left = diameter(node.left);

        //maximum distance bw two node for right side
        int right = diameter(node.right);

        //maximum distance bw  left deepest and right deepest side
        int f = height(node.left) + height(node.right) + 2;

        int di = Math.max(f, Math.max(left, right));

        return di;

    }

    public static void tiltBinaryTree(Node node) {

        if (node == null) {
            return;
        }

        tiltBinaryTree(node.left);
        tiltBinaryTree(node.right);

        Node left = node.left == null ? new Node(0) : node.left;

        Node right = node.right == null ? new Node(0) : node.right;


        int total = left.data - right.data;

        System.out.println(node.data + "->" + total);

    }

    static int count = 0;

    public static int countNodes(Node node) {
        if (node == null) {
            return 0;
        }

        countNodes(node.left);
        count++;
        countNodes(node.right);

        return count;
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
        System.out.println(findElementandNodeRootPath(root, 37));
        System.out.println(arrayList);
      //   kLevelDownHelper(root, 2);
             leafToRoot(root, "");
        //display(root);
    //    printSingleParentNode(root, null);
      //  System.out.println(diameter(root));
      //    tiltBinaryTree(root);
          System.out.println( height(root));
       System.out.println(countNodes(root));
    }
}