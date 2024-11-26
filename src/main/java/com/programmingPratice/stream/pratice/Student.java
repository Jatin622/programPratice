package com.programmingPratice.stream.pratice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class Student {
    String name;
    String type;

    public Student(String name, String type) {
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
class test{
    public static void main(String[]args){
        ArrayList<Student>arrayList=new ArrayList<>();

        arrayList.add(new Student("durga","Student"));
        arrayList.add(new Student("chair","Student"));
        arrayList.add(new Student("laptop","professional"));
        arrayList.add(new Student("bag","professional"));
        arrayList.add(new Student("table","Student"));
        arrayList.add(new Student("charger","professional"));
        arrayList.add(new Student("charger","child"));
        HashMap<String,Object> hashMap=new HashMap<>();
        List<Map<String, Object>> finalResponses = new ArrayList<>();


        for(Student s:arrayList){
            ArrayList<Student> arrayList1= (ArrayList<Student>) getCollect(arrayList);
            hashMap.put("type",s.name);
            hashMap.put("data",getCollect((ArrayList<Student>) getCollect(arrayList1)));
            hashMap.put("count",arrayList1.size());
            finalResponses.add(hashMap);
        }



        System.out.println();

    }

    private static Map<String, List<Student>> getCollect(ArrayList<Student> arrayList) {
        return arrayList.stream().collect(groupingBy(Student::getType));
    }
}

//    public Object getData() {
//        ArrayList<Student> arrayList = new ArrayList<>();
//
//        arrayList.add(new Student("durga", "Student"));
//        arrayList.add(new Student("chair", "Student"));
//        arrayList.add(new Student("laptop", "professional"));
//        arrayList.add(new Student("bag", "professional"));
//        arrayList.add(new Student("table", "Student"));
//        arrayList.add(new Student("charger", "professional"));
//        arrayList.add(new Student("charger", "child"));
//        Map<String, List<Student>> groupedStudents = getCollect(arrayList);
//
//        List<Map<String, Object>> finalResponses = new ArrayList<>();
//        for (Map.Entry<String, List<Student>> entry : groupedStudents.entrySet()) {
//            String type = entry.getKey();
//            List<Student> studentsOfType = entry.getValue();
//            HashMap<String, Object> hashMap = new HashMap<>();
//            hashMap.put("type", type);
//            hashMap.put("data", studentsOfType);
//            hashMap.put("count", studentsOfType.size());
//            finalResponses.add(hashMap);
//        }
//
//        return finalResponses;
//    }
//
//    private static Map<String, List<Student>> getCollect(ArrayList<Student> arrayList) {
//        return arrayList.stream().collect(groupingBy(Student::getType));
//    }

//using stream
//    List<Map<String, Object>> finalResponses = groupedStudents.entrySet()
//            .stream()
//            .map(entry -> {
//                String type = entry.getKey();
//                List<Student> studentsOfType = entry.getValue();
//
//                HashMap<String, Object> hashMap = new HashMap<>();
//                hashMap.put("type", type);
//                hashMap.put("data", studentsOfType);
//                hashMap.put("count", studentsOfType.size());
//
//                return hashMap;
//            })
//            .collect(Collectors.toList());
//
//        return finalResponses;