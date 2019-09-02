package com.jack.how2j.collectionFramework;

import java.util.ArrayList;
import java.util.List;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description:
 * @Date: 2019/4/17 21:40
 * @Author: Wyj
 */

interface LOL{

    public String toString();
}

class hero implements LOL{
    String name;
    int hp;

    public hero(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }
}

class Item implements LOL{

    String name;
    int price;

    public Item(String name) {
        this.name = name;
    }
}

public class arrayListForHeroAndItem {

    public static void main(String[] args) {

        List<LOL> lols = new ArrayList<>();
        lols.add(new hero("盖伦"));
        lols.add(new Item("生命药水"));

        System.out.println(lols.toString());
    }
}
