package com.programmingPratice.functionAndArray;

public class substractionOfarray {
    public static void main(String[]args){
        int[] a = {3, 1, 0, 7, 5};
        int[] b = {1, 1, 1, 1, 6};
        int[] c = new int[a.length];

        if (a.length == b.length) {

            for (int i = 0, j = 0, k = 0; i < a.length; i++, j++, k++) {
                c[k] = a[i] - b[j];
                System.out.println(c[k]);
            }

        }
    }
}
