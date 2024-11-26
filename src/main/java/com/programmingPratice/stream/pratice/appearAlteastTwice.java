package com.programmingPratice.stream.pratice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class appearAlteastTwice {
    public static void main(String[]args){

        List<Integer> list= Arrays.asList(1,2,3,1);
        HashSet<Integer>hashSet=new HashSet<>();

        List<Integer>result=list.stream().filter(x->hashSet.add(x)).collect(Collectors.toList());
        if(result.size()==list.size()){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
