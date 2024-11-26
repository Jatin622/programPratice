package com.programmingPratice.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class Employee {
    String name;
    int eno;

    public Employee(String name, int eno) {
        this.name = name;
        this.eno = eno;
    }

    public String toString() {
        return eno + ":" + name;
    }
}

class EmployeeTest {
    public static void main(String[] args) {

        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee("durga", 2));
        arrayList.add(new Employee("sunny", 1));
        arrayList.add(new Employee("china", 3));
        System.out.println(arrayList);
        Collections.sort(arrayList, (e1, e2) -> (e1.eno < e2.eno) ? -1 : (e1.eno > e2.eno) ? 1 : 0);//bae on id
        System.out.println(arrayList);

        Collections.sort(arrayList, (e1, e2) -> e1.name.compareTo(e2.name)); // base on name
        System.out.println(arrayList);


        Predicate<Employee> employeePredicate = e -> e.name.length() > 4 && e.eno == 2;
        for (Employee s : arrayList) {
            if (employeePredicate.test(s)) {
                System.out.println(s);
            }
        }
    }
}