package com.programmingPratice.stream.filter;

import java.util.Arrays;

public class findNumber {
    public static void main(String[] args) {
        int[] a = {10, 20, 40, 50};
        int target=10;
        Arrays.stream(a).filter(n->n==target).forEach(n->System.out.println(n));
        }

}
