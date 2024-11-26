package com.programmingPratice.binaryTree.binarySearchPlaylist;


import java.util.ArrayList;
import java.util.Stack;

public class sizeSumMax {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public Node() {
        }
    }

    public static Node construct(int[] arr, int lo, int hi) {

        if (lo > hi) {
            return null;
        }
        int mid = (lo + hi) / 2;
        int data = arr[mid];

        Node lc = construct(arr, lo, mid - 1);
        Node rc = construct(arr, mid + 1, hi);

        Node node = new Node(data, lc, rc);
        return node;
    }

    public static int sum(Node node) {

        if (node == null) {
            return 0;
        }

        int rS = sum(node.left);
        int ls = sum(node.right);

        int sum = rS + ls + node.data;
        return sum;
    }

    public static int size(Node node) {
        if (node == null) {
            return 0;
        }

        int rS = size(node.left);
        int ls = size(node.right);

        int sum = rS + ls + 1;
        return sum;
    }

    public static int maximum(Node node) { //bst is always sorted so we find maximum in only right side

        if (node.right != null) {

            return maximum(node.right);
        } else {
            return node.data;
        }
    }

    public static int minimum(Node node) {
        if (node.left != null) {

            return minimum(node.left);
        } else {
            return node.data;
        }
    }

    public static boolean find(Node node, int data) {
        if (node == null) {
            return false;
        }
        if (data > node.data) {
            return find(node.right, data);
        } else if (data < node.data) {
            return find(node.left, data);
        } else {
            return true;
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

    public static Node addNode(Node node, int data) {
        if (node == null) {
            return new Node(data, null, null);
        }
        if (data > node.data) {
            node.right = addNode(node.right, data);
        } else if (data < node.data) {
            node.left = addNode(node.left, data);
        } else {
        }
        display(node);
        return node;
    }

    public static int max(Node node) {

        if (node == null) {
            return max(node.right);
        } else {
            return node.data;
        }
    }

    public static Node remove(Node node, int data) {

        if (node == null) {
            return null;
        }
        if (data > node.data) {
            node.right = remove(node.right, data);
        } else if (data < node.data) {
            node.left = remove(node.left, data);
        } else {
            if (node.left != null && node.right != null) {
                int lmax = max(node.left);
                node.data = lmax;
                node.left = remove(node.left, lmax);
                return node;
            } else if (node.left != null) {
                return node.left;
            } else {
                return null;
            }
        }
        return node;
    }

    static int sum = 0;

    public static void rwsol(Node node) { //Replace Sum of Larger in BST
        if (node == null) {
            return;
        }
        rwsol(node.right);
        int od = node.data;
        node.data = sum;
        sum += od;
        rwsol(node.left);
        // display(node);
    }

    public static void printRange(Node node, int start, int end) {
        if (node == null) {
            return;
        }
        if (start < node.data && end < node.data) {
            printRange(node.left, start, end);
        } else if (start > node.data && end > node.data) {
            printRange(node.right, start, end);
        } else {
            printRange(node.left, start, end);
            System.out.println(node.data);
            printRange(node.right, start, end);
        }
    }

    public static boolean finds(Node node, int data) {

        if (node == null) {
            return false;
        }
        if (data > node.data) {
            return finds(node.right, data);
        } else if (data < node.data) {
            return find(node.left, data);
        } else {
            return true;
        }
    }

    public static void travelAndPrint(Node root, Node node, int tar) {
        if (node == null) {
            return;
        }
        travelAndPrint(root, node.left, tar);

        int comp = tar - node.data;

        if (node.data < comp) {
            if (finds(root, comp) == true) {

                System.out.println(node.data + " " + comp);
            }
        }
    }

    public static void travelAndPrintSecond(Node node, ArrayList<Integer> list) {

        if (node == null) {
            return;
        }
        travelAndPrintSecond(node.left, list);
        list.add(node.data);
        travelAndPrintSecond(node.right, list);
    }

    public static class ITPair {
        Node node;
        int state = 0;

        public ITPair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void travelAndPrintBestApproch(Node node, int tar) {

        Stack<ITPair> ls = new Stack<>();
        Stack<ITPair> rs = new Stack<>();

        ls.push(new ITPair(node, 0));
        rs.push(new ITPair(node, 0));

        Node left = getNextFromNoralInorder(ls);
        Node right = getNextFromReverseInorder(rs);

        while (left.data < right.data) {

            if (left.data + right.data < tar) {
                left = getNextFromNoralInorder(ls);
            } else if (left.data + right.data > tar) {
                right = getNextFromReverseInorder(rs);
            } else {
                System.out.println(left.data + " " + right.data);
                left = getNextFromNoralInorder(ls);
                right = getNextFromNoralInorder(rs);
            }
        }
    }

    public static Node getNextFromNoralInorder(Stack<ITPair> st) {

        while (st.size() > 0) {
            ITPair top = st.peek();

            if (top.state == 0) {
                if (top.node.left != null) {

                    st.push(new ITPair(top.node.left, 0));
                }
                top.state++;
            } else if (top.state == 1) {
                if (top.node.right != null) {
                    st.push(new ITPair(top.node.left, 0));
                }
                top.state++;
            } else {
                st.pop();
            }
        }
        return null;
    }

    public static Node getNextFromReverseInorder(Stack<ITPair> st) {

        while (st.size() > 0) {
            ITPair top = st.peek();

            if (top.state == 0) {
                if (top.node.right != null) {

                    st.push(new ITPair(top.node.right, 0));
                }
                top.state++;
            } else if (top.state == 1) {
                if (top.node.right != null) {
                    st.push(new ITPair(top.node.right, 0));
                }
                top.state++;
            } else {
                st.pop();
            }
        }
        return null;
    }

    public static void main(String[] args) {

        int[] arr = {12, 25, 37, 50, 62, 75, 87};
        Node root = construct(arr, 0, arr.length - 1);
//            System.out.println(sum(root));
//        System.out.println(size(root));
//        System.out.println(maximum(root));
        //      System.out.println(minimum(root));
        //     System.out.println(find(root, 87));
              addNode(root, 187);
        //    System.out.println(remove(root, 62));
        rwsol(root);
//        System.out.println(sum);

        //   printRange(root, 27, 72);
        //  travelAndPrint(root, root, 100);

//        ArrayList<Integer> list = new ArrayList<>();
//        travelAndPrintSecond(root, list);
//
//        int li = 0;
//        int ri = list.size() - 1;
//
//        while (li < ri) {
//            int left = list.get(li);
//            int right = list.get(ri);
//
//            if (left + right > root.data) {
//                li++;
//            } else if (left + right > root.data) {
//                ri--;
//            } else {
//                li++;
//                ri++;
//            }
//        }
        //   travelAndPrintBestApproch(root,100);
    }
}