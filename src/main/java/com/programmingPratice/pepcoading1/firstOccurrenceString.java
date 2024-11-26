package com.programmingPratice.pepcoading1;

public class firstOccurrenceString {
    static void printIndex(String haystack, String needle)
    {
        boolean flag = false;
        for (int i = 0; i < haystack.length() - needle.length()+1;i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                System.out.print(i + " ");
                flag = true;
            }
        }

        if (flag == false) {
            System.out.println("NONE");
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        String str1 = "GeeksforGeeks";
        String str2 = "Geeks";
        printIndex(str1, str2);
    }

}
