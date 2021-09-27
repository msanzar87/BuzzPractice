package com.msanzar87.practice.classroom;

public class Student {
    private String name;
    private char gender;
    private int age;
    //Create a Student entity with the fields name and gender

    public Student(){}

    public Student(String name, char gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
