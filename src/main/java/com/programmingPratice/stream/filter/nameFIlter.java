package com.programmingPratice.stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class nameFIlter {
    public static void main(String[]args){

        List<String> name= Arrays.asList("laptops","individual","professor","silent","tea");

        name.stream().filter(n->n.length()>6 && n.length()<8).forEach(n->System.out.println(n));
    }
}
