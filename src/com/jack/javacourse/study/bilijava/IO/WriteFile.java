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
        //先要有文件夹才能在文件夹下创建文件
        File f = new File("newfile/1.txt");
        if(!f.exists()){
            System.out.println("不存在，创建文件");
            f.createNewFile();
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        for(int i=0;i<10;i++){
            bw.write("you guess what i wrote"+i+"\r\n");
        }
        bw.close();
        System.out.println("done!");
    }
}
