package com.programmingPratice.stream.pratice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class printDuplicate {
    public static void main(String[]args){
        List<Integer> list= Arrays.asList(1,2,3,1,2,4);
        HashSet<Integer>hashSet=new HashSet<>();

      List<Integer>duplicate=  list.stream().filter(x->!hashSet.add(x)).collect(Collectors.toList());

      System.out.println(duplicate);
    }
}
