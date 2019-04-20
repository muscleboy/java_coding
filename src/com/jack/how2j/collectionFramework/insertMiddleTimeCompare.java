package com.jack.how2j.collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description:
 * @Date: 2019/4/20 18:12
 * @Author: Wyj
 */
public class insertMiddleTimeCompare {
    /**
    * @Description: ArrayList 数组定位快，插入慢
     *              LinkedList链表定位慢，插入快
     *              数量为1000的时候，差不多
    * @Param: [l, type]
    * @return: void
    */
    public static void insertMiddle(List<Integer> l, String type){

        int total = 10000;
        int number = 10;

        for (int i = 0; i < total; i++) {
            l.add(number);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            l.add(l.size() / 2, number++);
        }
        long end = System.currentTimeMillis();

        System.out.printf("%s的长度%d,在中间插入%d条数据，耗时%d", type, total, total, end - start);
        System.out.println();
    }

    public static void main(String[] args) {

        List<Integer> l;
        l = new ArrayList<>();
        insertMiddle(l, "ArrayList");

        l = new LinkedList<>();
        insertMiddle(l, "LinkedList");
    }
}
