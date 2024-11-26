package com.programmingPratice;

public class reverseANo {
    public static void main(String[] args) {
        int i = 789;
        int ans = 0;

        while (i > 0) {
            int rem = i % 10;
            i /= 10;

            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }

}
// Behind Logic
//
//         i = 789;
//
//ans = 9* 10 + 8 = 98
//
//ans = 98 * 10 +7 =987
