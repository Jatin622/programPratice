//package com.programmingPratice.hacker;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class academicRecord {
//    public static void main(String[] args) {
//
//        int[] rank = {100, 50, 40, 20, 10};
//        int[] player = {5, 25, 50, 120};
//        System.out.println(climbingLeaderBoard(rank, player));
//    }
//
//    public static List<Integer> climbingLeaderBoard(int[] rank, int[] player) {
//
//
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = player.length ; i >= 0; i--) {
//            for (int j = 0; j < rank.length; j++) {
//
//
//                if (player[i] >= rank[j]) {
//                    list.add(rank[i]);
//                } else {
//                    list.add(player[j]);
//
//                }
//            }
//        }
//        return list;
//    }
//
//}
