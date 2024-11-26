package com.programmingPratice.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentNumber {
    String name;
    int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public StudentNumber(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
class Studnets{
    public static void main(String[]args){

        ArrayList<StudentNumber>arrayList=new ArrayList<>();

        arrayList.add(new StudentNumber("durga",1));
        arrayList.add(new StudentNumber("chair",2));
        arrayList.add(new StudentNumber("laptop",50));
        arrayList.add(new StudentNumber("bag",100));
        arrayList.add(new StudentNumber("phn",70));

       StudentNumber  a= arrayList.stream().max(Comparator.comparingInt(StudentNumber::getNumber)).get();

       System.out.println(a.getNumber());
    }

}