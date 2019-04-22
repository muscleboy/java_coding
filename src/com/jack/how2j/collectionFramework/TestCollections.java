package com.jack.how2j.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: Collestions的基本方法
 * @Date: 2019/4/22 16:36
 * @Author: Wyj
 */
public class TestCollections {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1042);
        list.add(1143);
        list.add(1354);
        list.add(1676);
        list.add(18);
        list.add(111);

        // 反转
//        Collections.reverse(list);

        // 混淆
//        Collections.shuffle(list);

        //排序
//        Collections.sort(list);

        // 交换两个位置的值
//        Collections.swap(list, 0, 1);

        // 把list的数据，向右滚动
//        Collections.rotate(list, 3);

        System.out.println(list);
        // 线程安全list
        List<Integer> synchonizedlist = (List<Integer>) Collections.synchronizedList(list);
    }
}
