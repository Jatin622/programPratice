package com.programmingPratice.recursionJava;

import java.util.ArrayList;

public class mazePathRecursion {
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
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        if (sc <= dc) {
            hpaths = getMazePath(sr, sc + 1, dr, dc);
        }
        if (sr <=dr) {
            vpaths = getMazePath(sr + 1, sc, dr, dc);
        }

        ArrayList<String> paths = new ArrayList<>();
        for (String path : hpaths) {
            paths.add("h" + path);
        }
        for (String path : vpaths) {
            paths.add("v" + path);
        }
        return paths;
    }
}
//[hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]
