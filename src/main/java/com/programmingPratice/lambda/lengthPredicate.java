package com.programmingPratice.lambda;

import java.util.function.Predicate;

public class lengthPredicate {
    public static void main(String[]args){
        String s[]={"chair","laptop"};

        Predicate<String>predicate=s1 -> s1.length()>5;
        for(String s2:s){
            if(predicate.test(s2)){
                System.out.println(s2);
            }
        }
    }
}
