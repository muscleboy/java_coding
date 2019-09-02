package com.jack.how2j.collectionFramework;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: HashMap和Hashtable的比较:
     * HashMap,Hashtable都实现了map接口，都是以键值对的形式存放数据
     * HashMap: 可以存放null, 不是线程安全的类
     * Hashtable: 不可以存放null，是线程安全的类
 * @Date: 2019/4/22 17:43
 * @Author: Wyj
 */
public class HashMapAndHashtable {

    public static void main(String[] args) {

        HashMap<String, String> hp = new HashMap<>();
        hp.put(null, "1234");
        hp.put("hp", null);

        Hashtable<String, String> table = new Hashtable<>();
        //  key, value都不能存放null
        table.put(null, "heroname");
        table.put("ht", null);

    }
}
