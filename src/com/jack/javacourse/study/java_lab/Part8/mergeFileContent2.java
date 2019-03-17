package com.jack.javacourse.study.java_lab.Part8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class mergeFileContent2 {
    public static void main(String[] args) throws IOException {
        FileReader fr1 = new FileReader("1.txt");
        FileReader fr2 = new FileReader("2.txt");
        FileWriter fw = new FileWriter("3.txt");
        List<FileReader> l = new ArrayList<>();
        l.add(fr1);
        l.add(fr2);
//        for(FileReader e:l){
//            while ((e.read()) != -1){
//                fw.write(e.read());
//            }
//        }
        fw.write(fr1.read());
        System.out.println("done!");
    }
}
