package com.programmingPratice.lambda;
@FunctionalInterface
public interface add {
    public  void addition(int a ,int b);
}
class Demo {
    public static void main(String[]args) {
        add i = (int a, int b) -> System.out.println(a + b);
        i.addition(10,20);
    }
}
