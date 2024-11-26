package com.programmingPratice.recursionJava;

public class targetSumSubset49 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int target = 30;
        targetSum(arr, 0, "", 0, target);
    }

    public static void targetSum(int[] arr, int idx, String set, int sos, int tar) {
        if (idx == arr.length) {
            if (sos == tar) {
                System.out.println(set + ".");
            }
            return;
        }

        targetSum(arr, idx + 1, set + arr[idx] + " , ", sos + arr[idx], tar);
        targetSum(arr, idx + 1, set, sos, tar);


    }
}
