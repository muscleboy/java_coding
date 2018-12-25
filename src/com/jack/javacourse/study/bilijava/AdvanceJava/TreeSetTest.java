package com.jack.javacourse.study.bilijava.AdvanceJava;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Persons p1 = new Persons();
        p1.Name = "jj20asdgadsg";
        p1.Age = 21;
        p1.Height = 1801;

        Persons p2 = new Persons();
        p2.Name = "jj21fsdfas";
        p2.Age = 20;
        p2.Height = 180;

        Persons p3 = new Persons();
        p3.Name = "jj22eqwev";
        p3.Age = 22;
        p3.Height = 1804;

        TreeSet<Persons> ts = new TreeSet<>();
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        for(Persons item:ts){
            System.out.println(item.Name);
        }
    }
}
class Persons implements Comparable<Persons>{
    public String Name;
    public int Age;
    public int Height;

    // 返回值为 int
    public int compareTo(Persons o){
        return this.Height - o.Height;
    }

}