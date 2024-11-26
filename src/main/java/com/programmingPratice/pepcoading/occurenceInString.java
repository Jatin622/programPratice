package com.programmingPratice.pepcoading;

import java.util.HashMap;

public class occurenceInString {

    public static void main(String[] args) {
        String s = "alapppl";

        HashMap<Character,Integer> hashMap=new HashMap<>();


        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(hashMap.containsKey(ch)){
                int count =hashMap.get(ch);
                hashMap.put(ch,count+1);
            }else{
                hashMap.put(ch,1);
            }
        }
        for (Character c : hashMap.keySet()) {
            int count = hashMap.get(c);
            System.out.println("'" + c + "' occurs " + count + " time(s) in the name.");
        }
    }
}
