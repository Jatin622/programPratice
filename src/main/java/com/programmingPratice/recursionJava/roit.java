package com.programmingPratice.recursionJava;

import java.util.ArrayList;

public class roit {
    public static void main(String[] args) {

        int a = 4;
        System.out.println(getComb(a));

    }

    public static ArrayList<String> getComb(int a) {

        if (a == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }else if (a < 0) {//if n is neagtive just return
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> comb = getComb(a - 1);
        ArrayList<String> comb2 = getComb(a - 2);
        ArrayList<String> list = new ArrayList<>();

        for (String co : comb) {
            list.add(1 + co);

        }
        for (String c02 : comb2) {
            list.add(2 + c02);
        }
        return list;
    }


}
