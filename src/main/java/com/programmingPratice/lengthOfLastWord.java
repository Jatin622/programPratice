package com.programmingPratice;

public class lengthOfLastWord {

    public static  void main(String[]args){

       String s= "fly moon";
       System.out.println(lengthOfLastWord(s));
    }
    public static  int lengthOfLastWord(String s) {

        //Count the last word length
        int count = 0;

        for(int i=s.length()-1; i >= 0; i--){
            //Until we find space, we will iterate.
            if(s.charAt(i) == ' '){
                break;
            }

            count++;
        }
        //This will be our answer
        return count;
    }

}
