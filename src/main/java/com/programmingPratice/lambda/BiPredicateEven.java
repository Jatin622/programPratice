package com.programmingPratice.lambda;

import java.util.function.BiPredicate;

public class BiPredicateEven {
    public static void main(String[]args){
        BiPredicate<Integer,Integer>p=(a,b)->a+b%2==0;

        System.out.println(p.test(10,20));
    }
}
