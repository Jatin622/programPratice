package com.programmingPratice.pepcoading1;

import java.util.HashSet;

public class removeDuplicateTwiceElement {
    public static void main(String[]args){

        int[]a={1,2,2,3,4,4,6};

        HashSet<Integer> hashSet= new HashSet<>();

        for(int i=0;i<a.length;i++){

            if(hashSet.contains(a[i])){
                hashSet.remove(a[i]);
            }else {
                hashSet.add(a[i]);
            }
        }
        System.out.println(hashSet);

    }
}
