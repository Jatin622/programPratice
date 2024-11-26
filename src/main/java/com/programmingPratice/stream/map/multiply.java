package com.programmingPratice.stream.map;

import java.util.Arrays;
import java.util.List;

public class multiply {
    public static void main(String[]args){

        List<Integer>list= Arrays.asList(2,3,4,5);

        list.stream().map(n->n*2).forEach(n->System.out.println(n));
    }
}
