package com.jack.how2j.collectionFramework;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description:
 * @Date: 2019/4/23 17:30
 * @Author: Wyj
 */
public class Entry {

    public Object key;
    public Object value;

    public Entry(Object key, Object value) {
        super();
        this.key = key;
        this.value = value;
    }

    public String toString(){
        return "[key = " + key + ", value = " + value + "]";
    }
}
