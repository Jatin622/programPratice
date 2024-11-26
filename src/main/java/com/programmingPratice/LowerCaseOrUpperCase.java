package com.programmingPratice;

import java.util.Scanner;

public class LowerCaseOrUpperCase {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);

        if(a >='a' && a<='z' ){
            System.out.println("is lower case");
        } else if (a>='A' && a<='Z') {
            System.out.println("is upper case");

        }


    }


}
