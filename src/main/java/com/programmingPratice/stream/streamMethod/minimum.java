package com.programmingPratice.stream.streamMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class minimum {
    public static void main(String[]args){

        List<Integer>numberList= Arrays.asList(1,2,3,3,4,2,2);

        Optional<Integer> min=numberList.stream().min((val1, val2)->{
            return val1.compareTo(val2);
        });
        System.out.println(min.get());
    }
}
