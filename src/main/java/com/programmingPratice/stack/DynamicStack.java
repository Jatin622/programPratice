package com.programmingPratice.stack;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        // this take care of it being full
        if (this.isfull()) {
            //double the size of array
            int[] temp = new int[data.length * 2];

            //copy all previous in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];

            }
            data = temp;
        }
        // at this point we know array size is not full so we can insert them
        return super.push(item);
    }

}
