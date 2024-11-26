package com.programmingPratice.stringInMutable;


//make class inmutable
//Declare the class as final:
//Make all fields private and final:
//Do not provide setter methods:
//Initialize fields only through a constructor:

public final class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public static void main(String[] args) {

        ImmutablePerson person = new ImmutablePerson("John", 30);

        System.out.println(person.getName());
        System.out.println(person.getName());

    }

}
