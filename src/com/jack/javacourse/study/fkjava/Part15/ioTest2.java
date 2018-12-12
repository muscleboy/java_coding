package com.jack.javacourse.study.fkjava.Part15;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ioTest2 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String writing = input.next();
        FileWriter fw = new FileWriter("src/com/jack/javacourse/study/fkjava/Part15/2.txt");
        fw.write(writing);
        fw.close();
    }
}
