package com.programmingPratice.binaryTree.binarySearchPlaylist;

import java.util.Random;

public class s {

    private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";

    public static String generateRandomString() {
        Random random = new Random();
        return "TC" +
                random.ints(2, 0, LETTERS.length()).mapToObj(i -> String.valueOf(LETTERS.charAt(i))).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append) +
                random.ints(2, 0, DIGITS.length()).mapToObj(i -> String.valueOf(DIGITS.charAt(i))).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append) +
                random.ints(2, 0, LETTERS.length()).mapToObj(i -> String.valueOf(LETTERS.charAt(i))).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append) +
                "-" +
                random.ints(4, 0, DIGITS.length()).mapToObj(i -> String.valueOf(DIGITS.charAt(i))).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
    }

    public static void main(String[] args) {
        System.out.println(generateRandomString());
    }
}
