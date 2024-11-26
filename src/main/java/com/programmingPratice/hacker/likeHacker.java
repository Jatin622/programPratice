package com.programmingPratice.hacker;

public class likeHacker {
    public static void main(String[] ARGS) {

        int day = 2;
       System.out.println(viralAdvertising(day));
    }

    public static int viralAdvertising(int day) {
        int shared = 5;
        int like = 2;
        int cumulative = 2;

        for (int i = 2; i <= day; i++) {

            shared = like * 3;
            like = shared / 2;
            cumulative += like;

        }
        return cumulative;
    }
}
