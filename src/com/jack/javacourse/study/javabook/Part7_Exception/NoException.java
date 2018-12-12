package com.jack.javacourse.study.javabook.Part7_Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

public class NoException {
    public static void main(String[] args) throws IOException {
        String numBoxesIn;
        int numBoxes;
        double boxPrice = 3.25;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("有多少个盒子： ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        numBoxesIn = in.readLine();
        try {
            numBoxes = Integer.parseInt(numBoxesIn);
            System.out.println("盒子的总价值： ");
            System.out.println(currency.format(numBoxes * boxPrice));
        }catch (NumberFormatException e){
            System.out.println("输入的不是整数");
        }
    }
}
