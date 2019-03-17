package com.jack.javacourse.study.javabook.GUI;


import javax.swing.*;
import java.awt.*;

public class dormMain extends JFrame {
    JTextField tf1 = new JTextField(50);

    JButton btn1 = new JButton("添加");
    JButton btn2 = new JButton("删除");
    JButton btn3 = new JButton("查询");
    JButton btn4 = new JButton("修改");

    JTextField tf2 = new JTextField(50);


    dormMain(){
        this.setBounds(200,200,500,400);
        this.setTitle("CRUD");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);

        this.add(tf1);
        tf1.setBounds(20,20,200,100);
        this.add(btn1);
        btn1.setLocation(100,100);
        this.add(btn2);
        btn2.setLocation(300,100);
        this.add(btn3);
        btn3.setLocation(100,300);
        this.add(btn4);
        btn4.setLocation(300,300);
        this.add(tf2);
        tf2.setBounds(20,250,200,100);
    }

    public static void main(String[] args) {
        dormMain dm = new dormMain();
        dm.setVisible(true);
    }
}
