package com.programmingPratice.lambda;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println("child thread");
        }
    }
}
class Test{
    public static void main(String[]args){
        MyRunnable r=new MyRunnable();
        Thread thread=new Thread(r);
        thread.start();

    }
}
