package com.jack.how2j.class_object;

interface pet{
    String getName();
    void setName(String name);
    void play();
}

public class Cat implements pet {
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void play(){
        System.out.println("you can play with me~~~");
    }
    String name;
    void Cat(String name,int legs){
//        name = "Tom";
//        legs = 4;
        System.out.println("walk with " + legs + " legs");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.setName("Jackey");
        System.out.println(c.getName());
        c.play();
        System.out.println(c.name);
        c.Cat("Tom",5);
    }
}
