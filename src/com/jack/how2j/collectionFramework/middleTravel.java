package com.jack.how2j.collectionFramework;

import java.util.ArrayList;
import java.util.List;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description:
 * @Date: 2019/4/20 19:03
 * @Author: Wyj
 */
public class leftTravel {

    public Node leftNode;
    public Node rightNode;
    public Object value;

    public List<Object> values(){

        List<Object> values = new ArrayList<>();

        if (null != leftNode) {
            values.addAll(leftNode.values());
        }
    }
}
