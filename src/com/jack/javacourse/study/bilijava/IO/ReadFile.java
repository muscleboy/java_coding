package com.jack.javacourse.study.bilijava.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File f = new File("newfile/1.txt");
        if(!f.exists()){
            System.out.println("文件不存在");
            return;
        }
        FileReader fr = new FileReader(f);
        char buffer[] = new char[50];
        StringBuffer sb = new StringBuffer();
        int readCounts = fr.read(buffer);

        while (readCounts != -1){
            sb.append(new String(buffer));
            readCounts = fr.read(buffer);
        }
        fr.close();
        System.out.println(sb.toString());

    }
}
