package com.programmingPratice.stream.parallelStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}
public class parallelStreamDemo {
    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(

                new Student("David", 82),
                new Student("Bob", 90),
                new Student("john", 65),
                new Student("candy", 55),
                new Student("eric", 85),
                new Student("smooth", 60),
                new Student("scott", 70)
        );
        studentList.stream().filter(x->x.getScore()>80).forEach(x->System.out.println(x.getName()));

        studentList.parallelStream().filter(x->x.getScore()>80).forEach(x->System.out.println(x.getScore()));

        //convert stream to parallel
        studentList.stream().parallel().filter(x->x.getScore()>80).forEach(x->System.out.println(x.getScore()));

    }
}