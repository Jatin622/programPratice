package com.programmingPratice.recursionJava;

import java.util.ArrayList;

public class mazePathDiagonalRecursion {
    public static void main(String[] args) {
        System.out.println(getMazePath(1, 1, 3, 3));
    }

    //sr=source row
    //sc=source column
    //dr=destination row
    //dc=destination column
    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths = new ArrayList<>();

        for (int i = 1; i <= dc - sc; i++) {
            ArrayList<String> hpaths = getMazePath(sr, sc + i, dr, dc);
            for (String path : hpaths) {
                paths.add("h" + path);
            }
        }
        for (int i = 1; i <= dr - sr; i++) {
            ArrayList<String> vpaths = getMazePath(sr + 1, sc, dr, dc);
            for (String path : vpaths) {
                paths.add("v" + path);
            }
        }
        for (int i = 1; i <= dc - sc && i <= dr - sr; i++) {
            ArrayList<String> dpaths = getMazePath(sr + i, sc + i, dr, dc);

            for (String path : dpaths) {
                paths.add("d" + path);
            }
        }
        return paths;
    }
}
//[hhvv, hvhv, hvvh, hvd, hdv, vhhv, vhvh, vhd, vvhh, vdh, dhv, dvh, dd]