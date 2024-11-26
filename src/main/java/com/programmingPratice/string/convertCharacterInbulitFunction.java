package com.programmingPratice.string;

public class convertCharacterInbulitFunction {
    public static void main(String[]args){

        String s="pepCoade";
        String a=toogelCae(s);
        System.out.println(a);
    }
    public static String toogelCae(String str){
        String c=str.substring(0,1);
        for(int i=1;i<str.length();i++){

           if(Character.isUpperCase(str.charAt(i))){
               c=c+Character.toLowerCase(str.charAt(i));

           }
           else{
               c+=Character.toUpperCase(str.charAt(i));
           }
        }
        return c;
    }

}
