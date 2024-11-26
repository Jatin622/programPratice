package com.programmingPratice.pepcoading1;

public class FibonacciEven {
    public static void main(String[]args) {
        int number = 10;
        int a = 0;
        int b = 1;

        for(int i=0;i<=number;i++){

            int total=a+b;
//            if(total%2==0){
//                System.out.println(total);
//            }
            a=b;
            b=total;
            System.out.println(total);
        }
    }
}
