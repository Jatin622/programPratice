package com.programmingPratice.stream.flatMap;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    String name;
    int id;
    char grade;

    public Student(String name, int id, char grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
}

public class ObjectClass {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("smith", 101, 'A'));
        studentList.add(new Student("John", 102, 'B'));
        studentList.add(new Student("Candy", 103, 'C'));

        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student("scott", 104, 'A'));
        studentList1.add(new Student("Marry", 105, 'B'));
        studentList1.add(new Student("Kitty", 106, 'C'));

        List<List<Student>> list = Arrays.asList(studentList, studentList1);


//        for (List<Student> students : list) { // using loop
//            for (Student s : students) {
//                System.out.println(s.name);
//            }
//
//        }

        List<String>result=list.stream().flatMap(stuList->stuList.stream()).map(x->x.name).collect(Collectors.toList());

        System.out.println(result);

    }

}
