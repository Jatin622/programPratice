package com.programmingPratice.twoDArray;

import java.util.PriorityQueue;

public class testing {
    public static void main(String[] args) {

        int[] arr = {45, 23, 7, 33, 3, 11};
        int sum = find(arr) + find(arr);
        System.out.println(sum);
    }

    public static int find(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }


}
