package com.programmingPratice.lambda;

import java.util.function.Function;

public class OperationFunctionFirst {
    // Function we use when we can perform operation
    // inFunction We can pass 2 parameter first is input second in output

    //FunctionChaining--
    //f1.andThen(f2).apply(i) = first f1 followed by f2
    //f1.compose(f2).apply(i) = first f2 and then f1
    public static void main(String[]args) {

        Function<String, Integer> f = s -> s.length();
        System.out.println(f.apply("theDogIs"));
    }
}
