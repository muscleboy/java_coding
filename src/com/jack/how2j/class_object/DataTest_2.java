package com.jack.how2j.class_object;

abstract class Access{
    abstract void put(char c);
    abstract char get();
}

class LinkedList{
    char data;
    LinkedList back;
    LinkedList forward;
}

class MyStack extends Access{
    private LinkedList bottom = new LinkedList();
    private LinkedList top = bottom;

    public void put(char c){
        top.forward = new LinkedList();
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
            System.out.println("The Stack is empty!");
            return '\n';
        }
    }
}

public class DataTest_2 {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.put('a');
        s.put('b');
        s.put('c');
        System.out.println("In Stack: ");
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}
