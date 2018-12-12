package com.jack.javacourse.study.javabook.Part7_Exception;

import java.io.File;
import java.io.FileInputStream;

public class TestException {
    public static void main(String[] args) {
        File f = new File("a.txt");
        try{
            System.out.println("试图打开a.txt");
            new FileInputStream(f);
            System.out.println("成功打开");
        }catch (Exception e){
            System.out.println("a.txt不存在");
            e.printStackTrace();
        }
    }
}
