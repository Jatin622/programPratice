package com.programmingPratice.lambda;

// runnable by default support functional interface
public class MyRunnableLambda {
    public static void main(String[]args) {

        Runnable r = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println("child Thread");
            }
        };
        Thread t=new Thread(r);

        t.start();
    }
}
