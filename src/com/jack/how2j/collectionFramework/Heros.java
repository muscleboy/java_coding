package com.jack.how2j.collectionFramework;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: 在实体类里实现Comparable<T>接口，Collections可以直接进行排序
 * @Date: 2019/4/23 21:07
 * @Author: Wyj
 */
public class Heros implements Comparable<Heros> {

    public String name;
    public float hp;
    public int damage;

    public Heros() {
    }

    public Heros(String name) {
        this.name = name;
    }

    public Heros(String name, float hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public String toString(){

        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }

    // 重写 compareTo()
    @Override
    public int compareTo(Heros another){

        if (damage < another.damage){
            // 返回正数，表示比当前更大
            return 1;
        }else {
            return -1;
        }
    }

}
