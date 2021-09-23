package com.msanzar87.practice;

public class Person {
    private String name;
    private int age;
    private boolean employed;
    private double gpa;

   public Person(){}
    //nullary constructor when you create object it gives you access to that class


    public Person(String name, int age, boolean employed, double gpa){
       this.name = name;
       this.age = age;
       this.employed = employed;
       this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEmployed() {
        return employed;
    }

    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
