package com.jack.javacourse.study.java_lab;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int i = sin.nextInt();
        String action = sin.next();
        int j = sin.nextInt();
        switch (action){
            case "+":
                System.out.println("i+j=" + (i+j));
                break;
            case "-":
                System.out.println("i-j=" + (i-j));
                break;
            case "*":
                System.out.println("i*j=" + (i*j));
                break;
            case "/":
                System.out.println("i/j=" + (i/j));
                break;
        }
    }
}
