package com.programmingPratice;

public class OneNoIsAllow {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 3, 2};
        System.out.println(singleNumber(numbers));
    }

    public static int singleNumber(int[] numbers) {
        int len = numbers.length;
        boolean isTwice = false;
        for (int i = 0; i < len; i++) {
            isTwice = false;
            for (int j = 0; j < len; j++) {
                if (isTwice) break;
                if (i != j)
                    if (numbers[i] == numbers[j])
                        isTwice = true;
            }
            if (!isTwice) return numbers[i];
        }
        //return numbers[len - 1];
        return 0;
    }
}
