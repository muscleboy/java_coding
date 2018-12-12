package com.jack.javacourse.study.javabook.Part7_Exception;

import java.io.File;

public class TextException1 {
    public static void main(String[] args) {
        File f = new File("a.txt");
        System.out.println(f.getAbsoluteFile());
    }
}
