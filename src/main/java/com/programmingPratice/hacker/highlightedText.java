package com.programmingPratice.hacker;

public class highlightedText {
    public static void main(String[] args) {

        int[] arr = {1 ,3 ,1 ,3 ,1 ,4 ,1 ,3 ,2 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5,7};
        String word = "zaba";
        designerPdfViewer(arr, word);
    }

    public static void designerPdfViewer(int[] arr, String word) {
        int value = 0;
        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);
            int x = ch - 97;

            int store = arr[x];


            if (value < store) {
                value = store;
            }
        }
        int result=value*word.length();
        System.out.println(result);

    }
}
