package com.programmingPratice.singletonExample;

public class Samosa {

    private static Samosa samosa;

    //create private constructor
    private Samosa() {
    }


    public static Samosa getSamosa() {

        //object of the class ..we can make only one object not make everytime when they this method call.
        //so we make one  Static object outside and check if they null so create otherwise not create
        //this is not thread safe  if we two thread came same time they might chane they create two object that time samosa object is null
        // so we can use synchronized
        if (samosa == null) {
            synchronized (Samosa.class) {
                samosa = new Samosa();
            }
        }
        return samosa;
    }


}
