package com.programmingPratice.stack;

import java.util.Stack;

public class balancedBracket {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        // String str = "[(a+b)+{(c+d)*(e/f)}] "; // true
        String str = "[(a+b)]";
        //String str = "[(a + b) + {(c + d) * (e / f)]}"; // false

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);

            } else if (ch == ')') {
                boolean val = handleClosing(st, '(');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else if (ch == '}') {
                boolean val = handleClosing(st, '{');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else if (ch == ']') {
                boolean val = handleClosing(st, '[');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            }
        }
        if (st.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean handleClosing(Stack<Character> st, char corresoch) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != corresoch) { // [([a+b)] when ')' this have '[' instead of '('
            System.out.println(false);
            return false;
        } else {
            st.pop();
            return true;
        }
    }
}
