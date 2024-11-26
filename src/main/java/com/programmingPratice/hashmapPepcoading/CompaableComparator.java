package com.programmingPratice.hashmapPepcoading;

import java.util.Comparator;
import java.util.PriorityQueue;

//Comparable interface can be used to provide single way of sorting whereas
// Comparator interface is used to provide different ways of sorting.
public class CompaableComparator {
    static class Student implements Comparable<Student> {
        int rollNo;
        int ht;
        int wt;

        public Student(int rollNo, int ht, int wt) {
            this.rollNo = rollNo;
            this.ht = ht;
            this.wt = wt;
        }

        @Override
        public int compareTo(Student o) {
            return o.rollNo - this.rollNo;
        }

        public String toString() {
            return "Rno= " + this.rollNo + ", HT = " + this.ht + ", wt= " + this.wt;
        }
    }

//comparator
    static class StudentHtComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.ht - o1.ht;
        }
    }

    static class StudentWComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.wt - o1.wt;
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 2, 17, 3, 18, 9, 22};
        PriorityQueue<Student> pq = new PriorityQueue<>(new StudentHtComparator());
        pq.add(new Student(10, 180, 81));
        pq.add(new Student(2, 185, 85));
        pq.add(new Student(12, 170, 84));
        pq.add(new Student(18, 179, 88));
        pq.add(new Student(7, 182, 82));

        while (pq.size() > 0) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
