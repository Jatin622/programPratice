package com.programmingPratice.recursionPratice;

public class lastOccurence {
    public static void main(String[] args) {
        int a[] = {3, 2, 99, 99, 18};
        int target = 99;
      System.out.println(lastOccoruence(a,target,a.length-1));

    }

    public static int lastOccoruence(int[] arr, int target, int index) {
        if(index<0){
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }
        return lastOccoruence(arr, target, index - 1);
    }
}
