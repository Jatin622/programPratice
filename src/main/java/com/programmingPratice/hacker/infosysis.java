package com.programmingPratice.hacker;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class infosysis {
    public static void main(String[] args) {

        String str = "AB#CD#EF";
        System.out.println(removeSpecialChar(str));
    }

    public static List<String> removeSpecialChar(String str) {
        String[] s = str.split("#");
        List<String> list = new ArrayList<>();

        for (String part : s) {
            list.add(part);
        }
        return list;
    }
}
