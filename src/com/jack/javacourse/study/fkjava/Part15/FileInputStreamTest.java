package com.jack.javacourse.study.fkjava.Part15;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/com/jack/javacourse/study/fkjava/Part15/1.txt");
        byte bbuf[] = new byte[1024];
        int hasRead = 0;
        while ((hasRead = fis.read(bbuf)) > 0){
            System.out.print(new String(bbuf, 0, hasRead));
        }
        fis.close();
    }
}
