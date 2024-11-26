package com.programmingPratice.abstractExample;

abstract public class Vehicle {

    abstract void start(); //hiding the implementation detail
}

class car extends Vehicle {

    @Override
    void start() {
        System.out.println("car start key");
    }
}

class Scooter extends Vehicle {

    @Override
    void start() {
        System.out.println("car start kick");
    }

    public static void main(String[] args) {

        //  Vehicle vehicle=new Vehicle(); can not create object of abstract class

        car car = new car();
        car.start();

        Scooter scooter = new Scooter();
        scooter.start();
    }
}

