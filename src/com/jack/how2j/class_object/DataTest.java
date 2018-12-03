package com.jack.how2j.class_object;

abstract class Accesss{
    abstract void put(char c);
    abstract char get();
}

class LinkedLists{
    char data;
    LinkedLists back;
    LinkedLists forward;
}

class MyStacks extends Accesss{
    private LinkedLists bottom = new LinkedLists();
    private LinkedLists top = bottom;

    public void put(char c){
        top.forward = new LinkedLists();
        top.forward.data = c;
        top.forward.back = top;
        top = top.forward;
    }

    public char get(){
        if(top!=bottom){
            char ch = top.data;
            top.back.forward = null;
            top = top.back;
            return ch;
        }
        else{
            System.out.println("The Stack is empty");
            return '\n';
        }
    }
}

public class DataTest {
    public static void main(String[] args) {
        MyStacks s = new MyStacks();
        s.put('x');
        s.put('y');
        s.put('z');
//        s.put('d');
        System.out.println("In Stack");
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}
