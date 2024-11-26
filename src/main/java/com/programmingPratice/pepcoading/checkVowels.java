package com.programmingPratice.pepcoading;


import java.util.List;

public class checkVowels {
    public static void main(String[] args) {
        String str = "helloo";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'i' || ch == 'e' || ch == 'o') {
                System.out.println(ch);
                count++;
            }

        }
        System.out.println(count);
    }
}

// through List

//    String str= "hello";
//    int count=0;
//    List<String> chars= List.of("a","e","i","o","u");
//        for(int i=0;i<chars.size();i++){
//        if(str.toLowerCase().contains(chars.get(i)))
//        count++;
//
//        }
//        System.out.println(count);
//        }




//    String str="hello";
//
//        for(int i=0;i<str.length();i++){
//
//        char ch= str.charAt(i);
//
//        if(ch=='e' || ch =='o'){
//
//
//        System.out.println("Found vowel " + str.charAt(i) + " at position " + i);
//        }
//
//        }
//Output
//    Found vowel e at position 1
//        Found vowel o at position 4