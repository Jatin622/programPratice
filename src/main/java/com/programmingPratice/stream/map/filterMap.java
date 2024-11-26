package com.programmingPratice.stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

    int id;
    String employeeName;
    int Salary;

    public Employee(int id, String employeeName, int salary) {
        this.id = id;
        this.employeeName = employeeName;
        Salary = salary;
    }
}

public class filterMap {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(new Employee(101, "Alex", 1000),
                new Employee(102, "Brian", 2000),
                new Employee(103, "Chales", 3000),
                new Employee(104, "Dravid", 4000));
        List<String> emplyee = employeeList.stream().filter(e -> e.Salary > 1000).map(e -> e.employeeName).collect(Collectors.toList());

        System.out.println(emplyee);

    }
}
