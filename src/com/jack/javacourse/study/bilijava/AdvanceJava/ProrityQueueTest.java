package com.jack.javacourse.study.bilijava.AdvanceJava;

import java.util.Comparator;
import java.util.PriorityQueue;

//优先队列用于消息通知，什么消息先通知
public class ProrityQueueTest {
    public static void main(String[] args) {
        //在创建PriorityQueue,不传入比较器（外比较器person2Comparator），可以通过实现Comparable接口来实现同样的效果
        PriorityQueue<Person2> pq = new PriorityQueue<>();
        pq.offer(new Person2("jj1", 21));
        pq.offer(new Person2("jj2", 22));
        pq.offer(new Person2("jj3", 23));
        while (true){
            Person2 p2 = pq.poll();
            if(p2 == null){
                break;
            }
            System.out.println(p2.name);
        }
    }
//外比较器
//    public static Comparator<Person2> person2Comparator = new Comparator<Person2>() {
//        @Override
//        public int compare(Person2 o1, Person2 o2) {
//            return o1.age - o2.age;
//        }
//    };

}

class Person2 implements Comparable<Person2>{

    public String name;
    public int age;
    public Person2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person2 o){
        return this.age - o.age;
    }
}