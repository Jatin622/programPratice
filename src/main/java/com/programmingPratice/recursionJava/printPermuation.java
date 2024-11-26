package com.programmingPratice.recursionJava;

public class printPermuation {
    public static void main(String[] args) {

        printsss("abcdef", "");
    }

    public static void printsss(String quess, String ans) {

        if (quess.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < quess.length(); i++) {
            char ch = quess.charAt(i);

            String left = quess.substring(0, i);//""

            String right = quess.substring(i + 1);//bc

            String sub = left + right;//bc
            printsss(sub, ans + ch); //bc, a
        }
    }
}
