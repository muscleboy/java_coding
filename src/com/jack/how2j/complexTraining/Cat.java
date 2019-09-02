package com.jack.how2j.complexTraining;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.complexTraining
 * @Description:
 * @Date: 2019/4/15 19:08
 * @Author: Wyj
 */
public class Cat extends Animal implements Pet{

    String name;

    @Override
    public void eat() {
        System.out.println("cat eating");
    }

    public Cat(String name) {
        super(4);
    }

    public Cat() {
        this("");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("cat playing");
    }
}
