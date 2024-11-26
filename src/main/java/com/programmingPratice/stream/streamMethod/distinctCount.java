package com.programmingPratice.stream.streamMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class distinctCount {
    public static void main(String[]args){


        List<String>vehicleList= Arrays.asList("car","bus","car","auto","bike","auto");
        //distinct()
        vehicleList.stream().distinct().forEach(n->System.out.println(n));

        //count
       long countValue= vehicleList.stream().distinct().count();
       System.out.println(countValue);

       //limit
        vehicleList.stream().limit(3).forEach(x->System.out.println(x));

    }
}
