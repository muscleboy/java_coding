package com.jack.how2j.collectionFramework;

import java.util.ArrayList;
import java.util.List;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: 不能够在使用Iterator和增强for循环遍历数据的同时，删除数据
 * 需要准备一个临时数组temp，将要删除的元素添加到temp, removeAll(temp)
 * @Date: 2019/4/18 19:46
 * @Author: Wyj
 */

public class deleteArrayListData {

    public static void main(String[] args) {

        List<hero> hs = new ArrayList<>();
        List<hero> temp = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            hs.add(new hero("hero-" + i));
        }

        for (hero h : hs) {
            int index = Integer.parseInt(h.name.substring(5));
            if (index % 8 == 0) {
                temp.add(h);
            }
        }

        for (hero h : temp) {
            System.out.println(h);
        }
        hs.removeAll(temp);
        System.out.println("------------------");
        for (hero h : hs) {
            System.out.println(h);
        }
    }

}
