package com.programmingPratice.pepcoading1;

import java.util.Arrays;

public class plus {
    public static int[] plusOne(int[] digits) {
        int j = digits.length - 1;
        for (int i = j; i > 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i] = 0;
            i--;
        }
        return digits;
    }

    public static void main(String[] args) {

       int[] digits = {1, 9, 9};
//        int[] digits = {1, 2, 3};
        plusOne(digits);

        System.out.println(Arrays.toString(digits));
    }
}
