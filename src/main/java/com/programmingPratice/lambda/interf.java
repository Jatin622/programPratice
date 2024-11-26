package com.programmingPratice.lambda;
@FunctionalInterface
public interface interf {
    public  void  m1();
}
class test{
    public static void main(String[]args){
        interf i=()->System.out.println("hello through lambda");
        i.m1();
    }

}
