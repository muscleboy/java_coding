package com.jack.how2j.class_object;

public class Person {
     String name;
     int age;
    public void Say(){
        System.out.println(name + "can say");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

class Student extends Person{
    String schoolname;
    public void GotoSchool(){
        System.out.println("I am going to school!");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "jack";
        s1.age = 20;
        s1.schoolname = "glut";
        s1.Say();
//        s1.getName();
        s1.GotoSchool();
        System.out.println("My name is " + s1.name);
        System.out.println("My schoolname is " + s1.schoolname);
    }
}