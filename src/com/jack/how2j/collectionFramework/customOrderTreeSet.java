package com.jack.how2j.collectionFramework;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: 自定义顺序的TreeSet
 * @Date: 2019/4/24 19:54
 * @Author: Wyj
 */
public class customOrderTreeSet {

    public static Comparator<Heros> c = new Comparator<Heros>() {
        @Override
        public int compare(Heros o1, Heros o2) {
            // o1 - o2 是  小到大
            return o1.damage - o2.damage;
        }
    };

    public static void main(String[] args) {

        Random r = new Random();

        // 在TreeSet的构造方法传入 Comparator
        // 定义成static是为了方便调用
        TreeSet<Heros> treeSet = new TreeSet<>(c);
        for (int i = 0; i < 10; i++) {
            treeSet.add(new Heros("hero-" + i, r.nextInt(100), r.nextInt(100)));
        }

        System.out.println(treeSet);
    }
}
