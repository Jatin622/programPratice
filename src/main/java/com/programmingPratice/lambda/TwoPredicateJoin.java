package com.programmingPratice.lambda;

import net.bytebuddy.asm.Advice;

import java.util.function.Predicate;

public class TwoPredicateJoin {
    public static void main(String[]args){
        int[]x={10,20,30,14,15};

        Predicate<Integer>predicate1=s->s%2==0;
        Predicate<Integer>predicate2=d->d>10;

        for(int f:x){
            if(predicate1.and(predicate2).test(f)){
                System.out.println(f);
            }
        }
    }
}
