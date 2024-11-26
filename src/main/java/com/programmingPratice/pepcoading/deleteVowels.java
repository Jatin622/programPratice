package com.programmingPratice.pepcoading;

import java.util.ArrayList;
import java.util.List;

public class deleteVowels {
    public static void main(String[]args){
        String s="hello";

        List<Character>list=List.of('a','e','o');
        List<Character>list1=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!list.contains(ch)){
                list1.add(ch);
            }
        }
        System.out.println(list1);
    }
}
