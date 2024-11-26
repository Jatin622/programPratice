package com.programmingPratice.recursionPratice;

public class targetElementRecursion {
    public static void main(String[] args) {
        int a[] = {3, 2, 19, 99};
        int target = 19;
        System.out.println(searchElement(a,0,target));
    }

    public static String searchElement(int[] arr, int index, int target) {
        if (index == arr.length - 1) {
            return "not find this element";
        }

        if (arr[index] == target) {
            return "this is element index" + index;
        }
        return searchElement(arr, index +1, target);
    }
}
