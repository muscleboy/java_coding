package com.jack.javacourse.study.javabook.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class dormLogin extends JFrame {

    final String username = "韦勇杰";
    final String password = "3162052051213";

    Random r = new Random();

    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();


    JLabel l1 = new JLabel("宿舍管理系统");
    JLabel l2 = new JLabel("用户名: ");
    JLabel l3 = new JLabel("密码  : ");
    JLabel l4 = new JLabel();

    JTextField tf1 = new JTextField(20);
    JTextField tf2 = new JTextField(20);
//    JTextField tf3 = new JTextField(20);

    JButton btn = new JButton("登录");

    dormLogin(){
        // 基本设置
        this.setSize(400,400);
        this.setLocation(100,100);
        this.setTitle("dormLogin");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String uname,pwd;
                uname = tf1.getText();
                pwd = tf2.getText();
                if(uname.equals(username) || pwd.equals(password)){
                    l4.setText("密码正确");
                }else{
                    l4.setText("密码错误，请重新输入");
                }
            }
        });
//        网格布局，4X1；
        this.setLayout(new GridLayout(5,1));
        p1.add(l1);
        p2.add(l2);
        p2.add(tf1);
        p3.add(l3);
        p3.add(tf2);
        p4.add(l4);
        p5.add(btn);
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.add(p5);
    }

    public static void main(String[] args) {
        dormLogin ca = new dormLogin();
        ca.setVisible(true);
    }
}
