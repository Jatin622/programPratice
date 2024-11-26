package com.programmingPratice.stream.map;

import java.util.Arrays;
import java.util.List;

public class lengthWord {
    public static void main(String[]args){

        List<String>list=Arrays.asList("car","truck","helicopter");


        list.stream().map(n->n.length()).forEach(n->System.out.println(n));
    }
}
