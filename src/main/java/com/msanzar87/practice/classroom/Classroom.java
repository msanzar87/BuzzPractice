package com.msanzar87.practice.classroom;


import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private List<Student> students;

    public Classroom(){}

    public Classroom(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
//Create a classroom entity that contains a "LIST" of all the students in a class
}
