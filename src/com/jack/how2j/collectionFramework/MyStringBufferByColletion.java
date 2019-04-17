package com.jack.how2j.collectionFramework;

import jdk.jfr.Unsigned;

import java.util.ArrayList;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: 用collection实现一个StringBuffer
 * @Date: 2019/4/17 17:27
 * @Author: Wyj
 */
public class MyStringBufferByColletion {

    ArrayList StringBuffer;

    public MyStringBufferByColletion() {
        StringBuffer = new ArrayList();
    }

    public MyStringBufferByColletion(String str){
        this();
        if (str == null){
            return;
        }
        char[] cs = str.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            char c = cs[i];
            StringBuffer.add(c);
        }
    }

    public void append(String str){

        insert(StringBuffer.size(), str);
    }

    public void append(char c){

        StringBuffer.add(c);
    }

    public void insert(int pos, String str){
        if (pos < 0) {
            return;
        }

        if (pos > StringBuffer.size()) {
            return;
        }

        if (str == null) {
            return;
        }

        char[] cs = str.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            char c =  cs[i];
            StringBuffer.add(pos + i, c);
        }
    }

    public void delect(int pos){

        if (pos < 0) {
            return;
        }

        if (pos > StringBuffer.size()) {
            return;
        }

        StringBuffer.remove(pos);

    }

    public int length(){

        return StringBuffer.size();
    }

    public void  reverse(){

        for (int i = 0; i < StringBuffer.size() / 2; i++) {
            int length = StringBuffer.size();
            char temp = (char) StringBuffer.get(i);

            StringBuffer.set(i, StringBuffer.get(length -i -1));
            StringBuffer.set(length -i - 1, temp);
        }

    }

    public String toString(){

        char[] charValue = new char[StringBuffer.size()];
        for (int i = 0; i < StringBuffer.size(); i++) {
            charValue[i] = (char) StringBuffer.get(i);
        }

        return new String(charValue);
    }

    public static void main(String[] args) {

        MyStringBufferByColletion sb = new MyStringBufferByColletion("ABCDEFG");
        sb.insert(sb.length(), "GG");
        System.out.println(sb.toString());
        sb.delect(1);
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
        sb.append('j');
        System.out.println(sb.toString());
        sb.append("papa");
        System.out.println(sb.toString());
        System.out.println(sb.length());

    }

}
