//package com.programmingPratice.hacker;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class birthdayChoclate {
//    public static void main(String[] args) {
//        List<Integer> a = new ArrayList<>();
//
//        a.add(4);
//
//        int resultAddElement = 4;
//        int addElement = 1;
//        System.out.println(birthday(a, resultAddElement, addElement));
//    }
//
//    public static int birthday(List<Integer> a, int resultAddElement, int addElement) {
//        int count = 0;
//
//        for (int i = 0; i <= a.size() - resultAddElement; i++) {
//            int sum = 0;
//            for (int j = 0; j < addElement; j++) {
//                sum += a.get((i + j));
//            }
//            if (sum == resultAddElement) {
//                count++;
//            }
//        }
//        return count;
//    }
//}
