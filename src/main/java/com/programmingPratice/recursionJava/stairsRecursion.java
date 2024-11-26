package com.programmingPratice.recursionJava;

import java.util.ArrayList;

public class stairsRecursion {
    public static void main(String[] args) {
        int a = 4;
        System.out.println(getStairsPath(a));
    }

    public static ArrayList<String> getStairsPath(int n) {
        if (n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add(" ");
            return bres;
        } else if (n < 0) {//if n is neagtive just return
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String> path1 = getStairsPath(n - 1); // first statement
        ArrayList<String> path2 = getStairsPath(n - 2);// second statement
        //   ArrayList<String> path3 = getStairsPath(n - 3);// third statement

        ArrayList<String> myres = new ArrayList<>(); // 4 statement

        for (String path : path1) { // 5 statement
            myres.add(1 + path);
        }
        for (String path : path2) { // 6 statement
            myres.add(2 + path);
        }
//        for (String path : path3) { // 7 statement
//            myres.add(3 + path);
//        }
        //  System.out.println(myres);
        return myres;
    }

}
// line 95 debug their in copy