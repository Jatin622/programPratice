package com.programmingPratice.stream.filter;

import java.util.Arrays;
import java.util.List;

public class removeNull {
    public static void main(String[]args){
        List<String>words= Arrays.asList("cup",null,"tea",null,"laptop","door");


        words.stream().filter(n->n!=null).forEach(n->System.out.println(n));
    }
}
