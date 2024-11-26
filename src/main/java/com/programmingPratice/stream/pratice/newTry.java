package com.programmingPratice.stream.pratice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class newTry {
    public static void main(String[] args) {
        String s="Java Hungry Blog Alive is Awesome";
        HashSet<Character>hashSet=new HashSet<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(hashSet.contains(ch)){
                hashSet.remove(ch);
            }
            hashSet.add(ch);
        }
        System.out.println(hashSet);
    }
}
