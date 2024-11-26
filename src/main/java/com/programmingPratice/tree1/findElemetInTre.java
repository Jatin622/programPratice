package com.programmingPratice.tree1;

import com.programmingPratice.tree.treeFirst;

import java.util.ArrayList;
import java.util.Stack;

public class findElemetInTre {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static Boolean findEle(Node node, int data) {

        int a = 120;
        if (node.data == a) {
            return true;
        }
        for (Node child : node.children) {
            Boolean flc = findEle(child, data);
            if(flc){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root = null;

        Stack<Node> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == -1) {
                stack.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (stack.size() > 0) {

                    stack.peek().children.add(t);//
                } else {
                    root = t;//10//20
                }
                stack.push(t);

            }
        }
        System.out.println(findEle(root,110));
    }
}
