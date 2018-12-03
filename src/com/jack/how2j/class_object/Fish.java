package com.jack.how2j.class_object;


public class Fish extends Animal implements pet {
    public void walk(){
        System.out.println("Fishes cann't walk and no legs");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void play(){
        System.out.println("i am fish, i can play!");
    }
    public void eat(){
        System.out.println("i eat gross");
    }
    private String name;

    public static void main(String[] args) {
        Fish f = new Fish();
        f.setName("liyu");
        System.out.println(f.getName());
        f.play();
    }
}
