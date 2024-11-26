package com.programmingPratice.stream.pratice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

// list of object
public class St {
    String name;
    String type;

    public St(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
class testing {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();

        arrayList.add(new Student("durga", "Student"));
        arrayList.add(new Student("chair", "Student"));
        arrayList.add(new Student("laptop", "professional"));
        arrayList.add(new Student("bag", "professional"));
        arrayList.add(new Student("table", "Student"));
        arrayList.add(new Student("charger", "professional"));
        arrayList.add(new Student("charger", "child"));


        arrayList.stream().map(x -> {
            HashMap<String, Object> hashMap = new HashMap<>();

            hashMap.put("name", x.name);
            hashMap.put("type", x.type);
            System.out.println(hashMap);
            return hashMap;

        }).collect(Collectors.toList());
    }
}