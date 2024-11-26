package com.programmingPratice.recursion;

public class firstProgram {
    public static void main(String[]args){
        print(1);
    }
    //recursion = they call itself
    static void print(int n){
        if(n==5){ //condition where program stop base condition
            System.out.println(5);
              return;
        }
        System.out.println(n);
        print(n+1);// they inc the value

    }
}

//why recursion = 1) it helps us in solving bigger problem in a simple way
// 2) you can convert recursion solution into iteration & vice versa
// 3) space complexity is not constant because of recursive call
