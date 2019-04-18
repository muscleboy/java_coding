package com.jack.how2j.collectionFramework;

import java.util.LinkedList;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: 使用LinkedList自己实现一个stack
 * @Date: 2019/4/18 21:00
 * @Author: Wyj
 */
public class myStack implements Stack {

    public LinkedList<hero> selfStack = new LinkedList<>();

    public void push(hero h){
        this.selfStack.addLast(h);
    }

    public hero pull(){
        return selfStack.removeLast();
    }

    public hero peek(){
        return selfStack.getLast();
    }

    public static void main(String[] args) {

        myStack stack = new myStack();

        for (int i = 0; i < 5; i++) {
            hero h = new hero("hero-" + i);
            System.out.println("压入hero: " + h);
            stack.push(h);
        }
        for (int i = 0; i < 5; i++) {
            hero h = stack.pull();
            System.out.println("弹出hero: " + h);
        }
    }

}
