package com.jack.how2j.collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description:
 * @Date: 2019/4/20 20:03
 * @Author: Wyj
 */
public class hashMapPerformanceTest {
    
    /** 
    * @Description: 通过for查找元素 
    * @Param: [_for] 
    * @return: java.util.List<java.lang.String>
    */ 
    private static List<String> findItemInFor(List<String> _for){

        List<String> s = new ArrayList<>();

        long start = System.currentTimeMillis();
        for (String item : _for) {
            if (item.equals("hero-5555")) {
                s.add(item);
            }
        }
        long end = System.currentTimeMillis();
        System.out.printf("通过for查找，一共找到%d个对象, 耗时%d毫秒%n", s.size(), end - start);

        return s;

    }
    
    /** 
    * @Description: 通过hashmap查找元素 
    * @Param: [m] 
    * @return: java.util.List<java.lang.String>
    */ 
    private static List<String> findItemInHashMap(HashMap<String, List<String>> m){

        List<String> s1 = new ArrayList<>();
        long start = System.currentTimeMillis();
        s1 = m.get("hero-5555");
        long end = System.currentTimeMillis();

        System.out.printf("通过hashmap查找，一共找到%d个对象, 耗时%d毫秒%n", s1.size(), end - start);

        return s1;
    }

    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();
        System.out.println("初始化完成");
        for (int i = 0; i < 300 * 10000; i++) {
            // 转型很重要
            ls.add("hero-" + (int)(Math.random() * 9000 + 1000));
        }

        HashMap<String, List<String>> hs = new HashMap<>();
        for (String item : ls) {
           List<String> list = hs.get(item);
           // 不判 空，会引发空指针异常
            if (list == null) {
                list = new ArrayList<>();
                hs.put(item, list);
            }
            list.add(item);
        }

        System.out.println("初始化完成，开始查找");
        findItemInFor(ls);
        findItemInHashMap(hs);
    }
}
