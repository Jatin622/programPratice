package com.programmingPratice.stream.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class startwith1Java {
    public static void main(String[]args){
        int[]a={1,12,22,13};
       List<String> b= Arrays.stream(a).mapToObj(s-> s + "").filter(s->s.startsWith("1")).collect(Collectors.toList());
   System.out.println(b);

    }
}
