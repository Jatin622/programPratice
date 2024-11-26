package com.programmingPratice.pepcoading;

public class removeSecialCharater {
    public static void main(String[] args) {
        String input = "hello@3$%#";

        String result = input.replaceAll("[^a-zA-Z0-9\\s]", "");

        System.out.println("String after removing special characters: " + result);
    }
}
