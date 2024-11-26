package com.programmingPratice.recursionJava;

import java.util.ArrayList;
import java.util.List;

public class keypadCombination {
    public static void main(String[] args) {
        String str="678";

        System.out.println(combination(str));

    }
   static String[] codes = {".,", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static List<String> combination(String str) {

        if(str.length()==0){
            List<String>bres=new ArrayList<>();
            bres.add(" ");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        List<String> rres = combination(ros);
        List<String> mres = new ArrayList<>();

        String codeforch = codes[ch - '0'];
        for (int i = 0; i < codeforch.length(); i++) {
            char chcode = codeforch.charAt(i);
            for (String rstr : rres) {
                mres.add(chcode+" "+rstr);
            }
        }
        return mres;

    }
}
