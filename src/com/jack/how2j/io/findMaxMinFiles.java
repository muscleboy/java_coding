package com.jack.how2j.io;

import java.io.File;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.io
 * @Description:
 * @Date: 2019/3/16 19:57
 * @Author: Wyj
 */
public class findMaxMinFiles {
    public static void main(String[] args) {

        File f = new File("/Users/mac/Downloads");
        File[] fs = f.listFiles();

        // 把maxSize设为0，minSize设为整数的最大值
        long minSize = Integer.MAX_VALUE;
        long maxSize = 0;
        File maxFile = null;
        File minFile = null;

        for(File e : fs){
            if(e.isDirectory())
                continue;
            if(e.length() > maxSize){
                maxSize = e.length();
                maxFile = e;
            }
            if(e.length() != 0 && e.length() < minSize){
                minSize = e.length();
                minFile = e;
            }
        }
        System.out.println("large："+maxFile+" size: "+maxSize);
        System.out.println("small："+minFile+" size: "+minSize);
    }
}

