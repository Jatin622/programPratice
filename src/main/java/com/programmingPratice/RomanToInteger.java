package com.programmingPratice;

import javax.swing.text.Document;
import java.util.*;

public class RomanToInteger {
    public static void romanToInteger(String s){
    Map<Character,Integer> map = new HashMap<>();
    map.put('I',1);
    map.put('J',2);
    map.put('O',3);
    s=s.replace("IV","IIII");
    s=s.replace("IX","VIIII");


    int number =0;
    for(int i=0;i<s.length();i++){
        number = number +(map.get(s.charAt(i)));
    }
    System.out.println(number);


    }
    public static  void main(String[]args){
        String linear=("IJ");

        romanToInteger(linear);
    }

}