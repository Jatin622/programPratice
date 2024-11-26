package com.programmingPratice.stream.streamMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// reduce = they make one string
public class reduce {
    public static void main(String[]args){
        List<String>list= Arrays.asList("A","B","C","1","2","3");

        Optional<String>reduced=list.stream().reduce((value,combinedValue)->{
            return combinedValue+value;
                });
        System.out.println(reduced.get());
    }
}
