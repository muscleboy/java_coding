package com.jack.how2j.collectionFramework;

import java.util.ArrayList;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j
 * @Description:
 * @Date: 2019/4/17 16:37
 * @Author: Wyj
 */

class Hero{

    public String name;

    public Hero(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public boolean contains(String name){

        if (this.name == name){
            return true;
        }else {
            return false;
        }

    }

}

public class TestCollection {

    public static void main(String[] args) {

        ArrayList heros = new ArrayList();

        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("jj"+i));
        }

        System.out.println(heros.toString());

        Hero specialHero = new Hero("sp Hero");
        // 指定位置添加，只能是容器大小之前
//        heros.add(heros.size() - 2, specialHero);
//        System.out.println(heros);
//        heros.set(3, "replace Hero");
//        System.out.println(heros);

        String item = "jj2";
        for (int i = 0; i < heros.size(); i++) {
            Hero h = (Hero) heros.get(i);
            if (item.equals(h.name)){
                System.out.printf("找到一个%s对象, 位置是%s", h, heros.indexOf(h));
            }
        }

    }

}
