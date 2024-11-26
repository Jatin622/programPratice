package com.programmingPratice.twoDArray;

//first matrix =2 * 3 and second is 3 * 4 if first matrix row and second matrix columns not equal matrix is invalid

import java.util.Scanner;

// so new matrix make 2 * 4
public class MultiplyOfTwoArray {
    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);

        int r1 = scan.nextInt();
        int c1 = scan.nextInt();

        int[][] one = new int[2][3];

        for (int i = 0; i < one.length;i++){
            for(int j=0;j<one[0].length;j++){
                one[i][j]=scan.nextInt();
            }
        }
        int r2 = scan.nextInt();
        int c2 = scan.nextInt();

        int[][] two = new int[3][4];

        for (int i = 0; i < two.length;i++){
            for(int j=0;j<two[0].length;j++){
                two[i][j]=scan.nextInt();
            }
        }
        if(c1!=r2){
            System.out.println("not possible");
        }
        int [][]prd=new int[r1][c2];
        for(int i=0;i<prd.length;i++){
            for(int j=0;j<prd[0].length;j++){
                for(int k=0;k<c1;k++){
                    prd[i][j]+=one[i][k] * two[k][j];

                }
            }
        }
        for(int i=0;i<prd.length;i++){
            for(int j=0;j<prd[0].length;j++){
                System.out.println(prd[i][j] + "");

            }
            System.out.println();
        }
    }

}
