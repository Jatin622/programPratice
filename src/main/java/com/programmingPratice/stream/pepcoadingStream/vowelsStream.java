package com.programmingPratice.stream.pepcoadingStream;

import java.util.List;

public class vowelsStream {
    public static void main(String[] args) {
        String s = "hello";

        List<Character> list = List.of('a', 'e', 'o');

        s.chars().filter(x->!list.contains((char)x)).forEach(y->System.out.println((char)y));
    }
}
