package com.jack.how2j.complexTraining;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.complexTraining
 * @Description:
 * @Date: 2019/4/15 19:06
 * @Author: Wyj
 */
public class Spider extends Animal {
    @Override
    public void eat() {
        System.out.println("spider eating!");
    }

    public Spider() {
        super(8);
    }
}
