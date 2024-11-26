package com.programmingPratice.stream.streamMethod;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sorting {
    public static void main(String[]args){
        List<Integer>list= Arrays.asList(2,4,1,3,5,9,2);

        list.stream().sorted().forEach(x->System.out.println(x)); //ascending order

        list.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.println(x));
    }
}
