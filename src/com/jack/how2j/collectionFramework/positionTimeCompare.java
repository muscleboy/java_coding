package com.jack.how2j.collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description:
 * @Date: 2019/4/19 19:54
 * @Author: Wyj
 */
public class positionTimeCompare {

    /**
    * @Description: 比较ArrayList和LinkedList定位相同数量元素需要的时间
    * @Param: [l, type]
    * @return: void
    */
    public static void modify(List<Integer>l, String type){

        int total = 100 * 1000;
        int index = total / 2;
        final int number = 10;

        for (int i = 0; i < total; i++) {
            l.add(number);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            int n = l.get(index);
            n ++;
            l.set(index, n);

        }
    }

    public static void main(String[] args) {

        List<Integer>l;

        l = new ArrayList<>();
        modify(l, "ArrayList");

        l = new LinkedList<>();
        modify(l, "LinkedList");
    }

}
