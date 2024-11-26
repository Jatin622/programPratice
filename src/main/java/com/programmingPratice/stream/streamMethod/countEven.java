package com.programmingPratice.stream.streamMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countEven {
    public static void main(String[]args){

        List<Integer>number= Arrays.asList(1,2,3,4,5,6,1,2,3,4);

        Long total=number.stream().filter(x->x%2==0).count();
        System.out.println(total);

    }
}
