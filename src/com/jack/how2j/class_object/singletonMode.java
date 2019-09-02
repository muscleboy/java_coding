package com.jack.how2j.class_object;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.class_object
 * @Description:
 * @Date: 2019/4/13 17:36
 * @Author: Wyj
 */
/*
    饿汉单例模式
    1、私有化构造方法
    2、静态属性指向实例instance
    3、public static的getInstance()方法，返回instance
    立即加载，不管是否用到

public class Hero{

    private Hero() {
    }

    public static Hero instance = new Hero();

    public static Hero getInstance(){
        return instance;
    }

}
 */

/*
    懒汉单例模式
    1、构造方法私有化
    2、静态属性指向实例
    3、public static的getInstance()方法, 如果为空，new一个对象, 返回instance;
    延迟加载，只有使用到的时候才加载
 */

public class singletonMode{

    private singletonMode() {
    }

    public static singletonMode instance = new singletonMode();

    public static singletonMode getInstance(){

        if (instance == null){
            instance = new singletonMode();
        }
        return instance;
    }

}
