package com.programmingPratice.recursion;

public class LastIndex {
    public static void main(String[]args){
        int []a={10,20,30,40,30};
        int b=30;
     int c=   last(a,0,b);
     System.out.println(c);
    }
    public static int last(int[]a,int index,int b){

      if(index==a.length){
          return -1;
      }
      int lisa=last(a,index+1,b);
      if(lisa==-1){
          if(a[index]==b){
              return index;
          }else{
              return -1;

          }
          }else{
          return lisa;
      }
    }
}
