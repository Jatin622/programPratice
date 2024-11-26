package com.programmingPratice.singletonExample;

import org.apache.tomcat.jni.SSL;

public class SamosaCalling {
    public static void main(String[] args) {

        //we are two time of that object but they print one object and print same hashcode
        Samosa samosa = Samosa.getSamosa();

        System.out.println(samosa.hashCode());

        Samosa samosa1 = Samosa.getSamosa();

        System.out.println(samosa1.hashCode());
    }
}
