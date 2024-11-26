package com.programmingPratice.level2Binary;

import java.util.LinkedList;
import java.util.Queue;

public class constructBinaryTreeForList {
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

        public Node() {
        }
    }

    //isi=inOrderStartingIndex
    //psi=preOrderStartingIndex
    //pei=preOrderEndIndex
    //iei=inOrderEndIndex

    public static Node preIn(int[] preOrder, int psi, int pei, int[] inorder, int isi, int iei) {

        if (isi > iei) {
            return null;
        }
        Node node = new Node(preOrder[psi]);
        int idx = isi;
        while (inorder[idx] != preOrder[psi])
            idx++;

        int thnl = idx - isi;

        node.left = preIn(preOrder, psi + 1, psi + thnl, inorder, isi, idx - 1);

        node.right = preIn(preOrder, psi + thnl + 1, pei, inorder, idx + 1, iei);

        return node;
    }

    public static Node buildTree(int[] preOrder, int[] inOrder) {

        int n = preOrder.length;
        return preIn(preOrder, 0, n - 1, inOrder, 0, n - 1);
    }

    public static void levelOrderTraversal(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        int[] preOrder = {0, 1, 3, 7, 8, 4, 9, 10, 2, 5, 11, 6};
        int[] inOrder = {7, 3, 8, 1, 9, 4, 10, 0, 11, 5, 2, 6};

        Node root = buildTree(preOrder, inOrder);

        System.out.println("Level-order traversal of the constructed tree:");
        levelOrderTraversal(root);
    }
}
