package com.jack.how2j.collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.jack.how2j.collectionFramework.customHashcode.hashcode;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: 自己实现一个简单的HashMap
 * @Date: 2019/4/23 17:19
 * @Author: Wyj
 */
public class customHashMap implements IHashMap{

    // 常见一个长度为2000 的链表
    LinkedList<Entry>[] values = new LinkedList[2000];

    @Override
    public void put(String key, Object value) {

        // 得到hashcode
        int hashcode = hashcode(key);

        // 找到对应的LinkedList
        LinkedList<Entry> list = values[hashcode];

        // 如果LinkedList是空的，则创建一个
        if (list == null) {
            list = new LinkedList<>();
            values[hashcode] = list;
        }

        // 判断是该key否找到对应的value
        boolean found = false;
        for (Entry entry : list) {
            // 如果找到，则替换
            if (entry.key.equals(key)) {
                entry.value = value;
                found = true;
                break;
            }
        }

        // 没找到，则创建新的键值对
        if (!found) {
            Entry entry =  new Entry(key, value);
            // 把新创建的键值对添加到list里
            list.add(entry);
        }
    }

    @Override
    public Object get(String key) {

        // 首先得到hashcode
        int hashcode = hashcode(key);

        // 找到对应的LinkedList
        LinkedList<Entry> list = values[hashcode];

        // 如果LinkedList是null, 则返回空
        if (list == null) {

            return null;
        }

        Object result = null;

        for (Entry entry : list) {
            // 如果找到key对应的value，则返回该value
            if (entry.key.equals(key)) {
                result = entry.value;
                break;
            }
        }

        return result;
    }

    public String toString(){

        LinkedList<Entry> result = new LinkedList<>();

        for (LinkedList<Entry> linkedList : values) {
            if (linkedList == null) {
                continue;
            }
            result.addAll(linkedList);
        }

        return result.toString();
    }



    public static void main(String[] args) {

        customHashMap map = new customHashMap();
        map.put("t", "坦克");
        map.put("ADC", "物理英雄");
        map.put("apc", "魔法英雄");
        map.put("t", "坦克2");

        System.out.println(map);
    }
}
