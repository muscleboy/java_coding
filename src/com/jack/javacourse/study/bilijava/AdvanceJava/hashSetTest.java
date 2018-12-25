package com.jack.javacourse.study.bilijava.AdvanceJava;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetTest {
    public static void main(String[] args) {
//        HashSet<Person> hs = new HashSet<>();
//        hs.add("dasdas");
//        hs.add("dadada");
//        hs.add("dadada");
//        hs.add("xxxxxx");
//        System.out.println("增强for循环遍历");
//        for(String i:hs){
//            System.out.println(i+" ");
//        }
//        System.out.println("迭代器遍历");
//        Iterator<String> i =  hs.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
        Person p = new Person();
        p.Age = 21;
        p.Name = "wyj";
        p.Height = 170.9;

        Person p1 = new Person();
        p1.Age = 21;
        p1.Name = "wyj";
        p1.Height = 170.0;
        HashSet<Person> hs = new HashSet<>();
        hs.add(p);
        hs.add(p1);
        for(Person item:hs){
            System.out.println(item.Name);
        }
    }
}


class Person{
    public String Name;
    public int Age;
    public double Height;
    public String jj;

    public int hashCode(){
        return Name.hashCode();
    }

    public boolean equals(Object obj){
        Person p = (Person)obj;
        if(p.Name == this.Name){
            return true;
        }
        else {
            return false;
        }
    }

}
