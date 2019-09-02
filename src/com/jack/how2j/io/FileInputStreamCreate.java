package com.jack.how2j.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.io
 * @Description:
 * @Date: 2019/3/17 17:22
 * @Author: Wyj
 */
public class FileInputStreamCreate {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/mac/Python_coding/java大作业/1.txt");
        FileInputStream fis = new FileInputStream(f);
        byte[] c = fis.readAllBytes();
        for(byte e : c){
            System.out.println(e);
        }
        fis.close();
    }
}
