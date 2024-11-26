package com.programmingPratice.lambda;

import java.util.function.Function;

public class upperCase {
    public static void main(String[]args) {
        String s = "thedog";

        Function<String, String> f = k -> k.toUpperCase();

        System.out.println(f.apply(s));

    }
}
