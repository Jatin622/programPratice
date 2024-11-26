package com.programmingPratice.pepcoading1;

import java.util.HashSet;
import java.util.Set;

public class checkDuplicate {
    public static void  main(String[]args){

        String s="hello";
        String uniqueCharacterSubstringBruteForce = getUniqueCharacterSubstringBruteForce(s);
        System.out.println(uniqueCharacterSubstringBruteForce);

    }

   public static String getUniqueCharacterSubstringBruteForce(String input) {
            String output = "";
           Set<Character> visited = new HashSet<>();

                int end =0;
                for (end=0; end < input.length(); end++) {
                    char currChar = input.charAt(end);
                    if (visited.contains(currChar)) {
                        break;
                    } else {
                        visited.add(currChar);
                    }
                }
                if (output.length() < end + 1) {
                    output = input.substring(0, end);
                }
            return output;
        }
}
