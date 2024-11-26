package com.programmingPratice.stream.map;

import java.util.Arrays;
import java.util.List;

public class upperCAse {
    public static void main(String[]args){

        List<String>vehicle= Arrays.asList("car","truck");

        vehicle.stream().map(n->n.toUpperCase()).forEach(n->System.out.println(n));
    }
}
