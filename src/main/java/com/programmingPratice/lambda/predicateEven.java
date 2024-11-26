package com.programmingPratice.lambda;

import java.util.function.Predicate;
//predicate return boolean
public class predicateEven {
    public static void main(String[]args){
        Predicate<Integer>predicate=i->i%2==0;

        System.out.println(predicate.test(10));
        System.out.println(predicate.test(15));
    }
}
