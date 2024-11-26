package com.programmingPratice.stack;

import java.util.Stack;

public class firstProgram {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10); // thee add the element
        st.push(20);
        System.out.println(st);

        System.out.println(st.peek()); // they get the only first element

        st.push(30);
        st.push(40);
        System.out.println(st);

        st.pop(); // they remove the to of element
        System.out.println(st);
    }

}
