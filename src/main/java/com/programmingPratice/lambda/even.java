package com.programmingPratice.lambda;

import java.util.function.Predicate;

public class even {
    public static void main(String[]args){
        int[]a={1,2,3,4};

        Predicate<Integer>predicate=s->s%2==0;

       for(int v:a){
           if(predicate.test(v)){
               System.out.println(v);
           }
       }
    }
}
