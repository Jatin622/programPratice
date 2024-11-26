package com.programmingPratice.hashmapPepcoading;

import java.util.ArrayList;
import java.util.LinkedList;

// internal implementation for hashap how they work
public class HashmapInternal {
    public static class HsshMap<K, V> {
        private class HMNode {
            K key;
            V value;

            public HMNode(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; //n
        private LinkedList<HMNode>[] buckets; //N = bucket length

        public void HashMap() {
            initbuckets(4);
            size = 0;
        }

        private void initbuckets(int N) {
            //we make 4 size of array and make empty linkedlist
            buckets = new LinkedList[N];
            for (int b1 = 0; b1 < buckets.length; b1++) {
                buckets[b1] = new LinkedList<>();
            }
        }

        private void put(K key, V value) {

            int bucketIndex = hashfn(key); // they gave us bucket index
            int dataIndex = getIndexWithInBucket(key, bucketIndex);//they gave us where the value index in bucket

            if (dataIndex != -1) {
                //update
                HMNode node = buckets[bucketIndex].get(dataIndex);
                node.value = value;
            } else {
                //insert //create node and insert
                HMNode hmNode = new HMNode(key, value);
                buckets[bucketIndex].add(hmNode);
                size++;
            }
            double lambda = size * 1.0 / buckets.length;
            if (lambda > 2.0) {
                rehash();
            }
        }

        private void rehash() {

            LinkedList<HMNode>[] oldBucketArray = buckets;

            initbuckets(oldBucketArray.length * 2);

            size = 0;
            for (int i = 0; i < oldBucketArray.length; i++) {

                for (HMNode node : oldBucketArray[i]) {
                    put(node.key, node.value);
                }
            }
        }

        private int hashfn(K key) {

            int hashCode = key.hashCode();
            return Math.abs(hashCode) % buckets.length;// hashcode generate random we want only code for bucket size
        }

        private int getIndexWithInBucket(K key, int bi) {
            int di = 0;
            for (HMNode node : buckets[bi]) {

                if (node.key.equals(key)) {
                    return di;
                }
                di++;
            }
            return -1;// if key is not in hashmap return -1
        }

        private boolean containKey(K key) {

            int bucketIndex = hashfn(key);
            int dataIndex = getIndexWithInBucket(key, bucketIndex);

            if (dataIndex != -1) {
                return true;
            } else {
                return false;
            }
        }

        private V get(K key) {

            int bucketIndex = hashfn(key);
            int dataIndex = getIndexWithInBucket(key, bucketIndex);
            if (dataIndex != -1) {
                HMNode node = buckets[bucketIndex].get(dataIndex);
                return node.value;
            } else {
                return null;
            }
        }

        private V remove(K key) {
            int bucketIndex = hashfn(key);
            int dataIndex = getIndexWithInBucket(key, bucketIndex);
            if (dataIndex != -1) {
                HMNode node = buckets[bucketIndex].remove(dataIndex);
                size--;
                return node.value;
            } else {
                return null;
            }
        }

        private int size() {
            return size;
        }

        private ArrayList<K> keySet() {

            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) { // this loop for bucket index
                for (HMNode node : buckets[i]) {//this lopp for bucket data index
                    keys.add(node.key);
                }
            }
            return keys;
        }
    }
}
