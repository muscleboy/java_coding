package com.jack.how2j.collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description:
 * @Date: 2019/4/19 08:10
 * @Author: Wyj
 */
public class insertFirstTimeCompare {
    
    /** 
    * @Description: 在最前面插入1000 * 100条数据
    * @Param: [l, type] l: List,type: ArrayList or LinkedList
    * @return: void
    */ 
    private static void insertFirst(List<Integer>l, String type){

        int total = 1000 * 1000;
        final int number = 5;
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            // 0：每次都添加到最前面的位置
            l.add(0, number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("在%s最前面插入%d条数据，耗时：%d", type, total, end - start);
        System.out.println();
    }

    public static void main(String[] args) {

        List<Integer> l;
        l = new ArrayList<>();
        insertFirst(l, "ArrayList");

        l = new LinkedList<>();
        insertFirst(l, "LinkedList");
    }
}
