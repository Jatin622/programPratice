package com.programmingPratice.hacker;

import java.util.ArrayList;
import java.util.List;

public class huddleRace {
    public static void main(String[] args) {
        int k = 4;
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(3);
        list.add(5);
        list.add(2);
        System.out.println(hurdleRace(k, list));
    }

    public static int hurdleRace(int k, List<Integer>arr) {

        int ans = 0;

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i)>k) {
                int dupl = arr.get(i) - k;
                if (dupl>ans) {
                    ans = dupl;
                }
            }
        }
        return ans;
    }
}
