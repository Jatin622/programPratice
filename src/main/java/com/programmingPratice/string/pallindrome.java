package com.programmingPratice.string;

public class pallindrome {
    public static void main(String[]args){
        String str="radars";
        String nstr="";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            nstr=ch+nstr;

        }
        if(str.equals(nstr)){
            System.out.println("pallindrome");
        }else{
            System.out.println("not pallindrome");
        }

    }
}
