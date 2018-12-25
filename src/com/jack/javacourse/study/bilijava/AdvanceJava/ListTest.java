package com.jack.javacourse.study.bilijava.AdvanceJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        for(int i=0; i<100; i++){
            al.add("第"+i+"行");
        }
        Iterator<String> it = al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
