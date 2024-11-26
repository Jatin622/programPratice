package com.programmingPratice.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1<o2)?-1:(o1>o2)?1:0;
    }
}
class Testing{
    public static void main(String[]args){
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(30);
        System.out.println(arrayList);
        Collections.sort(arrayList,new MyComparator());
        System.out.println(arrayList);
    }

}