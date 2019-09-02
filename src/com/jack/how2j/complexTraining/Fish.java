package com.jack.how2j.complexTraining;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.complexTraining
 * @Description:
 * @Date: 2019/4/15 19:12
 * @Author: Wyj
 */
public class Fish extends Animal implements Pet {

    private String name;

    public Fish(int legs) {
        super(legs);
    }

    @Override
    public void eat() {
        System.out.println("鱼吃");
    }

    @Override
    public void walk() {
        System.out.println("swimming");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("fish playing");
    }

    public static void main(String[] args) {
        Fish f = new Fish(0);
        f.setName("鱼儿");
        System.out.println(f.getName());
        System.out.println(f.legs);
        f.eat();
        f.walk();
        f.play();
    }

}
