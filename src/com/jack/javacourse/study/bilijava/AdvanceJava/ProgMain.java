package com.jack.javacourse.study.bilijava.AdvanceJava;


public class ProgMain {
    public static void main(String[] args) {
        Person3<String> p = new Person3<>();
        say(p);
    }
    public static void say(Person3<? extends String> person3){
        person3.hello();
    }
}

class Person3<T>{
    public void hello(){
        System.out.println("hello guys!");
    }
}
