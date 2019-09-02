package com.jack.how2j.class_object;

public class Item {
    String name;
    int price;

    public String toString(){
        System.out.println(name);
        return name;
    }

    public void finalize(){
        System.out.println("这个对象正在被回收");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Item){
            Item i = (Item) obj;
            if (i.price == this.price){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        Item i = new Item();
//        i.name = "jj";
//        i.price = 200;
//
//        Item i1 = new Item();
//        i1.name = "jack";
//        i1.price = 200;
//
//        i.toString();
//        i1.toString();
//
//        System.out.println(i.equals(i1));

        Item i = new Item(){
            public boolean dispoable(){
                System.out.println("使用消失");
                return false;
            }
        };
//        System.out.println(i.dispoable());
    }

}
