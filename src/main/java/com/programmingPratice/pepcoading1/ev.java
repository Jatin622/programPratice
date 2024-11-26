package com.programmingPratice.pepcoading1;

public class ev {
    public static void main(String[] args) {
        // Print message to console
        System.out.println("Getting class path and Operating System using environment variable");

        // Retrieve the value of the CLASS_PATH environment variable
        String classPath = System.getenv("EVHUBPASSWORD");

        // Retrieve the value of the OS environment variable
        String operatingSystem = System.getenv("GJS_DEBUG_OUTPUT");

        // Print the value of the CLASS_PATH environment variable to console
        System.out.println("Class Path - " + classPath);

        // Print the value of the OS environment variable to console
        System.out.println("Operating System - " + operatingSystem);
    }
}
