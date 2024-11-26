package com.programmingPratice.hacker;

import java.util.ArrayList;
import java.util.List;

public class ranking {
    public static void main(String[] args) {

        int[] ranked = {100, 100, 50, 40, 40, 20, 10};

        int[] player = {5, 25, 50, 120};
        System.out.println(climbingLeaderboard(ranked, player));
    }

    //6 4 2 1
    public static List<Integer> climbingLeaderboard(int[] ranked, int[] player) {
        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < player.length; i++) {

            for (int j = ranked.length - 1; j >0; j--) {
                if (ranked[j] >= player[i]) {
                    list.add(j);
                    break;
                }
            }
        }
        return list;
    }
}
