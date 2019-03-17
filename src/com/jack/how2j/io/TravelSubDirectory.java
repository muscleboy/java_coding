package com.jack.how2j.io;

import java.io.File;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.io
 * @Description:
 * @Date: 2019/3/17 11:41
 * @Author: Wyj
 */
public class TravelSubDirectory {
    public static void main(String[] args) {

        File f = new File("/Users/mac/python_coding");
        File[] fs = f.listFiles();
        File[] subFile = null;

        for(File e : fs){
            if(e.isDirectory()){
                subFile = e.listFiles();
                // 获得绝对路径
                System.out.println("父目录："+e.getAbsolutePath());
                for(File e1 : subFile){
                    System.out.println(e1.getName());
                }System.out.println("==================================");
            }else {
                System.out.println("不是文件夹!");
            }
        }

    }
}
