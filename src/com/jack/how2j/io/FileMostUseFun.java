package com.jack.how2j.io;

import java.io.File;
import java.io.IOException;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.io
 * @Description:
 * @Date: 2019/3/16 19:45
 * @Author: Wyj
 */
public class FileMostUseFun {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/mac/Python_coding/daily_coding/Algorithm");
        f.list();

        System.out.println(f.list());
        System.out.println(f.getParent());
        File[] fs = f.listFiles();
        for(File e : fs){
            System.out.println(e);
        }
        System.out.println(f.getParentFile());
        System.out.println(f.mkdirs());
        System.out.println(f.listRoots());
    }
}
