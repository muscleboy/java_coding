package com.jack.how2j.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.io
 * @Description:
 * @Date: 2019/3/17 17:26
 * @Author: Wyj
 */
public class FileOutputStreamCreate {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/mac/Python_coding/java大作业/1.txt");
        FileOutputStream fos = new FileOutputStream(f);
        byte data[] = {88, 89};
        fos.write(data);
        fos.close();
    }
}
