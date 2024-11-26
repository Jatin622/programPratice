package com.programmingPratice.recursionPratice;

public class towerOfhonai {
    public static void main(String[] args) {
        toh(3, 10, 11, 12);
    }

    public static void toh(int n, int tlid, int t2id, int t3id) {
        if (n == 0) {
            return;
        }
        toh(n - 1, tlid, t3id, t2id);
        System.out.println(n + "[" + tlid + "-> " + t2id + "]");
        toh(n - 1, t3id, t2id, tlid);

    }
}


//stairsRecursion , maze path  , keypadCombination , getSubsequenceRecursion