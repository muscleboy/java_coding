package com.jack.how2j.class_object;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.class_object
 * @Description:
 * @Date: 2019/4/13 11:29
 * @Author: Wyj
 */
public class h {

    String name;
    float hp;
    float armor;
    int moveSpeed;

    public h() {
    }

    public h(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }

    public void revive(h h1){
        h1 = new h("提莫", 400);
    }

    public static void main(String[] args) {
        h teemo = new h("提莫", 400);
        teemo.hp = teemo.hp - 403;
        System.out.println(teemo.hp);

        teemo.revive(teemo);

        System.out.println(teemo.hp);
    }
}
