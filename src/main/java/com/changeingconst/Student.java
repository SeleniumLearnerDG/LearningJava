package com.changeingconst;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Student {
    public Student(Integer studentNo, String studentName) {
        StudentNo = studentNo;
        StudentName = studentName;
    }

    Integer StudentNo;
    String StudentName;

    public static void main(String[] args) {
        Student  s1= new Student(5,"Ram");
        Student  s2= new Student(1,"Adhaya");
        List<Student > stringList= new LinkedList<Student>(Arrays.asList(s1,s2));
        Collections.sort(stringList, (Student p1, Student p2) -> p1.StudentNo.compareTo(p2.StudentNo));
        System.out.println(stringList.toString());
    }
}
