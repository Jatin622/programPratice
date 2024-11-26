package com.programmingPratice.functionAndArray;

public class RotateArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int N = a.length;
        int b = 2;
        int temp[] = new int[N];
        int k = 0;

        for (int i = a.length - 1; i > b; i--) { // first we can iterate loop till b=2 {50 ,40 ,0,0,0} and store in new array in temp
            temp[k] = a[i];
            k++;

        }
        for (int i = a.length - b - 1; i >= 0; i--) { // second step in we can iterate the loop {50,40,30,20,10}
            temp[k] = a[i];
            k++;
        }
        for (int i = 0; i < N; i++) { // third step we can store temp value in our main array
            a[i] = temp[i];

            System.out.println(temp[i]);
        }

    }
}
