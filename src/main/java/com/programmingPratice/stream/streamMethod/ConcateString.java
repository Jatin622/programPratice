package com.programmingPratice.stream.streamMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcateString {
    public static void main(String[]args){
        List<String>animalList= Arrays.asList("Dog","cat","Elephant");

        List<String>birdsList=Arrays.asList("paeckock","parrot","crow");

        Stream<String>stream1=animalList.stream();
        Stream<String>stream2=birdsList.stream();

        List<String>fianlList=Stream.concat(stream1,stream2).collect(Collectors.toList());

        System.out.println(fianlList);
    }
}
