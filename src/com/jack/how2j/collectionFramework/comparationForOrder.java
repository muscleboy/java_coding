package com.jack.how2j.collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: ArrayList: 有顺序
 *               HashSet:   无顺序
 * @Date: 2019/4/22 17:20
 * @Author: Wyj
 */
public class comparationForOrder {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(5);
        list.add(1);
        System.out.println("-------list----------");
        System.out.println("向List中插入数据: 9 5 1");
        System.out.println("List存放数据的顺序: " + list);

        System.out.println();

        HashSet<Integer> hs = new HashSet<>();
        hs.add(9);
        hs.add(5);
        hs.add(1);
        System.out.println("-------hashset----------");
        System.out.println("向HashSet中插入数据: 9 5 1");
        System.out.println("HashSet存放数据的顺序: " + hs);

    }
}
