package com.jack.javacourse.study.bilijava.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {

        //1.创建File对象
        //2.判断是否存在
        //3.创建读写缓存对象
        //4.写入内容
        //5.关闭资源
        File f = new File("newfile/1.txt");
        if(!f.exists()){
            System.out.println("不存在，创建文件");
            f.createNewFile();
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write("you guess what i wrote");
        bw.close();
    }
}
