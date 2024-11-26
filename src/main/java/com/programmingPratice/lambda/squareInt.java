package com.programmingPratice.lambda;
@FunctionalInterface
public interface squareInt {
    public void m1(int a);
}
class square {
    public static void main(String[]args){
        squareInt i=(int a)->System.out.println((a*a)*a);

        i.m1(2);
        i.m1(3);
    }


}
