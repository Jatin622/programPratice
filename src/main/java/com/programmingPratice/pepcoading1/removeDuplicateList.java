package com.programmingPratice.pepcoading1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class removeDuplicateList {
    public static void main(String[]args){
        List<String> list=new ArrayList<String>();
        list.add("Apple");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        HashSet<String> set=new HashSet<>();
        for(String arr:list){
            set.add(arr);
        }
        System.out.println(set);
    }
}
