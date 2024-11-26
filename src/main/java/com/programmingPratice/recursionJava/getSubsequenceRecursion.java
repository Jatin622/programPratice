package com.programmingPratice.recursionJava;

import java.util.ArrayList;

public class getSubsequenceRecursion {
    public static void main(String[] args) {
        String str = "abc";

        System.out.println(gss(str));
    }
    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add(" ");
            return bres;
        }
        char ch = str.charAt(0);//a
        String ros = str.substring(1);//bc

        ArrayList<String> rres = gss(ros);//call with rest of string

        ArrayList<String> mres = new ArrayList<>();

        for (String rstr : rres) {

            mres.add(" " + rstr);
            mres.add(ch + rstr);
        }
            return mres;
    }
}
