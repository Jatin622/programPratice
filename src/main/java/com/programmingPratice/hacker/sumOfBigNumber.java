package com.programmingPratice.hacker;

public class sumOfBigNumber {
    public static void main(String[] args) {
        Long[] a = {1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L};
        sumOfBig(a);
    }

    public static void sumOfBig(Long[] a) {

        Long sum = 0L;

        for (int i = 0; i < a.length; i++) {

            sum += a[i];
        }
        System.out.println(sum);
    }
}
