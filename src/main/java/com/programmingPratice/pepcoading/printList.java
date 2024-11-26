package com.programmingPratice.pepcoading;

import java.util.ArrayList;
import java.util.Arrays;

public class printList {
    public static void main(String[]args){
//        List<Integer>list=new ArrayList<>();
//        list.add(10);
//        list.add(20);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 3, 2, 2, 3));


        for(int i=0;i<list.size();i++){
            System.out.println(list.size());
        }

    }
}
