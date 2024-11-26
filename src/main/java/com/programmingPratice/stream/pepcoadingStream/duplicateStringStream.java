package com.programmingPratice.stream.pepcoadingStream;

import java.util.HashSet;

public class duplicateStringStream {
    public static void main(String[] args) {

        String s="aaababbabacd";

        HashSet<Character> hashSet=new HashSet<>();

        s.chars().filter(x->hashSet.add((char) x)).forEach(y->System.out.println((char)y));
    }
}
