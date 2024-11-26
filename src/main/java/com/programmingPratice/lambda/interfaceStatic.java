package com.programmingPratice.lambda;

public interface interfaceStatic {
    public static void m1() {
        System.out.println("interface static method");
    }
}
    class staticInterface {
        public static void main(String[]args){
            interfaceStatic.m1();
        }
    }

