package com.jack.how2j.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.io
 * @Description:
 * @Date: 2019/3/17 17:22
 * @Author: Wyj
 */
public class FileInputStreamCreate {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("/User/mac/python_coding");
        FileInputStream fis = new FileInputStream(f);
    }
}
