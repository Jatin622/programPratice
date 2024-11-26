package com.programmingPratice.hashmapPepcoading;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQuessCrudGenric<T> {
    ArrayList<T> data;
    Comparator comp;

    public PriorityQuessCrudGenric() {
        data = new ArrayList<>();
        comp = null;// if priority quese is null so comparator is null
    }

    public PriorityQuessCrudGenric(Comparator comp) {
        data = new ArrayList<>();
        this.comp = comp;// if priority quese is not null so comparator is null
    }

    public boolean isSmaller(int i, int j) {
        if (comp == null) {
            Comparable ith = (Comparable) data.get(i);
            Comparable jth = (Comparable) data.get(j);

            if (ith.compareTo(jth) < 0) {
                return true;
            } else {
                return false;
            }
        } else {
            T ith = data.get(i);
            T jth = data.get(j);

            if (comp.compare(ith, jth) < 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void add(T val) {
        data.add(val);
        upheapify(data.size() - 1);
    }

    public void upheapify(int i) {

        int pi = (i - 1) / 2;//find parent index

        if (isSmaller(i, pi) == true) {
            swap(i, pi);
            upheapify(pi);
        }
    }

    public T remove() {

        if (this.size() == 0) {
            return null;
        }
        swap(0, data.size() - 1);
        T val = data.remove(data.size() - 1);
        downHeapify(0);
        return val;
    }

    public void downHeapify(int pi) {
        int mini = pi;

        int leftIndex = 2 * pi + 1;

        if (leftIndex < data.size() && isSmaller(leftIndex, mini) == true) {
            mini = leftIndex;
        }
        int rightIndex = 2 * pi + 2;
        if (rightIndex < data.size() && isSmaller(rightIndex, mini) == true) {

            mini = rightIndex;
        }
        if (mini != pi) {
            swap(pi, mini);
            downHeapify(mini);
        }
    }

    public void swap(int i, int j) {
        T ith = data.get(i);
        T jth = data.get(j);

        data.set(i, jth);
        data.set(j, ith);

    }

    public T peek() {
        if (this.size() == 0) {
            return null;
        }
        return data.get(0);
    }

    public int size() {
        return data.size();
    }

    static class Student implements Comparable<CompaableComparator.Student> {
        int rollNo;
        int ht;
        int wt;

        public Student(int rollNo, int ht, int wt) {
            this.rollNo = rollNo;
            this.ht = ht;
            this.wt = wt;
        }

        @Override
        public int compareTo(CompaableComparator.Student o) {
            return o.rollNo - this.rollNo;
        }

        public String toString() {
            return "Rno= " + this.rollNo + ", HT = " + this.ht + ", wt= " + this.wt;
        }
    }

    static class StudentHtComparator implements Comparator<CompaableComparator.Student> {
        @Override
        public int compare(CompaableComparator.Student o1, CompaableComparator.Student o2) {
            return o2.ht - o1.ht;
        }
    }

    static class StudentWComparator implements Comparator<CompaableComparator.Student> {
        @Override
        public int compare(CompaableComparator.Student o1, CompaableComparator.Student o2) {
            return o2.wt - o1.wt;
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 2, 17, 3, 18, 9, 22};
        PriorityQueue<CompaableComparator.Student> pq = new PriorityQueue<>(); // if this is null so comparable run
        //   PriorityQueue<CompaableComparator.Student> pq = new PriorityQueue<>(new CompaableComparator.StudentHtComparator()); // // if this is not null so comparable run
        pq.add(new CompaableComparator.Student(10, 180, 81));
        pq.add(new CompaableComparator.Student(2, 185, 85));
        pq.add(new CompaableComparator.Student(12, 170, 84));
        pq.add(new CompaableComparator.Student(18, 179, 88));
        pq.add(new CompaableComparator.Student(7, 182, 82));

        while (pq.size() > 0) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
