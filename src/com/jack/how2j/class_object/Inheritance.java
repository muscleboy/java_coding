package com.jack.how2j.class_object;



class Employee{
    private String name;
    private int salary;
    public String getDetails(){
        return "name: " + name + "\nsalary: " + salary;
    }
    Employee(){
        name = "jack";
        salary = 10000;
    }
}

class Manager extends Employee{
    public String department;
    public String getDetails(){
        System.out.println("I am in Manager");
        return super.getDetails();
    }
    Manager(){
        super();
        department = "sale";
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Manager m = new Manager();
        System.out.println(m.getDetails());
        System.out.println("department: " + m.department);
    }
}
