package com.jack.how2j.swing;

import javax.swing.*;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.swing
 * @Description:
 * @Date: 2019/3/12 18:27
 * @Author: Wyj
 */
public class firstSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame("firstSwing");
        f.setSize(400, 500);
        f.setTitle("first frame");
        f.setLocation(400, 400);
        f.setLayout(null);

        JButton b = new JButton("一键秒杀");
        b.setBounds(50, 50, 280, 300);
        f.add(b);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
