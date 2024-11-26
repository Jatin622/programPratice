package com.programmingPratice.hashmapPepcoading;

import java.util.ArrayList;

//downheapify remove
public class PriorityQueseCrud {

    ArrayList<Integer> data;

    public PriorityQueseCrud(ArrayList<Integer> data) {
        this.data = data;
    }

    public void add(int val) {
        data.add(val);
        upheapify(val);
    }

    public void upheapify(int i) {

        int pi = (i - 1) / 2;//find parent index

        if (data.get(i) < data.get(pi)) {
            swap(i, pi);
            upheapify(pi);
        }
    }

    public int remove() {

        if (this.size() == 0) {
            return -1;
        }
        swap(0, data.size() - 1);
        int val = data.remove(data.size() - 1);
        downHeapify(0);
        return val;
    }

    public void downHeapify(int pi) {
        int mini = pi;

        int leftIndex = 2 * pi + 1;

        if (leftIndex < data.size() && data.get(leftIndex) < data.get(mini)) {
            mini = leftIndex;
        }
        int rightIndex = 2 * pi + 2;
        if (rightIndex < data.size() && data.get(rightIndex) < data.get(mini)) {

            mini = rightIndex;
        }
        if (mini != pi) {
            swap(pi, mini);
            downHeapify(mini);
        }
    }

    public void swap(int i, int j) {
        int ith = data.get(i);
        int jth = data.get(j);

        data.set(i, jth);
        data.set(j, ith);

    }

    public int peek() {
        if (this.size() == 0) {
            return -1;
        }
        return data.get(0);
    }

    public int size() {
        return data.size();
    }

}
