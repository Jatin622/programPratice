package com.programmingPratice.stream.streamMethod;

import java.util.HashSet;
import java.util.Set;

public class AnyMatchMethods {

    public static void main(String[]args){

        Set<String>fruits= new HashSet<String>();

        fruits.add("One Apple");
        fruits.add("One Mango");
        fruits.add("Two Apple");
        fruits.add("More Grapes");

        //Any Match = if any value start with One return true
        Boolean result=fruits.stream().anyMatch(value->{return value.startsWith("One");});
        System.out.println(result);

        //allMatch = if all start with true they return true or else false
        Boolean resultAllMatch=fruits.stream().allMatch(value->{return value.startsWith("One");});
        System.out.println(resultAllMatch);

        //none Match = if anyOne start with One they return false or else true
        Boolean noneMatchResult=fruits.stream().noneMatch(value->{return value.startsWith("One");});
        System.out.println(noneMatchResult);


    }
}
