package com.programmingPratice.linkedListPepCoading;

public class AddLastfirst {
    public static class Node {

        int data;
        Node next;
    }

    public static class LinkedList {

        Node head; //first element store
        Node tail; // last element store
        int size; // size of linkedList

        void addLst(int val) {

            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp; //if lindelist have data so link last tail to previous one
                tail = temp;
            }
            size++;
        }

        public int sizeData() {
            return size;
        }

        public void display() {

            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println();
        }

        public void removeFirst() {

            if (size == 0) {
                System.out.println("list is empty");
            } else if (size == 1) {
                head = tail = null;
            } else {
                head = head.next;
                size--;
            }
        }

        public int getFisrt() {
            return head.data;
        }

        public int getLast() {
            return tail.data;
        }

        public int getLast(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("invalid");
                return -1;
            } else {
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
        }

        public void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;
            size++;
        }

        public void addAt(int val, int idx) { //in progress

            if (idx == 0) {
                addFirst(val);
            } else if (idx == size) {
                addLst(val);
            } else {
                Node node = new Node();
                node.data = val;
                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                node.next = temp.next;
                temp.next = node;
                size++;
            }
        }

        public void removeLast() {

            Node temp = head;
            for (int i = 0; i < size - 2; i++) {

                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
            size--;
        }

        public Node getNodeAt(int idx) {
            Node temp = head;

            for (int i = 0; i < idx; i++) {

                temp = temp.next;
            }
            return temp;
        }

        public void reverse() {
            int li = 0;
            int ri = size - 1;

            while (li < ri) {
                Node left = getNodeAt(li);
                Node right = getNodeAt(ri);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                li++;
                ri--;
            }
        }

        public void reversePointer() {

            Node prev = null;
            Node curr = head;

            while (curr != null) {
                Node next = curr.next;
                curr.next = prev;

                prev = curr;
                curr = next;
            }
            Node temp = head;
            head = tail;
            tail = temp;
        }

        public void removeAt(int idx) {

            Node temp = head;

            for (int i = 0; i < idx; i++) {

                temp = temp.next;
            }
            temp.next = temp.next.next;//they disconnect for current node and look forward for next to next node
            size--;
        }

        public int kthFromLast(int k) {

            Node s = head;
            Node f = head;

            for (int i = 0; i < k; i++) {
                f = f.next;
            }
            while (f != tail) {
                s = s.next;
                f = f.next;
            }
            return s.data;
        }

        public int mid() {

            Node s = head;
            Node f = head;

            while (f.next != null && f.next.next != null) {
                s = s.next;
                f = f.next.next;
            }
            return s.data;
        }

    }


    public static void main(String[] args) {
        // Create an instance of LinkedList
        LinkedList linkedList = new LinkedList();

        // Add values to the linked list
        linkedList.addLst(10);
        linkedList.addLst(20);
        linkedList.addLst(30);

        //   linkedList.addFirst(50);
        //   linkedList.display();
        //    linkedList.removeFirst();

        //   linkedList.removeLast();
        //  linkedList.reverse();
        System.out.println(linkedList.kthFromLast(1));
        //  System.out.println("Size of linked list: " + linkedList.sizeData());
    }
}
