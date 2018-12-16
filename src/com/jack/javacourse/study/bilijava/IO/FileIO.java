package com.jack.javacourse.study.bilijava.IO;

import java.io.File;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) throws IOException {
        // newfile：创建文件夹
        File myfile = new File("newfile/1.txt");
        if(!myfile.exists()){
            // myfile.mkdir(); --->创建文件夹
            // 创建文件1.txt
            myfile.createNewFile();
            System.out.println("文件创建成功");
        }else {
            System.out.println("文件存在");
        }
    }
}
