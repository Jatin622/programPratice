package com.programmingPratice.lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class StudentFunction {
    String name;
    int marks;

    StudentFunction(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class TestMarks {
    public static void main(String[] args) {
        StudentFunction[] s = {
                new StudentFunction("Durga", 100),
                new StudentFunction("Sunny", 60),
                new StudentFunction("Bunny", 55),
                new StudentFunction("chinny", 45)};

        Function<StudentFunction, String> function = f -> {
            int marks = f.marks;
            String grade = "";
            if (marks > 80) grade = "A";
            else if (marks > 50) grade = "B";
            else if (marks > 40) grade = "C";

            return grade;
        };
        Predicate<StudentFunction>predicate=p->p.marks>60;// only greater than 60

        for (StudentFunction f : s) {
            if(predicate.test(f)) {
                System.out.println(f.name);
                System.out.println(f.marks);
                System.out.println(function.apply(f));
            }
        }
    }
}
