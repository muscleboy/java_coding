package com.jack.how2j.collectionFramework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: hashmap  键值反转
 * @Date: 2019/4/22 18:10
 * @Author: Wyj
 */
public class reverseHashMap {

    public static void main(String[] args) {

        HashMap<String, String> hp = new HashMap<>();
        // 临时的hashset
        HashMap<String, String> temp = new HashMap<>();

        hp.put("adc", "物理英雄");
        hp.put("apc", "魔法英雄");
        hp.put("t", "坦克");
        System.out.println(hp);

        Set<String> keys = hp.keySet();

        for (String key : keys) {
            String value = hp.get(key);
            // 先将反转的放入temp, 然后putAll到原来的hashset
            temp.put(value, key);
        }
        // 清空原来的hashset
        hp.clear();
        hp.putAll(temp);

        System.out.println(hp);
    }
}
