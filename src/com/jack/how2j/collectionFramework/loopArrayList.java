package com.jack.how2j.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description:
 * @Date: 2019/4/17 20:09
 * @Author: Wyj
 */


public class Test {

    public static void main(String[] args) {

        List<hero> hs = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            hs.add(new hero("name" + i));
        }

        System.out.println("迭代器输出ArrayList的元素");
        Iterator it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }

        System.out.println("增强for循环输出ArrayList的元素");
        for (hero h : hs) {
            System.out.println(h.toString());
        }
    }
}
