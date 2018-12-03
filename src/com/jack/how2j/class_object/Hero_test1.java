package com.jack.how2j.class_object;

public class Hero_test1 {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public Hero_test1(String name){
        System.out.println("一个参数的构造函数");
        this.name = name;
    }

    public Hero_test1(String name, int moveSpeed){
        //在一个方法里调用另一个方法
        this(name);
        System.out.println("2参数的构造函数");
        this.hp = hp;
    }

    public static void main(String[] args) {
        Hero_test1 ht1 = new Hero_test1("AA",222);
        System.out.println(ht1.name);
    }

    /**
     * @author Weiyj
     * @version jdk11
     * */

    public static class ADHero extends Hero {

    //    public void attack(){
    //        System.out.println(name+"进行了一次攻击");
    //    }
    //    public void attack(Hero h1){
    //        System.out.println(name+"对"+h1.name+"进行了一次攻击");
    //    }
    //    public void attack(Hero h1, Hero h2){
    //        System.out.println(name+"同时对"+h1.name+"和"+h2.name+"进行了一次攻击");
    //    }

        public void attack(){
            System.out.println(name+"进行了一次攻击");
        }

        public void attack(Hero... heroes){
            for(int i=0;i<heroes.length;i++){
                System.out.println(name+"攻击了"+heroes[i].name);
            }
        }

        public static void main(String[] args) {
            ADHero bh = new ADHero();
            bh.name = "黄金猎人";

            Hero h1 = new Hero();
            h1.name = "盖伦";

            Hero h2 = new Hero();
            h2.name = "提莫";

            bh.attack(h1);
            bh.attack(h1,h2);
        }
    }
}
