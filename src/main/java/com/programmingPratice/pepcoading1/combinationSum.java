package com.programmingPratice.pepcoading1;

public class combinationSum {
    public static void main(String[]args){
//still incomplete
        int[] total={2,3,6,7};

        int target=7;
        int sum=0;

        for(int i=0;i<total.length;i++){

            sum+=total[i];
             System.out.println(total[i]);
            if(sum>target){
                sum=sum-total[i];


                for (int j = 0; j < total.length; j++) {
                    sum += total[j];
                    if (sum == target) {

                        break;

                }

            }
            }
        }


    }
}
