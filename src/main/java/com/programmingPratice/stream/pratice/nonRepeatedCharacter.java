package com.programmingPratice.stream.pratice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class nonRepeatedCharacter {
    public static Character firstNonRepeatedCharacter(String str)
    {
        Set<Character> repeatingChars = new HashSet<>();
        List<Character> nonRepeatingChars = new ArrayList<>();
        for(int i=0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if(repeatingChars.contains(letter))
                continue;
            if(nonRepeatingChars.contains(letter)) {
                nonRepeatingChars.remove((Character) letter);
                repeatingChars.add(letter);
            }
            else {
                nonRepeatingChars.add(letter);
            }
        }
        return nonRepeatingChars.get(0);
    }

    public static void main(String[] args)
    {

       String s="Java Hungry Blog Alive is Awesome";
        char ch = firstNonRepeatedCharacter(s);
        System.out.println("The first non repeated character is :  " + ch);
    }
    }
