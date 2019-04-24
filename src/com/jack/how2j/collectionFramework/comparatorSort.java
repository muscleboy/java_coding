package com.jack.how2j.collectionFramework;

import java.util.*;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: 比较器排序
 * @Date: 2019/4/24 19:25
 * @Author: Wyj
 */
public class comparatorSort {

    public static void main(String[] args) {

        Random r = new Random();
        List<Heros> heros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            heros.add(new Heros("hero-" + i, r.nextInt(100), r.nextInt(100)));
        }

        System.out.println("初始化完成！");

        Comparator<Heros> c = new Comparator<Heros>() {
            @Override
            public int compare(Heros o1, Heros o2) {
                if (o1.damage > o2.damage) {
                    // 正数表示 o1 > o2;
                    return 1;
                }else {
                    return -1;
                }
            }
        };

        Collections.sort(heros, c);
        System.out.println("按照伤害进行排序");
        System.out.println(heros);
    }

}
