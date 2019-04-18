package com.jack.how2j.collectionFramework;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description:
 * @Date: 2019/4/18 21:01
 * @Author: Wyj
 */
public interface Stack {

    /**
    * @Description: 添加到最后
    * @Param: [h]
    * @return: void
    */
    public void push(hero h);

    /**
    * @Description: 取出最后一个
    * @Param: []
    * @return: com.jack.how2j.collectionFramework.hero
    */
    public hero pull();

    /**
    * @Description: 查看最后一个
    * @Param: []
    * @return: com.jack.how2j.collectionFramework.hero
    */
    public hero peek();

}
