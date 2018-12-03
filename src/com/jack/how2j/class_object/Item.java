package com.jack.how2j.class_object;

public class Item {
    String name;
    int price;

    public static void main(String[] args) {
        Item xp = new Item();
        Item cx = new Item();
        Item cj = new Item();

        xp.name = "血瓶";
        xp.price = 50;
        System.out.println(xp.name+": " + xp.price);

        cx.name = "草鞋";
        cx.price = 300;
        System.out.println(cx.name+": " + cx.price);

        cj.name = "长剑";
        cj.price = 350;
        System.out.println(cj.name+": " + cj.price);
    }
}
