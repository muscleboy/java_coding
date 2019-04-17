package com.jack.how2j.collectionFramework;

import jdk.jfr.Description;

import java.util.ArrayList;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description:
 * @Date: 2019/4/17 20:37
 * @Author: Wyj
 */


public class MyStringBufferByColletion2 {

    ArrayList value;

    public MyStringBufferByColletion2() {
        value = new ArrayList();
    }

    public MyStringBufferByColletion2(String str){
        this();

        char[] cs = str.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            char c = cs[i];
            value.add(c);
        }
    }

    public void delect(int pos){

        if (pos < 0) {
            return;
        }

        if (pos > value.size()) {
            return;
        }

        value.remove(pos);
    }

    /**
    * @Description: 插入操作
     * 先判断位置是否合法
    * @Param: [pos, c]
    * @return: void
    */
    public void insert(int pos, char c){

        if (pos < 0) {
            return;
        }

        if (pos > value.size()) {
            return;
        }

        value.add(pos, c);
    }

    public void append(char c){

        value.add(c);
    }

    public int length(){

        return value.size();
    }

    /**
    * @Description: 字符串输出
     * 取出ArrayList的值，放入char[]中，调用new String()构造函数, 转化成字符串
    * @Param: []
    * @return: java.lang.String
    */
    public String toString(){

        char[] cs = new char[value.size()];
        for (int i = 0; i < value.size(); i++) {
            cs[i] = (char) value.get(i);
        }
        return new String(cs);
    }


    public void reverse(){

        for (int i = 0; i < value.size(); i++) {
            char temp = (char) value.get(length() - i - 1);

            value.set(i, value.get(length() - i - 1));
            value.set(length() -i - 1, temp);
        }
    }

    public static void main(String[] args) {

        MyStringBufferByColletion2 sb = new MyStringBufferByColletion2("papapa");
        System.out.println(sb.toString());

        sb.append('g');
        System.out.println(sb.toString());

        sb.insert(sb.length(), '8');
        System.out.println(sb.toString());

        sb.delect(3);
        System.out.println(sb.toString());

        sb.reverse();
        System.out.println(sb.toString());
    }

}
