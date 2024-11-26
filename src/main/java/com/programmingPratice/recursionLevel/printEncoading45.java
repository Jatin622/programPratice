package com.programmingPratice.recursionLevel;

// '6' notEqual 6 , '6' - '0'=6
public class printEncoading45 {
    public static void main(String[] args) {
        printEncoiadings("12103","");

    }

    public static void printEncoiadings(String ques, String asf) {
        if (ques.length() == 0) {
            System.out.println(asf);
            return;
        } else if (ques.length() == 1) {
            //check this condition if char is 0
            char ch = ques.charAt(0);
            if (ch == '0') {
                return;
            } else {
                int chv = ch - '0';
                char code = (char) ('a' + chv - 1); //chv = 3,  a+3 = d, d - 1 = c
                asf = asf + code;
                System.out.println(asf);
            }

        } else { // if size is greater than 1

            char ch = ques.charAt(0);
            String roq = ques.substring(1);

            if (ch == '0') {
                return;
            } else {
                int chv = ch - '0';
                char code = (char) ('a' + chv - 1);
                printEncoiadings(roq, asf + code);
            }
            String ch12 = ques.substring(0, 2);
            String roq12 = ques.substring(2);

            int ch12v = Integer.parseInt(ch12);
            if (ch12v <= 26) {
                char code = (char) ('a' + ch12v - 1);
                printEncoiadings(roq12, asf + code);
            }
        }
    }

}
