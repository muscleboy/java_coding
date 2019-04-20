package com.jack.how2j.collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description:
 * @Date: 2019/4/20 17:57
 * @Author: Wyj
 */
public class insertLastTimeCompare {
    /** 
    * @Description: 直接调用add()就是添加在最后的位置 
    * @Param: [l, type] 
    * @return: void
    */ 
    public static void insertLast(List<Integer> l, String type){

        int total = 100 * 1000;
        final int number = 10;

        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            l.add(number);
        }
        long end = System.currentTimeMillis();

        System.out.printf("%s的长度%d,在最后插入%d条数据，耗时%d", type, total, total, end - start);
        System.out.println();
    }

    public static void main(String[] args) {

        List<Integer> l;
        l = new ArrayList<>();
        insertLast(l, "ArrayList");

        l = new LinkedList<>();
        insertLast(l, "LinkedList");
    }
}
